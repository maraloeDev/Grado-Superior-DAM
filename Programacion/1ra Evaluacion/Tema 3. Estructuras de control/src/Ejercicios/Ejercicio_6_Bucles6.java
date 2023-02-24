/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;
@SuppressWarnings("ALL")
public class Ejercicio_6_Bucles6 {

    /** Programa que pida al usuario su estado civil
     *
     * S : Soltero
     * C : Casado
     * D : Divorciado
     * V : Viudo
     *
     * Si el usuario introduce un valor no contenplado el programa mostrara un mensaje informativo y volvera a realizar la pregunta
     *
     * Ejemplo
     *
     * Estado civil : (S/C/D/V) g
     * Entrada incorrecta

     * Estado civil : (S/C/D/V) z
     * Entrada incorrecta
     * Estado civil : (S/C/D/V) C
     * Casado
     *
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Estado civil : (S/C/D/V)");
        char estadoC=teclado.next().charAt(0);


        while (estadoC != 'S' && estadoC != 'C' && estadoC != 'D' && estadoC != 'V'){
            System.out.println("Entrada incorrecta");
            System.out.println("Estado civil : (S/C/D/V)");
            estadoC = teclado.next().charAt(0);
        }

        switch (estadoC){
            case 'C', 'c' :
                System.out.println("Casasdo");
                break;

            case 'D', 'd' :
                System.out.println("Divorciado");
                break;

            case 'S', 's' :
                System.out.println("Soltero");
                break;

            case 'V', 'v' :
                System.out.println("Viudo");
                break;
        }

    }


    }
