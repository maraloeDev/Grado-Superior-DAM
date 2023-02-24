/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_4_OperacionesAritmeticas {

    /**
     * Escribe un programa llamado OperacionesAritmeticas que genere dos números enteros
     * aleatorios A y B entre 0 y 10 (ambos inclusive) y muestre las 5 operaciones aritméticas básicas
     * +, -, *, / y % que pueden hacerse entre ellos en el sentido A op B. Utiliza para generar los
     * números aleatorios el método random() de la clase Math
     */

    public static void main(String[] args) {

        double aleatorios = (int) (Math.random() * 10);
        double aleatorios2 = (int) (Math.random() * 10);

        System.out.println("SUMA" + (aleatorios + aleatorios2));
        System.out.println("RESTA" + (aleatorios - aleatorios2));
        System.out.println("MULTIPLICACION" + (aleatorios * aleatorios2));
        System.out.println("DIVISION" + (aleatorios / aleatorios2));
        System.out.println("RESTO" + (aleatorios % aleatorios2));


    }
}
