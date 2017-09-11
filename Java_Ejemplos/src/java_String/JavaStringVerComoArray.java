/**
 * @created on : 11-sep-2017, 9:45:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringVerComoArray {

    public static void main(String[] args) {
        char[] c = {'a', ' ', 'b', ' ', 'c', 'd', ' ', 'f', 'g', ' ', 'h', 'i'};
        String st = new String(c, 0, c.length);
        System.out.println(st);
        

    }
}
