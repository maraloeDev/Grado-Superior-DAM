/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejemplos;

public class Anidados1 {

    public static void main(String[] args) {
        int base = (int) (10 * Math.random() + 2);
        int altura = (int) (10 * Math.random() + 2);

        System.out.println(base + " x " + altura + " = " + (base * altura));

        for (int i = 0; i <= base; i++) {
            for (int j = 0; j <= altura; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
