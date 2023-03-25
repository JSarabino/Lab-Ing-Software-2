package mundo;

import java.util.Date;

public class ViajeFamiliar extends Viaje{
    
    //Attributes
    /**
    * Cantidad de integrantes de la familia
    */
    private int familia;
    
    //Empty constructor
    public ViajeFamiliar(){};
    
    //Constructor with parameters
    public ViajeFamiliar(String pOrigen, String pDestino, int pCosto, Date pFechaSalida, Date pFechaLlegada, int pFamilia){
        super(pOrigen, pDestino, pCosto, pFechaSalida, pFechaLlegada);
        familia = pFamilia;
    }
    
    //Guetters and setters
    public int getFamilia(){
        return familia;
    }
    
    public void setFamilia(int familia){
        this.familia = familia;
    }
    
    //Methods
    @Override
    public String descripcion(){
        return "Viaje para disfrutar con toda tu familia";
    }
    
    @Override
    public String cualquierMetodo2(){
        return "Método implementado en la clase hija viaje familiar";
    }
}
