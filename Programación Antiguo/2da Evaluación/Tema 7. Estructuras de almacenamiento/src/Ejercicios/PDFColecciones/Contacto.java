/**
 * ****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
package Ejercicios.PDFColecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maraloed
 */

public class Contacto {

    static Scanner teclado = new Scanner(System.in);

    static ArrayList<String> personas = new ArrayList();

    private int id_contacto;
    private String nombreContacto;
    private int telefono_Contacto;

    public Contacto(int id_contacto, String nombreContacto, int telefono_Contacto) {
        this.id_contacto = id_contacto;
        this.nombreContacto = nombreContacto;
        this.telefono_Contacto = telefono_Contacto;
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getTelefono_Contacto() {
        return telefono_Contacto;
    }

    public void setTelefono_Contacto(int telefono_Contacto) {
        this.telefono_Contacto = telefono_Contacto;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id_contacto=" + id_contacto + ", nombreContacto=" + nombreContacto + ", telefono_Contacto=" + telefono_Contacto + '}';
    }

    public void anadirContacto() {

String respuesta;
        do {
        System.out.println("Introduce el nuevo nombre del contacto");
            String nuevo = teclado.nextLine();
            personas.add(nuevo);

        if (nuevo.equals(this.nombreContacto)) {
            System.out.println("Contacto ya extistente");
        }else {
            System.out.println("Contacto creado correctamente");
        }
            System.out.println("Quiere anadir otro contacto");

         respuesta= teclado.nextLine();

        } while (respuesta == "S");
    }

}
