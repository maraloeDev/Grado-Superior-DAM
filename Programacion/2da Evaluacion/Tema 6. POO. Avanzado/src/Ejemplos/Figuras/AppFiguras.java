/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Figuras;

/**
 *
 * @author priparno
 */
public class AppFiguras {

    /*
    Utilizando la estructura jerarquica realizada, implementa el polimorfismo.
     */
    
    //Version dos
    public static double hallamosAreaMan(Figura f) {
        return f.calcularArea();
    }

    public static void pintoQueTePinto(Figura f) {
        f.dibujarFigura();
    }

    public static void main(String[] args) {
        Circulo circ = new Circulo(3, new Punto(2, 3));
        Rectangulo rect = new Rectangulo(6, 3, new Punto(4, 6));
        Cuadrado cuadr = new Cuadrado(4, new Punto(0, 0));

        //Version uno
        Figura f1;
        f1 = circ;
        f1.dibujarFigura();
        System.out.println("Area del circulo = " + f1.calcularArea());
        f1 = cuadr;
        f1.dibujarFigura();
        System.out.println("Area del cuadrado = " + f1.calcularArea());

        System.out.println();
        //version dos continuacion
        System.out.println("Area del circulo = " + hallamosAreaMan(circ));
        pintoQueTePinto(circ);
        System.out.println("Area del rectangulo = " + hallamosAreaMan(rect));
        pintoQueTePinto(rect);
        System.out.println("Area del cuadrado = " + hallamosAreaMan(cuadr));
        pintoQueTePinto(cuadr);
    }
}
