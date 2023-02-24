/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Arrays;

/**
 *
 * @author ortsanma
 */
public class ArrayDeObjetos {

    public static void mostrarPersonas(PersonaClase[] persona) {
        for (int i = 0; i < persona.length; i++) {

            if (persona[i] != null) {
                persona[i].toString();
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        PersonaClase[] persona = new PersonaClase[30];

        PersonaClase p1 = new PersonaClase("Juan", "Perez", 25);
        PersonaClase p2 = new PersonaClase("Maria", "Martin", 18);

        persona[0] = p1;
        persona[1] = p2;

        System.out.println(Arrays.toString(persona));
        mostrarPersonas(persona);
    }

    //Metodo que muestre las personas mayores de edad
    public static void muestraMayores(PersonaClase[] persona) {
        for (int i = 0; i < persona.length; i++) {
            if (persona[i].getEdad() > 18) {
                System.out.println(persona[i].getNombre() + " " + persona[i].getApellidos());
            }
        }
    }

    //Metodo que busque las personas con el apellido igual al parametro recibido
    public static void persoAp(PersonaClase[] persona, String Apellido) {
        String[] per = new String[persona.length];
        int cont = 0;
        for (int i = 0; i < persona.length; i++) {
            if (Apellido == persona[i].getApellidos()) {
                per[cont] = persona[i].getNombre() + " " + persona[i].getApellidos();
                cont++;
            }
        }
        System.out.println("Resultados de la busqueda son: ");
        boolean hay = false;

        for (int i = 0; i < per.length; i++) {
            if (per[i] != null) {
                System.out.println(per[i]);
                hay = true;
            }
        }

        if (hay == false) {
            System.out.println("No se encontro ningun resultado");
        }
    }

}
