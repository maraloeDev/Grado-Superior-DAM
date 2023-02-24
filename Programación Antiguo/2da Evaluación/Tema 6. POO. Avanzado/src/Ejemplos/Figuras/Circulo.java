/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

/**
 *
 * @author priparno
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando un circulo de radio " + this.radio);
    }

}
