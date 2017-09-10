/**
 * @created on : 06-sep-2017, 20:38:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Matrices;

public class JavaMatricesIndicesNegativos {

    public static void main(String[] args) {

        System.out.println("NUNCA FUNCIONARA : \n"
                + "int[][] a = new int[-1][-1] ");
        int[][] a = new int[1][1];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] += 100;
                System.out.println(a[i][j]);
            }
        }

    }
}
