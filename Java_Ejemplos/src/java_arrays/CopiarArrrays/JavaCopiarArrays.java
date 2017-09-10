/**
 * @created on : 07-sep-2017, 10:44:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.CopiarArrrays;

public class JavaCopiarArrays {

    /**
     *
     * @param matrizVacia
     * @return
     */
    public static int[][] getNumMatriz(int[][] matrizVacia) {
        for (int i = 0; i < matrizVacia.length; i++) {
            for (int j = 0; j < matrizVacia[i].length; j++) {
//                matrizVacia[i][j] = (int) (Math.random() * (1 * 100));
                matrizVacia[i][j] = j + 1;
            }
        }
        return matrizVacia;
    }

    /**
     * Copia lo que hay en una pasada por parametro a otra matriz local para
     * devolverla
     *
     * @param matrizPara
     * @return
     */
    public static int[][] getCopiarNumMatriz(int[][] matrizPara) {
        int[][] matrizContenedor = new int[10][5];

        getNumMatriz(matrizPara); // En este punto coge la matriz desde el parametro y la rellena de datos

        for (int f = 0; f < matrizPara.length; f++) {
            System.arraycopy(matrizPara[f], 0, matrizContenedor[f], 0, matrizPara[f].length);
        }
        return matrizContenedor;
    }

    /**
     * Coge la matriz desde los parametros y los modifica
     *
     * @param matrizParam
     */
    public static void setVerDatos(int[][] matrizParam) {
        for (int i = 0; i < getCopiarNumMatriz(matrizParam).length; i++) {
            for (int j = 0; j < getCopiarNumMatriz(matrizParam)[i].length; j++) {
                System.out.println("fila : " + i + " columnas : " + getCopiarNumMatriz(matrizParam)[i][j]);
            }
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {

        int[][] matriz = new int[10][5];

        setVerDatos(matriz);
    }

}
