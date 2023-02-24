/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_MiNota {

    /**
     * Cuatro números enteros entre 0 y 100 representan las puntuaciones de un estudiante de
     * informática a lo largo del curso. Escribe un programa llamado MiNota que dados cuatro
     * enteros entre 0 y 100, correspondientes a las notas de un estudiante de Informática a lo largo
     * del curso, calcula la media de estas puntuaciones y muestre la nota calificación de la
     * asignatura de acuerdo a los siguientes rangos:
     * Media Calificación
     * 90 -  100      A
     * 80 -  89       B
     * 70 -  79       C
     * 60 -  69       D
     * 0  -  59       E
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero (entre 0 y 100)");
        int n1 = teclado.nextInt();

        System.out.println("Introduce un numero (entre 0 y 100)");
        int n2 = teclado.nextInt();

        System.out.println("Introduce un numero (entre 0 y 100)");
        int n3 = teclado.nextInt();

        System.out.println("Introduce un numero (entre 0 y 100)");
        int n4 = teclado.nextInt();

        int total = ((n1+n2+n3+n4) / 4);

        if (total >= 90 && total <= 100) {
            System.out.println("Calificacion A (90 - 100)");
        } else if (total >= 80 && total <= 89) {
            System.out.println("Calificacion B ( 80 - 89");
        } else if (total>= 70 && total <= 79) {
            System.out.println("Calificacion C ( 70 - 79)");
        } else if (total >= 60 && total <= 69) {
            System.out.println("Calificacion D ( 60 - 69)");
        } else if (total >= 0 && total <= 59) {
            System.out.println("Calificacion E ( 0 - 59)");
        }
        System.out.println("El total es de " + total);

    }


}
