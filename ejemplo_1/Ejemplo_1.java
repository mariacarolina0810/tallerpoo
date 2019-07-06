/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_1;

/**
 *
 * @author MariaCarolina
 */
public class Ejemplo_1 extends  jugadores{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        jugadores maria = new jugadores("maria", 21, "el pando", 1082993441, "3188642746", "mz 50 c 14");
        System.out.println(maria.getNombre());

        jugadores Andres = new jugadores("jaime", 23, "el pando", 1028201123, "3154168330", "cra 2 #2-23");
        System.out.println(Andres.getNombre()+"," +Andres.getEquipo());
    }

    public Ejemplo_1(String nombre, int edad, String equipo, int documento, String telefono, String direccion) {
        super(nombre, edad, equipo, documento, telefono, direccion);
    }

}
