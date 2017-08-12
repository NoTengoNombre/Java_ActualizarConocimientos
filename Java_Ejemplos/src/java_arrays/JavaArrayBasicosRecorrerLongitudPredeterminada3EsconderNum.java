/**
 * @created on : 11-ago-2017, 18:00:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaArrayBasicosRecorrerLongitudPredeterminada3EsconderNum {

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
                    System.out.print("Posicion : " + a[i] + " - Numero a Adivinar : " + a[cont]);
                    Thread.sleep(3000);
                    System.out.print("\b\b\b\b\b");

                }
            } else {
                System.out.println("No Entra");
                cont = 10;
            }
            System.out.println();
            if (cont == 10) {
                System.out.println("♦♦♦ Final ♦♦♦");
            } else {
                System.out.println("Intro otra vez 's' ");
                res = SC.nextInt();
            }
        } while (cont < 10);

    }
}
