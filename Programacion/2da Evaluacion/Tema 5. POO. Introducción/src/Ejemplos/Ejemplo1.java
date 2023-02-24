package Ejemplos;

import java.util.Scanner;


/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
/**
 *
 * @author maraloed
 */
public class Ejemplo1 {
    static Scanner teclado = new Scanner (System.in);
    public static String Saludo(String mensaje){
        String mayus = mensaje.toUpperCase();
        return mensaje;
        

    }
    
    public static void main(String[] args) {
        System.out.println("Iniciando el programa Ejemplo1");
        System.out.println("Llamamos al metodo saludo");
        
        System.out.println("Hola, buenos días");
        System.out.println("Adios!!...");
        
        System.out.println("Fin del ejemplo1");
    }
    
}
