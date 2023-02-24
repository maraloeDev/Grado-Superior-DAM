/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_5_Primo {
    static Scanner teclado = new Scanner(System.in);

    public static void esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {

            if ((numero % i) == 0) {
                contador++;
            }

        }
        if (contador <= 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    public static void main(String[] args) {
        int numero;
        System.out.println("Introduce un numero :");
        numero = teclado.nextInt();
        esPrimo(numero);
    }
}
