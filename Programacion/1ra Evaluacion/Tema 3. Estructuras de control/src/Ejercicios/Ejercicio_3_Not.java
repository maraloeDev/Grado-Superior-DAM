/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_Not {
    /**
     * Escribe un programa llamado Not que reciba por teclado un número en binario de 8 bits y
     * muestre por pantalla su complemento en forma binaria. El programa debe mostrar el
     * resultado tanto en binario como en decimal. Por ejemplo:
     * NOT(10010001) = 01101110
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        String s = teclado.next(); //cadena con la entrada del usuario

        if (s.length() != 8) {
            System.out.println("Ni ");
        } else {
            int i = 0;
            boolean bit = true;
            while (i < s.length() && bit) {
                char c = s.charAt(i);
                if (c != '1' && c != '0') { //no es bit

                    bit = false;
                }
                i++;
            }

            ///proceso NOT solo is tenia todos los bits
            if (bit) {
                System.out.println("NOT(" + s + ") = ");
                i = 0;
                int dec = 0; //decimal del NOT
                while (i < s.length()) {
                    if (s.charAt(i) == '0') {
                        System.out.println("0");

                    }
                    i++;
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}