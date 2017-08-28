/**
 * @created on : 28-ago-2017, 19:30:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.MetodosClaseArray;

import java.util.Arrays;

public class T5ArrayFill {

    private static double[] vector = new double[10];
    private static double x;

    public static double getAleatorio() {
        x = Math.random() * (1 + 10);
        return x;
    }

    public static void main(String[] args) {

        T5ArrayFill t5 = new T5ArrayFill();

        Arrays.fill(vector, 0, vector.length, getAleatorio());

        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector : " + vector[i]);
        }

    }
}
