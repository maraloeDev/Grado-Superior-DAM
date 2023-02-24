/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */
package Ejercicios.PDFArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author maraloed
 */
public class Ejercicio_4_Frases {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] frases = new String[5];

        Ejercicio_4_Frases ej4 = new Ejercicio_4_Frases();

        for (int i = 0; i < frases.length; i++) {
            System.out.println("Introduce una frase");
            frases[i] = teclado.nextLine();
        }

        System.out.println(Arrays.toString(frases));


        System.out.println("""
                Selecciona una opcion
                1 Imprimir frases
                2 Imprimir la frase con mayor longitud
                3 Imprimir la frase con menor longitud
                4 Salir""");

        int opt = teclado.nextInt();

        switch (opt) {
            case 1:
                imprimeFrases(frases);

            case 2:
                mayorFrase(frases);

            case 3:
                menorFrase(frases);
                break;
            case 4:
                System.out.println("Has salido");
                System.exit(0);

        }

    }

    public static void imprimeFrases(String[] frases) { // Imprime el contenido de las frases

        System.out.println(Arrays.toString(frases));

    }

    public static void mayorFrase(String[] frases) {
        String masLarga = ""; // La frase más larga se añade el valor de cadena
        for (String frase : frases) {

            if (frase.length() > masLarga.length()) {
                masLarga = frase;
            }
        }
        System.out.println("La frase con mayor longitud es " + masLarga);
    }

   public static void menorFrase(String[] frases) {
        int longsPequeno = Integer.MAX_VALUE;
        String masPequeno="";
       for (String frase : frases) {

           if (frase.length() < longsPequeno) {
               longsPequeno = frase.length();
               masPequeno = frase;
           }

       }
        System.out.println("La frase con menor longitud es " + masPequeno);
    }


}
