/**
 * @created on : 04-sep-2017, 11:38:10
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class JNumAleatoriosArray {

    public static void main(String[] args) {

//                            Posicion
//                 0  1  2  3  4  5  6  7  8  9
        int[] a = {0, 0, 0, 4, 0, 0, 4, 0, 0, 0};
        int[] b = {0, 0, 0, 4, 0, 0, 4, 0, 0, 0};

        for (int j = 0; j < a.length; j++) {
            for (int i = j; i < a.length; i++) {
                if (a[j] == b[i]) {
                    System.out.print(a[j] + " ");
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
