/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author maraloed
 */
public class FormateosNumericos {

    public static void main(String[] args) {

//        double cantidad=123456.789;
//                // Formatos preestablecidos (clase number formal
//                
//                NumberFormat nf = NumberFormat.getInstance(); //Por defecto
//                System.out.println("Formato por defecto = " + nf);
//                
//                nf.setMaximumFractionDigits(2); //Por moneda
//                System.out.println(nf.format(cantidad));
//                
//                nf=NumberFormat.getCurrencyInstance();  // Por porcentaje
//                System.out.println(nf.format(cantidad));
//                
//                nf=NumberFormat.getPercentInstance(Locale.US); //Para cambiar dre pais
//                System.out.println(nf.format(cantidad));
        double cantidad1 = 123456.789;
//        double cantidad2 = -.456;
//        double cantidad3 = 123;
//
//        DecimalFormat df = new DecimalFormat("0,000; 0,000.00"); // Plantilla (punto y coma para la separacion;
//        System.out.println(df.format(cantidad1));
//        System.out.println(df.format(cantidad2));
//        System.out.println(df.format(cantidad3));
//
//        df.applyPattern("###.###; ##,###");
//
//        System.out.println(df.format(cantidad1));
//        System.out.println(df.format(cantidad2));
//        System.out.println(df.format(cantidad3));

        //FORMATO CON STRING
        
        System.out.println(String.format("%f", cantidad1)); //FORMATO POR DEFECTO
        System.out.println(String.format("%30f", cantidad1)); //FORMATO POR tabulador
        System.out.println(String.format("%-30f", cantidad1)); //FORMATO POR tabulador
        
        String  cadena = "Desarrollo de aplicaciones multiplataforma";
        
        System.out.println(String.format("%30s", cadena));
        System.out.println(String.format("%-30s", cadena));
        
    }

}
