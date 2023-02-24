/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fechas1 {

    /* Gregoriann Calendar  + calendar*/
    public static void main(String[] args) {

        GregorianCalendar navidad = new GregorianCalendar(2022, Calendar.DECEMBER, 25);

        System.out.println(navidad.get(Calendar.DAY_OF_MONTH));
        System.out.println(navidad.get(Calendar.DAY_OF_YEAR));
        System.out.println(navidad.get(Calendar.YEAR));
        System.out.println(navidad.get(Calendar.HOUR));

        navidad.set(Calendar.DAY_OF_MONTH, 24); /* Sirve para asignar una fecha */
        navidad.getTime();
        
        Date fecha = navidad.getTime();
        System.out.println("Times in milliseconds" + navidad.getTimeInMillis());
        
        GregorianCalendar gc =  new GregorianCalendar();
        gc.setTime(fecha);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.MONTH);
        Date nochebuena = new Date(16718346400000L);
        System.out.println(nochebuena);
        System.out.println("Resultado comparacion de nochebuena con hoy " + nochebuena.before(fecha));
        

    }

}
