/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

/**
 *
 * @author priparno
 */
public class Cuadrado extends Cuadrilateros {
    
    public Cuadrado(double lado, Punto centro) {
        super(lado, lado, centro);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando un cuadrado de lado " + this.lado1);
    }

    @Override
    public void metodo1() {
        super.metodo1();
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

}
