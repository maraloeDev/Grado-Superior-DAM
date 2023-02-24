/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_3_SentenciaBucleFor_Pares {

    //Hacer un programa que sume los números pares positivos menores o iguales
    //que 100 utilizando un bucle for.
    //RESULTADO 2550
    public static void main(String[] args) {

        int resultado = 0;
        int i;

        for ( i = 0; i <= 100 ; i++) {
            if ((i % 2) == 0 ){
                System.out.println(i);
                resultado = resultado + i;
            }

        }
            System.out.println("La suma de todos los numeros pares es de :" + (resultado) );

    }
}
