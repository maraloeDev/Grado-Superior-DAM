/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio__10_Fecha3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Intriduce segundos");
        
        int segundos = teclado.nextInt();
        
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime nuevoMomento = ahora.plusSeconds(segundos);
        System.out.println(nuevoMomento);
    }
    
}
