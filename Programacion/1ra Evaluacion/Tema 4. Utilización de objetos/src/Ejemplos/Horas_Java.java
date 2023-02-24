package Ejemplos;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COOLBOX_SSD5
 */
public class Horas_Java {
    
    public static void main(String[] args) {
        
        try {
            //Visualizar la hora actual
            LocalTime horaActual = LocalTime.now();
            System.out.println("La hora actual es " + horaActual);

            //Para evitar que saque los nano segundos,
            System.out.println("La hora actual es " + horaActual.getHour() + horaActual.getMinute() + horaActual.getSecond());

            //Composici�n a partir de composiciones externas
            Scanner papaya = new Scanner(System.in);
            System.out.println("Introduzca la hora en forma HH:MM;SS");
            LocalTime hora1 = LocalTime.parse(papaya.nextLine());
            
            System.out.println("La hora 1 " + hora1.getHour() + ":" + hora1.getMinute() + ":" + hora1.getSecond());

            //Composici�n de hora a partir de datos externos
            LocalTime hora2 = LocalTime.of(15, 13, 40);
            System.out.println("La hora 2 es " + hora2);

            //A la hora1 se le a�adiran 2 horas y se le restaran 45 min
            LocalTime hora3 = hora1.plusHours(2).minusMinutes(45);
            System.out.println("La hora3 es " + hora3);
            //A la hora2 se le restaran 2 horas y 15 minutos y se a�adiran 40 segundos
            LocalTime hora4 = hora2.minusHours(2).minusMinutes(15).plusSeconds(40);
            System.out.println("La hora4 es " + hora4);

            //Commparaciones de horas
            if (hora1.equals(hora2)) {
                System.out.println("La hora 1 y la hora 2 son iguales");
            } else {
                System.out.println("La hora 1 y la hora 2 no son iguales");
            }
            
            if (hora3.isAfter(hora4)) {
                System.out.println("La hora3 trancurre DESPUES de la hora 4");
            } else {
                System.out.println("Desde " + hora4 + " hasta " + hora3 + " trandcurren " + hora4.until(hora3, ChronoUnit.MINUTES) + " minutos");
            }
            
        } catch (Exception error) {
            System.out.println("Se produjo un error");
            main(null);
            
        }
    }
    
}
