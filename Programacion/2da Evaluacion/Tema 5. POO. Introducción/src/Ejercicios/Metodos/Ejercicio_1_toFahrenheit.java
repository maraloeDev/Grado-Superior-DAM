/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_1_toFahrenheit {

    public static double farenheit() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique una tenperatura en grados celsius");
        double celsius = teclado.nextDouble();

        double formula = (celsius * 9/5) +32;
        return formula;
    }

    public static void main(String[] args) {

        System.out.println("Los grados celsius pasados a temperatura es " + farenheit());
    }

}
