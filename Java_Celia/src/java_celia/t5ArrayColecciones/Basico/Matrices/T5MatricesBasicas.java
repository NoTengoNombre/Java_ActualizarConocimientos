/**
 * @created on : 28-ago-2017, 21:02:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Matrices;

public class T5MatricesBasicas {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        matriz[0][0] = 5;
        matriz[1][0] = 5;
        matriz[3][2] = 5;

        System.out.println("filas : " + matriz.length);
        System.out.println("columnas : " + matriz[0].length);
    }

}
