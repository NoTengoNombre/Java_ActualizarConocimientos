/**
 * @created on : 09-sep-2017, 21:13:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

public class JavaArrayDeCharConCaracterVacio {

    public static void main(String[] args) {

        String cadena = "Hola Mundo";

        char[] c = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            c[i] = cadena.charAt(i);
            System.out.print(c[i]);
            if (c[i] == '\000') {
                System.out.println("E");
            }
        }

        System.out.println("\n--------------\n");
        System.out.print(c[0]);
        System.out.print(c[1]);
        System.out.print(c[2]);
        System.out.print(c[3]);
        System.out.print(c[4]);
        System.out.print(c[5]);
        System.out.print(c[6]);
        System.out.println("\n--------------\n");

        System.out.println("");
        if (c[4] == '\u0020') {
            System.out.println("Valor vacio ");
        }

        char[] s = new char[10];
        s[0] = 'a';
        s[1] = 'b';
        s[2] = 'c';
        s[3] = ' ';
        s[4] = 'e';
        int i = 0;
        while (s[i] == '\u0020') {
            System.out.println("si");
            System.out.print(s[i]);
            i++;
        }

        char ccc = ' ';

        if (ccc == '\u0020') {
            System.out.println("VACIO ");
        }

    }
}
