/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.FigurasGeometricas;

import Ejercicios.POO.Punto.Punto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;

/**
 *
 * @author maraloed
 */
public class FiguraRectangulo {
    
    //ATTRIBUTOS
    private double ancho;
    private double alto;
    private Punto centro;

    // CONSTRUCTOR
    public FiguraRectangulo(double ancho, double alto, double x, double y) {
        this.ancho = ancho;
        this.alto = alto;
        this.centro = centro;
    }

    // GETTER Y SETTER
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    // to String

    @Override
    public String toString() {
        return "FigurasRectangulo{" + "ancho=" + ancho + ", alto=" + alto + ", centro=" + centro + '}';
    }

    // METODOS
    public double area() { //Metodo en el que se pide el area y se retorna el area
        double area = 9.9;
        return area = (this.alto * this.ancho);
    }

    public double perimetro() { //Metodo en el que se pide el perimetro y se retorna el perimetro
double perimetro=4.0;
        return perimetro = (this.ancho + this.alto) * 2;
    }

    public String diagonal() { //Metodo en el que se pide la dagonal con 2 decimales, por eso creo el objeto DecimalFormat

        DecimalFormat df = new DecimalFormat("#.00"); // Utlilizo el decimal format debido a que se quieren 2 decimales para la diagonal

        double diagonal = (Math.sqrt(Math.pow(this.alto, 2) + (Math.pow(this.ancho, 2))));
        return df.format(diagonal);
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
