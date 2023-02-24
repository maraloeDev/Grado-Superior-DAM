/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.TXT;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Programa que cree un array de 10 enteros con los numeros del 1 al 10
 * colocados aleatoriamente.
 *
 * @author priparno
 */
public class Nouel {

    public static void solucion2(int[] array, Random r) {
        for (int i = 1; i <= 10; i++) {
            boolean ocupado = true;        //controla si la posici�n del array ya est� ocupada.
            int posRand;                   //posicion aleatoria del array donde colocar el numero
            while (ocupado) {
                posRand = r.nextInt(0, 10);
                if (array[posRand] == 0) {
                    ocupado = false;
                    array[posRand] = i;
                }
            }
        }
    }

    //cada vez que se vaya a colocar un numero mostrar el numero de colisiones que ha tenido
    public static void solucion2_var(int[] array, Random r){
        for (int i = 1; i <= array.length; i++) {
            boolean ocupado = true;        //controla si la posici�n del array ya est� ocupada.
            int posRand;                   //posicion aleatoria del array donde colocar el numero
            System.out.println("Colocando el numero "+i);
            while (ocupado) {
                // try {
                //     Thread.sleep((long)500);
                //} catch (InterruptedException ex) {
                //    System.out.println(ex.getMessage());
                //}
                posRand = r.nextInt(0, array.length);
                if (array[posRand] == 0) {
                    System.out.println("\tColocado en posicion "+posRand);
                    ocupado = false;
                    array[posRand] = i;
                }else{
                    System.out.println("\tColision en posicion "+posRand);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int posAux = rand.nextInt(0, 10);
            int aux = array1[i];
            array1[i] = array1[posAux];
            array1[posAux] = aux;
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[10];
        solucion2(array2, rand);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[10];
        solucion2_var(array3, rand);
        System.out.println(Arrays.toString(array3));

    }
}
