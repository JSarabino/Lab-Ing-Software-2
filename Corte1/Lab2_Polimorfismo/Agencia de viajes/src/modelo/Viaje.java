package modelo;
import java.util.Date;

public abstract class Viaje {
    
    //Attributes
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    
    //Empty constructor
    public Viaje(){}
    
    //Constructor with parameters
    public Viaje(String pOrigen, String pDestino, int pCosto, Date pFechaSalida, Date pFechaLlegada){
        origen = pOrigen;
        destino = pDestino;
        costo = pCosto;
        fechaSalida = pFechaSalida;
        fechaLlegada = pFechaLlegada;
    }
    
    //Guetters and setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    //Methods
    public abstract String descripcion();
    
    public String cualquierMetodo(){
        return "Cualquier metodo implementado en la clase base";
    }
    
    public String cualquierMetodo2(){
        return "Cualquier metodo2 implementado en la clase base";
    }
}
