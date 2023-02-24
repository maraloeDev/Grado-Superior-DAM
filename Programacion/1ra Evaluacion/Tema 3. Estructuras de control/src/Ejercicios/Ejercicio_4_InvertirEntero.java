/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4_InvertirEntero {

    /**
     * Escribe un programa llamado InvertirEntero que invierta los dígitos de un
     * entero dado por el usuario. Para ello convierte el número a cadena.
     */
    public static void main(String[] args) {
        try {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            String total = String.valueOf(numero);

            String resultado = "";

            int invertido = total.length() - 1;
            do {
                resultado = resultado + total.charAt(invertido);
                invertido--;

            } while (invertido >= 0); //Se incluye 0 por que es el primero character

            System.out.println("El numero real " + numero + " invertido es " + resultado);
        } catch (InputMismatchException ex) {
            System.out.println("Error");
        }

    }
}
