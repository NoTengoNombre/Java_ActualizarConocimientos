/**
 * @created on : 18-jul-2017, 0:35:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

import java.io.IOException;

public class T3_conmutador_consola {

    public static void main(String[] args) throws IOException {

        int n, suma;
        boolean terminar;

        suma = 0;
        terminar = false;
        while (terminar == false) {
            System.out.println("Intro un numero (negativo para terminar)");
            n = Integer.parseInt(System.console().readLine());
            if (n >= 0) {
                suma = suma + n;
            } else {
                terminar = true;
            }
        }
        System.out.println("La suma es : " + suma);
    }

}
