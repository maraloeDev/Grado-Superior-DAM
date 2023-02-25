package Ejercicios.POO.Persona;

import java.time.LocalDate;

public class PersonaApp {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombrePersona("Pepe");

        persona1.setSexoPersona('H');

        persona1.mayorEdad();

        persona1.setAltura(1.75);

        persona1.setPeso(50);

        System.out.println(persona1);

        System.out.println("Tiene " + persona1.getEdad());

        System.out.println(persona1.pesoIdeal(80));
    }
}
