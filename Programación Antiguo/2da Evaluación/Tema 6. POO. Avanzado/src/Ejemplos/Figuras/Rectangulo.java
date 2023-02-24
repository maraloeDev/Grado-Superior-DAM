/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

/**
 *
 * @author priparno
 */
public class Rectangulo extends Cuadrilateros {

    public Rectangulo(double base, double altura, Punto centro) {
        super(base, altura, centro);
    }

    //Definicion de metodo abstracto heredado.
    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando un rectangulo de base " + this.lado1 + " y altura " + this.lado2);
    }

    //Definicion de metodo abstracto heredado (2 niveles).
    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public void metodo1() {
        System.out.println("Metodo 1 de rectangulo.");
    }

}
