/**
 * @created on : 06-sep-2017, 20:38:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Matrices;

public class JavaMatricesPosicionAnteriorConIndices {

    public static void main(String[] args) {

        System.out.println("SI LA FILAS SON MAYORES QUE LAS COLUMNAS : ERROR ");
        System.out.println("CUANDO LE DICES QUE RECORRA EL ARRAY POR FILAS ");
        System.out.println("PORQUE NO LLEGA AL INDICE DE LAS COLUMNAS ");
        int[][] a
                = {
                    //     C0 C1 C2 C3 C4
                    /*f0 */{0, 1, 2, 3, 4},
                    /*f1*/ {5, 6, 7, 8, 9},
                    /*f2*/ {10, 11, 12, 13},
                    /*f3*/ {14, 15, 16, 17},
//                    /*f4*/ {18, 19, 20, 21},
//                    /*f5*/ {118, 119, 120, 121}
                };

        System.out.println("Longitud de la 1º dimension : " + a.length);
        System.out.println("-------------");
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a.length; c++) {
                System.out.print(a[f][c] + " ");
            }
        }
        System.out.println("\n---------------");

        System.out.println(a[0][0]);

    }
}
