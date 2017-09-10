/**
 * @created on : 06-sep-2017, 20:38:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Matrices;

public class JavaMatricesPosicionAnterior {

    public static void main(String[] args) {

        int[][] a
                = {
                    //     C0 C1 C2 C3 C4
                    /*f0 */{0, 1, 2, 3, 4},
                    /*f1*/ {5, 6, 7, 8, 9},
                    /*f2*/ {10, 11, 12, 13},
                    /*f3*/ {14, 15, 16, 17},
                    /*f4*/ {18, 19, 20, 21}
                };
        System.out.println(" a[4][c - 1] : Error porque provoca de COL empiece en (-1) en vez de (0)");
        System.out.println("Valor al menos empiece en :  + a[f][1 - 1]");
//        System.out.println("a[0][1]: " + a[0][1] + " - a[0][1-1]: " + a[0][1 - 1]);
//        System.out.println("Da eRRoR PORQUE NO SE acceder a un indice por debajo de 0 ");
//        System.out.println("a[1][1]: " + a[1][1] + " - a[1][0-1]");
//        System.out.println("a[1][2]: " + a[1][1] + " - a[0][1-2]: " + a[1][1]);
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                System.out.print(a[f][c] + " ");
                if (a[f][c] > a[0][0]) {
                    System.out.println("Valor del array : " + a[f][1 - 1]);
                } else {
                    System.out.println(a[f][c]);
                }
            }
            System.out.println("");
        }

    }
}
