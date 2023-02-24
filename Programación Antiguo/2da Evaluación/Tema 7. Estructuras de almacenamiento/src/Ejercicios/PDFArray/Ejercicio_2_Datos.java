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
 * @author maraloed
 */
public class Ejercicio_2_Datos {

    public int sumaPares() {
        Scanner aguacate = new Scanner(System.in);
        int enteros[] = new int[10];
        int suma = 0;
        for (int i = 0; i < enteros.length; i = i + 2) {

            System.out.println("Introduce un numero");
            enteros[i] = aguacate.nextInt();
            
                suma = suma + enteros[i];
            
        }
        System.out.println(Arrays.toString(enteros));
        return suma;
    }

    public static void main(String[] args) {

        Ejercicio_2_Datos ej2 = new Ejercicio_2_Datos();

        System.out.println("La suma de los numeros total es de " + ej2.sumaPares());

    }
}
