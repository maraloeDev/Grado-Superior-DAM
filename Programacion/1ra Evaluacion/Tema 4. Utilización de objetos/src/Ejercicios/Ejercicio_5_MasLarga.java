/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_5_MasLarga {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = ""; //almacena cada frase del usuario
        String masLarga = ""; //contiene la frase mas larga de todas las introducidas

        do {
            System.out.println("Introduce una frase");
            cadena = teclado.nextLine();
            if (cadena.length() > masLarga.length()) {
                masLarga = cadena;
            }

        } while (!cadena.isEmpty());
        System.out.println("La cadena mas larga es " + masLarga);

    }

}
