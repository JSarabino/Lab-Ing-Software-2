/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosel;

/**
 *
 * @author juank
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.setCodigo(10);
        est.setNombre("Matias");
        System.out.println(est.getCodigo());
        System.out.println(est.getNombre());
    }
    
}
