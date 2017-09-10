/**
 * @created on : 07-sep-2017, 23:14:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.ComprobarPosiciones;

public class JavaComprobarPosiciones {

    public static void main(String[] args) {

        int[][] a = new int[5][5];

        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                a[c][c] = f + 1;
                System.out.print(a[f][c] + " ");
            }
            System.out.println("");
        }
    }
}
