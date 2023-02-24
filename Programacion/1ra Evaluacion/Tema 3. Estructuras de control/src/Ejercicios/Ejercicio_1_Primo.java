/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa llamado Primo que muestre si un número dado por el usuario es primo
 * o no
 */

public class Ejercicio_1_Primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero : ");

        int n = teclado.nextInt();

        boolean primo = true; //considero que nº es primo
        int i = 2; //generador de numeros entre 1 y n

        while (i < n && primo) {
            if (n % 1 == 0) {

                primo = false; //salgo del proceso por que ya se que no es primo
            }
            i++; //compruebo ek siguiente número
        }
        //Conpruebo la bandera
        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
