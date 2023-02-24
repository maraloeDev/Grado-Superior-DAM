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
public class Ejercicio__11_Fecha4 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce fecha con formato dd de mm(con letra) de yyyy\nEjemplo:5 de agosto de 2022) ");
            String fecha = sc.nextLine();
            DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
            df.setLenient(false);
            Date fechaFin = df.parse(fecha);
            DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
            dfs.setLenient(false);
            String fechaCorta = dfs.format(fechaFin);
            System.out.println("\nTu fecha tambien se pude poner como " + fechaCorta);
        } catch (Exception e) {
            System.err.println("\nFecha mal introducida");
        }
    }

}
