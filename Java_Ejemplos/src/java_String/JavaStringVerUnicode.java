/**
 * @created on : 09-sep-2017, 22:46:44
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringVerUnicode {

    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }

}
