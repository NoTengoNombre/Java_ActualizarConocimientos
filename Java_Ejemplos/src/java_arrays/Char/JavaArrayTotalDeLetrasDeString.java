/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays.Char;

import java.io.IOException;

/**
 *
 * @author Portatil_Bot
 */
public class JavaArrayTotalDeLetrasDeString {

    /**
     * Con esto compruebo que tienen los mismo caracteres
     *
     * @param cadena
     * @return
     * @throws IOException
     */
    public int getNumeroDeLetras(String cadena) throws IOException {
        int longitud = cadena.length();
        char[] c = new char[longitud];
        int numTotalLetras = 0;
        for (int i = 0; i < longitud; i++) {
            c[i] = cadena.charAt(i);
            System.out.print(c[i] + 0 + " ");
            numTotalLetras += c[i];
        }
        System.out.println("Longitud total : " + numTotalLetras);
        return numTotalLetras;
    }

}
