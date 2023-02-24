/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios;


import java.util.Scanner;

public class Ejercicio_1_huelga {

    /**
     * Introducir por teclado una serie de números. Sumar los múltiplos de 5, decir cuál es el mayor y cuántos números se han introducido
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char respuesta = 'S';
        int numero = 0;
        int sumamultiplos = 0;
        int contador = 0;
        int mayor=Integer.MIN_VALUE;


        while (respuesta == 'S') {
            System.out.print("Introduce un numero");
            numero = teclado.nextInt();
            contador++;

            System.out.print("Quiere volver a introducir el numero? (S o N)");
            respuesta = teclado.next().charAt(0);

            if ((numero % 5) == 0) {
                sumamultiplos = sumamultiplos + numero;

            } if (numero > mayor) {
                mayor=numero;

            } else {

                System.out.println("El numero que has introducido NO es un multiplo de 5");
            }

        }
        System.out.println("Has acabado...");
        System.out.println("El total de los numeros multiplos total es de " + sumamultiplos);
        System.out.println("El mayor de los numeros es " + mayor);
        System.out.println("Has introducido " + contador + " numeros");
    }
}


