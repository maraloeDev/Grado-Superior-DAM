/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios;

/**
 * Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
 */

public class Ejercicio_5_huelga {

    public static void main(String[] args) {

        int veces=0; //Contador de veces de tirada de lps dados
        for (int i = 0; i <= 100; i++) {
            int dado1 = (int) (Math.random() * 6) +1; //Generacion alearoria entre 1 y 6
            int dado2 = (int) (Math.random() * 6) +1; //Generacion alearoria entre 1 y 6

            System.out.println("Tirada " + i);
            System.out.println("---------------------");
            System.out.println("Dado 1 = " + dado1);
            System.out.println("Dado 2 = " + dado2);
            System.out.println("Suman " + (dado1 + dado2));

        if (dado1 + dado2 == 10){
            veces++;
        }
        }
        System.out.println("Las veces que ha aparecido el 10 es " + "\033[0;1m" + veces);







    }
}