/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4_Bucles4 {

    /**
     * Programa que muestre. cuente. sume los pares que hay entre 1 y un numero positivo
     * // introducido por teclado
     * //  Introduce valor : 10
     * //  0 2 4 6 8 10
     * //
     * //  Hay : 5 pares
     * //
     * //  Suman 30/
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce valor : ");
        int num = teclado.nextInt();

        if (num < 0 ){
            System.out.println("NO SE PUEDE");
        } else {
        int contador = 0;
        int contadorPares=0;
        int suma=0;

        while (contador < num) {

            System.out.println(contador);
            contador=contador+1;
            contador++;

            suma=suma+contador;
            contadorPares++;

        }
        System.out.println("Hay " + contadorPares + " pares");
        System.out.println("Suman " + suma);
        }
    }
}
