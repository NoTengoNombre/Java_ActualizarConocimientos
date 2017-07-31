/**
 * @created on : 31-jul-2017, 0:11:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__25_Quiniela {

    public static void getQuiniela() {
        String x = null;
        for (int i = 0; i < 14; i++) {
            int v = (int) (Math.random() * (1 + 2) + 1);
            if (v == 1) {
                x = "x";
                System.out.print(" - " + x);
            }
            if (v == 2) {
                x = "1";
                System.out.print(" - " + x);
            }
            if (v == 3) {
                x = "2";
                System.out.print(" - " + x);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        getQuiniela();
    }
}
