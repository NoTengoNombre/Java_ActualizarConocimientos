/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerLongitudPredeterminada {

    private static int f = 0;
    private static int cont = 0;
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

//                 1  2  3  4  5  6  7  8  9 10
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Introduce 's' ");
        String res = SC.next();
        do {
            if (res.equals("s")) {
                System.out.println("Entra");
                cont++;
            } else {
                System.out.println("No Entra");
                cont = 10;
            }
            for (int i = 0; i < cont; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            if (cont == 10) {
                System.out.println("♦♦♦ Final ♦♦♦");
            } else {
                System.out.println("Intro otra vez 's' ");
                res = SC.next();
            }
        } while (cont < 10);

    }
}
