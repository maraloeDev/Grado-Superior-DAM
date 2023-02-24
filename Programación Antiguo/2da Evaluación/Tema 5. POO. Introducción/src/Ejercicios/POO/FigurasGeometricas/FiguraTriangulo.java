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
public class FiguraTriangulo {
    
    // ATRIBUTOS
    private double base;
    private double altura;
    private double lado;
    private Punto centro;

    // CONSTRUCTORES
    public FiguraTriangulo(double base, double altura, double lado, double x, double y) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.centro = centro;
    }

    // GETTER Y SETTER
    public double getBase() {

        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        return "FigurasTriangulo{" + "base=" + base + ", altura=" + altura + ", lado=" + lado + ", centro=" + centro + '}';
    }
    

    // METODOS 
    public double area() { //Metodo en el que se pide el area y se retorna el area
        double area = 0.0;
        return area = (this.base * this.altura) / 2;
    }

    public double perimetro() { //Metodo en el que se pide el perimetro y se retorna el perimetro
        double perimetro = 0.0;
        return perimetro = (Math.pow(lado, 3));
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
