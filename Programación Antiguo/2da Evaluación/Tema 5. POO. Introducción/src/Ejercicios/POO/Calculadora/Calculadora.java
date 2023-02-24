/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Calculadora;

/**
 *
 * @author maraloed
 */
public class Calculadora {
    // Calculadora que haga Sumar, restar, multiplicar, dicidir y cambio de signo
    
    //ATRIBUTOS
    private double numero1;
    private double numero2;
    public char cambioSigno;
    
    //CONSTRUCTOR
    public Calculadora(double numero1, double numero2, char cambioSigno) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.cambioSigno = cambioSigno;
    }

    public Calculadora() {
    }
    
    
    
    //GETTER AND SETTER

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public char getCambioSigno() {
        return cambioSigno;
    }

    public void setCambioSigno(char cambioSigno) {
        this.cambioSigno = cambioSigno;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", cambioSigno=" + cambioSigno + '}';
    }
    
    //METODOS
    
    public double suma (double n1,double n2){
        double suma = (n1 + n2);
        return suma;
    }
    public double restar (double n1,double n2){
        double resta = (n1 - n2);
        return resta;
    }
    public double multiplicar (double n1,double n2){
        double multiplicar =  (n1 * n2);
        return multiplicar;
    }
    public double dividir (double n1,double n2){
        double dividir = (n1 / n2);
        return dividir;
    }
}
