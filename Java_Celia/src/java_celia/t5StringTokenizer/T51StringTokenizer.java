/**
 * @created on : 29-ago-2017, 21:03:41
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5StringTokenizer;

import java.util.StringTokenizer;

/**
 * La clase StringTokenizer nos ayuda a dividir un string en substrings o
 * tokens, en base a otro string (normalmente un carácter) separador entre ellos
 * denominado delimitador.
 *
 * @author Portatil_Bot
 */
public class T51StringTokenizer {

    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Sirve para dividir un string en Substring");
        System.out.println("La cadena str tiene " + str.countTokens() + " elementos , y son :");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }

}
