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
public class Ejercicio_3_Datos2 {
    
    public int sumaImpares() {
        Scanner aguacate = new Scanner(System.in);
        int enteros[] = new int[10];
        int suma = 0;
        for (int i = 0; i < enteros.length; i++) {

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
