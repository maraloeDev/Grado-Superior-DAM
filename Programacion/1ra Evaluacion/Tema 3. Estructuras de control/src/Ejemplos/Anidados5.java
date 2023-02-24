/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
package Ejemplos;

/**
 * ANGULO AGUDO
 *
 *       *
 *      **
 *     ***
 * @author marti
 */
public class Anidados5 {

    public static void main(String[] args) {

        int base = 3;
        for (int i = 0; i < base; i++) {

            for (int j = 0; j < base - 1 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

    }
}
