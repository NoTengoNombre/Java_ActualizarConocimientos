/**
 * @created on : 28-ago-2017, 19:30:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.MetodosClaseArray;

import java.util.Arrays;

public class T5ArrayBinarySearch {

    static int[] vector = {90, 50, 100, 70, 80, 60, 20, 10, 30, 40};

    public static void seleccionDirecta() {

        for (int i = 0; i < vector.length; i++) {

            int minimo = vector[i];

            int posicion_minimo = i;

            for (int j = i; j < vector.length; j++) {

                if (vector[j] < minimo) {

                    minimo = vector[j];

                    posicion_minimo = j;
                }
            }
            vector[posicion_minimo] = vector[i];
            vector[i] = minimo;
        }
    }

    public static void valorABuscar() {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + " - Valor : " + vector[i]);
        }
    }

    public static void main(String[] args) {

        seleccionDirecta();

        valorABuscar();

        System.out.println("-----------------------");

        System.out.println("Valor a Buscar : " + 40);

        int r = Arrays.binarySearch(vector, 0, vector.length, 40);

        System.out.println("Posicion : " + r);

    }
}
