/**
 * @created on : 10-sep-2017, 14:43:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5x25Palindromos {

    public static void main(String[] args) throws IOException {

        Palindromos p = new Palindromos();
        p.setComprobacionFinal();

    }
}

class Palindromos {

    public String getTeclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una palabra o frase ");
        return br.readLine().trim().toLowerCase();
    }

    /**
     *
     * @param cadena
     * @return
     * @throws IOException
     */
    public char[] getLetrasNormal(String cadena) throws IOException {
        int longitud = cadena.length();
        char[] c = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            c[i] = cadena.charAt(i);
        }
        return c;
    }

    /**
     *
     * @param cadena
     * @return
     * @throws IOException
     */
    public char[] getLetrasInverso(String cadena) throws IOException {
        int longitud = cadena.length();
        char[] cNormal = new char[longitud];
        char[] cInvertida = new char[longitud];

        for (int i = longitud - 1; i >= 0; i--) {
            cNormal[i] = cadena.charAt(i);
            int v = (longitud - 1) - i;
            cInvertida[v] = cadena.charAt(i);
        }
        return cInvertida;
    }

    public int setCompararCadenas(char[] c, char[] c1) throws IOException {
        int cierto = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == c1[i]) {
                System.out.println("Iguales : " + c[i] + " = " + c1[i]);
                cierto = 1;
            } else {
                System.out.println("No Iguales : " + c[i] + " = " + c1[i]);
                cierto = 2;
            }
        }
        return cierto;
    }

    public void getValor(int entero) throws IOException {
        if (entero == 1) {
            System.out.println("Son iguales");
        }
        if (entero == 2) {
            System.out.println("Son Diferentes");
        }

    }

    public void setComprobacionFinal() throws IOException {
        String valor = getTeclado();
        getValor(setCompararCadenas(getLetrasNormal(valor), getLetrasInverso(valor)));
    }

}
