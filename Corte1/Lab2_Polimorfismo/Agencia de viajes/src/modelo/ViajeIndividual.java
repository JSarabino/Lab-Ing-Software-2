package modelo;

import java.util.Date;

public class ViajeIndividual extends Viaje{
    
    //Attributes
    
    //Empty constructor
    public ViajeIndividual(){}
    
    //Constructor with parameters
    public ViajeIndividual(String pOrigen, String pDestino, int pCosto, Date pFechaSalida, Date pFechaLlegada){
        super(pOrigen, pDestino, pCosto, pFechaSalida, pFechaLlegada);
    }
    
    //Getters and setters
    
    //Methods
    @Override
    public String descripcion()
    {
        return "Disfruta tu viaje individual";
    }
    
    //No se sobreescribe cualquierMetodo2()
}
