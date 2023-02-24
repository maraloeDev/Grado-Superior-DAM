/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
package Ejemplos;

import java.util.Arrays;

/**
 *
 * @author Eduardo Martín-Sonseca
 */
public class EjemploString {

    public static void main(String[] args) {

        String cadena1 = "Cadena para prueba";
        String cadena2 = " Cadena para prueba ";
        String cadena3 = "cadena para prueba";
        String cadena4 = " concatenada con nueva cadena";
        String cadena5 = "a";
        String cadena6 = "A";
        char[] arrayCadena7 = {'C', 'a', 'd', 'e', 'n', 'a'};

        //Transforma la cadena a mayusculas 
        System.out.println(cadena1.toUpperCase());

        //Transforma la cadena a minusculas 
        System.out.println(cadena1.toLowerCase());

        //Comparar cadenas
        System.out.println("¿La cadena 1 es igual a la cadena2? " + cadena1.equals(cadena2));
        System.out.println("¿La cadena 1 es igual a la cadena3? " + cadena1.equals(cadena3));

        //Comparar cadenas sin distinguir mayusculas de minusculas
        System.out.println("¿Cadena 1 es igual que cadena 3? " + cadena1.equalsIgnoreCase(cadena3));

        //Medir la longitud de la cadena
        System.out.println(cadena1.length() + " caracteres");

        //Cadena sin espacios en blanco por delante y por detras 
        System.out.println(cadena2.trim());

        //Devuelve el caracter que coincide con el indice indicado en el parametro
        //Indice comienza en 0, de tal forma que el indice 2 corresponde con el tercer caracter
        System.out.println("Tercer caracter de la cadena 1 " + cadena1.charAt(2));

        //Separar la cadena original en caracteres a acumular en un array 
        System.out.println("String troceado ");
        System.out.println(Arrays.toString(cadena1.toCharArray()));

        //Concatenación de cadenas
        System.out.println(cadena1 + cadena4);
        System.out.println(cadena1.concat(cadena4));

        //Comparar dos cadenas
        System.out.println(cadena5.compareTo(cadena6));

        //comparar dos cadenas ignorando las mayusculas y minusculas
        System.out.println(cadena5.compareToIgnoreCase(cadena6));

        //Convertir un array a cadena
        String cadena7 = String.copyValueOf(arrayCadena7);
        System.out.println(cadena7);

        //Array tipo bytes con los codigos ASCII de los caracteres de la cadena7
        System.out.println(Arrays.toString(cadena6.getBytes()));

        //Extraer partes de una cadena empezando por en el caracter 4 (posicion3)
        System.out.println(cadena7.substring(3, 6));

        //La cadena5 empieza por cadena?
        System.out.println("La cadena 5 empieza por los caracteres Cadena " + cadena4.endsWith("Cad"));

        //Posicion que ocupa 'p' en la cadena 1
        System.out.println("Posicion que ocupa 'p' en la cadena 1 " + cadena1.indexOf('p'));

        //Hay una 'p' a partir de la posicion 13?
        System.out.println("Hay una 'p' a partir de la posicion 13? " + cadena1.indexOf('p', 13));

        //Posición que ocupa la ultima 'p' en la cadena1
        System.out.println("Posición que ocupa la ultima 'p' en la cadena1 " + cadena1.lastIndexOf('p'));

        //Ultima 'a' dentro de las 6 posiciones iniciales
        System.out.println("Ultima 'a' dentro de las 6 posiciones iniciales" + cadena1.lastIndexOf('a', 6));

        //Transformar el valor entero 5 en String
        int numero = 5;
        String cadenanumero = String.valueOf(numero);
        System.out.println("Numero 5 transformado a cadena " + cadenanumero);

        //Reemplazar una cadena por otra
        System.out.println(cadena1.replace("prueba", "Experimentos"));

    }
}
