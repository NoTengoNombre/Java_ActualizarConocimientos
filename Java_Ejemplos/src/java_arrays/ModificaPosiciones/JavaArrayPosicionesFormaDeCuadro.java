/**
 * @created on : 08-sep-2017, 23:42:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.ModificaPosiciones;

/**
 * Mostrar un array siguiendo la forma de un cuadrado
 *
 * @author Portatil_Bot
 */
public class JavaArrayPosicionesFormaDeCuadro {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        int ii = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ii++;
                System.out.print("|" + arr[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");

        System.out.print(arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " " + arr[0][3] + " | ");
        System.out.print(arr[1][3] + " " + arr[2][3] + " | ");
        System.out.print(arr[3][3] + " " + arr[3][2] + " " + arr[3][1] + " " + arr[3][0] + " | ");
        System.out.print(arr[2][0] + " " + arr[1][0] + " | ");

        System.out.println("----------------------");
        for (int f = 0; f < arr.length; f++) {
            for (int c = 0; c < arr[f].length; c++) {
                if ((f == 0) && (c <= arr.length)) {
                    System.out.print(arr[f][c] + " ");
//                    arrAlmacen[f][c] = arr[f][c];
                }
                if ((f >= 1) && (c == arr.length - 1)) {
                    if (f <= arr.length - 2) {
                        System.out.print(" " + arr[f][c] + " ");
//                        arrAlmacen[f][c] = arr[f][c];
                    }
                }
                if (f == arr.length - 1) {
                    System.out.print(arr[f][((arr.length - 1) - c)]);
                }
                if (f == 2) {
                    System.out.print(arr[arr.length - 2][0]);
                }
            }
        }
        System.out.println("\n-------------------------------------");
    }
}
