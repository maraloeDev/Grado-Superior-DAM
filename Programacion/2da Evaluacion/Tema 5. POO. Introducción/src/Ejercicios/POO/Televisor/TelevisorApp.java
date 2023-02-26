/*
 * *
 *  * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 *  * ****************************************************************************
 *
 */

package Ejercicios.POO.Televisor;

import java.util.Scanner;

public class TelevisorApp {

static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

     Televisor televisor1 = new Televisor("123456789A",55.5,147,8,false,25,false);

     String respuesta = "h";
do {

        System.out.println("Introduce una de las opciones para saber el estado de la television" + "\n" +
                "1 Estado de la television actualmente" + "\n" +
                "2 Canal actual" + "\n" +
                "3 Volumen actual" +
                "4 Cambiar canal" + "\n" +
                "5 Subir canal" + "\n" +
                "6 Bajar canal" + "\n" +
                "7 Subir volumen" + "\n" +
                "8 Bajar volumen" + "\n" +
                "9 Poner en silencio" + "\n" +
                "10 Salir");

        switch (respuesta){
            case "1" :
                System.out.println(televisor1.toString());
                break;

            case "2" :
                System.out.println(televisor1.getCanal());
                break;

            case "3" :
                System.out.println(televisor1.getVolumenTelevisor());
                break;

            case "4" :
                System.out.println(televisor1.cambiarCanal(25));
                break;

            case "5" :
                System.out.println(televisor1.subirCanal());
                break;

            case "6" :
                System.out.println(televisor1.bajarCanal());
                break;

            case "7" :
                System.out.println(televisor1.subirVolumen());
                break;

                case "8" :
                    System.out.println(televisor1.bajarVolumen());
                    break;
            case "9" :
                televisor1.silenciarTelevisor();
            case "10" :
                System.exit(0);
                System.out.println("Has salido");

        }
}while (respuesta.isBlank());
        System.out.println("No has introducido nada");

    }


}
