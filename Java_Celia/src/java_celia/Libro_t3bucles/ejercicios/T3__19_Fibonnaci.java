/**
 * @created on : 26-jul-2017, 22:09:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__19_Fibonnaci {

    public static int fibonacci_iterativo(int n) {
        int actual = 0, anterior1, anterior2;

        anterior1 = anterior2 = 1;

        if ((n == 0) || (n == 1)) {
            actual = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                actual = anterior1 + anterior2;
                anterior2 = anterior1;
                anterior1 = actual;
            }
        }
        return actual;
    }

    public static int fibonacci_recursivo(int n) {
        if ((n == 0 || n == 1)) {
            return 1;
        } else {
            return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);
        }
    }

    public static void main(String[] args) {
//      0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de los valores : ");
        int longitud = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int temp;

        System.out.println("" + n1);
        System.out.println("" + n2);

        for (int i = 1; i < longitud; i++) {
//           Para almacenar el valor
            temp = n1;
            n1 = n2;
            n2 = temp + n1;
            System.out.println("" + n2);
        }

        int fibonacci_recursivo = fibonacci_recursivo(10);
        System.out.println("Ejecuta fibonacci recursivo : " + fibonacci_recursivo);

        System.out.println("----------------");

        int fibonacci_iterativo = fibonacci_iterativo(5);
        System.out.println("Ejecuta fibonacci iterativo : " + fibonacci_iterativo);

    }
}
