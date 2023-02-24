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
public class Barco {
    
    private String matricula;
    private double metrosEslora;
    private Date anioFabricacion;

    public Barco(String matricula, double metrosEslora, Date anioFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(double metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public int modulo(){
        int modulo = (int) ((10 *this.metrosEslora) * 2);
        
        return modulo;
    }
    
    

}
