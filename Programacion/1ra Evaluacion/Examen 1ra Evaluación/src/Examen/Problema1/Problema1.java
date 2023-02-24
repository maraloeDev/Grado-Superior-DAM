/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Examen.Problema1;

import java.util.Scanner;

/**
 *
 * @author marti
 *
 * Escribe un programa Java que genere un nº aleatorio entre 1 y 100 y tú lo
 * trates de adivinar. Para ello, te preguntará el número repetidamente hasta
 * que lo consigas. En cada intento fallido, el intervalo se irá cerrando.
 * NOTAS: • El intervalo inicial será [1,100].
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 100) + 1;//Genero el aleatorio

        int numero;

        int max = 100;
        int min = 1;
        boolean acierto = false; //false indica al usuario que no ha ganado
        System.out.println("El numero secreto esta entre " + min + " y " + max + "\n"
                + "Cual es");
        while (acierto == false) {
            numero = teclado.nextInt();

            if (numero == aleatorio) { //Cuando el usuario acierte el numero, cambia la variable a cierto 

                System.out.println("Acertaste!!");

                acierto = true;
            } else {
                if (aleatorio > (min + max) / 2) {

                    min = (min + max) / 2;
                    System.out.println("El numero secreto esta entre " + min + " y " + max + "\n"
                            + "Cual es");
                } else {
                    max = (min + max) / 2;
                    System.out.println("El numero secreto esta entre " + min + " y " + max + "\n"
                            + "Cual es");
                }
            }

        }

    }

}
