/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.PDFMatrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio_3_Permutacion {

    static Scanner teclado = new Scanner(System.in);
    static Random rndm = new Random();

    public static void mostrarMatriz(int[][] mu) {

        

        
        int n;
        for (int i = 0; i < mu.length; i++) {
            for (int j = 0; j < mu.length; j++) {
                n = rndm.nextInt(1, 100);
                mu[i][j] = n;
                System.out.print(mu[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la dimensión de la matriz");
        int dimension1 = teclado.nextInt();
        System.out.println("Introduzca la dimensión de la matriz");
        int dimension2 = teclado.nextInt();
        
int[][] matrizUsuario = new int[dimension1][dimension2];
        mostrarMatriz(matrizUsuario);
    }

}
