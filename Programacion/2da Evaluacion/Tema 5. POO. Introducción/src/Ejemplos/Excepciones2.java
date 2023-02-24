/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Excepciones2 {
    
    public double dividir(int a, int b){
            try{
                return a/b;
            } catch(ArithmeticException ex){
                
           System.err.println("Error al dividir");
            return 0;
            }
        }
        
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            try{
                
            System.out.println("Numerador : ");
            int numerador = teclado.nextInt();
            
            System.out.println("Denominador : ");
            int denominador = teclado.nextInt();
            
            Excepciones1 e1 = new Excepciones1();
            System.out.println(e1.dividir(numerador, denominador));
            } catch(ArithmeticException ex){
                System.err.println("Error al dividir");
            }
    }
    
}
