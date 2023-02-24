/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_6_Primos {
    static Scanner teclado = new Scanner(System.in);

    public static void esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {

            if ((numero % i) == 0) {
                contador++;
            }

        }
        if (contador <= 2) {
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            esPrimo(i);
        }

    }
}
