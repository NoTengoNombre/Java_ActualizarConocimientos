/**
 * @created on : 29-ago-2017, 21:13:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5StringTest {

    private static String[] lista;
    final static int POS = 5;

    public static void muestra() {
        for (int i = 0; i < POS; i++) {
            System.out.println(lista[i] + " ");
        }
    }

    public static void main(String[] args) {

        lista = new String[POS];
        for (int i = 0; i < POS; i++) {
            String ln = SC.nextLine();
            lista[i] = ln.toLowerCase();
        }
        muestra();
    }
}
