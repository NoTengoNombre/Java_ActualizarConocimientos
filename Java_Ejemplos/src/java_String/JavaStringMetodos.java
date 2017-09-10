/**
 * @created on : 03-sep-2017, 0:39:15
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringMetodos {

    public static void main(String[] args) {

        String a = "ABCD12345abcd";
        String z = "z";

        String abc = "abcdefghijklmnñopqrstuvwxyz";

        System.out.println("Convertir String a numero");
        System.out.println("Se pueden hacer operaciones con la cadena String ");

        System.out.println("La 'A' a numerico es : " + (a.charAt(0) - 0));
        System.out.println("La 'A' - 10 a numerico es : " + (a.charAt(0) - 10));
        System.out.println("La 'Z' - a numerico es : " + (z.charAt(0) - 0));
        System.out.println("La 'Z' - a numerico es : " + (z.charAt(0) - 0));
        System.out.println("La 'Z' - a numerico es : " + (z.charAt(0) - 0));

        for (int i = 0; i < abc.length(); i++) {
            System.out.println((abc.charAt(i) - 0) + " - " + abc.charAt(i));
        }

    }

}
