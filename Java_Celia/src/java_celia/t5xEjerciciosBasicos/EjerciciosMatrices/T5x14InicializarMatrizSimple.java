/**
 * @created on : 06-sep-2017, 0:09:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

public class T5x14InicializarMatrizSimple {

    private int[][] matriz;

    public int[][] matriz2 = new int[10][10];

    public T5x14InicializarMatrizSimple() {
        this.matriz = new int[10][10];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int[][] setMatriz(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = -1;
                System.out.print(ma[i][j]);
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        return ma;
    }

    public static void main(String[] args) {
        T5x14InicializarMatrizSimple mt = new T5x14InicializarMatrizSimple();
        mt.setMatriz(mt.getMatriz());

        T5x15InicializarMatrizComplejo mt2 = new T5x15InicializarMatrizComplejo();
        mt.setMatriz(mt2.matriz2);

    }
}
