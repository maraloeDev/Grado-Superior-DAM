/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa llamado GetASCIICodeFromChar que devuelva el valor ASCII de un
 * carácter introducido por teclado
 */

public class Ejercicio_1_GetASCIICodeFromChar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un caracter");

        char carac = teclado.next().charAt(0);
        System.out.println("El caracter que has introducido es " + (int) carac + " a numero");
    }
}