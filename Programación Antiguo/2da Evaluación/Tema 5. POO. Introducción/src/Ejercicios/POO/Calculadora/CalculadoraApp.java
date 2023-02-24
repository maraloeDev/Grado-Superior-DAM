/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** *



/**
 *
 * @author maraloed
 */

import Ejercicios.POO.Calculadora.Calculadora;

import java.util.Scanner;
public class CalculadoraApp {
static Scanner teclado = new Scanner (System.in);
    public static void main(String[] args) {

//        Calculadora caLculadora1 = new Calculadora(12, 47, '+');
//        
//        System.out.println("SUMA : " + caLculadora1.suma(2,4));
//        
//        System.out.println("RESTA : " + caLculadora1.restar(2, 4));
//        
//        System.out.println("MULTIPLICACIÓN : " + caLculadora1.multiplicar(2, 4));
//        
//        System.out.println("DIVISION : " + caLculadora1.dividir(2, 4));

        Ejercicios.POO.Calculadora.Calculadora calculadora2 = new Calculadora();
        
        int opt = 0;
        
        do{
            System.out.println("Elige una opcion :");
            System.out.println("1- Suma (+)");
            System.out.println("2- Resta (-)");
            System.out.println("3- Multiplicación (*)");
            System.out.println("4- Division (/)");
            
            String operacion = teclado.next();
            
            switch (operacion){
                case "1":
                    System.out.println("La suma es : " + calculadora2.suma(2, 4));
                    break;
                    
                case "2" :
                    System.out.println("La resta es : " +  calculadora2.restar(12, 47));
                    break;
                    
                case "3" :
                    System.out.println("La resta es : " + calculadora2.multiplicar(2, 58));
                    break;
                    
                case "4" :
                    System.out.println("La división es : " + calculadora2.dividir(14, 10));
                    break;
                    default:
                        System.out.println("Opcion no contenplada");
            }
        }while (opt != 1 || opt != 2 || opt != 3 || opt != 4);

    }

}
