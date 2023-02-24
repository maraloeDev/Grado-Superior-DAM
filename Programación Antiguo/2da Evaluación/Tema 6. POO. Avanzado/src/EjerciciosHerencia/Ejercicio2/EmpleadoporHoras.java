/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package EjerciciosHerencia.Ejercicio2;

/**
 *
 * @author maraloed
 */
public class EmpleadoporHoras extends Empleado {

    private double precioHora = 500;
    private double numeroHoras;

    public EmpleadoporHoras(double precioHora, double numeroHoras, String nombre, String dni, double salario, String apellidos, String direccion, String telefono) {
        super(nombre, dni, salario, apellidos, direccion, telefono);
        this.precioHora = precioHora;
        this.numeroHoras = numeroHoras;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoporHoras{" + "precioHora=" + precioHora + ", numeroHoras=" + numeroHoras + '}';
    }

    public double CalcularSueldoH() {

        double sueldoHora = (this.precioHora * numeroHoras);
        return sueldoHora;
    }

}
