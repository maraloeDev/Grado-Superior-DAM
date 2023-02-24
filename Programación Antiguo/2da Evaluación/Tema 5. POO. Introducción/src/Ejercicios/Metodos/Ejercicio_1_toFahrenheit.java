/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

/* Escribe un método llamado toFahrenheit que convierta una temperatura dada en grados
Celsius a grados Fahrenheit. La fórmula de conversión es:
F = 9 / 5 C + 3 */

import java.util.Scanner;

public class Ejercicio_1_toFahrenheit {

    public static void toFahrenheit() { //Los metodos no se ejecutan si no hay un metodo main
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura en grados Celsius");
        double celsius = teclado.nextDouble();

        double f = (celsius * 9/5) + 32;
        System.out.println(f);

    }

    public static void main(String[] args) { //Si hay un metodo main, se ejecuta el metodo entero
        toFahrenheit();
    }
}
