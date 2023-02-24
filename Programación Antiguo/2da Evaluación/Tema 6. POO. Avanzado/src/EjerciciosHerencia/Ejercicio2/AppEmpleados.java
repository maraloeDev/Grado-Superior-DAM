/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package EjerciciosHerencia.Ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class AppEmpleados {

    public static void main(String[] args) {
        Empleado empl = new Empleado("Eduardo", "47583974-X", 50, "Martín-Sonseca", "Calle La Malaza, 40", "601094161");

        EmpleadoFijo emplF = new EmpleadoFijo(LocalDate.of(1999, 04, 01), 54, "Eduardo", "47583974X", 50, "Martin-Sonseca", "Calle la malaza, 40", "601094161");
        System.out.println("EL SUELDO DEL EMPLEADO FIJO ES " + emplF.CalcularSueldo());
        EmpleadoTemporal emplTemp = new EmpleadoTemporal(LocalDate.of(1999, 12, 04), LocalDate.of(2000, 12, 04), "Eduardo", "47583974-X", 50, "Martín-Sonseca", "Calle La Malaza, 40", "601094161");
        System.out.println("EL SUELDO DEL EMPLEADO TEMPORAL ES " + emplTemp.salarioTemp());
        EmpleadoporHoras emplHoras = new EmpleadoporHoras(50, 14, "Eduardo", "47583974-X", 50, "Martín-Sonseca", "Calle La Malaza, 40", "601094161");
        System.out.println("EL SUELDO DEL EMPLEADO POR HORAS ES " + emplHoras.CalcularSueldoH());
    }

}
