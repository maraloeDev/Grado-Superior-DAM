/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo Martin-Sonseca
 */
public class Ejercicio_4_Aternar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce ubna frase");
        String cadena = teclado.nextLine();

        int longitud = cadena.length();

        for (int i = 0; i < longitud / 2; i++) {
            System.out.println(cadena.charAt(i));
            System.out.println(cadena.charAt(longitud - i - 1));
        }

        if (longitud % 2 != 0) {
            System.out.print(cadena.charAt(longitud / 2));
        }

    }
}
