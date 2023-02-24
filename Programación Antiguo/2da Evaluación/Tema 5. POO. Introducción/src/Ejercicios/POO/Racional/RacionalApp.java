/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Racional;

public class RacionalApp {

    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 6);

        System.out.println("FORMATO FRACCIÓN " + r1);

        System.out.println("FORMATO DECIMAL " + r1.toDecimal());

        System.out.println("FORMATO FRACCIÓN " + r2);

        System.out.println("FORMATO DECIMAL " + r2.toDecimal());

        System.out.println("SUMA " + r1.sumar(r2));

        System.out.println("RESTA " + r1.resta(r2));

        System.out.println("MULTIPLICACION " + r1.producto(r2));

        System.out.println("DIVISION " + r1.dividir(r2));

        System.out.println("COMPARACIONES " + r1.equals(r2));

        Racional r3 = new Racional(1,2);

        System.out.println("Probamos el orden de los objetos racional");

        System.out.println(r2.compareTo(r1));

        System.out.println(r1.compareTo(r2));

        System.out.println(r3.compareTo(r1));


    }

}
