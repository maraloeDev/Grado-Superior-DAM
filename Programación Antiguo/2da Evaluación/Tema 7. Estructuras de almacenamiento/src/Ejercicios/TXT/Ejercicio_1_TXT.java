/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */
package Ejercicios.TXT;

import java.util.Arrays;
import java.util.Random;

/**

 * Programa que cree un array de 10 enteros con los numeros del 1 al 10
 * colocados aleatoriamente.
 * Cada vez que se coloque un número, mostrar el número de colisiones que ha
 * tenido
 */
public class Ejercicio_1_TXT {

    static Random numR = new Random();

    public static void main(String[] args) {

        int[] enteros = new int[10]; //Genero un array con longitud 10

        for (int i = 0; i < enteros.length; i++) {
            boolean ocupado = true; // Creo la bandera (estado base : true)
            while (ocupado) { //Mientras ocupado sea true

               int posAleatoria = numR.nextInt(0, enteros.length); //Creacion de los numeros aleatorios

                if (enteros[posAleatoria] == 0) { // Si el array de enteros==0 entonces se coloca en una posicion
                    System.out.println("Colocando en la posicion" + posAleatoria);
                    ocupado = false; //La bandera cambia de valor (debido a que si no le cambio de valor es un loop infinito)
                    enteros[posAleatoria] = i;
                } else {
                    System.out.println("Colision en " + posAleatoria);
                }
            }

        }

        System.out.println(Arrays.toString(enteros));

    }

}
