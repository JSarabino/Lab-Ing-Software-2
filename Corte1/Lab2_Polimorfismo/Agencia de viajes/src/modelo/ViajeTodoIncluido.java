package modelo;

import java.util.Date;

public class ViajeTodoIncluido extends Viaje{
    
    //Attributes
    
    //Empty constructor
    public ViajeTodoIncluido(){}
    
    //Constructor with parameters
    public ViajeTodoIncluido(String pOrigen, String pDestino, int pCosto, Date pFechaSalida, Date pFechaLlegada){
        super(pOrigen, pDestino, pCosto, pFechaSalida, pFechaLlegada);
    }
    
    //Getters and setters
    
    //Methods
    @Override
    public String descripcion(){
        return "Disfruta tu viaje todo incluido";
    }
    
    //No se sobreescribe cualquierMetodo2()
}
