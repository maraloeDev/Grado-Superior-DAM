/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.Predicate;

/**
 * Escribe un programa PorcentajeNotas que lea por teclado cinco números enteros
 * correspondientes al número de sobresalientes, notables, aprobados, suspensos y no
 * presentados de una asignatura, y muestre por pantalla el porcentaje de cada uno de ellos.
 * Además, deberá mostrar el porcentaje total de presentados y de no presentados. De los
 * presentados mostrará el porcentaje de aprobados y no aprobados. Por ejemplo, si en una
 * clase de 60 los resultados fuera 5 SB, 10 N, 25 A, 9 S y 11 NP la salida del programa sería:
 * SB=5 (8.33%)
 * N=10 (16.67%)
 * A=25 (41.67%)
 * S=9 (15.00%)
 * NP=11 (18.33%)
 * Total=60 (100%)
 * Total presentados=49 (81.67%)
 * Total aprobados=40 (81.63%)
 * Total suspensos=9 (18.37%)
 * Total no presentados=11(18.33%)
 */

public class Ejercicio_5_PorcentajeNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero correspondiente al numero de sobresalientes :");
        int sobreSalientes = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de notables :");
        int notables = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de aprobados :");
        int aprobados = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de suspensos :");
        int suspensos = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de no presentados :");
        int noPresentados = teclado.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        int total = (sobreSalientes + notables + aprobados + suspensos + noPresentados);

        System.out.print("El numero total de alumnos es de: " + total + " alumnos");

        System.out.println("--------------------RELULTADOS-------------------- ");

        System.out.println("SB=" + sobreSalientes + "(" + (sobreSalientes / total) * 100 + "%)");
        System.out.println("N=" + notables + "(" + (notables / total) * 100 + "%)");
        System.out.println("A=" + aprobados + "(" + (aprobados / total) * 100 + "%)");
        System.out.println("S=" + suspensos + "(" + (suspensos / total) * 100 + "%)");
        System.out.println("NP=" + noPresentados + "(" + (noPresentados / total) * 100 + "%)");
        System.out.println("Total=" + total + "(" + total * 100 + "%)");

        System.out.println("-----------------------TOTAL------------------------------------");

        System.out.println("Total presentados=" +
                total + "%)");
        System.out.println("Total aprobados=" +
                "(" + (sobreSalientes + notables + aprobados) * 100 / (total - noPresentados) + "%)");
        System.out.println("Total suspensos=" +
                "(" + suspensos * 100 / (total - suspensos) + "%)");
        System.out.println("Total no presentados=" +
                "(" + (noPresentados / total) / (total - noPresentados) + "%)");
    }
}
