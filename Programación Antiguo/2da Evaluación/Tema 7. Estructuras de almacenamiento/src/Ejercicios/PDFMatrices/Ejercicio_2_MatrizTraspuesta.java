/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.PDFMatrices;

import java.util.Random;

/**
 *
 * @author marti
 */
public class Ejercicio_2_MatrizTraspuesta {

    static Random rndm = new Random();

    public static void main(String[] args) {

        int[][] enterosAleatorios = new int[4][5];
        int[][] enterosAleatorios2 = new int[5][4];
        System.out.println("NORMAL");
        normal(enterosAleatorios);
        System.out.println("----------------------");
        System.out.println("TRASPUESTA");
        traspuesta(enterosAleatorios2);

    }

    public static void normal(int[][] ea) {
        int numero;
        for (int i = 0; i < ea.length; i++) {
            for (int j = 0; j < ea[0].length; j++) {
                numero = rndm.nextInt(1, 100);

                ea[i][j] = numero;

            }

            System.out.print("");
        }
        for (int i = 0; i < ea.length; i++) {
            for (int j = 0; j < ea[0].length; j++) {
                System.out.print(ea[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static void traspuesta(int[][] ea) {
        int numero;
        for (int j = 0; j < ea.length; j++) {
            for (int i = 0; i < ea[0].length; i++) {
                numero = rndm.nextInt(1, 100);

                ea[j][i] = numero;

            }

            System.out.print("");
        }
        for (int j = 0; j < ea.length; j++) {
            for (int i = 0; i < ea[0].length; i++) {
                System.out.print(ea[j][i] + "\t");

            }
            System.out.println("");

        }
    }

}
