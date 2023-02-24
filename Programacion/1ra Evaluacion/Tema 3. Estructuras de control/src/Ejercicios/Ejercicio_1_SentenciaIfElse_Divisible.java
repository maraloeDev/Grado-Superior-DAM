/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_1_SentenciaIfElse_Divisible {

    //Hacer un programa llamado Divisible que reciba por teclado dos números y
//compruebe si el primero es divisible por el segundo.
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int n2 = teclado.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }

    }
}
