/**
 * @created on : 18-jul-2017, 0:35:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_coger_teclado_sumar_datos1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ii = 0;
        int num = 0;
        int total_suma = 0;

        System.out.println("Intro valor : ");
        while (ii <= 10) {

            num = (int) br.read();
            System.out.println("valor : " + num);

            total_suma += num;

            System.err.println("Suma valores : " + total_suma);

            ii++;
        }

    }

}
