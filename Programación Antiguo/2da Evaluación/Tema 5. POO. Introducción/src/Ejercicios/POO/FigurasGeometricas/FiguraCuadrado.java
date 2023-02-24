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
public class FiguraCuadrado {
    
    // ATTRIBUTOS
    private int lado;
    private Punto centro;

    // CONSTRUCTOR
    public FiguraCuadrado(int lado, double x, double i) {
        this.lado = lado;
        this.centro = centro;
    }

    // GETTER Y SETTER
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
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
        return "FigurasCuadrado{" + "lado=" + lado + ", centro=" + centro + '}';
    }
    
    

    // METODOS
    public double area() { //Metodo en el que se pide el area y se retorna el area
        double area = 0.0;
        return area = Math.pow(lado, 2);
    }

    public double perimetro() { //Metodo en el que se pide el perimetro y se retorna el perimetro
        double perimetro =0.0;
        return perimetro = this.lado * 4;
    }

    public String diagonal() { //Metodo en el que se pide la dagonal con 2 decimales, por eso creo el objeto DecimalFormat
        DecimalFormat df = new DecimalFormat("#.##"); // Utlilizo el decimal format debido a que se quieren 2 decimales para la diagonal
        double diagonal = Math.sqrt(Math.pow(this.lado, 2) * 2);
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
