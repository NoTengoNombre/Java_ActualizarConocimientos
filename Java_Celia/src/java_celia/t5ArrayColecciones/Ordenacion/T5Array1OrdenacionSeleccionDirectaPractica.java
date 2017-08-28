/**
 * @created on : 25-ago-2017, 17:49:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class T5Array1OrdenacionSeleccionDirectaPractica {

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

        int minimo;

        for (int i = 0; i < vector.length; i++) {
//            14         p0v14
            minimo = vector[i];
//                                0
            int posicion_minimo = i;

            for (int j = i; j < vector.length; j++) {
//                        p1v7  < 14
                if (vector[j] < minimo) {
//                    7            p1v7
                    minimo = vector[j];
                    posicion_minimo = j;
                }
            }
            vector[posicion_minimo] = vector[i];
            vector[i] = minimo;
        }
        System.out.println("------------------");
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
