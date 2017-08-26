/**
 * @created on : 25-ago-2017, 11:53:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico;

public class T5Array2Manipulacion2 {

    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;
        for (int i = 0; i <= 9; i++) {
            suma += v[i];
            System.out.printf(i + " ---- %10d %n", suma);
        }

    }
}
