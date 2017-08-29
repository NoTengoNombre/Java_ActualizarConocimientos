/**
 * @created on : 29-ago-2017, 17:59:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

public class t5StringBasico1 {

    public static void main(String[] args) {

//        Mediante char
        char cadena[] = new char[50];
        cadena[0] = 'H';
        cadena[1] = 'e';
        cadena[2] = 'l';
        cadena[3] = 'l';
        cadena[4] = 'o';
        cadena[5] = '\0';

        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }

    }
}
