/**
 * @created on : 07-sep-2017, 0:31:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayPiramideDeNumeros {

    static int[][] a = new int[5][7];

    public static int getNumeroAleatorio() {
        int n = (int) (Math.random() * (1 + 100));
        return n;
    }

    public static void setDatos() {
        int x = 100;
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                if ((getNumeroAleatorio() <= 50) && (c <= 3)) {
                    a[f][c] = getNumeroAleatorio();
                }
                System.out.print(a[f][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        setDatos();
    }
}
