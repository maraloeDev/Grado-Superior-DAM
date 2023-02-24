package Ejercicios.POO.CocheAutomatico;

import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MART�N-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class CocheAutomaticoApp {

    public void menu() { // Metodo en el que establezco un menu para el switch, y lo llamo desde el do while
        System.out.println("(+) Acelerar");
        System.out.println("(-) Decelerar");
        System.out.println("(p) Parar");
        System.out.println("(r) Repostar");
        System.out.println("(t) TiposConduccion");
        System.out.println("-------------");
        System.out.print("Seleccion: ");
    }

    public static void main(String[] args) {
        CocheAutomaticoApp app = new CocheAutomaticoApp();
        Scanner teclado = new Scanner(System.in);

        CocheAutomatico coche1 = new CocheAutomatico("1458ASW", "Renault", "Clio", 500, true, 20, 250);

        coche1.setVelocidad(10);
        coche1.setMarca("Fiat");
        coche1.setModelo("500");
        coche1.setModosConduccion("eco");

        char opc;
        do {
            app.menu();
            opc = teclado.nextLine().toLowerCase().charAt(0);
            switch (opc) {
                case '+':
                    coche1.acelerar();
                    break;
                case '-':
                    coche1.decelerar();
                    break;
                case 'p':
                    coche1.parar();
                    break;
                case 'r':
                    coche1.repostar(1);
                    break;
                case 't' :
                    coche1.tipoConducir();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (true);
    }
}
