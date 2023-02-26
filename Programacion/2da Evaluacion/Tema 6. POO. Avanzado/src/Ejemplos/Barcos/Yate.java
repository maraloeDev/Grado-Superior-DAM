/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Barcos;

/**
 *
 * @author maraloed
 */
public class Yate extends Barco {

    public Yate() {
        System.out.println("Se ha creado un yate");
    }

    @Override
    public void alarma() {
        System.out.println("SOS desde un yate");
    }

    public void metodo3(int numero) throws ExcepciónBarco {
        System.out.println("Metodo3 de yate");
    }

}
