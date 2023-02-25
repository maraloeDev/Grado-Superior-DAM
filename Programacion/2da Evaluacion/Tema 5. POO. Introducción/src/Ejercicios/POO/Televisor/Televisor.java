/*
 * *
 *  * *****************************************************************************
 *  * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 *  * ****************************************************************************
 *
 */

package Ejercicios.POO.Televisor;

public class Televisor {

    // ATRIBUTOS
    private String numero_serie;
    private double pulgadas;
    private int canales;
    private int canal;
    private boolean encenderse;
    private int volumen;
    private boolean mute;

    // CONSTRUCTOR
    public Televisor(String numero_serie, double pulgadas, int canales, int volumen, boolean mute) {
        this.numero_serie = numero_serie;
        this.pulgadas = pulgadas;
        this.canales = canales;
        this.canal = 1;
        this.encenderse = true;
        this.volumen = 30;
        this.mute = mute;
    }
    // GETTER AND SETTER

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getCanales() {
        return canales;
    }

    public void setCanales(int canales) {
        this.canales = canales;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isEncenderse() {
        return encenderse;
    }

    public void setEncenderse(boolean encenderse) {
        this.encenderse = encenderse;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    // toString
    @Override
    public String toString() {
        return "Televisor{" + "numero_serie=" + numero_serie + ", pulgadas=" + pulgadas + ", canales=" + canales + ", canal=" + canal + ", encenderse=" + encenderse + ", volumen=" + volumen + ", mute=" + mute + '}';
    }


    // Metodos

    public void subirCanal() {
        this.canal++;
        if (this.canal <= 1) {
            this.canal = 1;
        }
    }


    public void bajarCanal() {
        this.canal--;
        if (this.canal <= 1) {
            this.canal = 1;
        }
    }

    public void bajarVolumen() {
        this.volumen--;
        if (this.volumen <= 0) {
            this.volumen = 1;
        }
    }

    public void subirVolumen() {
        this.volumen++;
        if (this.volumen <= 0) {
            this.volumen = 1;
        }
    }

    public boolean encenderse(boolean encender) {
        if (encender == this.encenderse) {
            this.canal = 1;
            return true;
        } else {
            return false;
        }
    }

    public int cambiarCanal(int cambiar) {
        if (cambiar > this.canal) {
            this.getCanal();
        } else {

            return cambiar;
        }
        return this.canal = cambiar;
    }

    public void silencio() {

        if (this.mute == true) {
            this.volumen = 0;
        } else {
            this.getVolumen();
        }

    }
}
