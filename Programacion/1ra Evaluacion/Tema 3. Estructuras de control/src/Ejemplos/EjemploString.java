/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

public class EjemploString {

    public static void main(String[] args) {
        String texto = "Desarrollo de Aplicaciones Multiplataforma";

int caracter= 0;
int total = texto.length();
        while (caracter < total){
            System.out.println(texto.charAt(caracter));
            caracter++;
        }


    }
}
