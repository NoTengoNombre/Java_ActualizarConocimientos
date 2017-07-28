/**
 * @created on : 26-jul-2017, 20:02:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 *
 *
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3__18_Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿ Intro un numero para factorizar ? ");
        int x = Integer.parseInt(br.readLine());

        int valor_incremental = 1;
        int variable_controladora = x;

        do {
            x = x * (valor_incremental++);
        } while (valor_incremental < x && valor_incremental < variable_controladora);

        System.out.println("---------------");
        System.out.println("Total : " + x);

    }

}
