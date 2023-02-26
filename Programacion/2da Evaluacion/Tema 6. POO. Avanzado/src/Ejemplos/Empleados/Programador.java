/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Empleados;

/**
 *
 * @author maraloed
 */
public class Programador extends Empleado {
    
    private double horas;
    private double precioHora;

    public Programador( String nombre, String apellidos, double salarioBase) {
        super(nombre, apellidos, salarioBase);
    }

    public Programador() {
    }
    
    
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    //Calcular el salario de un programador
    
    public double salarioMes(){
        return (this.salarioBase + (this.horas * this.precioHora));
    }

    @Override
    public String toString() {
        return super.toString() + "Programador{" + "horas=" + horas + ", precioHora=" + precioHora + '}';
    }
    
    
}
