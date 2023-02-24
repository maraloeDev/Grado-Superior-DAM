/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.Metodos;

/**
 *
 * @author marti
 */
public class Ejercicio_3_Par {

    public static boolean par(int numero) {
        if ((numero % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(par(21));
    }

}
