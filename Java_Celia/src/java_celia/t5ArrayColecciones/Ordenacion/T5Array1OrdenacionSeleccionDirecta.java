/**
 * @created on : 25-ago-2017, 17:49:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class T5Array1OrdenacionSeleccionDirecta {

    public static int[] array = new int[10];

    /**
     *
     * @return array
     */
    public static int[] getArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (1 + 20) + 1);
            System.out.println(i + " - " + array[i]);
        }
        return array;
    }

    /**
     *
     * @param vector
     * @return
     */
    public static int[] setOrdenaDirecta(int[] vector) {

        int i, j, minimo, posicion_minimo;

        System.out.println("--------------------------");
        for (i = 0; i < vector.length; i++) {

            minimo = vector[i];
            posicion_minimo = i;
            for (j = i; j < vector.length; j++) {
                if (vector[j] < minimo) {
                    minimo = vector[j];
                    posicion_minimo = j;
                }
            }
            vector[posicion_minimo] = vector[i];
            System.out.println("• Vector : " + vector[posicion_minimo]);
            vector[i] = minimo;
            System.out.println("•• Vector : " + vector[posicion_minimo]);
        }
        return vector;
    }

    public static void getMostrarArray() {
        System.out.println("--------------------------");
        array = setOrdenaDirecta(getArray());
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

    public static void main(String[] args) {

        getMostrarArray();

    }
}
