package Ejemplos;
/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
/**
 *
 * @author maraloed
 */
public class Ejemplo3 {

    //Metodo que determina si esta aprobado o no
    //En funcion de la nota y la asistencia
    static int numero;

    public static boolean isAprobado(double nota, boolean asistencia) {

        if (nota >= 5) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        double nota = 5.5;
        boolean asistencia = true;
        System.out.println(isAprobado(10, false));

        //Los paraametros actuales son las que se llaman deste el metodo
    }

}
