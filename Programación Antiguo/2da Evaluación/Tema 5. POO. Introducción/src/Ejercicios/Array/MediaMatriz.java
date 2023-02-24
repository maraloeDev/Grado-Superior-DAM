package Ejercicios.Array;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MART�N-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class MediaMatriz {

    public double media(int posicion1, int posicion2) {

        int numeros[] = new int[10];

        double media = 0.F;
        try {
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 10) + 1;
            }
            System.out.println(Arrays.toString(numeros));
            for (int i = posicion1; i <= posicion2; i++) {
                media = media + numeros[i]; //añado a la suma la propia media para que la media tenga el valor del array   
            }

            media = media / (posicion1 - posicion2 + 1);

            System.out.println("Media = " + media);
        } catch (Exception ex) {
            System.err.println("Error Indices fuera de alcance");
        }
        return media;
    }

    public static void main(String[] args) {

        MediaMatriz Medai1 = new MediaMatriz();

        Medai1.media(1, 4);
    }
}
