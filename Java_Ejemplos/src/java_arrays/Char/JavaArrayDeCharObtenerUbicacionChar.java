/**
 * @created on : 09-sep-2017, 21:13:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

public class JavaArrayDeCharObtenerUbicacionChar {

    public static void main(String[] args) {

        String cpalabra = "Free";
        String ctotal = "Hello Friend ; Free your Mind";

        char[] charpalabra = new char[cpalabra.length()];
        for (int j = 0; j < cpalabra.length(); j++) {
            charpalabra[j] = cpalabra.charAt(j);
            System.out.print(charpalabra[j]);
        }
        System.out.println();

        char[] chartotal = new char[ctotal.length()];
        for (int i = 0; i < ctotal.length(); i++) {
            chartotal[i] = ctotal.charAt(i);
            System.out.print(chartotal[i]);
        }

        System.out.println("");

        for (int j = 0; j < chartotal.length; j++) {
        }

        System.out.println();

        for (int i = 0; i < chartotal.length; i++) {
            for (int j = i; j < chartotal.length; j++) {
            }
            System.out.println("");
        }

    }
}
