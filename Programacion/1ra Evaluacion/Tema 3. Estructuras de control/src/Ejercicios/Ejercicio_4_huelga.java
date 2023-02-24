/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4_huelga {

    /**
     * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
     * Repetir el proceso tantas veces como deseemos.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char respuesta='S';

        do {
        int numero = (int) (Math.random() * 2 + 1);

        if (numero==1){
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }

            System.out.println("Quieres volver a repetirlo??");
        respuesta=teclado.next().charAt(0);

        }while (respuesta =='S' || respuesta == 's');
        System.out.println("Has acabado");
    }

}
