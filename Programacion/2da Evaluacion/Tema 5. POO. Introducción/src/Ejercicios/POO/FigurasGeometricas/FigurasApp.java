/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.POO.FigurasGeometricas;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class FigurasApp {

    static Scanner teclado = new Scanner(System.in);

    static Figura_Circulo circulo1 = new Figura_Circulo(25, 4, 5);
    static Figura_Rectangulo rectangulo1 = new Figura_Rectangulo(4, 2, 47, 85);
    static Figura_Cuadrado cuadrado1 = new Figura_Cuadrado(25, 4, 8);
    static Figura_Triangulo triangulo1 = new Figura_Triangulo(25, 4, 87, 4, 78);

    public static void main(String[] args) {

        System.out.println("El radio y las coordenadas del circulo es " + circulo1.toString());
        System.out.println("La base, la altura y las coordenadas del rectangulo es " + rectangulo1.toString());
        System.out.println("El lado y las coordenadas del cuadrado es " + cuadrado1.toString());
        System.out.println("La La base, la altura y las coordenadas del triangulo es " + triangulo1.toString());

        String opt = "h";

        System.out.println("Introduce una opcion para sacar el perimetro,"
                + "diagonas y areas " + "\n "
                + "1- Circulo " + "\n"
                + "2- Rectangulo " + "\n"
                + "3- Cuadrado " + "\n"
                + "4- Triangulo" + "\n");

        opt = teclado.nextLine();

        switch (opt) {
            case "1":
                System.out.println("El area del circulo es " + circulo1.areaCirculo());
                System.out.println("El perimetro del circulo es " + circulo1.perimetroCirculo());
                break;

            case "2":
                System.out.println("El area del rectangulo es " + rectangulo1.areaRectangulo());
                System.out.println("El perimetro del rectangulo es " + rectangulo1.perimetroRectangulo());
                System.out.println("La diagonal del rectangulo es " + rectangulo1.diagonalRectangulo());
                break;

            case "3":
                System.out.println("El area del cuadrado es " + cuadrado1.areaCuadrado());
                System.out.println("El perimetro del cuadrado es " + cuadrado1.perimetroCuadrado());
                System.out.println("La diagonal del cuadrdrado es " + cuadrado1.diagonalCuadrado());
                break;

            case "4":
                System.out.println("El area del triangulo es " + triangulo1.areaTriangulo());
                System.out.println("El perimetro del triangulo es " + triangulo1.perimetroTriangulo());
                break;
            default:
                System.out.println("Opcion no contemplada");

        }

    }

}
