/** *****************************************************************************
 * /** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

/*Programa que pida al usuario su fecha de nacimiento
y le diga Felicidades!!! si es su cumpleaños*/
public class FechasCumple_2 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce fecha de cumpleaños (dd/mm/aaaa)");
            String fechaNac = teclado.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy"); //Plantilla de la fecha
            sdf.setLenient(false);
            Date fecha = sdf.parse(fechaNac);

            sdf.applyPattern("dd/MM");
            String cadenaFechas1 = sdf.format(fecha);
            String cadenaFechas2 = sdf.format(new Date());

            if (cadenaFechas1.equals(cadenaFechas2)) {
                System.out.println("Felicidades!!!");
            } else {

            }

        } catch (Exception es) {
            System.out.println("Error");
        }
    }

}
