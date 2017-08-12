/**
 * @created on : 12-ago-2017, 10:55:03
 * @see
 * https://stackoverflow.com/questions/10904911/how-to-convert-an-int-array-to-string-with-tostring-method-in-java#10904956
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Arrays;

public class ArrayNumeroStringAEnteroSinParentesis {

    private static final int[] ARRAY = new int[9];

    public static void generarArray() {
        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = (int) (Math.random() * (1 + 2) + 1);
        }
    }

    public static void main(String[] args) {
        generarArray();

        String toString = Arrays.toString(ARRAY);
        System.out.println("cadena : " + toString);

        String strOfInts = Arrays.toString(ARRAY).replaceAll("\\[|\\]|,|\\s", "");
        System.out.println("cadena : " + strOfInts);

        int secuencia = Integer.parseInt(strOfInts);
        System.out.println("Secuencia numeros : " + secuencia);

    }
}
