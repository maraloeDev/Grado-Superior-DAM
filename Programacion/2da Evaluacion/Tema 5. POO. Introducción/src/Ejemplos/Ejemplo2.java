package Ejemplos;

import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class Ejemplo2 {

    static Scanner teclado = new Scanner(System.in);
    static int numero;

    public static String Saludo(String mensaje) {
        String mayus = mensaje.toUpperCase();
        numero = 12;
        return mensaje;

    }

    public static void main(String[] args) {
        System.out.println("Iniciando el programa Ejemplo1");
        System.out.println("Llamamos al metodo saludo");

        numero = 23;
        System.out.println("Hola, buenos días");
        System.out.println("Adios!!...");

        System.out.println("Fin del ejemplo1");
    }

}
