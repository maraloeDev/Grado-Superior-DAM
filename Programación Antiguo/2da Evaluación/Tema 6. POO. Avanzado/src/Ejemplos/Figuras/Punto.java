/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author priparno
 */
public class Punto {

    private static double x;
    private static double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        Punto.x = x;
        Punto.y = y;
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        Punto.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        Punto.y = y;
    }

    public void desplazaX(double dist) {
        x = x + dist;
    }

    public void desplazaY(double dist) {
        y = y + dist;
    }

    public void desplazaCoordenadas(double distX, double distY) {
        x = x + distX;
        y = y + distY;
    }

    public void cambioCoordenadas(double coordX, double coordY) {
        x = coordX;
        y = coordY;
    }

    public double distanciaPuntos(double coordX, double coordY) {
        return Math.sqrt(Math.pow(coordX - x, 2) + Math.pow(coordY - y, 2));
    }

    public double distanciaPuntos(Punto puntoAux) {
        return distanciaPuntos(puntoAux.x, puntoAux.y);
    }

    public void centroPantalla() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        x = d.width / 2.;
        y = d.height / 2.;
    }

    public String getEstado() {
        return "(" + x + ", " + y + ")";
    }

}
