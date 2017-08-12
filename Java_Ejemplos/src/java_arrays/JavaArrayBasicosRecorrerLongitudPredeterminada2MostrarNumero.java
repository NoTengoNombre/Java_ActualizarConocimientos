/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerLongitudPredeterminada2MostrarNumero {

    private static int cont = 0;
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Introduce '1' ");
        int res = SC.nextInt();
        do {
            if (res == 1) {
                System.out.println("Entra");
                cont++;
                for (int i = 0; i < cont; i++) {
                    System.out.print(a[i]);
                }
                Thread.sleep(1000);
                System.out.print("\b");
            } else {
                System.out.println("No Entra");
                cont = 10;
            }
            System.out.println();
            if (cont == 10) {
                System.out.println("♦♦♦ Final ♦♦♦");
            } else {
                System.out.println("Intro otra vez '1' ");
                res = SC.nextInt();
            }
        } while (cont < 10);

    }
}
