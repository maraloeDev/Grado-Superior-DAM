
package Ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

/**
 *
 * @author maraloed
 */
public class Fechas1_Java8 {

    public static void main(String[] args) {
        // Clase LocalDate, de hora con now, y la que queramos con of;
        LocalDate hoy = LocalDate.now();

        System.out.println(hoy);

        LocalDate navidad = LocalDate.of(2022, Month.DECEMBER, 25);

        System.out.println(navidad);
        
        LocalDate nocheBuena = LocalDate.now();
        
        System.out.println(nocheBuena);

        //Metodos para sumar y restar fechas
        LocalDate sumaDias = navidad.plusDays(22);
        LocalDate restarDias = navidad.minusDays(22);

        // Trabajar con zonas horarias
        Set zonas = ZoneId.getAvailableZoneIds(); //Devuelve lod ids con las zonas horarias

        //Bucle que muestre por pantalla los ids de las zonas horarias que podemos utilizar
        for (Object zona : zonas) {
            System.out.println(zona);
        }

        LocalTime horaInicio = LocalTime.of(13, 13);
        LocalTime horaFin = LocalTime.of(14, 00);
        System.out.println(hoy.plus(Period.of(2000, 2, 14)));
        Duration.between(horaInicio, horaFin);
        long segundos = Duration.between(horaInicio, horaFin).getSeconds();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        System.out.println("Formato Localizado " + dtf.format(navidad));
        
        
        
        DateTimeFormatter dtfPattern = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtfPattern.format(navidad));

    }

}
