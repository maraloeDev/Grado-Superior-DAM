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
public class Figura_Triangulo extends Punto {
    //ATRIBUTOS
    private double base;
    private double altura;
    private double lado;
    //CONTRUCTOR
    public Figura_Triangulo(double base, double altura, double lado, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    //G Y S
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //toSRING
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    //METODOS
    public double areaTriangulo() {
        double areaTriangulo = (this.base * this.altura) / 2;
        return areaTriangulo;
    }

    public double perimetroTriangulo() {

        return this.lado= Math.pow(this.lado, 3);
                
    }

}
