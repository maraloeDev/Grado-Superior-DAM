/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Metodos;

public class Ejercicio_8_MayorDe3 {

   /* static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        System.out.println("Introduce un numero");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int numero3 = teclado.nextInt();

        elMayor(numero, numero2, numero3);
    }

    public static void elMayor(int numero, int numero2, int numero3) {

        if ((numero > numero2) && (numero > numero3)) {
            System.out.println("El numero mayor de los introducidos es el " + numero);
        } else if ((numero2 > numero) && (numero2 > numero3)) {
            System.out.println("El numero mayor de los introducidos es el " + numero2);
        } else {
            System.out.println("El numero mayor de los introducidos es el " + numero3);
        }

    }*/
   public int elMayor(int a, int b){
       return (a>=b) ? a : b;

   }
    public int elMayor (int a, int b, int c){
        int mayorDe2elMayor = elMayor(a, b);
        return elMayor(mayorDe2elMayor,c);
    }

    public static void main(String[] args) {

        Ejercicio_8_MayorDe3 app = new Ejercicio_8_MayorDe3();
        System.out.println(app.elMayor(5,3,28));
    }
}
