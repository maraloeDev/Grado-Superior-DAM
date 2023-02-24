/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_2_Divisor {

    public static void divisor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int entero = teclado.nextInt();

        System.out.println("Introduce un divisor");
        int divisor = teclado.nextInt();

        do {

            if ((entero == divisor) || (divisor > entero )) {
                System.out.println("El numero entero y el divisor son iguales");
            }
            System.out.println("Introduce un numero entero");
             entero = teclado.nextInt();

            System.out.println("Introduce un divisor");
             divisor = teclado.nextInt();

        } while (entero == divisor);

        System.out.println("El divisor mas grande introducido es " + divisor);
    }

    public static void main(String[] args) {
        divisor();
    }


}
