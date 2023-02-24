/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
package Ejemplos;

/**
 *   *
    ***
   *****
 * @author marti
 */
public class Anidados6 {

    public static void main(String[] args) {
        int base = 3;
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= base - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
