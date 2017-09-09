/**
 * @created on : 09-sep-2017, 18:55:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5xEjercicioAsteriscos {

    public static void main(String[] args) throws IOException {

        Asteriscos a = new Asteriscos();
        a.getCensuraPalabra();

    }
}

class Asteriscos {

    /**
     * Metodo que coge por teclado una cadena y no modifica sus caracteres , es
     * una cadena mutable.
     *
     * String es una cadena
     *
     * coge correctamente los espacio entre caracteres '\u0020'
     *
     * @return
     * @throws IOException
     */
    public StringBuilder getTeclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("• Introduce una frase por teclado : ");
        String s = br.readLine();
        StringBuilder ss = new StringBuilder(s);
        return ss;
    }

    /**
     * Censura la palabra por medio de la clase Mutable de StringBuilder
     *
     * @throws IOException
     */
    public void getCensuraPalabra() throws IOException {

        StringBuilder cadena = getTeclado();

        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = cadena.charAt(i);

            if ('a' == cadena.charAt(i) || 'e' == cadena.charAt(i) || 'i' == cadena.charAt(i) || 'o' == cadena.charAt(i) || 'u' == cadena.charAt(i)) {
                caracteres[i] = '*';
            }

            if ('A' == cadena.charAt(i) || 'E' == cadena.charAt(i) || 'I' == cadena.charAt(i) || 'O' == cadena.charAt(i) || 'U' == cadena.charAt(i)) {
                caracteres[i] = '*';
            }
        }

        for (char ca : caracteres) {
            System.out.print(ca);
        }
        System.out.println();

    }

}
