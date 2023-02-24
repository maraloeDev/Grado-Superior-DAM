/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.coche_automatico;

import java.util.Scanner;

/**
 *
 * @author ortsanma
 */
public class cocheMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Datos al azar
        coche car = new coche("Seat", "Toledo-2023","0000AAA",300,70,5);
        int  resp= 0;
        do{
        System.out.println("INSTRUCCIONES");
        System.out.println("Encender/Apagar->1"
                + "\nCambiar estado del coche->2"
                + "\nAcelerar->3"
                + "\nFrenar->4"
                + "\nAbrir deposito (Echar combustible)->5"
                + "\nAbrir puertas (Para subir o bajar personas)->6"
                + "\nHechar o quitar freno de mano->7"
                + "\nPoner o quitar VelLock (bloqueador de velocidad)->8"
                + "\nIrte->9");
        System.out.println("Tienes un coche, que vas a hacer?");
        resp = sc.nextInt();
        
        switch (resp) {
            case 1:
                boolean onoff = car.isOn_off();
                    if(onoff = false){
                        car.Enecender();
                    }else{
                        car.Apagar();
                    }
                break;
            case 2:
                System.out.println("A que estado quieres el coche");
                System.out.println("\nparking\t->\t1"
                        + "\nmarchaa atras\t->\t2"
                        + "\npunto muerto\t->\t3"
                        + "\nmarcha alante\t->\t4");
                resp = sc.nextInt();
                    car.setEstado(resp);
                break;
            case 3: 
                car.subirVelocidad();
                break;
            case 4:
                car.bajarVelocidad();
                break;
            case 5:
                System.out.println("Cuanto quieres llenar");
                resp = sc.nextInt();
                car.llenarDeposito(resp);
                break;
            case 6:
                System.out.println("A que estado quieres el coche");
                System.out.println("\nsubir persona\t->\t1"
                        + "\nbajar persona\t->\t2");
                resp = sc.nextInt();
                switch (resp) {
                    case 1:
                        System.out.println("Cuantos?");
                        resp = sc.nextInt();
                        car.subirPasajeros(resp);
                        break;
                    case 2:
                        System.out.println("Cuantos?");
                        resp = sc.nextInt();
                        car.bajarPasajeros(resp);
                        break;         
                    default:
                        System.out.println("Error");
                }
            case 7:
                boolean frenoMan = car.isFrenoMano();
                    if(onoff = false){
                        car.desactivarFrenoMano();
                    }else{
                        car.activarFrenoMano();
                    }
                break;
                
            case 8:
                System.out.println("Cuantos?");
                resp = sc.nextInt();
                car.setVellock(resp);
                break;
            case 9:
                break;
            default:
                System.out.println("Error");
        }
        }while(resp != 9);
}
}
