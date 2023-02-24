/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_9_DiasDelMes {

    /**Escribe un programa DiasDelMes, que reciba desde el teclado el número de un mes (del 1
     al 12) y muestre el número de días de ese mes (febrero 28 días). Utilizar el operador ternario
     ?*/

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un numero del 1 al 12 ");

        int mes =teclado.nextInt();

        String eleccion =
                (mes == 1) ? "Enero " :
                (mes == 2) ? "Febrero " :
                (mes == 3) ? "Marzo " :
                (mes == 4) ? "Abril " :
                (mes == 5) ? "Mayo " :
                (mes == 6) ? "Junio " :
                (mes == 7) ? "Julio " :
                (mes == 8) ? "Agosto " :
                (mes == 9) ? "Septiembre " :
                (mes == 10) ? "Octubre " :
                (mes == 11) ? "Noviembre " :
                (mes == 12) ? "Diciembre " : "Mes no contemplado";

        String dias =
                (mes == 1) ? " 31" :
                (mes == 2) ? " 28" :
                (mes == 3) ? " 31" :
                (mes == 4) ? " 30" :
                (mes == 5) ? " 31" :
                (mes == 6) ? " 30" :
                (mes == 7) ? " 31" :
                (mes == 8) ? " 31" :
                (mes == 9) ? " 30" :
                (mes == 10) ?" 31" :
                (mes == 11) ?" 31" :
                (mes == 12) ?" 31" : "0";
        System.out.println("--------------------------------------");
        System.out.println("El mes que ha elegido es : " + eleccion + " y tiene " + dias + " dias");
    }
}
