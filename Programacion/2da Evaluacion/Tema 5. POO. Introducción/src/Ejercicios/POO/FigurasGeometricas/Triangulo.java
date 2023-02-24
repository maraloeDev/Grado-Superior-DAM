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
public class Triangulo extends Punto{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

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

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    public double areaTriangulo(){
        double areaTriangulo = (this.base * this.altura) / 2;
        return areaTriangulo;
    }
    
    public double perimetroTriangulo(){
        
        
    }

}
