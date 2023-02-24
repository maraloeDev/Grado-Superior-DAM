/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.POO.Punto;

public class PuntoApp {

    public static void main(String[] args) {

        Punto p1 = new Punto(45,87);
        
        Punto p2 = new Punto();

        System.out.println(p1);

        System.out.println("------------------------------------------");

        p1.mover(0,0);
        System.out.println("El MOVIMIENTO ES " + '\n' + p1);

        p1.desplazamiento(2,-9);
        System.out.println("El DESPLAZAMIENTO ES " + '\n' + p1);

        System.out.println("------------------------------------------");

        System.out.println("LA DISTANCIA ENTRE X e Y ES " + '\n' + p1 );

        p1.Centro();

        System.out.println("El CENTRO de esta pantalla es " + p1);
        
        p2.setX(10);
        p2.setY(5);
        System.out.println(p2.toString());

    }

}
