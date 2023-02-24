/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Persona;

import java.time.LocalDate;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marti
 */
public class PersonaApp {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.setNombre("Pepe");
        
        persona1.setSexo('H');
        
        persona1.isMayorEdad();
        
        persona1.setAltura(1.75);
        
        persona1.setPeso(50);
        
        persona1.setFechadeNacimiento(11, 01, 2000);
        
        System.out.println(persona1);
        
        System.out.println( "Tiene " + persona1.getEdad());
        
        System.out.println(persona1.pesoIdeal(80));
    }
    
}
