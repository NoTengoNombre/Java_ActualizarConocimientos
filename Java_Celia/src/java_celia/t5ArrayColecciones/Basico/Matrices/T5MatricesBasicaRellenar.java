/**
 * @created on : 28-ago-2017, 21:02:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Matrices;

public class T5MatricesBasicaRellenar {

    public static void main(String[] args) {

        int[][] matriz = new int[5][10];

        System.out.println("---------- FILAS -----------");
        System.out.printf("\t-- DE IZQUIERDA a DERECHA --\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                matriz[i][j] = 0;
                int x = matriz[i][j] = i;
                System.out.printf("%4d ", x);
            }
            System.out.println("");
        }

        System.out.println("---------- COLUMNAS -----------");
        System.out.printf("\t-- DE ARRIBA a ABAJO --\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                matriz[i][j] = 0;
                int x = matriz[i][j] = j;
                System.out.printf("%4d ", x);
            }
            System.out.println("");
        }

    }

}
