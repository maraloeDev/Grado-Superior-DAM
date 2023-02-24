/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maraloed
 */
public class EjemploMatriz {

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j != m[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void mostrarMatriz_bis(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
    
    public static void rellenoAleatorio(int[][] m) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(0, 10);
            }
            System.out.println("Linea " + i + " rellenada.");
        }
    }

    
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        mostrarMatriz(matriz);
        rellenoAleatorio(matriz);
        mostrarMatriz_bis(matriz);
    }
}
