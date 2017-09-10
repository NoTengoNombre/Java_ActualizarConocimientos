/**
 * @created on : 07-sep-2017, 19:44:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.BuclesForConIF;

public class JavaBuclesForConIF {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int f = 0; f < a.length; f++) {
            System.out.print(f);
            if (f % 2 == 0) {
                if (f < a.length) {
                    for (int c = 0; c < 5; c++) {
                        System.out.print(" | " + c);
                    }
                }
            }
            System.out.println("");
        }
    }
}
