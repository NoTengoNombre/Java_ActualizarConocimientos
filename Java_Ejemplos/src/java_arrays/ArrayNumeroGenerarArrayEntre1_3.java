/**
 * @created on : 12-ago-2017, 10:55:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Arrays;

public class ArrayNumeroGenerarArrayEntre1_3 {

    private static int x1 = (int) (Math.random() * (1 + 2) + 1);
    private static int x2 = (int) (Math.random() * (1 + 2) + 1);
    private static int x3 = (int) (Math.random() * (1 + 2) + 1);
    private static int x4 = (int) (Math.random() * (1 + 2) + 1);
    private static int x5 = (int) (Math.random() * (1 + 2) + 1);
    private static int x6 = (int) (Math.random() * (1 + 2) + 1);
    private static int x7 = (int) (Math.random() * (1 + 2) + 1);
    private static int x8 = (int) (Math.random() * (1 + 2) + 1);
    private static int x9 = (int) (Math.random() * (1 + 2) + 1);

    private static final int[] ARRAY = {x1, x2, x3, x4, x5, x6, x7, x8, x9};
    private static int contador = 0;

    public static void generarArray() {
        contador++;
        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[contador] = (int) (Math.random() * (1 + 2) + 1);
        }
    }

    public static void main(String[] args) {
 
        String toString = Arrays.toString(ARRAY);
        System.out.println("cadena : " + toString);

        String strOfInts = Arrays.toString(ARRAY).replaceAll("\\[|\\]|,|\\s", "");
        System.out.println("cadena de STRING : " + strOfInts);
        

    }
}
