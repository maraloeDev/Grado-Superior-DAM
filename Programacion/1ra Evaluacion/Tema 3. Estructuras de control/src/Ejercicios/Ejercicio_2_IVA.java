/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2_IVA {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /**Realiza un programa que solicite al usuario una cantidad (real)
         //y el tipo de IVA (G: 21%, R: 10%, S: 4%), y muestre el desglose de la siguiente forma:
         //
         //BI: (base imponible -> total menos el IVA)
         //
         //IVA: (% de IVA aplicado sobre la base imponible)
         //
         //Por ejemplo, si la cantidad es 1210 y el IVA es G, el resultado del programa será:
         //
         //BI: 1000
         //
         //IVA: 210/**/


        System.out.println("Introduce una cantidad en euros ");
        double cantidad = teclado.nextDouble();

        double G = (cantidad / 1.21);
        double R = (cantidad / 0.10);
        double S = (cantidad / 0.04);
        double ivaG = (cantidad - G);
        double ivaR = (cantidad - R);
        double ivaS = (cantidad - S);

        System.out.println("--------------");

        System.out.println("Introduce el tipo de IVA " + "\n"
                + " G: 21% " + "\n"
                + " R: 10% " + "\n"
                + " S: 4% ");
        String eleccion = teclado.next();

        switch (eleccion) {

            case "G", "g":
                System.out.println("BI : " + G + "\n"
                        + "IVA : " + ivaG);
                break;
            case "R", "r":
                System.out.println("BI : " + R + "\n"
                        + "IVA : " + ivaR);
                break;
            case "S", "s":
                System.out.println("BI : " + S + "\n"
                        + "IVA : " + ivaS);
                break;
            default:
                System.out.println("Numero no contenplado ");
        }

    }
}
