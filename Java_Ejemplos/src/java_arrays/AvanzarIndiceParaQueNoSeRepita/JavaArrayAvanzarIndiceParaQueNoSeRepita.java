/**
 * @created on : 19-sep-2017, 19:19:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.AvanzarIndiceParaQueNoSeRepita;

public class JavaArrayAvanzarIndiceParaQueNoSeRepita {

    public static int f = 0;
    public static int[] array = {11, 22, 33, 44, 55, 66, 77, 88};

    public static void main(String[] args) {

        for (f = 0; f < array.length; f++) {
            System.out.print(array[f] + " ");
        }
        System.out.println();

        for (f = 1; f < array.length; f++) {
            System.out.print(array[f] + " ");
        }
        System.out.println();

    }
}
