/*
 * *
 *  * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 *  * ****************************************************************************
 *
 */

package Ejercicios.POO.Televisor;

public class TelevisorApp {
    public static void main(String[] args) {
        Televisor television = new Televisor("12345678-AA", 55.5, 50, 30, false);
        System.out.println(television.toString());

        System.out.println("La televisión esta encendida " + television.encenderse(true));


        System.out.println("Canal " + television.cambiarCanal(56) );

        System.out.println("La televisión esta apagada " + television.encenderse(false));

        television.getCanal();

        System.out.println("Canal " + television.getCanal());
    }
}
