/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.POO.Punto;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Eduardo
 */
public class Punto {
    
    
        
        //ATRIBUTOS
        private double x;
        private double y;
    
        //CONSTRUCTOR

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

        // GETTER Y SETTER

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

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    /*Método que desplace el punto actual una distancia dada por los valores recibidos como
parámetro para las coordenadas x e y.*/
    
    public void desplazaPunto(double desplazaX, double desplazaY){
        this.x = this.x + desplazaX;
        this.y = this.y + desplazaY;
}
    
    /*Método que mueva el punto actual a la nueva posición dada por las coordenadas
recibidas como parámetro. */
    
    public void muevePunto(double moverX, double moverY){
        this.x = moverX;
        this.y = moverY;
}
    
    /*Método que calcule la distancia entre el punto actual y un segundo punto recibido como
parámetro.*/
    
    public double distancia(double otroPuntoX, double otroPuntoY) {

        double a = otroPuntoX - this.x;
        double b = otroPuntoY - this.y;

        double distanciaNueva = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
        return distanciaNueva;
    }

    //Método que mueva el punto actual al centro de la pantalla.
    public void centro() {
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        double centrox = tamanio.width / 2;
        double centroy = tamanio.height / 2;
        x = centrox;
        y = centroy;

    }
        
}
