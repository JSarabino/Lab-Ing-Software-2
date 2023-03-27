package modelo;

import java.util.Date;

public class ViajeIncentivo extends Viaje  {
    
    //Attributes
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    
    //Empty constructor
    public ViajeIncentivo(){};
    
    //Constructor with parameters
    public ViajeIncentivo(String pOrigen, String pDestino, int pCosto, Date pFechaSalida, Date pFechaLlegada, String pEmpresa){
        super(pOrigen, pDestino, pCosto, pFechaSalida, pFechaLlegada);
        empresa = pEmpresa;
    }
    
    //Getters and setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    //Methods
    @Override
    public String descripcion(){
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    
    @Override
    public String cualquierMetodo2(){
        return "Método implementado en la clase hija viaje de incentivo";
    }    
}
