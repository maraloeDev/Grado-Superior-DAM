/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Examen.Problema2;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dni = "1";
        int DNI_numero = 1;
        do {
            System.out.println("Introduce numero DNI:");
            dni = teclado.nextLine(); //Pido el numero mediante un string
            DNI_numero = Integer.parseInt(dni);
            //casteo el numero, por que si no, no podria dividirlo con el modulo 23
            if (dni.length() > 8 || dni.length() < 8) {

                System.out.println("Error. El DNI debe tener 8 dígitos");
                System.out.print("Introduce numero DNI:");

            }

        } while (dni.length() > 8 || dni.length() < 8);
        String letra = "";

        switch ((DNI_numero % 23)) {
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;

        }
        System.out.println("Letra " + letra);
    }

}
