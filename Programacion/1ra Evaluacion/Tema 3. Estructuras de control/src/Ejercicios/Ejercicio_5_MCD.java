/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios;

import java.util.Scanner;

/** Escribe un programa llamado MCD que lea desde el teclado dos números enteros positivos
 y que calcule el máximo común divisor de ambos.
 Para el cálculo del MCD utilizar el “algoritmo de Euclides”, que consiste en dividir el mayor
 número por el menor, quedarse con el resto y transformar dicho resto en el número menor
 y el menor de antes en el mayor de ahora. Repetir el proceso hasta que el resto sea cero. en
 ese momento el menor número será el máximo común divisor.
 Ejemplo MCD(532, 112):
 • Paso 1: 532 / 112 → resto = 84
 • Paso 2: 112 / 84 → resto = 28
 • Paso 3: 84 / 28 → resto = 0 → FIN: MCD = 28 */

public class Ejercicio_5_MCD {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int n1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        int n2 = teclado.nextInt();

        if (n1 < 0 || n2 < 0) {
            return;
        }

        //Algoritmo de Euclides
        int a; //Es el menor de los numeros
        int b; //Es el mayor de los numeros
        if (n1 <= n2) {

            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }

        int resto = 0;

        do {
            resto = a % b;

            a = b;

        } while (resto != 0);

        System.out.println("MCD" + "( " + a + " y " + b + " ) = " + n1);
    }
}
