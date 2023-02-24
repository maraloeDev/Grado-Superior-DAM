/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.PDFColecciones;

import java.util.Scanner;


/**
 *
 * @author maraloed
 */
public class Ejercicio_1_Agenda {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        Contacto contacto1= new Contacto();
        int respuesta;
        do{
        System.out.println("Seleccione que quiere hacer en la agenda " + "\n"
                + "1- Anadir nuevo contacto" + "\n"
                + "2- Buscar Contacto (Por nombre o telefono)" + "\n"
                + "3- Nodificar contacto " + "\n"
                + "4- Eliminar contacto " + "\n"
                + "5- Mostrar agenda de contactos " + "\n"
                + "6- Vaciar agenda");
        
         respuesta = teclado.nextInt();
         
         switch (respuesta){
             case 1 :
                 System.out.println(contacto1.anadirContacto();
         }
        } while (respuesta ==1 || respuesta == 6);
        System.out.println("Opcion no contemplada");
        
        
        
    }
        
        


    }