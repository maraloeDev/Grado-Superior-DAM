/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/
package Ejercicios;

import java.util.Scanner;

/**Escribe un programa EstanEnOrden que lea tres enteros y diga si están ordenados de menor
 a mayor, de mayor a menor o desordenados*/

public class Ejercicio_1_EstanEnOrden {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero2 > numero3) {

            System.out.println("Estan ordenados de mayor a menor");

        } else if ((numero1 < numero2 && numero2 < numero3)) {

            System.out.println("Estan ordenados de menor a mayor");
        } else {
            System.out.println("Los numeros estan desordenados");
        }
    }

}
