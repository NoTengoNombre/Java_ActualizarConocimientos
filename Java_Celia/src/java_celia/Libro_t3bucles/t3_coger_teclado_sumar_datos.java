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
import java.util.logging.Level;
import java.util.logging.Logger;

public class t3_coger_teclado_sumar_datos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;
        int n = 0;
        int suma = 0;

        do {

            n = br.read();
            suma = suma + n;
            System.out.println("numero : " + n);
            System.out.println("suma : " + suma);

            System.out.println(" • veces : " + i++);

        } while (i <= 10);

        int ii = 0;
        int num = 0;
        int total_suma = 0;

        while (ii <= 10) {

            num = br.read();

            total_suma = total_suma + num;

            System.err.println("Suma valores : " + total_suma);

            System.out.println("• Valor : " + ii++);
        }

    }

}
