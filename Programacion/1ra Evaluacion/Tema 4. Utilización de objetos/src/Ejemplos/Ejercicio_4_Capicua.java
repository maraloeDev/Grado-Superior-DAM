/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class Ejercicio_4_Capicua {

    /*Realiza un programa que diga si un numero introducido es capicua */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero capitua");
            int capicua = teclado.nextInt();

            String longitud = String.valueOf(capicua);

            String resultado = "";
            for (int i = longitud.length() - 1; i >= 0; i--) {
                resultado = resultado + longitud.charAt(i);

            }

            if (longitud.equals(resultado)) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}
