package Ejercicios.POO.Persona;

/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Persona {

    // ATTRIBUTES
    private String dni;
    private String nombre;
    private String apellido;
    private char sexo;
    private LocalDate fechadeNacimiento;
    private int edad;
    private double altura;
    private double peso;
    private boolean casado;

    //CONSTRUCTORS
    public Persona(String dni) {
        this.dni=dni;
    }

    public Persona(String nombre, String apellido, char sexo, LocalDate fechadeNacimiento, int edad, double altura, double peso, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechadeNacimiento = fechadeNacimiento;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }

    public Persona() {
    }
    //  GETTER AND SETTER

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setDni(String Dni){
        if (dni.length() !=8){
            System.out.println("Error");
        } else{
            for (int i = 0; i < dni.length(); i++) {
                
                if(Character.isDigit(dni.charAt(i))){
                    System.out.println("Error");
                    return;
                }
                
            }
        }
        this.dni=dni;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechadeNacimiento() {

        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        return fechadeNacimiento;
    }

    public LocalDate setFechadeNacimiento(int dia, int mes, int año) {
         LocalDate fechaNac = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNac.getYear();
        fechaNac.getDayOfMonth();
        fechaNac.getMonth();
        fechaNac.getYear();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
       

    
        this.edad=edad;
        return fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    // Método que devuelva los datos de una persona en formato cadena.
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechadeNacimiento=" + fechadeNacimiento + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }

    // Método que calcula la letra del DNI de la Persona
    public int calcularLetra(int DNI_numero) {

        Scanner teclado = new Scanner(System.in);
        String dni = "1";
        DNI_numero = 1;
        do {
            System.out.println("Introduce numero DNI:");
            this.dni = dni;
            DNI_numero = Integer.parseInt(dni);
            if (dni.length() > 8 || dni.length() < 8) {

                System.out.println("Error. El DNI debe tener 8 dígitos");
                System.out.print("Introduce numero DNI:");
                dni = teclado.nextLine();
            }

        } while (dni.length() > 8 || dni.length() < 8);
        String letra = "";

        switch ((DNI_numero % 23)) {
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;

        }
        System.out.println("Letra " + letra);
        return DNI_numero;
    }

    private void CalcularEdad() { //Metodo que calcula la edad de la persona en función de su fecha de nacimiento

        if (fechadeNacimiento.getDayOfYear() <= LocalDate.now().getDayOfYear()) {
            this.edad = LocalDate.now().getYear() - this.fechadeNacimiento.getYear();
        } else {
            this.edad = LocalDate.now().getYear() - fechadeNacimiento.getYear() - 1;
        }
    }

    // Método que determina si la persona está en su peso ideal (0,75 * (altura en cm. – 150)
    // + 50). Devuelve un -1 si está por debajo de su peso ideal, un 0 si está en su peso ideal y
    // un 1 si tiene sobrepeso.
    public double pesoIdeal(double peso) {
        peso = (0.75 * (this.altura - 150) + 50);

        double pesoIdeal = 0.75 * (altura - 150) + 50;
    if (peso < pesoIdeal) {
        return -1;
    } else if (peso == pesoIdeal) {
        return 0;
    } else {
        return 1;
    }
    }

    // Método que devuelve un booleano indicando si la persona es o no mayor de edad
    public boolean isMayorEdad() {
        return this.edad >= 18;
    }
}
