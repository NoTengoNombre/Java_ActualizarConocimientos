/**
 * @created on : 11-sep-2017, 9:39:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String.Constructores;

public class JavaStringConstructores {

    public static void main(String[] args) {

        char[] c = {'a', ' ', 'b', ' ', 'c', 'd', ' ', 'f', 'g', ' ', 'h', 'i'};
        String st = new String(c, 0, c.length);
        System.out.println(st);

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {

            }
            System.out.print(c[i]);
        }
        System.out.println("");

    }
}
