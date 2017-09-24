/**
 * @created on : 24-sep-2017, 19:39:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T5x14InicializarMatrizSimpleProfesor {

    String str1, str2;

    /**
     * Generarmos un array asignando el mismo valor inicial
     *
     * @param filas
     * @param cols
     * @param valorInicial
     * @return
     */
    public static int[][] inicializar(int filas, int cols, int valorInicial) {
        int[][] m = new int[filas][cols];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                m[f][c] = (int) (Math.random() * (1000) + 1);
            }
        }
        return m;
    }

    public static void mostrar(int[][] matriz) {
//        Mostrar el contenido de la matriz
        for (int[] indice1 : matriz) {
            for (int indice2 : indice1) {
                System.out.format(" %12d ", indice2);
            }
            System.out.println();
        }
    }

    public static void mostrar2(int[][] matriz) {
//        Mostrar el contenido de la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(" " + matriz[f][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrrizBasica = T5x14InicializarMatrizSimpleProfesor.inicializar(10, 5, -1);
        T5x14InicializarMatrizSimpleProfesor.mostrar(matrrizBasica);
        System.out.println("-----------------------------------");
        T5x14InicializarMatrizSimpleProfesor.mostrar2(matrrizBasica);
    }
}
