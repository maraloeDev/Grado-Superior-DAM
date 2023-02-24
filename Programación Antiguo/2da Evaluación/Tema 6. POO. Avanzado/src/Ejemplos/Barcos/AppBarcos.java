/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Barcos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maraloed
 */
public class AppBarcos {
    //Metodo generico para controlar cualquier barco

    public static void naufragio(Barco b) {
        b.alarma(); //Se determina a que metodo alarma se llama
        // El mnetodo alarma es un metodo polimorfico

        if (b instanceof Velero) {
            ((Velero) b).metodo2();
        } else if (b instanceof Yate) {

            Yate y = (Yate) b;
            try {
                y.metodo3(-5);
            } catch (ExcepciónBarco ex) {
                ex.getMessage();
            }

        }
    }

    public static void main(String[] args) {
        Velero velero1 = new Velero();
        Yate yate1 = new Yate();

        //Estos metodos es una ligadura estatica debido a que se ejecuta en tiempo de compilacion
        velero1.alarma();
        yate1.alarma();

        naufragio(yate1);
        naufragio(velero1);

    }

}
