/**
 * @created on : 07-sep-2017, 10:27:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

public class T5x18SumarMatrices {

    private static final int[][] MATRIZA = new int[10][5];
    private static final int[][] MATRIZB = new int[10][5];
    private static int[][] matrizContenedor = new int[10][5];

    public static int setNumAleatorio() {
        int x = (int) (Math.random() * (1 * 255) + 1);
        return x;
    }

    public static int[][] getCargadaMatrizDeNumeros(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = setNumAleatorio();
            }
        }
        return matriz;
    }

    public static void setCopiarMatriz(int[][] matriz) {
        getCargadaMatrizDeNumeros(matriz);
        for (int f = 0; f < matriz.length; f++) {
            if (f == 0) {
                System.out.println("---------- Siguiente Array -----------");
            }
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("F : " + f + " - c : " + c + " = " + matriz[f][c]);
            }
        }
        System.out.println("---------- Fin de la Matriz -----------");

    }

    public static void setSumarMatriz() {
        setCopiarMatriz(MATRIZA);
        setCopiarMatriz(MATRIZB);
        for (int f = 0; f < matrizContenedor.length; f++) {
            for (int c = 0; c < matrizContenedor[f].length; c++) {
                if (MATRIZA[f][c] == MATRIZB[f][c]) {
                    matrizContenedor[f][c] = (MATRIZA[f][c] + MATRIZB[f][c]);
                    System.out.println("◘ matrizA[" + f + "][" + c + "] : "
                            + MATRIZA[f][c] + " + matrizB[" + f + "][" + c + "] : "
                            + MATRIZB[f][c] + " = " + matrizContenedor[f][c]);
                } else {
                    System.out.println("• matrizA[" + f + "][" + c + "] : "
                            + MATRIZA[f][c] + " + matrizB[" + f + "][" + c + "] : "
                            + MATRIZB[f][c] + " = " + matrizContenedor[f][c]);
                }
            }
        }
    }

    public static void main(String[] args) {

        setSumarMatriz();
    }
}
