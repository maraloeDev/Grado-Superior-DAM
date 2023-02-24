package Ejercicios.POO.CocheAutomatico;

import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MART�N-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class CocheAutomatico {

    static Scanner teclado = new Scanner(System.in);

    // ATRIBUTOS
    private String matricula; //Matricula del coche
    private String marca; //marca de coche
    private String modelo; //modelo de coche
    private int potencia; //potencia del coche
    private boolean arrancado; // Si o No
    private double gasolina; // el litros
    private int velocidad; //velocidad actual del coche
    private int velocidadMax; //velocidad maxima del coche
    private double maximoLitros; // los litros de un coche
    private String modosConduccion; //modos de conducción a elegir por el usuario

    // CONSTRUCTOR
    public CocheAutomatico(String matricula, String marca, String modelo, int potencia, boolean arrancado, double gasolina, int velocidadMax) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.arrancado = arrancado;
        this.gasolina = gasolina;
        this.velocidadMax = velocidadMax;
    }

    // GETTER Y SETTER

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getMaximoLitros() {
        return maximoLitros;
    }

    public void setMaximoLitros(double maximoLitros) {
        this.maximoLitros = maximoLitros;
    }

    public String getModosConduccion() {
        return modosConduccion;
    }

    public void setModosConduccion(String modosConduccion) {
        this.modosConduccion = modosConduccion;
    }    

    //toString

    @Override
    public String toString() {
        return "CocheAutomatico{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", arrancado=" + arrancado + ", gasolina=" + gasolina + ", velocidad=" + velocidad + ", velocidadMax=" + velocidadMax + ", maximoLitros=" + maximoLitros + ", modosConduccion=" + modosConduccion + '}';
    }
    
    //Metodos
    public int acelerar() { // metodo que acelera el coche
        if (this.velocidad < 0) {
            System.out.println("El coche debe ser arrancado primero");
        } else if (this.velocidad > 0) {
            System.out.println("Acelerando... " + this.velocidad++);

        }
        return this.velocidad;
    }

    public int decelerar() { // Metodo para decelerar el coche
        if (this.velocidad > 0) {
            System.out.println("Decelerando... " + this.velocidad--);
        } else if (this.velocidad <= 0) {
            System.out.println("Ya no tienes gasolina");
        }

        return this.velocidad;
    }

    public void parar() { //Metodo que para el coche
        if (this.arrancado == false) {
            System.out.println("Ya est� parado");
        } else {
            if (this.velocidad > 0) {
                System.out.println("No es posible parar con velocidad");
            } else {
                this.arrancado = false;
                System.out.println(this.toString());
            }
        }
    }

    public void repostar(double litros) { //Metodo en el que reposta el vehiculo
        if (this.arrancado && this.velocidad < 0) {
            System.out.println("No es posible hechar gasolina cuando el coche esta en marcha");
        } else {
                System.out.println("Demasiados litros ");
                System.out.println("Repostando... " + this.gasolina++);
            }
        }
    public int tipoConducir(){ //Metodo en l que el usuario elige el tipo de conduccion
        
        if (this.modosConduccion.contains("normal")){
            System.out.println(this.velocidadMax = getVelocidadMax());
        }else if (this.modosConduccion.contains("eco")){
            System.out.println(this.velocidadMax = 170);
        }else if(this.modosConduccion.contains("sport")){
            System.out.println(this.velocidadMax = 200);
        }
        return this.velocidadMax;
    }

}
