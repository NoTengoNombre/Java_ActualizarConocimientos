/**
 * @created on : 25-ago-2017, 17:49:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class T5Array1OrdenacionBurbujaPractica {

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
     * @param array
     * @return
     */
    public static int[] setOrdenacionBurbuja(int[] array) {

        int i, j, elem;

        System.out.println("--------------------------");
        for (i = 1; i < array.length; i++) {
            for (j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    elem = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = elem;
                }
            }
        }
        return array;
    }

    public static void getMostrarArray() {
        System.out.println("--------------------------");
        int[] array = setOrdenacionBurbuja(getArray());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        getMostrarArray();

    }
}
