/**
 * @created on : 04-sep-2017, 12:14:18
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class JavaArraysConDimesionVacia {

    public static void main(String[] args) {

//                 0   1   2  3
        int[] a = {11, 0, 12, 13};
        int[] b = {21, 13, 22, 0};

        int[][] almacenar = {
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        for (int i = 0; i < a.length; i++) {
            System.out.print("Posicion : " + a[i] + " \n");
            if (a[i] != 0) {
                almacenar[0][i] = a[i];
            }
            if (b[i] != 0) {
                almacenar[0][i] = b[i];
            }
        }

//        Recorrer el array
        for (int i = 0; i < almacenar.length; i++) {
            for (int j = 0; j < almacenar[i].length; j++) {
                System.out.print(almacenar[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

