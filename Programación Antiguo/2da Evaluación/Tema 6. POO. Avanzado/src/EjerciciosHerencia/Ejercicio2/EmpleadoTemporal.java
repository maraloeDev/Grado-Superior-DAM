/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package EjerciciosHerencia.Ejercicio2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author maraloed
 */
public class EmpleadoTemporal extends Empleado {

    private double sueldo = 800;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    public EmpleadoTemporal(LocalDate fechaAlta, LocalDate fechaBaja, String nombre, String dni, double salario, String apellidos, String direccion, String telefono) {
        super(nombre, dni, salario, apellidos, direccion, telefono);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTemporal{" + "fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

    public double salarioTemp() {
        double sueldoTotal = getSueldo();
        return sueldoTotal;

    }

}
