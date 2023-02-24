/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
package Ejemplos;

public class Anidados4 {

    /**
     *
     *
     **
     ***
     ****
     ***
     **
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        int base = 10;
        for (int i = 0; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for (int i = 1; i <= base; i++) {

            for (int j = base; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
