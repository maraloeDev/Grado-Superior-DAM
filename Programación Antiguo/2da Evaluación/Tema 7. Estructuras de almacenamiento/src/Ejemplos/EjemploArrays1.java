/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author marti
 */
public class EjemploArrays1 {
    //metodo que devuelva el numero de personas con una altura superior 
    //a la pasada como parametro

    public static int numPersonasAltura(int[] alturas, int altura) {
        int contPersonas = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] >= altura) {
                contPersonas++;
            }
        }
        return contPersonas;
    }

    //metodo que aumente las alturas en un numero de cm dado
    public static void aumentoAlturas(int[] alturas, int aumento) {
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] != -1) {
                alturas[i] += aumento;
            }
        }
    }

    //metodo que busque en el array de alturas la mas alta y devuelva la posicion
//    public static int indexMayorAltura(int[] alturas) {
////        int mayor = 0;
////        for (int i = 0; i < alturas.length; i++) {
////            if (alturas[i] > mayor) {
////                mayor = alturas[i];
////            }
////        }
//        int index = 0;
//        for (int i = 0; i < alturas.length; i++) {
//            if (alturas[i] == mayorAltura(alturas)) {
//                index = i;
//            }
//        }
//        return index;
//    }
    public static int mayorAltura(int[] alturas) {
        int mayor = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > mayor) {
                mayor = alturas[i];
            }
        }
        return mayor;
    }

    public static int indexMayorAltura(int[] alturas) {
        int mayor = 0;
        int index = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > mayor) {
                mayor = alturas[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int tam = 30;
        int[] alturas; //declaracion
        alturas = new int[tam]; //creacion

        String[] nombres = new String[10]; //en una linea

        System.out.println(Arrays.toString(alturas));

        Arrays.fill(alturas, -1);

        System.out.println(Arrays.toString(alturas));
        System.out.println(Arrays.toString(nombres));

        //Vamos a llenar el array alturas con las alturas
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            alturas[i] = rand.nextInt(100, 201);
        }
        System.out.println(Arrays.toString(alturas));

        //mostrar la altura media
        int suma = 0;
        int lleno = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] != -1) {
                suma += alturas[i];
                lleno++;
            }
        }
        System.out.println("Media altura: " + (double) (suma) / lleno);

        System.out.println("Numero de personas que midan mas que 150: " + numPersonasAltura(alturas, 150));

        //incremento cm
        aumentoAlturas(alturas, 10);
        System.out.println(Arrays.toString(alturas));

        //posicion mayor altura
        System.out.println("Mayor altura: " + mayorAltura(alturas));
        System.out.println("Posicion: " + indexMayorAltura(alturas));
    }

}
