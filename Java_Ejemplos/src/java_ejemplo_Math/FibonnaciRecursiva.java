/**
 * @created on : 27-jul-2017, 23:31:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

import java.util.Scanner;

public class FibonnaciRecursiva {

    public static int fibonnaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonnaci(n - 1) + (n - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un numero para hacer la sucesión Fibonnaci: ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        for (int i = 1; i <= v; i++) {
            System.out.println(fibonnaci(i));
        }
    }

}
