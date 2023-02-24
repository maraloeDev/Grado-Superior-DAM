/*
 *
 *  * * *****************************************************************************
 *  *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *  *****************************************************************************
 *
 */
package Ejercicios.PDFMatrices;

public class Ejercicio_1_Matriz1 {

    public static void main(String[] args) {

        int[][] enteros = new int[5][5];
        imprimirMatriz(enteros);
        System.out.println("-------------------------------------");
        sumaMatriz(enteros);
        System.out.println("-------------------------------------");
        diagonal(enteros);
        System.out.println("-------------------------------------");
        diagonal_extra(enteros);
    }

    public static void imprimirMatriz(int[][] e) {
        int n;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                if ((i % 2) == 0) {
                    n = (int) (Math.random() * 10 + 1) * 2;
                } else {
                    n = (int) (Math.random() * 10 + 1) * 3;
                }
                e[i][j] = n;
            }
        }

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                System.out.print(e[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static void sumaMatriz(int[][] e) {
        int suma = 0;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                suma = suma + e[i][j];

            }

        }
        System.out.println("La suma de todos los elementos es " + suma);
    }

    public static void diagonal(int[][] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                if (i == j) {
                    System.out.print(e[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println("");

        }
    }

    public static void diagonal_extra(int[][] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                if ((i + j) == e[0].length - 1) {
                    System.out.print(e[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println("");

        }
    }

}
