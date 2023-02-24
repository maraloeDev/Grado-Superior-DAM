/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo Martin-Sonseca
 */
public class Ejercicio_6_Ordenar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un par de palabras");
        String par = teclado.nextLine();

        par = par.trim();//Almacena las palabras sin espacios al principio y final

        String palabra1 = par.substring(0, par.indexOf(" "));
        String resto = par.substring(par.indexOf(" "));
        String palabra2 = resto.trim();

        if (palabra1.compareTo(palabra2) < 0) {

            System.out.println(palabra1 + " " + palabra2);

        } else if (palabra1.compareTo(palabra2) > 0) {
            System.out.println(palabra2 + " " + palabra1);
        } else {
            System.out.println("Palabras iguales");
            System.out.println(palabra1 + " " + palabra2);
        }

    }

}
