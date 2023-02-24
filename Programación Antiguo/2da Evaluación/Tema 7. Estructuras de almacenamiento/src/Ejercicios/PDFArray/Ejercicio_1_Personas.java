/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */

package Ejercicios.PDFArray;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_1_Personas {

    static Scanner teclado = new Scanner(System.in);

    static String personas[] = new String[5];

    public String imprimePersonas() {

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introduce el nombre de personas ");
            personas[i] = teclado.nextLine();

        }

        String msg = "";
        for (int i = 0; i < personas.length; i++) {
            msg = msg + personas[i] + "\n";
        }

        return msg;
    }

    public String pares() {

        String personas[] = new String[5];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introduce el nombre de personas ");
            personas[i] = teclado.nextLine();

        }

        String msgPares = "";
        for (int i = 0; i < personas.length; i = i + 2) {

            msgPares = msgPares + personas[i] + "\n";

        }
        System.out.println("------------");
        return msgPares;

    }

    public static void main(String[] args) {
        Ejercicio_1_Personas p1 = new Ejercicio_1_Personas();
        System.out.println("Seleccione una opcion"
                + "\n" + " 1 imprimePersonas"
                + "\n" + " 2 Pares"
                + "\n" + " 3 Salir");
        int resp = teclado.nextInt();

        switch (resp) {
            case 1:
                System.out.print(p1.imprimePersonas());
                break;
            case 2:
                System.out.println(p1.pares());
                break;
            case 3:
                System.exit(0);
        }

    }

}
