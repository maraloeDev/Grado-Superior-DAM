/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Racional;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Racional implements Comparable<Racional>{

    //ATTRIBUTES
    private int numerador;
    private int denomidador;

    //CONSTRUCTOR
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denomidador = denominador;
    }

    //GETTER AND SETTER
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenomidador() {
        return denomidador;
    }

    public void setDenomidador(int denomidador) {
        this.denomidador = denomidador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denomidador;
    }

    public Racional sumar(Racional r) {
        
        int sumaNumerador = (this.numerador * r.denomidador) + (this.denomidador * r.numerador); 
        int sumaDenominador = (this.numerador * r.denomidador) ;
        
        return simplifica(new Racional(sumaNumerador,sumaDenominador ));
    }

    public Racional resta(Racional r) {
        int restaNumerador = (this.numerador * r.denomidador) - (this.denomidador * r.numerador); 
        int restaDenominador = (this.numerador * r.denomidador) ;
        
        return simplifica(new Racional(restaNumerador,restaDenominador ));
    }
    public Racional producto(Racional r) {
        int productoNumerador = (this.numerador * r.denomidador) * (this.denomidador * r.numerador); 
        int ProductoDenominador = (this.numerador * r.denomidador) ;
        
        return simplifica(new Racional(productoNumerador,ProductoDenominador ));
    }

    public Racional dividir(Racional r) {
        int divisionNumerador = (this.numerador * r.denomidador) / (this.denomidador * r.numerador); 
        int divisionDenominador = (this.numerador * r.denomidador) ;
        
        return simplifica(new Racional(divisionNumerador,divisionDenominador ));
    }

    public double toDecimal() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        return Double.parseDouble(nf.format((double) this.numerador / (double) this.denomidador));
    }

//    public boolean toEquals(Racional r) {
//
//        if (r.equals(r.denomidador) && (r.equals(r.numerador))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void compareTo(Racional r) {
//
//        if ((r.denomidador > this.denomidador) && (r.numerador > this.numerador)) {
//
//        } else if ((r.numerador < r.denomidador) && (r.denomidador > this.denomidador)) {
//
//        } else if ((r.numerador == this.numerador) && (r.denomidador == this.denomidador)) {
//
//        }
//    }

    public int MCD(int n1, int n2) {

        
        int resto;
        int aux;
        do {
            resto = n1 % n2;

            if (resto != 0) {
                aux = n2;
                n2 = resto;
                n1 = aux;
            }
        } while (resto != 0);
        return n2;
    }

    private Racional simplifica(Racional r) {
        int mcd = MCD(Math.abs(r.numerador), Math.abs(r.denomidador));
        r.numerador= r.numerador / mcd;
         r.denomidador = r.denomidador / mcd;
        return new Racional(r.numerador, r.denomidador);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Racional other = (Racional) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        return this.denomidador == other.denomidador;
    }

    // Establecemos orden de los objetos racionales teniendo encuenta su valor racional

    @Override
    public int compareTo(Racional o) {
        return (int) (this.toDecimal() - o.toDecimal());
    }
}
