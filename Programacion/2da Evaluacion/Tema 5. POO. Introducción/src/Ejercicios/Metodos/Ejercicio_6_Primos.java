/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.Metodos;

import static Ejercicios.Metodos.Ejercicio_5_Primo.teclado;

/**
 *
 * @author marti
 */
public class Ejercicio_6_Primos {

    public static void esPrimo() {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {

            if ((100 % i) == 0) {
                contador++;
            }

        }
        if (contador <= 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    public static void main(String[] args) {
        esPrimo();
    }

}
