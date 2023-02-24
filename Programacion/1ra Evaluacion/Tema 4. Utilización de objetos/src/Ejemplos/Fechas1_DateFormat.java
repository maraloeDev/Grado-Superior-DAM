/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Fechas1_DateFormat {
    
    public static void main(String[] args) {
        
        //DateFormat -> nos limitamos a las opciones FULL, LONG, MEDIUM, SHORT
        
        //Creamos el formateador de fecha
        DateFormat df = DateFormat.getInstance();
        
        //Creamos objeto Date
        Date hoy = new Date();
        
        //Formateamos el objeto "Date" con el formateador "df" 
        System.out.println("Formato por defecto (short): " + df.format(hoy));
        
        //Cambiamos el formateador al medium
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Formato medium: " + df.format(hoy));
        
        //Cambiamos el formateador al long
        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Formato long: " + df.format(hoy));
        
        //Cambiamos el formateador al full
        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Formato full: " + df.format(hoy));
        
        //Cambiamos el formateador para fecha y hora: (formato para fecha, formato para hora, lugar)
        df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Locale.US);
        System.out.println("Formato fehca/hora USA: " + df.format(hoy));
        
    }

}
