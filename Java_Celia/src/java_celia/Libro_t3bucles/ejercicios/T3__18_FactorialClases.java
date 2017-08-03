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

public class T3__18_FactorialClases {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x;

        do {
            System.out.println("¿ Intro un numero mayor o igual a 0 para factorizar ? ");
            x = Integer.parseInt(br.readLine());
        } while (x < 0);

        int fac = 1;

        for (int i = x; i >= 1; i--) {
            System.out.println(i + " - " + fac);
            fac = fac * i;
        }

        System.out.println("---------------");
        System.out.println("Factorial : " + fac);

    }

}
