/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_6_CalculasSeg {

    /*  Programa que a partir de un numero de segundos ( + o -) determine la fecha que representa a partir de hoy 
        Ejemplo : Nº de segundos a partir de hoy : 175000
        Fecha 19/11/2022
    
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero de segundos a partir de hoy : ");
        
        long segundos = teclado.nextLong();
        Date hoy = new Date();
        long millisegundos = hoy.getTime() + (segundos * 1000);
        
        Date fecha = new Date(millisegundos);
        System.out.println("Fecha " +DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha));
        
    }
    
}
