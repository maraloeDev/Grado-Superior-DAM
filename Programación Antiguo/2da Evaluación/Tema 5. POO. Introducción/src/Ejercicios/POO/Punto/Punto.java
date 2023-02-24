/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Punto;

import java.awt.*;

public class Punto {

    //ATTRIBUTES
    private double x;
    private double y;

    //CONSTRUCTORS
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() { //CONSTRUCTOR POR DEFECTO (Los atributos se inicializan a 0)
        
        this.x=0.0;
        this.y=0.0;

    }
    //METHODS GETTER AND SETTER

    // Método para recuperar y modificar las propiedades del punto.
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //toString
    //Método que devuelva el estado del objeto de forma textual, con el formato (x,y)

    @Override
    public String toString() {
        return "Punto{"
                + "x=" + x
                + ", y=" + y
                + '}';
    }

    //Método que desplace el punto actual una distancia dada por los valores recibidos como
    //parámetro para las coordenadas x e y.
    public void desplazamiento(double desplazax, double desplazay) {
        x = desplazax + x;
        y = desplazay + y;
    }

    //Método que mueva el punto actual a la nueva posición dada por las coordenadas
    //recibidas como parámetro.
    public void mover(double newX, double nexY) {
        x = newX;
        y = nexY;
    }

    //Método que calcule la distancia entre el punto actual y un segundo punto recibido como
    //parámetro
    public void distancia(double otroPuntoX, double otroPuntoY) {

        double a = otroPuntoX - this.x;
        double b = otroPuntoY - this.y;

        double distanciaNueva = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
    }

    //Método que mueva el punto actual al centro de la pantalla.
    public void Centro() {
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        double centrox = tamanio.width / 2;
        double centroy = tamanio.height / 2;
        x = centrox;
        y = centroy;

    }

}
