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
public class medicamentos {
    
    public String nombre;
    public double precio;
    public String codigo;
    public String rccomendaciones;

    public medicamentos(String nombre, double precio, String codigo, String rccomendaciones) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.rccomendaciones = rccomendaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRccomendaciones() {
        return rccomendaciones;
    }

    public void setRccomendaciones(String rccomendaciones) {
        this.rccomendaciones = rccomendaciones;
    }
    
    
    
}
