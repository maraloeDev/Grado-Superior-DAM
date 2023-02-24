/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Empleados;

/**
 *
 * @author maraloed
 */
public class Empleado {
    
    private String nombre;
    private String apellidos;
    protected double salarioBase;
    
    //Se trabajaremos con el contructor por defecto (ESEL QUE NO TIENE PARAMETROS)

    public Empleado(String nombre, String apellidos, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        
    }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase + '}';
    }
    
    
    
    
    
}
