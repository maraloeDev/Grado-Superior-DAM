/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_3_Par {

    static Scanner teclado = new Scanner(System.in);

    public static boolean par( ){

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        boolean esPar= (numero % 2)==0;
        System.out.println(esPar);

        return esPar;
    }

    public static void main(String[] args) {
        par();
    }
}
