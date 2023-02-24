/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

public class Ejercicio_8_Triangulo3 {

    public static void main(String[] args) {
//El segundo bucle es del 1 al 4
        int base = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }
        
        //El segundo bucle es del 4 al 1
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = n; j >= i; j--) {
                System.out.print(num);
                num++;

            }
            System.out.println("");

        }

    }
}
