/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */

package Ejercicios.POO.FigurasGeometricas;

import Ejercicios.POO.Punto.Punto;

/**
 *
 * @author Eduardo MartinSonseca
 */
public class Circulo extends Punto{
    
    private double radio;

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    /*De todas las figuras nos interesa conocer su área y perímetro*/
    
    public double areaCirculo(){
        
        double areaCirculo = Math.PI * (Math.pow(this.radio, 2));
        
        return areaCirculo;
    }
    
    public double perimetroCirculo(){
        
        double perimetroCirculo = 2 * Math.PI * this.radio;
        return perimetroCirculo;
        
    }

}
