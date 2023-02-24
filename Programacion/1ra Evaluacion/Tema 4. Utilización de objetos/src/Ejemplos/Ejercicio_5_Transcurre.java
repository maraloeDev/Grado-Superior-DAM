/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/* programa que calcule el numero de dias trascurridos desde una fecha introducida por teclaso hasta hoy

Ejemplo : 

Introduce fecha 01/01/2022
Han transcurrido hasta hoy 340 dias */
public class Ejercicio_5_Transcurre {

    public static void main(String[] args) {

        try {
            Scanner telado = new Scanner(System.in);

            System.out.print("Introduce fecha : ");
            String Cadenafecha = telado.next();

            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);

            Date fecha = df.parse(Cadenafecha);
            Date hoy = new Date();

            if (fecha.after(hoy)) {
                System.out.println("Debes introducir la fecha actual");

            } else {

                long milisegundos = hoy.getTime() - fecha.getTime();
                long dias = milisegundos / 1000 / 60 / 60 / 24;
                System.out.println("Dias transcurridos desde " + df.format(Cadenafecha) + " hasta hoy " + dias);
            
        }
        
    } catch (Exception ex) {
            System.out.println("Error");
        }
    }

}
