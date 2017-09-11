/**
 * @created on : 09-sep-2017, 21:13:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.util.Arrays;

public class JavaArrayVerLongitud {

    public static void main(String[] args) {

        String cadena = "Hello Friend ; Free your Mind";
        String cadena1 = "Free";

        char[] c = new char[cadena.length()];
        char[] c1 = new char[cadena1.length()];

        for (int i = 0; i < cadena.length(); i++) {
//Convierto String a array Char
            c[i] = cadena.charAt(i);
            System.out.print(c[i]);
        }

        System.out.println("");
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(c));
        System.out.println("");
        System.out.println(Arrays.toString(c1));

    }
}
