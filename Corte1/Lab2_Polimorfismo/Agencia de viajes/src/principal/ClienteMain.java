package principal;
import mundo.Viaje;
import mundo.ViajeFamiliar;
import mundo.ViajeIncentivo;
import mundo.ViajeIndividual;
import mundo.ViajeTodoIncluido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 *
 * @author Juan Camilo Sarabino Alegria
 */
public class ClienteMain {
    
    public static ArrayList<Viaje> viajes = new ArrayList();
    
    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }
    
    /**
    * Lee viajes en el arreglo polimórfico
    */
    public static void leerViajes(){
        try {
            //Viaje Familiar
            Viaje viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new
            SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
            viajes.add(viaje1);
            
            //Viaje Incentivo
            Viaje viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, new
            SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
            viajes.add(viaje2);
            
            //Viaje Individual
            Viaje viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            
            //Viaje Todo Incluido
            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
            
        } catch (ParseException ex) {
            System.out.println("Error");
        }
    }
    
    /**
    * Recorre e imprime datos del arreglo polimófico
    */
    public static void mostrarViajes(){
        // En este caso vemos que todos los viajes ejecutan el método "descripcion()" de forma diferente
        // ya que al ser este método abstracto en la clase padre, les forzamos a las clases hijas a que implementen ese método.
        
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Cualquier método: " + viaje.cualquierMetodo());
            System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
}
