/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class EjemplosWrappers {
    
    public static void main(String[] args) {
        /** Uso de parse 
         * 
         * Para transformar de string a tipo basico
         */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        int edad = Integer.parseInt(teclado.next());
        
        System.out.println("Introduce una cantidad ");
        String cantidad = teclado.nextLine();
        
        Integer cantid=Integer.valueOf(cantidad);
        
        
        String.valueOf(edad);
        
        System.out.println("Introduce el codigo postal");
        

        
    }
    
}
