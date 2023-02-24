/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.Arrays;

import java.util.Arrays;

/**
 *
 * @author marti
 */
public class Ejercicio_1_array {

    static int[] enteros = new int[10];

    public static void media(int pos1, int pos2) {
        double media = 0;
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println(Arrays.toString(enteros));

        for (int i = pos1; i <= pos2; i++) {
            media = media + enteros[i];

        }

        media = media + (pos1 - pos2 + 1) / 2; //Pongo el +1 para que este
        // entre el 1 y 5, no entre 0 y 4
        System.out.println("La media aritmetica es " + media);

    }

    public static void main(String[] args) {
        media(2, 4);
    }

}
