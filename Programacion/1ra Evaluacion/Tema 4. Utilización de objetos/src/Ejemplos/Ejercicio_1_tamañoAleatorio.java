/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Random;

/**
 *
 * @author maraloed
 */
/**
 * Programa que cree palabras de tamaño aleatorio (minimo 1 y maximo 25) cuyos
 * caracteres sean tambien generados tambien aleatoriamente
 *
 * NOTAS 1* Usa la clase random para generar los aleatorios 2* Los caracteres
 * que forman las palabras seran imprimibles
 *
 * Palabra generada (tamaño 5) cx12Z
 */
public class Ejercicio_1_tamañoAleatorio {

    /*public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(25) + 1; //Generador de numeros aleatorios entre 1 y 25
        char caracterMayus = (char) (random.nextInt(65, 90)); // Generador de caracteres entre a y z
        char caracterMinus = (char) (random.nextInt(97, 122)); // Generador de caracteres entre A y Z

        String caraMayus = String.valueOf(caracterMayus);
        String caraMinus = String.valueOf(caracterMinus);
        String num = String.valueOf(numero);

        int totalMay = caraMayus.length();
        int totalMin = caraMinus.length();
        int totnum = num.length();

        System.out.println("Palabra generada (tamano " + (totalMay + totnum + totalMay) + ")"
                + caracterMayus + "" + caracterMinus + "" + numero);

    }*/
    public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(25) + 1; //Generador de numeros aleatorios entre 1 y 25
        int aleatorio = 0;
        String resultado = "";
        int i = 0;
        for (i = 0; i < numero; i++) {
            aleatorio = random.nextInt(94) + 33;

            resultado = resultado + (char) aleatorio;
        }
        System.out.println("Palabra generada ( tamano " + i + ") " + resultado);
    }

}
