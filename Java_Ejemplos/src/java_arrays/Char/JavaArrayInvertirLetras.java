/**
 * @created on : 13-sep-2017, 11:18:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

public class JavaArrayInvertirLetras {

    public static void main(String[] args) {

        char[] cadena = {'Z', 'O', 'R', 'R', 'O',};

        for (int i = cadena.length - 1; i >= 0; i--) {
            System.out.print(cadena[i]);
        }
        System.out.println();
    }
}
