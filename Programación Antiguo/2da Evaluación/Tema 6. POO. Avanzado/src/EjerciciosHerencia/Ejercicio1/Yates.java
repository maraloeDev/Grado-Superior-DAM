/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */

package EjerciciosHerencia.Ejercicio1;

import java.util.Date;

/**
 *
 * @author marti
 */
public class Yates extends Barco{
    
    private double potencia;
    private int numero_camarotes;

    public Yates(double potencia, int numero_camarotes, String matricula, double metrosEslora, Date anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potencia = potencia;
        this.numero_camarotes = numero_camarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumero_camarotes() {
        return numero_camarotes;
    }

    public void setNumero_camarotes(int numero_camarotes) {
        this.numero_camarotes = numero_camarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "potencia=" + potencia + ", numero_camarotes=" + numero_camarotes + '}';
    }

    
    
    

}
