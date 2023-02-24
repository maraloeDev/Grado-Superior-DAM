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
public class Veleros extends Barco {
    
    private int numeroMastiles;

    public Veleros(int numeroMastiles, String matricula, double metrosEslora, Date anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    

}
