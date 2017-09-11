/**
 * @created on : 10-sep-2017, 17:36:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.util.Arrays;

public class JavaArrayCharVerContenido {

    private static final char[] AB
            = {'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'ñ',
                'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x',
                'y', 'z'};

    public static void main(String[] args) {

        String cadena = Arrays.toString(AB);
        System.out.println("Cadena : " + cadena);

    }

}
