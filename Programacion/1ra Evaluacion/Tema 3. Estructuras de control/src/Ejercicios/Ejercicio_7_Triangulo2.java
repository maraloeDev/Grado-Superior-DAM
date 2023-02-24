/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_7_Triangulo2 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num= 1;
            for (int j = n; j >= i; j--) {
                System.out.print(num);
                num++;
                
            }
            System.out.println("");
            
        }
    }
}
