/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_Bucles3 {

    //Numeros naturares entre 2 valores introducidos por teclado

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero");
        int num = teclado.nextInt();

        System.out.print("Escribe un numero");
        int num2 = teclado.nextInt();

        if (num < 0 || num2 < 0) {
            System.out.println("Los valores deben de ser positivos");
        } else if (num >= num2) {

            while (num >= num2) {
                System.out.println(num);
                num--;
            }

        } else if (num <= num2) {
            while (num <= num2) {
                System.out.println(num);
                num++;
            }
        }
    }
}
