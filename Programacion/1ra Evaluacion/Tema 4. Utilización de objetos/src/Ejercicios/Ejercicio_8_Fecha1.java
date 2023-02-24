/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_8_Fecha1 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una fecha\n");
            System.out.print("Que dia naciste?  ");
            int dia = sc.nextInt();
            System.out.print("\nQue mes naciste?  ");
            int mes = sc.nextInt();
            mes = mes - 1;
            System.out.print("\nQue año naciste?  ");
            int ano = sc.nextInt();
            ano = ano - 1900;
            Date fechaNac = new Date(ano, mes, dia);
            DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
            DateFormat dfl = DateFormat.getDateInstance(DateFormat.FULL);
            dfs.setLenient(false);
            dfl.setLenient(false);
            String fechaCorta = dfs.format(fechaNac);
            String fechaLarga = dfl.format(fechaNac);
            System.out.println("\nPor lo que tu naciestes el " + fechaCorta + " o lo que es lo mismo " + fechaLarga);
        } catch (Exception e) {
            System.err.println("\nFecha mal introducida");
        }
    }
}
