/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_1_Busqueda {

    public static void main(String[] args) {

        Scanner papaya = new Scanner(System.in);

        System.out.print("Cadena a donde buscar");
        String cadena = papaya.nextLine();

        System.out.print("Cadena a buscar :");
        String cadena2 = papaya.nextLine();

        int coincidencias = 0;
        String posiciones = "";
        int posicion = -1;

        do {
            posicion = cadena.indexOf(cadena2, posicion + 1);
            if (posicion >= 0) {
                coincidencias++;
                posiciones += String.valueOf(posicion) + " ";
            }

        } while (posicion >= 0);
        posiciones = posiciones.substring(0, posiciones.length() - 1);
        System.out.println("Numero de coincidencias +" + coincidencias + " Posiciones (" + posiciones + ")");
    }

}
