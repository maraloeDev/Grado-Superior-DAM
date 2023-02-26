/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Barcos;

/**
 *
 * @author maraloed
 */
public class Velero extends Barco {

    public Velero() {
        System.out.println("Se ha creado un velero");
    }

    @Override
    public void alarma() {
        System.out.println("SOS desde un velero");
    }

    public void metodo2() {
        System.out.println("Metodo2 de barco");
    }

}
