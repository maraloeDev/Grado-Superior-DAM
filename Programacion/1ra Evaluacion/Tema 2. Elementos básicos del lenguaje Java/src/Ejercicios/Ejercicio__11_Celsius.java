/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio__11_Celsius {

    /**
     * Escribe un programa Celsius que dada una temperatura en grados Celsius (centígrados)
     * pueda ser convertida a una temperatura equivalente en grados Fahrenheti de acuerdo a la
     * siguiente fórmula:
     * f = ( 9 / 5 ) C + 32
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique una temperatura en grados Celsius : ");

        float Celsius = teclado.nextInt();

        float f = (Celsius * 9 / 5) + 32;
        System.out.println(f);
    }
}
