/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.coche_automatico;

/**
 *
 * @author ortsanma
 */
public class coche {

    private String marca;
    private String modelo;
    private String matricula;
    private char estado;//Cogi los que normalmete hay, yo he asignado a "P" para
    //parking, "R" para marcha atras, "N" punto muerto,y "D" hacia alante
    private int velocidad;
    private int velocidadMax;
    private double deposito;
    private double depositoMax;
    private int pasajeros;
    private int pasajerosMax;
    private boolean on_off;//booleano que determina si esta encendido o apagado
    private boolean frenoMano;
    private int Vellock;//Sistema de tope de velocidad

    //CONSTRUCTOR, tome que los datos predeterminados, quitando que al estar quieto
    //la velocidad y revoluciones estaran en 0, tienen que ser:
    //- El estado, estara en modo parking (P)
    //- La marcha, estara en punto muerto (0)
    //- El deposito, que estara por la mitad
    //- Los pasajeros, seran 0, asi que habra que subirse antes
    //- El freno de mano, que estara echado hechado
    //- El AddLock, el cual esta puesto en la velocidad maxima
    public coche(String marca, String modelo, String matricula, int velocidadMax,
            double depositoMax, int pasajerosMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.estado = 'P';
        this.velocidad = 0;
        this.velocidadMax = velocidadMax;
        this.deposito = this.depositoMax / 2;
        this.depositoMax = depositoMax;
        this.pasajeros = 0;
        this.pasajerosMax = pasajerosMax;
        this.on_off = false;
        this.frenoMano = true;
        this.Vellock = velocidadMax;
    }

    //GETTER Y SETTER esteticos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //GETTER Y SETTER valores maximos   
    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getDepositoMax() {
        return depositoMax;
    }

    public void setDepositoMax(double depositoMax) {
        this.depositoMax = depositoMax;
    }

    public int getPasajerosMax() {
        return pasajerosMax;
    }

    public void setPasajerosMax(int pasajerosMax) {
        this.pasajerosMax = pasajerosMax;
    }

    //GETTER Y SETTER funcionalidades
    public char getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (this.on_off == true) {
            switch (estado) {
                case 1: {
                    this.estado = 'P';
                    System.out.println("Modo aparacado");
                }
                case 2: {
                    this.estado = 'R';
                    System.out.println("Modo marcha atras");
                }
                case 3: {
                    this.estado = 'N';
                    System.out.println("Modo punto muerto");
                }
                case 4: {
                    this.estado = 'D';
                    System.out.println("Modo marcha alante");
                }
                default:
                    System.out.println("No existe ese estado del coche");
            }
        } else {
            System.out.println("El coche esta apagado");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void subirVelocidad() {
        if (this.on_off == true) {
            if (this.deposito > (this.depositoMax * 0.1)) {
                if (this.estado != 'P' && this.estado != 'N') {
                    if (this.frenoMano == false) {
                        if (this.velocidad <= this.velocidadMax || this.velocidad <= this.Vellock) {
                            this.velocidad++;
                            System.out.println("Se ha acelerado");
                        } else {
                            System.out.println("Velocidad maxima adquirida");
                        }
                    } else {
                        System.out.println("El freno de mano esta hechado");
                    }
                } else {
                    System.out.println("El coche esta en funcion parking o punto muerto,"
                            + "por lo que no podra acelerarse");
                }
            } else {
                System.out.println("Tenga cuidado, el deposito o esta vacio o"
                        + "esta por debajo del 10% de su capacidad");
            }
        } else {
            System.out.println("El coche esta apagado");
        }

    }

    public void bajarVelocidad() {
        if (this.on_off == true) {
            if (this.estado != 'P' && this.estado != 'N' || this.frenoMano == false) {
                if (this.velocidad > 0) {
                    this.velocidad--;
                    System.out.println("Se ha decelerado");
                } else {
                    System.out.println("Coche detenido");
                }

            } else {
                System.out.println("El coche ya esta detenido");
            }
        } else {
            System.out.println("El coche esta apagado");
        }

    }

    public double getDeposito() {
        return deposito;
    }

    public void llenarDeposito(double llenado) {
        if (this.deposito < this.depositoMax) {
            if (this.deposito + llenado >= this.depositoMax) {
                this.deposito = this.deposito + llenado;
                System.out.println("Se ha llenado el deposito");
            } else {
                System.out.println("No puedes llenar esa cantidad, debido a que el"
                        + "deposito revosaria");
            }
        } else {
            System.out.println("El deposito ya esta lleno");
        }

    }

    public void vaciadoDeposito() {
        this.deposito = this.deposito - 0.5;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void subirPasajeros(int pasajeros) {
        if ((this.pasajeros + pasajeros) <= this.pasajerosMax) {
            this.pasajeros = this.pasajeros + pasajeros;
            System.out.println("Se han subido " + pasajeros + "psajero/s");
        } else {
            System.out.println("Cuidado el numero de pasajeros esta por encima del"
                    + "permitido");
        }
    }

    public void bajarPasajeros(int pasajeros) {
        this.pasajeros = this.pasajeros - pasajeros;
        System.out.println("Se han bajado " + pasajeros + "pasajero/s");
    }

    public boolean isOn_off() {
        return on_off;
    }

    public void Enecender() {
        this.on_off = true;
        System.out.println("El coche se ha encendiddo");
    }

    public void Apagar() {
        this.on_off = false;
        System.out.println("El coche se ha apagado");
    }

    public boolean isFrenoMano() {
        return frenoMano;

    }

    public void activarFrenoMano() {
        this.frenoMano = true;
        System.out.println("Has hechado el freno de mano");
    }

    public void desactivarFrenoMano() {
        this.frenoMano = false;
        System.out.println("Has desactivado el freno de mano");
    }

    public int getAVellock() {
        return Vellock;
    }

    public void setVellock(int vellock) {
        if (vellock == this.Vellock) {
            System.out.println("El Vellock ya esta hechado en esa velocidad");
        } else {
            if (vellock > 1 && vellock < this.velocidadMax) {
            this.Vellock = vellock;
            System.out.println("Has puesto el Vellock en " + Vellock);
        } else {
            System.out.println("No hay velocidad seleccionable");
        }
        }
    }

}
