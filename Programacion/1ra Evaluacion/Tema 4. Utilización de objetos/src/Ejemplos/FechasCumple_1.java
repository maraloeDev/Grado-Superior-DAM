
/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Programa que pida al usuario su fecha de nacimiento
y le diga Felicidades!!! si es su cumpleaños*/
public class FechasCumple_1 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce fecha de nacimiento (dd/mm/yy): ");
            String fechaNac = sc.next();
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);
            Date fecha = df.parse(fechaNac);

            //Si llegamos aqui es que la cadena era una fecha
            //fecha de hoy
            GregorianCalendar fechaNacimiento = new GregorianCalendar();
            fechaNacimiento.setTime(fecha);
            GregorianCalendar today = new GregorianCalendar();
            today.setTime(new Date());

            //comparacion
            if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH) && fechaNacimiento.get(Calendar.MONTH) == today.get(Calendar.MONTH)) {
                System.out.println("Felicidades.");
            }else{
                //Cuantos días quedan.
                long milisHoy = today.getTimeInMillis();
                fechaNacimiento.set(Calendar.YEAR, today.get(Calendar.YEAR));
                if(fechaNacimiento.getTimeInMillis()<milisHoy){
                    fechaNacimiento.set(Calendar.YEAR, today.get(Calendar.YEAR+1));
                }
                long resultado = fechaNacimiento.getTimeInMillis() - milisHoy;
                int dias = (int) (resultado / (1000*60*60*24))+1;
                System.out.println("Quedan "+dias+" dias");
            }

        } catch (ParseException ex) {
            System.out.println("Error. Fecha no valida.");
        }

    }

}
