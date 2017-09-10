/**
 * @created on : 07-sep-2017, 23:14:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.ComprobarPosiciones;

public class JavaComprobarPosiciones2 {

    public static void main(String[] args) {

        int[][] a = new int[5][5];

        for (int f = 0; f < a.length; f++) {
            a[f][f] += 1;
            for (int c = 0; c < a[f].length; c++) {
                a[f][c] += 0;
                System.out.print(a[f][c] + " ");
            }
            System.out.println("");
        }
    }
}
