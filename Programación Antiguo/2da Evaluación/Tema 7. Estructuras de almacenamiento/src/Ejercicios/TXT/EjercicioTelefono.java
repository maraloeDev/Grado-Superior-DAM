/*
 * * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *  *****************************************************************************
 */
package Ejercicios.TXT;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author maraloed
 * 
 * //  Escribe un programa que a partir de un array de numeros de telefono
 * con el formato (XXX)XXX-XXX, determine
 * 
 * a) Si existe un número de telefono concreto
 * b)El nº de telefono de un prefijo concreto
 */
    public class EjercicioTelefono {

        static Scanner sc = new Scanner(System.in);
        static Random rand = new Random();
        static String[] telefonos = rellenaTelefonos();

        /**
         * rellenaTelefonos: devuelve un numero de la forma (XXX)XXX-XXX aleatorio.
         *
         * @return un numero completo aleatorio
         */
        public static String[] rellenaTelefonos() {
            String[] array = new String[50];
            for (int i = 0; i < array.length; i++) {
                array[i] = prefijoAleatorio() + numeroAleatorio();
            }
            return array;
        }

        /**
         * prefijoAleatorio: devuelve (XXX) siendo X digitos aleatorios.
         *
         * @return un prefijo aleatorio
         */
        public static String prefijoAleatorio() {
            String prefix = "(";
            prefix+=rand.nextInt(895, 940);
            return prefix + ")";
        }

        /**
         * numeroAleatorio: devuelve XXX-XXX siendo las X digitos aleatorios.
         *
         * @return un numero aleatorio
         */
        public static String numeroAleatorio() {
            String numero = "";
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    numero += rand.nextInt(0, 10);
                }
                numero+="-";
            }
            return numero.substring(0, numero.length()-1);
        }

        /**
         * telefonosPorPrefijo: devuelve el numero de telefonos que tienen el
         * prefijo pasado como parametro.
         *
         * @param array un array de cadenas, son los telefonos.
         * @param prefix una cadena que representa el prefijo.
         * @return un entero que representa el numero de telefonos con el prefijo.
         */
        public static int telefonosPorPrefijo(String[] array, String prefix) {
            int cont = 0;   //contador de numeros.
            String patron;  //el patron con el que se busca.
            switch (prefix.length()) {
                case 2:
                    patron = "\\(" + prefix + "\\d{1}\\)\\d{3}-\\d{3}";
                    break;
                case 3:
                    patron = "\\(" + prefix + "\\)\\d{3}-\\d{3}";
                    break;
                default:
                    throw new IllegalArgumentException("No has introducido un modelo de prefijo válido.");
            }
            Pattern pt = Pattern.compile(patron);
            Matcher mt;
            for (int i = 0; i < array.length; i++) {
                mt = pt.matcher(array[i]);  //se comprueba con cada numero que cumpla el patron.
                if (mt.matches()) {         //si coinciden, se aumenta el contador.
                    cont++;
                }
            }
            return cont; //devuelve el numero de telefonos.
        }

        /**
         * numeroExacto: devuelve la posición del teléfono introducido por
         * parámetro, devolviendo la primera coincidencia, -1 si no está.
         *
         * @param array un array de cadenas, son los telefonos.
         * @param telefono una cadena que representa el telefono a buscar.
         * @return un entero que representa la posicion del telefono, -1 si no esta.
         */
        public static int numeroExacto(String[] array, String telefono) {
            int posi = -1;
            Pattern pt = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{3}");
            Matcher mt = pt.matcher(telefono);
            if (!mt.matches()) {    //Una comprobación del teléfono.
                throw new IllegalArgumentException("No has introducido un numero de telefono válido.");
            } else {
                boolean encontrado = false; //una bandera para salir del bucle.
                for (int i = 0; i < array.length && !encontrado; i++) {
                    if (telefono.equals(array[i])) {    //si coinciden se guarda la posición y se sale del bucle
                        posi = i;
                        encontrado = true;
                    }
                }
            }
            return posi;
        }

        /**
         * introducePrefjo: el usuario introduce un prefijo por teclado. Tiene que
         * tener 3 digitos, ser 91 o 93.
         *
         * @return una cadena que sea el prefijo.
         */
        public static String introducePrefijo() {
            System.out.print("Introduce un prefijo de numero (91 y 93 para Madrid y Barcelona respectivamente): ");
            String prefix = sc.nextLine();
            Pattern pt = Pattern.compile("\\d{3}|91|93");
            Matcher mt = pt.matcher(prefix);
            if (prefix.length() != 2 && prefix.length() != 3) {
                //dependiendo del error te devuelve una excepcion personalizada.
                throw new InputMismatchException("Longitud erronea. El prefijo tiene que estar formado por 2 o 3 digitos.");
            } else if (!mt.matches()) {
                throw new InputMismatchException("Error. El prefijo tiene que estar formado 3 digitos. 91 y 93 en el caso de Madrid y Barcelona respectivamente.");
            }
            return prefix;
        }

        /**
         * introduceTelefono: el usuario introduce un telefono por teclado. Tiene
         * que seguir el modelo (XXX)XXX-XXX siendo las X numeros.
         *
         * @return una cadena que es el telefono.
         */
        public static String introduceTelefono() {
            System.out.print("Introduce un numero de telefono siguiendo este modelo (XXX)XXX-XXX: ");
            String telefono = sc.nextLine();
            Pattern pt = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{3}");
            Matcher mt = pt.matcher(telefono);
            if (!mt.matches()) {
                throw new InputMismatchException("Error. El numero tiene que seguir el modelo (XXX)XXX-XXX siendo todas las X dígitos");
            }
            return telefono;
        }

        /**
         * opcion: permite al usuario escoger una opcion.
         *
         * @param array el array de los telefonos.
         */
        public static void opcion(String[] array) {
            char opt = textoMenu().toUpperCase().charAt(0);
            switch (opt) {
                case 'N':
                    String prefijo = introducePrefijo();
                    System.out.println("El numero de telefonos con ese prefijo es " + telefonosPorPrefijo(array, prefijo));
                    break;
                case 'T':
                    String telefono = introduceTelefono();
                    int encontrado = numeroExacto(array, telefono);
                    switch (encontrado) {
                        case -1:
                            System.out.println("No se ha encontrado este teléfono.");
                            break;
                        default:
                            System.out.println("El telefono se ha encontrado en la posicion " + encontrado);
                    }
                    break;
                case 'S':
                    System.out.println("Adios.");
                    break;
                default:
                    throw new IllegalArgumentException("Error. La opcion introducida no esta contemplada.");
            }
        }

        /**
         * textoMenu: imprime el menú y devuelve la opción que escoge el usuario.
         *
         * @return una cadena que corresponde con la opción que introduce el
         * usuario.
         */
        public static String textoMenu() {
            System.out.println("Escoge la opcion = ");
            System.out.println("\t[T]elefono exacto en el array");
            System.out.println("\t[N]umero de telefonos por prefijo");
            System.out.print("Introduce una opción (T/N/S para salir): ");
            String op = sc.nextLine();
            return op;
        }

        /**
         * TODO
         *
         * @param args TODO
         */
        public static void main(String[] args) {
            System.out.println(Arrays.toString(telefonos));
            try {
                opcion(telefonos);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }