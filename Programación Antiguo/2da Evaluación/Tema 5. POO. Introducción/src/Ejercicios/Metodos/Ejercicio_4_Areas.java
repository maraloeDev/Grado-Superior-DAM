/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_4_Areas {

    static Scanner teclado = new Scanner(System.in);

    public static double circulo( double radio) { //Metodo que calcula el area de un circulo

        System.out.println("Introduce un radio para el circulo");
        radio = teclado.nextDouble();

        double areaCirculo = (int) (Math.PI * Math.pow(radio, 2));
        return areaCirculo;
    }

    public static double cuadrado(double lado) { //Metodo que calcula el area de un cuadrado

        System.out.println("Introduce un lado para el cuadrado");
         lado = teclado.nextDouble();

        double areaCuadrado = (int) (Math.pow(lado, lado));
        return areaCuadrado;
    }

    public static double rectangulo(double base, double altura) { //Metodo que calcula el area de un rectangulo

        System.out.println("Introduce la base del rectangulo");
        base = teclado.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        altura = teclado.nextDouble();

        double areaRectangulo = (int) (base * altura);
        return areaRectangulo;
    }

    public static double triangulo(double base, double altura) { //Metodo que calcula el area de un triangulo

        System.out.println("Introduce la base del rectangulo");
        base = teclado.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        altura = teclado.nextDouble();

        double areaTriangulo = (int) (base * altura) / 2;
        return areaTriangulo;
    }

    public static void main(String[] args) {
        int eleccion;

        do {

            System.out.println("Introduce el numero de la figura geometrica a calcular" + "\n" +
                    "\t" + "1 Circulo" + "\n" +
                    "\t" + "2 Cuadrado" + "\n" +
                    "\t" + "3 Rectangulo" + "\n" +
                    "\t" + "4 Triangulo");
            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:
                    circulo(5);
                    break;
                case 2:
                    cuadrado(4);
                    break;
                case 3:
                    rectangulo(8,4);
                    break;
                case 4:
                    triangulo(4,2);
                    break;
                default:
                    System.out.println("Ese numero no figura en la lista");
            }
        } while ((eleccion >=1) );


    }


}
