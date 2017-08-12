/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerLongitudPredeterminada1 {

    private static int cont = 0;
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] aux = new int[a.length];

        System.out.println("Introduce '1' ");
        int res = SC.nextInt();
        do {
            if (res == 1) {
                cont++;
                System.out.println("Entra : incrementa el for : " + cont);
                for (int i = 0; i < cont; i++) {
                    System.out.print(a[i]);
                }
            } else {
                System.out.println("No Entra en el for");
                cont = 10;
            }
            System.out.println();
            if (cont == 10) {
                System.out.println("♦♦♦ Final ♦♦♦");
            } else {
                System.out.println("Intro otra vez '1' para volver a entrar en el bucle");
                res = SC.nextInt();
            }
        } while (cont < 10);

    }
}
