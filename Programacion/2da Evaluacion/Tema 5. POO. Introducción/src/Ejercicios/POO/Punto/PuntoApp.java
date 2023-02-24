/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.POO.Punto;

/**
 *
 * @author COOLBOX_SSD5
 */
public class PuntoApp {

    public static void main(String[] args) {
        Punto p1 = new Punto(24, 2);

        System.out.println("Punto actual " + p1.toString());

        p1.desplazaPunto(2, 10);
        System.out.println("Punto desplazando en las coordenadas " + p1);

        p1.muevePunto(10, 54);
        System.out.println("Punto movido " + p1);

        p1.centro();
        System.out.println("El centro de la pantalla es " + p1);

    }

}
