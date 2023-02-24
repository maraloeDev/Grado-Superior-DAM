/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios;

/** Escribe un programa llamado TablaAscii que mediante un bucle imprima por pantalla los 128
 primeros caracteres ASCII con el siguiente formato:
 ....
 65:A
 66:B
 ...*/

public class Ejercicio_2_TablaASCII {

    public static void main(String[] args) {
        int carac = 255;
        int minimo = 0;

        while (carac >= minimo) {

            System.out.println(carac + " " + (char) carac);
            carac--;
        }
    }
}
