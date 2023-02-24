/** ***************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.time.LocalDate;

/**
 *
 * @author maraloed
 */
public class AppAlumnos {

    public static void mostrarAlumno (Alumno alumno){
        System.out.println("Datos del Alumno ");
        System.out.println("Numero de matricula " + alumno.getNum_matricula());
        System.out.println("Nombre " + alumno.getNombre());
        System.out.println("Apellido " + alumno.getApellidos());
        System.out.println("Fecha de nacimiento " + alumno.getFecha_nacimiento());
        System.out.println("Nota " + alumno.getNota());

    }
    public static void main(String[] args) {

        //Creamos el objeto Alumno
        Alumno alum1 = new Alumno();
        //Mostramos su estado por defecto
        System.out.println(alum1.getNum_matricula());
        System.out.println(alum1.getNota());
        //Damos valores a los atributos
        String nombre = "Juan";


        alum1.setNum_matricula("22-23/100");
        alum1.setNombre(nombre);
        alum1.setApellidos("Martin");
        alum1.setFecha_nacimiento(LocalDate.now());
        alum1.setNota(6.5);

        System.out.println(alum1.getNum_matricula());
        System.out.println(alum1.getNombre());
        System.out.println(alum1.getApellidos());
        System.out.println(alum1.getFecha_nacimiento());
        System.out.println("----------------------------------");
        mostrarAlumno(alum1);
        System.out.println(alum1.getNombre());

    }
    
}
