/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerlos {

    private static int f = 0;
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();
        System.out.println("----------");

        do {
//            System.out.println("Intro letra : ");
//            String l = SC.next();
//            if (l.equals("si")) {
                f++;
                System.out.println("Numero : " + a[f]);
                c[f] = a[f];
                System.out.println(c[f]);
//            }
        } while (f < a.length);
        System.out.println();

    }
}
