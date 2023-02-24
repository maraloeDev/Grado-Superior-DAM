/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_7_Bucles7 {

    /**
     * Programa que pida al usuario dos enteros que tal forma que el segundo sea mayor que el primero
     * Si el primero es mayor que el segundo se le pedira repetidamente hasta que lo cumpla
     * A continuación el programa mostrara a partir del primer número los numeros separados por 7 unidades
     * <p>
     * Su cuenta y de ellos cuantos son pares y cuanto vale la suma de los impares
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int n2 = teclado.nextInt();
        int contadordeNumeros = 0; //Suma de numeros
        int contadorPares = 0;
        int contadorImpares = 0;

        //Bucle de validacion 2º num mayor que el primero
        while (n1 >= n2) {
            System.out.println("Error, el segundo numero tiene que ser mayor que el primero");

            n2 = teclado.nextInt();
        }

        System.out.println("------------------------");
//Se cumple que n1 es mayor o igual que n2

        while (n1 < n2) {
            System.out.println(n1);
            contadordeNumeros++;

            if (n1 % 2==0){
                contadorPares++;
            } else {
                contadorImpares = contadorImpares + n1;
            }
            n1 = n1 + 7;

        }
        System.out.println("Hay " + contadordeNumeros + " numeros separados entre 7 unidades.");
        System.out.println("Hay " + contadorPares + " numeros pares.");
        System.out.println("Los impares suman " + contadorImpares + ".");
}
}
