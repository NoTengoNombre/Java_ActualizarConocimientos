/**
 * @created on : 29-ago-2017, 17:59:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

import java.util.Iterator;

public class t5StringBasico {

    public static void main(String[] args) {

//        Mediante char
        char cadena[] = new char[50];
        cadena[0] = 'H';
        cadena[1] = 'e';
        cadena[2] = 'l';
        cadena[3] = 'l';
        cadena[4] = 'o';

        for (char c : cadena) {
            System.out.print(c);
        }
        System.out.println("\n---------------");

        char cadena1[] = new char[50];
        cadena1[0] = 'H';
        cadena1[1] = 'e';
        cadena1[2] = 'l';
        cadena1[3] = 'l';
        cadena1[4] = 'o';
        cadena1[5] = '\0';

        for (char c1 : cadena1) {
            System.out.print(c1);
        }
        System.out.println("\n---------------");

    }
}
