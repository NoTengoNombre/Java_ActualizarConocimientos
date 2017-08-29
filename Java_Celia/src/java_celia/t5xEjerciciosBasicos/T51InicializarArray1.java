/**
 * @created on : 29-ago-2017, 22:59:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T51InicializarArray1 {

    private static int[] array = new int[101];

    public static void main(String[] args) {

        for (int i = 1; i < array.length; i++) {
            array[i] = -1;
            System.out.println(i + " - " + array[i]);
        }
    }
}
