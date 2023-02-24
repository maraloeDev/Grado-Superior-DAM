/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

/**
 *
 * @author priparno
 */
public abstract class Cuadrilateros extends Figura {

    protected double lado1;
    protected double lado2;

    public Cuadrilateros(double lado1, double lado2, Punto centro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.centro = centro;
    }

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    public void metodo1 (){
        System.out.println("Metodo 1 de cuadrilatero");
    }
}
