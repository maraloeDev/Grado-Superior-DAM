/*
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.POO.Televisor;

/**
 * @author marti
 */
public class Televisor {

    //ATRIBUTOS
    private String numeroSerie;
    private double pulgadas;
    private int numeroCanales;
    private int canal;
    private boolean encenderTelevision; //True si esta encendida y false si no esta encendida
    private int volumenTelevisor; //El volumen va de 0 a 30
    private boolean quitarSonido; //True si esta silenciada, y false si no esta silenciada

    //CONSTRUCTORES


    public Televisor(String numeroSerie, double pulgadas, int numeroCanales, int canal, boolean encenderTelevision, int volumenTelevisor, boolean quitarSonido) {
        this.numeroSerie = numeroSerie;
        this.pulgadas = pulgadas;
        this.numeroCanales = numeroCanales;
        this.canal = 1;
        this.encenderTelevision = encenderTelevision;
        this.volumenTelevisor = volumenTelevisor;
        this.quitarSonido = false;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getNumeroCanales() {
        return numeroCanales;
    }

    public void setNumeroCanales(int numeroCanales) {
        this.numeroCanales = numeroCanales;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (this.canal > this.numeroCanales) {
            System.out.println("Canal no existente");
        }
        this.canal = canal;
    }

    public boolean isEncenderTelevision() {
        return encenderTelevision;
    }

    public void setEncenderTelevision(boolean encenderTelevision) {
        this.encenderTelevision = encenderTelevision;
    }

    public int getVolumenTelevisor() {
        return volumenTelevisor;
    }

    public void setVolumenTelevisor(int volumenTelevisor) {
        this.volumenTelevisor = volumenTelevisor;
    }

    public boolean isQuitarSonido() {
        return quitarSonido;
    }

    public void setQuitarSonido(boolean quitarSonido) {
        this.quitarSonido = quitarSonido;
    }

    @Override
    public String toString() {
        return "Estado del Televisor " +
                "numeroSerie = '" + numeroSerie + '\'' +
                ", pulgadas = " + pulgadas +
                ", numeroCanales  =" + numeroCanales +
                ", canal = " + canal +
                ", encenderTelevision = " + encenderTelevision +
                ", volumenTelevisor = " + volumenTelevisor +
                ", quitarSonido = " + quitarSonido;
    }

    public int cambiarCanal(int cambiar) {
        if (cambiar > this.canal) {
            this.getCanal();
        } else {

            return cambiar;
        }
        return this.canal = cambiar;
    }

    public String subirCanal() {
        this.canal++;
        if (this.canal <= 1) {
            this.canal = 1;
        }
        return "canal subido a" + this.canal;
    }

    public String bajarCanal() {
        this.canal--;
        if (this.canal <= 1) {
            this.canal = 1;
        }
        return "canal bajado a" + this.canal;
    }

    public String subirVolumen() {
        this.volumenTelevisor++;
        if (this.volumenTelevisor > 0) {
            this.volumenTelevisor = 1;
        }
        return "volumen subido a" + this.volumenTelevisor;
    }

    public String bajarVolumen() {
        this.volumenTelevisor--;
        if (this.volumenTelevisor == 1) {
            this.getVolumenTelevisor();
        }

        return "volumen bajado a" + this.volumenTelevisor;
    }

    public void silenciarTelevisor(){
        if (this.quitarSonido==true){
            this.volumenTelevisor=0;
        } else {
            this.getVolumenTelevisor();
        }

    }
}
