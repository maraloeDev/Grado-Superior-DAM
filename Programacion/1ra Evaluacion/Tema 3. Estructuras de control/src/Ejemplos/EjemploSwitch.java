/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

public class EjemploSwitch {

    public static void main(String[] args) {
        int eleccion = 0; //Opciones disponibles 1 2 3 4
        
        int aleatorio = (int) (1 + Math.random() * 4);
        
        switch (aleatorio) {
            
            case 1:
                System.out.println("Has elegido la opcion 1");
                break;
            case 2:
                System.out.println("Has elegido la opcion 2");
                break;
            case 3:
                System.out.println("Has elegido la opcion 3");
                break;
            case 4:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Error");
        }
    }

}
