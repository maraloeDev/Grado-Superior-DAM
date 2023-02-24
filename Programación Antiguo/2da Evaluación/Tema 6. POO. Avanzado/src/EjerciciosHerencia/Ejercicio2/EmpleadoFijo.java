/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package EjerciciosHerencia.Ejercicio2;

import java.time.LocalDate;


/**
 *
 * @author maraloed
 */
public class EmpleadoFijo extends Empleado {

    private LocalDate anioAlta;
    private double sueldoFijo;

    public EmpleadoFijo(LocalDate anioAlta, double sueldoFijo, String nombre, String dni, double salario, String apellidos, String direccion, String telefono) {
        super(nombre, dni, salario, apellidos, direccion, telefono);
        this.anioAlta = anioAlta;
        this.sueldoFijo = sueldoFijo;
    }

    public LocalDate getAnioAlta() {
        return anioAlta;
    }

    public void setAnioAlta(LocalDate anioAlta) {
        this.anioAlta = anioAlta;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoFijo{" + "anioAlta=" + anioAlta + '}';
    }

    public double CalcularSueldo() {

        double sueldo = (this.salario * (this.anioAlta.getYear()));
        return sueldo;
    }

}
