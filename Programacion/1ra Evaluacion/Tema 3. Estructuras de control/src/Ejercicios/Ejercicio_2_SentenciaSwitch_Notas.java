/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

        //Hacer un programa llamado Notas que lea por teclado un entero
        //correspondiente a la nota de un examen y muestre por pantalla a qué
        //calificación corresponde (MD=0,1,2, I=3,4, A=5, B=6, N=7,8, SB=9,10).

import java.util.Scanner;

public class Ejercicio_2_SentenciaSwitch_Notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica una nota :");
        int numero1 = teclado.nextInt();

        switch (numero1){

            case 0 :
            case 1 :
            case 2 :
                System.out.println("Myu Deficiente");
                break;

            case 3 :
            case 4 :
                System.out.println("I");
                break;

            case 5 :
                System.out.println("A");
                break;

            case 6 :
                System.out.println("B");
                break;

            case 7 :
            case 8 :
                System.out.println("N");
                break;

            case 9 :
            case 10 :
                System.out.println("SB");
                break;

            default:
                System.out.println("No se puede evaluar");

        }

    }
}
