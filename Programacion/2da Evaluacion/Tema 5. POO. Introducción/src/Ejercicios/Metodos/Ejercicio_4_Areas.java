/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.Metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio_4_Areas {

    static DecimalFormat df = new DecimalFormat("0.00");
//Sirve para poner un limite de decimales (En este caso 2)
    static Scanner teclado = new Scanner(System.in);

    public static String circulo() {
        System.out.println("Introduzca un radio para el circulo");
        double radio = teclado.nextDouble();

        return df.format(Math.PI * (Math.pow(radio, 2)));

    }

    public static String cuadrado() {

        System.out.println("Introduzca un lado para el cuadrado");
        double lado1 = teclado.nextDouble();

        System.out.println("Introduzca un lado para el cuadrado");
        double lado2 = teclado.nextDouble();

        return df.format(lado1 * lado2);
    }

    public static String rectangulo() {

        System.out.println("Introduzca un largo para el rectangulo");
        double largo = teclado.nextDouble();

        System.out.println("Introduzca un ancho para el rectangulo");
        double ancho = teclado.nextDouble();

        return df.format(largo * ancho);
    }

    public static String triangulo() {

        System.out.println("Introduzca un base para el triangulo");
        double base = teclado.nextDouble();

        System.out.println("Introduzca un altura para el triangulo");
        double altura = teclado.nextDouble();

        return df.format((base * altura) / 2);
    }

    public static void main(String[] args) {

        System.out.println("Introduce una figura para calular su area" + "\n"
                + "1 Circulo" + "\n"
                + "2 Cuadrado" + "\n"
                + "3 Rectangulo" + "\n"
                + "4 Triangulo");
        int opt = teclado.nextInt();

        switch (opt) {
            case 1:
                System.out.println(circulo());
                break;
            case 2:
                System.out.println(cuadrado());
                break;
            case 3:
                System.out.println(rectangulo());
                break;
            case 4:
                System.out.println(triangulo());
                break;
            default:
                System.out.println("No es la respuesta correcta");
        }

    }

}
