/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Arrays;

/**
 *
 * @author maraloed
 */
public class EjemploArrays2 {

    //Busqueda  binaria
    public static void main(String[] args) {
        int ordenar[] = new int[10];

        int pos = Arrays.binarySearch(ordenar, 10);
//     
//        System.out.println(pos);

//  Trabajamos con array de personas
        PersonaClase[] per = new PersonaClase[5];

        PersonaClase p1 = new PersonaClase("Pepe", "Perez", 25);
        PersonaClase p2 = new PersonaClase("Luis", "Enrique", 80);
        PersonaClase p3 = new PersonaClase("Julio", "Iglesias", 74);
        PersonaClase p4 = new PersonaClase("Mario", "Ortuñez", 20);
        PersonaClase p5 = new PersonaClase("Pepe", "Villuela", 35);

        per[0] = p1;
        per[1] = p2;
        per[2] = p3;
        per[3] = p4;
        per[4] = p5;

    }
}
