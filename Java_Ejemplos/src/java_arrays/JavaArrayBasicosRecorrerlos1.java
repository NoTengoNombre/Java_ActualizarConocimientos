/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerlos1 {

    private static int f = 0;
    private static int cont = 0;
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] c = new int[10];

        System.out.println("Introduce 'si' ");
        String r = SC.next();
        if (r.equals("si")) {
            do {
                cont++;
                for (int i = 0; i < cont; i++) {
                    System.out.print(a[i]);
                }
            } while (cont < 10);
        } else {
            System.out.println("Mala suerte");
        }

        System.out.println();
        System.out.println("----------");

    }
}
