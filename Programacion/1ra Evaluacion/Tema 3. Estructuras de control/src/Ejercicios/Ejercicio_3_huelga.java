/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_huelga {

    /**
     * Imprimir las letras de una frase introducida por teclado de una forma alternativa,
     * es decir,una de la parte final y la siguiente de la inicial, hasta recorrer todos los caracteres de la misma.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase :");
        String texto = teclado.nextLine();

        int contador = 0;

        do {
            System.out.println(texto.substring(contador, contador + 1));
            System.out.println(texto.substring(texto.length() - contador - 1, texto.length() - contador));
            contador++;

        } while (contador < texto.length() / 2);
        }
    }
