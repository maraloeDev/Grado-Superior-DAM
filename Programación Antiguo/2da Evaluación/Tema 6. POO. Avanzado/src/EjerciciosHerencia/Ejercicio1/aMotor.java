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
public class aMotor extends Barco{
    
    private double potencia;

    public aMotor(double potencia, String matricula, double metrosEslora, Date anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString()+ potencia +  '}';
    }
    
    

}
