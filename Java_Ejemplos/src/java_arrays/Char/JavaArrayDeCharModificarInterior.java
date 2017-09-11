/**
 * @created on : 09-sep-2017, 21:13:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.util.Arrays;

public class JavaArrayDeCharModificarInterior {

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

        for (int i = 0; i < cadena1.length(); i++) {
//Convierto String a array Char
            c1[i] = cadena1.charAt(i);
            System.out.print(c1[i]);
        }

        System.out.println("");
        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i]);
        }

        System.out.println("");
        for (int i = 0; i < c1.length; i++) {
//            System.out.print(c1[i]);
        }

        for (int j = 0; j < c1.length; j++) {
            if (c1[j] == c1[j]) {
                c1[j] = '*';
                System.out.print(c1[j]);
            }
        }

        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
        }

        System.out.println("");
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(c));
        System.out.println("");
        System.out.println(Arrays.toString(c1));

    }
}
