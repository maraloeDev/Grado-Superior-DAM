/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package EjerciciosHerencia.Ejercicio1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author marti
 */
public class Alquiler extends Barco {

    private String nombre;
    private String clienteDni;
    private Calendar fechaInicial;
    private Calendar fechaFinal;
    private int posicionAmarre;
    private Barco barcoOcupar;

    public Alquiler(String nombre, String clienteDni, Calendar fechaInicial, Calendar fechaFinal, int posicionAmarre, Barco barcoOcupar, String matricula, double metrosEslora, Date anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.nombre = nombre;
        this.clienteDni = clienteDni;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barcoOcupar = barcoOcupar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(String clienteDni) {
        this.clienteDni = clienteDni;
    }

    public Calendar getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Calendar fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoOcupar() {
        return barcoOcupar;
    }

    public void setBarcoOcupar(Barco barcoOcupar) {
        this.barcoOcupar = barcoOcupar;
    }

    public double calcularAlquiler() {
        double diasAlquiler = (this.fechaInicial.get(Calendar.DAY_OF_WEEK) + this.fechaFinal.get(Calendar.DAY_OF_WEEK) * barcoOcupar.modulo());
        int valorAlquiler=0;
        if (barcoOcupar instanceof Veleros) {
            valorAlquiler = ((Veleros) barcoOcupar).modulo();
        } else if (barcoOcupar instanceof Yates) {
            valorAlquiler = ((Yates) barcoOcupar).modulo();
        } else if (barcoOcupar instanceof aMotor) {
            valorAlquiler = ((aMotor) barcoOcupar).modulo();
        }

        return valorAlquiler;
    }

}
