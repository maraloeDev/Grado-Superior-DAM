/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejemplos;

import java.time.LocalDate;

/**
 * @author maraloed
 */

//ATTRIBUTES
public class Alumno {
    private String num_matricula;
    private String nombre;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private double nota;

    //CONSTRUCTORS

    public Alumno() {
    }

    //GETTER AND SETTER
    public String getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(String num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;

    }

    //toString
    @Override
    public String toString() {
        return "Alumno{" +
                "num_matricula='" + num_matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", nota=" + nota +
                '}';
    }
}
