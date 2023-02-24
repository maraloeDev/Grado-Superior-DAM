/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/
package Ejercicios;

import java.util.Scanner;

/** Escribe un programa Binario que lea tres números, en tres entradas independientes desde el
 teclado (del bit más significativo al menos significativo). Estos números deberán ser o 0 o 1,
 de modo que si el usuario introduce otro número distinto a 0 o 1 el programa finalizará
 mostrando al usuario un mensaje de error. El programa debe tratar estos números como si
 se tratasen de un número binario de tres bits y mostrar su valor en decimal.
 Nota: El número binario b2 b1 b0 con b = 0, 1 en decimal se calcula como 2*2*b 2 + 2*b1 + b0 .*/

public class Ejercicio_2_Binario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce bit 2");
        int bit2 = teclado.nextInt();

        System.out.println("Introduce bit 1");
        int bit1 = teclado.nextInt();

        System.out.println("Introduce bit0 ");
        int bit0 = teclado.nextInt();

        if (bit2 != 0 && bit2 != 1 || bit1 != 0 && bit1 != 1 || bit0 != 0 && bit0 != 1) {
            System.out.println("El numero es Incorrecto");
        } else {
            int resultado = (bit2 + 2 * bit1 + bit0 + bit0 * 1);
            System.out.println("El resultado decimal es: " + resultado);
        }
    }
}
