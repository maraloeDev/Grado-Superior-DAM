/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.FigurasGeometricas;



import Ejercicios.POO.Punto.Punto;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author maraloed
 */
public class FiguraCirculo {
    
    // ATRIBUTOS
    private double radio;
    private Punto centro;

    // CONSTRUCTOR
    public FiguraCirculo(double radio, double x, double y) {
        this.radio = radio;
        this.centro = new Punto(x, y);
    }

    // GETTER Y SETTER
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    // toString
    @Override
    public String toString() {
        return "FigurasCirculo{" + "radio=" + radio + ", centro=" + centro + '}';
    }

    //METODOS
    public double area() { //Metodo en el que se pide el area y se retorna el area
        double area = 0.0;
        return area = (Math.PI * Math.pow(this.radio, 2));
    }

    public double perimetro() { //Metodo en el que se pide el perimetro y se retorna el perimetro
        double perimetro = 0.0;
        return perimetro = (2 * Math.PI * this.radio);
    }

    //Método que mueva el punto actual a la nueva posición dada por las coordenadas
    //recibidas como parámetro.
    public void mover(double newX, double nexY) {
        double x = newX;
        double y = nexY;
    }

    public void Centro() {
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        double centrox = tamanio.width / 2;
        double centroy = tamanio.height / 2;
        double x = centrox;
        double y = centroy;

    }
    
}
