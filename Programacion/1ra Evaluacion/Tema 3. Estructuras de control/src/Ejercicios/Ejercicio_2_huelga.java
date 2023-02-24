/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios;

import java.io.FileReader;
import java.security.AllPermission;
import java.util.Scanner;

public class Ejercicio_2_huelga {


    /**
     * Contar las veces que aparece una determinada letra en una frase, ambas introducidas por teclado.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Creacion de variables frase y caracter para la introduccion de texto mediante el objeto Scanner
        String frase = "";
        String caracter = "";
        int contador = 0;

        do {
            System.out.println("Introduce una frase");
            frase = teclado.nextLine();

        } while (frase.isEmpty());

        System.out.println("Introduce un caracter");
        caracter = teclado.next();
        while (contador < frase.length()) {
            if (frase.charAt(contador) == caracter.charAt(0)) {
            }
            contador++;
        }

        if (contador != 0) {
            System.out.println("El caracter " + caracter + " aparece " + "\033[0;1m" + contador + " veces");
        } else {
            System.out.println("No se encuentra la letra");
        }


    }
}