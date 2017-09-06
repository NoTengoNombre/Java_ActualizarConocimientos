/**
 * @created on : 06-sep-2017, 0:09:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

public class T5x15InicializarMatrizComplejo {

    private int[][] matriz;

    public int[][] matriz2 = new int[10][10];

    public T5x15InicializarMatrizComplejo() {
        this.matriz = new int[10][10];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int[][] setMatriz(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                if (i % 2 == 0) {
                    ma[i][j] = 0;
                    System.out.print("\u001B[32m Par : " + ma[i][j] + " ");
                }
                if (i % 2 != 0) {
                    ma[i][j] = 1;
                    System.out.print("\u001B[33m Impar : " + ma[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println();
        return ma;
    }

    public static void main(String[] args) {
        T5x15InicializarMatrizComplejo mt = new T5x15InicializarMatrizComplejo();
        int[][] a = mt.getMatriz();
        mt.setMatriz(a);

    }
}
