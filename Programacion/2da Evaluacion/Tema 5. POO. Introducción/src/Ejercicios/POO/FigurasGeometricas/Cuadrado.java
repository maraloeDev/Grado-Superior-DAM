/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.POO.FigurasGeometricas;

import Ejercicios.POO.Punto.Punto;

/**
 *
 * @author Eduardo Martin Sonseca
 */
public class Cuadrado extends Punto {

    private double lado;

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = 21;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    public double areaCuadrado() {
        double areaCuadrado = Math.pow(this.lado, this.lado);
        return areaCuadrado;
    }

    public double diagonalCuadrado() {

        double areaCuadrado = Math.pow(this.lado, this.lado) + Math.pow(this.lado, this.lado);

        double trunks = areaCuadrado * 100;
        double trunks2 = trunks / 100;

        return trunks2;

    }

    public double perimetroCuadrado() {
        double perimetroCuadrado = (this.lado + this.lado + this.lado + this.lado);
        return perimetroCuadrado;
    }

}
