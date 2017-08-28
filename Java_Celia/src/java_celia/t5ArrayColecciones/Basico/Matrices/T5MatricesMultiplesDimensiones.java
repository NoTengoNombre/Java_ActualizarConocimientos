/**
 * @created on : 28-ago-2017, 23:19:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Matrices;

public class T5MatricesMultiplesDimensiones {

    private static int num;

    public static void main(String[] args) {

        int ejemplo[][][][][] = new int[1][2][3][4][5];

        for (int i = 0; i < ejemplo.length; i++) {
            for (int j = 0; j < ejemplo[i].length; j++) {
                for (int k = 0; k < ejemplo[i][j].length; k++) {
                    for (int l = 0; l < ejemplo[i][j][k].length; l++) {
                        for (int m = 0; m < ejemplo[i][j][k][l].length; m++) {
                            ejemplo[i][j][k][l][m] = num++;
                            System.out.printf("|%d", ejemplo[i][j][k][l][m]);
                        }
                    }
                    System.out.printf("\n");
                }
            }
        }

    }
}
