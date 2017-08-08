/**
 * @created on : 07-ago-2017, 12:07:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_fisica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gravedad {

    public static void main(String args[]) throws IOException {
        double m1, m2, m, aux, r, F;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca el valor de m1 expresada en kilogramos:");
        m1 = Double.
                parseDouble(leer.readLine());
        System.out.println("Introduzca el valor de m2 expresada en kilogramos:");
        m2 = Double.
                parseDouble(leer.readLine());
        System.out.println("Introduzca el valor de la distancia expresada en metros :");
        m = Double.
                parseDouble(leer.readLine());
        aux = m1 * m2 * 0.0000000000667;
        r = Math.pow(m, 2);
        F = aux / r;

        System.out.println("La fuerza de atracción gravitacional es: " + F);
    }
}
