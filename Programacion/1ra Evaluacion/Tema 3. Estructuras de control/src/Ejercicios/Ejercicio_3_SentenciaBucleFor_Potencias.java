/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_3_SentenciaBucleFor_Potencias {

    //Hacer un programa que imprima por pantalla todas las potencias de 2 entre 1 y
    //100 utilizando un bucle for

    public static void main(String[] args) {
        for (int i = 1; (int) Math.pow(2, i) <= 100; i++) {

            if (i <= 100){
                System.out.println(i + " elevado a 2  = " + (int) Math.pow(2, i));
            }

        }

    }

}
