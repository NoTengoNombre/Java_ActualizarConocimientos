/**
 * @created on : 12-sep-2017, 18:38:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaArrayCharHasta8Elementos {

    /**
     * Pide por teclado que escriba ocho letras
     *
     * @return
     * @throws IOException
     */
    public static char[] getArray8Char() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char palabra = (char) bf.read();
        char[] a = new char[9];
        for (int i = 1; i < a.length - 1; i++) {
            System.out.println("Introduce el " + i + "º caracter de 8");
            a[i] = palabra;
        }
        return a;
    }

    /**
     * Coge por teclado una palabra minimo 1 caracter y maximo 8 caracteres
     *
     * @return
     */
    public static String getStringPorTecladoMax8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.next();
        if (palabra.length() < 0 || palabra.length() > 8) {
            while (palabra.length() < 0 || palabra.length() > 8) {
                System.out.println("Introduce una palabra entre 1 y 8");
                palabra = sc.next();
            }
        }
        return palabra;
    }

    public static void main(String[] args) throws IOException {
//        getStringPorTecladoMax8();
        getArray8Char();
    }
}
