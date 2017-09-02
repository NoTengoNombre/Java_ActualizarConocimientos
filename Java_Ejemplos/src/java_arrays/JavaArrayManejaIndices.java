/**
 * @created on : 02-sep-2017, 20:21:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Arrays;

public class JavaArrayManejaIndices {

    public static void main(String[] args) {
// INDICES          0   1  2    3   4  5   6   7   8
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99}; // LONGITUD 9
        int[] a1 = a;
        int[] a2 = a;
        int[] a3 = a;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int num = 20;
        int varI = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < num) {
                varI++;
            }
        }
        System.out.println("varI : " + varI);

        int varD = 0;

        for (int d = a.length - 1; d > 0; d--) {
            if (num < a[d]) {
                varD++;
            }
        }
        System.out.println("varD : " + varD);

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i - 1] > num) {
                a[i] = a[i - 1];
                System.out.println("♦ valor abrir hueco : " + a[i]);
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (num <= a[0]) {
                a[0] = num;
            }
            if (varI > i) {
                a[varI] = num;
            }
            System.out.print(a[i] + " ");
        }

        System.out.println("");
    }

}
