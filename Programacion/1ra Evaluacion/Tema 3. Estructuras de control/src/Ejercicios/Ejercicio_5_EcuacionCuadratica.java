/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa llamado EcuacionCuadratica que resuelva la ecuación de segundo grado
 * ax2 + bx + c = 0, donde a ≠ 0.
 */

public class Ejercicio_5_EcuacionCuadratica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique un valor para A");
        double a = teclado.nextDouble();

        System.out.println("Indique un valor para B");
        double b = teclado.nextDouble();

        System.out.println("Indique un valor para C");
        double c = teclado.nextDouble();

        System.out.println("Indique un valor para D");
        double d = teclado.nextDouble();

        System.out.println("Indique un valor para E");
        double e = teclado.nextDouble();

        System.out.println("Indique un valor para F");
        double f = teclado.nextDouble();


        double x = (c * e - b * f) / (a * e - b * d);
        double y = (a * f - c * d) / (a * e - b * d);

        System.out.println("Sistema a resolver:");
        System.out.println(a + "x + " + b + "y = " + c);
        System.out.println(d + "x + " + e + "y = " + f);

        System.out.println();

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        System.out.println();
        System.out.println("Comprobacion:");
        System.out.println(a + "x + " + b + "y = " + a * x + " + " + b * y + " = " + c);
        System.out.println(d + "x + " + e + "y = " + d * x + " + " + e * y + " = " + f);

    }


}
