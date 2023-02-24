package Ejemplos;

import java.time.LocalDate;
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
public class Fechas_Java {

    public static void main(String[] args) {
        try {
            //Visualizar la fecha actual
            LocalDate fechaActual = LocalDate.now();            
            System.out.println(fechaActual);

            //Para visualizar la fecha en formato espa�ol
            String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

            String semana[] = {"domingo", "lunes", "martes", "mi�rcoles", "jueves", "viernes", "s�bado"};

            int dia = fechaActual.getDayOfMonth();
            int mes = fechaActual.getMonthValue();
            int anio = fechaActual.getYear();
            int diasem = fechaActual.getDayOfWeek().getValue();
            System.out.println("Hoy es " + semana [diasem] + "" +  dia + " de " + meses[mes] + " de a�o " + anio);
            
            //Fechas a partir de datos externos
            //Se pedira una cadena de forma aaaa-mm-dd
            Scanner papaya = new Scanner (System.in);
            System.out.println("Introduce una cadena en forma aaaa-mm-dd");
            LocalDate fecha1 = LocalDate.parse(papaya.nextLine());
            System.out.println("La fecha de hoy es " + semana[fecha1.getDayOfWeek().getValue()] + fecha1.getDayOfMonth() + " de " + meses[fecha1.getMonthValue()] + " de " + fecha1.getYear());
            
        } catch (Exception error) {
            System.out.println("Se produjo un error");
            main(null);

        }
    }

}
