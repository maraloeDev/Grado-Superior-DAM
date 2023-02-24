/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */

package Ejercicios.PDFArray;

import java.util.Scanner;

public class Ejercicio_6_Capicua {
static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Introduce un numero capitua");
            int capi = teclado.nextInt();
            int capicua[] = new int[capi];

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
