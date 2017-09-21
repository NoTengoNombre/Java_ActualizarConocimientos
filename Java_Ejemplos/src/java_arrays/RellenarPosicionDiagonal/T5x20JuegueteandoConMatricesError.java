/**
 * @created on : 08-sep-2017, 22:24:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.RellenarPosicionDiagonal;

public class T5x20JuegueteandoConMatricesError {

    private static final int N = (int) (Math.random() * (1 + 9) + 1);
    private static final int N1 = (int) (Math.random() * (1 + 9) + 1);
    private static int[][] matriz = new int[N][N1];

    private static void setMatriz() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (1 + 8) + 1);
            }
        }
    }

    private static void setMostrarMatriz() {
        System.out.println("Filas : " + matriz.length);
        System.out.println("Columnas : " + matriz[0].length);
        System.out.println("---------------------------------------");
        setMatriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
            System.out.println("");
        }
    }

    private static void setPerimetroMatriz() {

        int[][] matriz = new int[4][4];
        int[][] m1 = matriz;

        int i = 1;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = c + i;
                System.out.print(matriz[f][c]);
            }
            System.out.println("");
        }

        System.out.println("-------------------");

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == 0) {
                    m1[f][c] = matriz[f][c];
                }
                do {
                    if ((f > 0) && (c == matriz.length)) {
                        m1[f][c] = matriz[f][c];
                    }
                } while (f < matriz.length - 1);

                if (f == matriz.length) {
                    for (int inversa = matriz.length; inversa >= 0; inversa--) {
                        m1[f][c] = matriz[f][c];
                    }
                }

                if (f == matriz.length) {
                    m1[f][c] = matriz[matriz.length - 1][0];
                    if (f == matriz.length) {
                        m1[f][c] = matriz[matriz.length - 2][0];
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

//        setMatriz();
//        setMostrarMatriz();
        setPerimetroMatriz();
    }

}
