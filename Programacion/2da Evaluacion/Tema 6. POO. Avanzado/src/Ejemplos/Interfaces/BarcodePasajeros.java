/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Interfaces;

/**
 *
 * @author maraloed
 */
public abstract class    BarcodePasajeros implements Barco {

    @Override
    public void alarma() {
        System.out.println("Alarma");
    }
    public void mensaje(String msg) {
        System.out.println("Ayuda");
    }
    
}
