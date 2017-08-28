/**
 * @created on : 28-ago-2017, 19:30:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.MetodosClaseArray;

import java.util.Arrays;

public class T5ArraySort {

    static double[] vector = {
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10),
        (Math.random() * (1 + 100) + 10)};

    public static void main(String[] args) {

        Arrays.sort(vector, 0, vector.length);

        for (int i = 0;
                i < vector.length;
                i++) {
            System.out.println(vector[i]);
        }

    }
}
