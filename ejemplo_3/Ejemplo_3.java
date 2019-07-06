/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_3;

/**
 *
 * @author MariaCarolina
 */
public class Ejemplo_3 extends medicamentos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        medicamentos medicamento1=new medicamentos("Acetaminofen 500mg", 3000, "ab301", "Para fiebre alta en adultos 2 tabletas cada 8 horas");
         System.out.println("El medicamento 1 tiene como nombre: "+medicamento1.getNombre());
         
         medicamentos medicamento2=new medicamentos("Amoxicilina", 4000, "dks452", "tomar dos tabletas cada 12 horas");
         System.out.println("El medicamento 2 tiene como tiene un precio de : "+medicamento2.getPrecio());
    }

    public Ejemplo_3(String nombre, double precio, String codigo, String rccomendaciones) {
        super(nombre, precio, codigo, rccomendaciones);
    }
    
}
