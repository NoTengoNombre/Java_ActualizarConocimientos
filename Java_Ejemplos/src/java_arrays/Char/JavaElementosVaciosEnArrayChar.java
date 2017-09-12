/**
 * @created on : 12-sep-2017, 17:16:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

public class JavaElementosVaciosEnArrayChar {

    public static void main(String[] args) {

        char[] c = new char[10];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '\u0000') {
                System.out.println("Vacio ' ' ");
            }
        }

        System.out.println();
    }
}
