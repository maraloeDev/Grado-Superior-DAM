public class Expresiones_regulares {

    public static void main(String[] args) {
        String cadena1 = "En un lugar de La Mancha";
        String cadena2;
        String cadena3 = "Solo se que no se nada";

        //Reemplazar la primera "a" por "e"
        cadena2 = cadena1.replaceFirst("a", "e");
        System.out.println(cadena2); // En un luger de La Mancha
        //Comprobamos que no modifica la cadena original
        System.out.println(cadena1);

        //Utilicemos expresiones regulares donde reemplazaremos la primera vocal minúscula por una e
        cadena2 = cadena1.replaceFirst("[aeiou]", "e");
        System.out.println(cadena2);// En en lugar de La Mancha
        //Comprobamos que no modifica la cadena original
        System.out.println(cadena1);

        //Reemplazar la todas las "a" por "e"
        cadena2 = cadena1.replaceAll("a", "e");
        System.out.println(cadena2); // En un luger de Le Menche
        //Comprobamos que no modifica la cadena original
        System.out.println(cadena1);

        //Utilicemos expresiones regulares donde reemplazaremos la todas las vocales minúscula por e" e
        cadena2 = cadena1.replaceAll("[aeiou]", "e");
        System.out.println(cadena2);// En en leger de Le Menche
        //Comprobamos que no modifica la cadena original
        System.out.println(cadena1);

        // Ejemplo1: devolvera false, ya que la cadena tiene mas caracteres tras Solo
        System.out.println("Ejemplo1: " + cadena3.matches("Solo"));

        // Ejemplo2: devolvera true, porque la cadena comienza por Solo
        System.out.println("Ejemplo2: " + cadena3.matches("Solo.*"));

        // Ejemplo3: devolvera true, porque en la cadena hay alguno de esos caracteres-->q
        System.out.println("Ejemplo3: " + cadena3.matches(".*[qnd].*"));

        // Ejemplo4: devolvera false, ya que ninguno de esos caracteres estan
        System.out.println("Ejemplo4: " + cadena3.matches(".*[xyz].*"));

        // Ejemplo5: devolvera true, ya que le indicamos que no incluya esos caracteres
        System.out.println("Ejemplo5: " + cadena3.matches(".*[^xyz].*"));
    }
}