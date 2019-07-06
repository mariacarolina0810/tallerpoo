/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_2;

/**
 *
 * @author MariaCarolina
 */
public class Ejemplo_2 extends frutas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       frutas fruta1 = new frutas("Manzana", "rojo", 3000, "201");
       frutas fruta2 = new frutas("piña","amarillo",4000,"202");
       frutas fruta3 = new frutas("Manzgo", "verde", 3000, "203");
       System.out.println("fruta 1 tiene como nombre: "+fruta1.getNombre());
       System.out.println("fruta dos tiene un color: "+fruta2.getColor());
       System.out.println("fruta 3 tiene un precio de: "+fruta3.getPrecio());
       
       
    }

    public Ejemplo_2(String nombre, String color, double precio, String codigo) {
        super(nombre, color, precio, codigo);
    }
    
}
