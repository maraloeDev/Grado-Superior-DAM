/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */

package Ejercicios.PDFArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio_5_ListaAleatoria {

    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        //Generación del array (vector) con longitud 10
        System.out.println("Introduce la longitud max");
        int numeros = teclado.nextInt();
        int enteros[] = new int[numeros];
        int pos=0;
        for (int i = 1; i <enteros.length; i++) {

            System.out.println("Colocando el " + (pos+i) + "...");
            enteros[i] = (int) (Math.random() * (numeros));
            System.out.println(enteros[i]);

            if (pos!=0){
                System.out.println("Colision con el numero " + pos);
            }

        }
        System.out.println(Arrays.toString(enteros));

    }

}
