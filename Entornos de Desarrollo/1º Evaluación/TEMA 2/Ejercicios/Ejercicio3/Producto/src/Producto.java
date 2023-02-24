
import java.util.Scanner;

/**
 * ************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 * ************************************************
 */
public class Producto {
    //ATTRIBUTES

    String idProducto;
    String descripcion_Producto;
    int unidades;

    //Constructor
    public Producto(String idProducto, String descripcion_Producto, int unidades) {
        this.idProducto = idProducto;
        this.descripcion_Producto = descripcion_Producto;
        this.unidades = unidades;
    }

    //Getter and Setter
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion_Producto() {
        return descripcion_Producto;
    }

    public void setDescripcion_Producto(String descripcion_Producto) {
        this.descripcion_Producto = descripcion_Producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    //ToString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", descripcion_Producto=" + descripcion_Producto + ", unidades=" + unidades + '}';
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce id de producto ");
        String id_producto = teclado.nextLine();

        System.out.println("Introduce descripcion del producto");
        String desctipcion = teclado.nextLine();

        System.out.println("Introduce un numero de unidades ");
        int unidades = teclado.nextInt();

        Producto product = new Producto(id_producto, desctipcion, unidades);

        System.out.println("El id del producto son " + id_producto);
        System.out.println("La descripción del producto es " + desctipcion);
        System.out.println("Las unidades del producto son: " + unidades);

        product.setIdProducto("TARJ08112022");
        product.setDescripcion_Producto("TP-Link-TG3468 Gigabit");
        product.setUnidades(30);

    }

}
