/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejemplos;

public class Anidados2 {
    
    /**
     * IMPRIMIR MEDIO TRIANFULO DE FORMA ALEATORIA
     *  *
     *  **
     *  ***
     * @param args 
     */

    public static void main(String[] args) {
        int base = (int) (10 * Math.random() + 2);

        for (int i = 0; i <= base; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }

}