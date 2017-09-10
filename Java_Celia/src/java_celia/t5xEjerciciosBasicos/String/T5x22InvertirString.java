/**
 * @created on : 09-sep-2017, 23:50:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5x22InvertirString {

    public static void main(String[] args) throws IOException {
        Invertir i = new Invertir();
        i.getInvertirCadena();
    }
}

class Invertir {

    public String getCadena() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la cadena de caracteres");
        String caracteres = bf.readLine();
        return caracteres;
    }

    public String getInvertirCadena() throws IOException {
        String cadena = getCadena();
        System.out.println("Longitud de la cadena = " + cadena.length());

        char[] c = new char[cadena.length()];
        char[] c1 = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            c[i] = cadena.charAt(i);
        }

        for (int i = cadena.length() - 1; i >= 0; i--) {
            c1[i] = c[i];
            System.out.print(c1[i]);
        }
        System.out.println("");
        return cadena;
    }

}
