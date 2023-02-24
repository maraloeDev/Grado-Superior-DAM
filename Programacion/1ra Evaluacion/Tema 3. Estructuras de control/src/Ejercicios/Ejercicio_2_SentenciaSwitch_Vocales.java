/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2_SentenciaSwitch_Vocales {

    //Hacer un programa llamado Vocales que reciba por teclado un carácter y
    //muestre por pantalla si se trata de una vocal o no. Hacer el programa con
    //sentencias if anidadas en primer lugar y después con una estructura
    //switch.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un caracter");

        char caract = teclado.next().toLowerCase().charAt(0);

        switch (caract) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Has introducido una vocal");
                break;
            default:
                System.out.println("No es una vocal");

        }

    }

}
    

