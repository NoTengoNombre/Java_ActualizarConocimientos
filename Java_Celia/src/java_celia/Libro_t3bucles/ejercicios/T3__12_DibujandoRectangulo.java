/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

/**
 * Dibuja patrones con asteriscos utilizando bucles.
 *
 * (comenzamos con los comentarios en formato javadoc)
 *
 */
public class T3__12_DibujandoRectangulo {

    public static void rectangulo(int espacio_izq_der, int num_col, int cantidad_puntos) {
        System.out.println("---------");
        for (int f = 0; f < espacio_izq_der; f++) {
            for (int c = 0; c < num_col; c++) {
                System.out.print(" ");
            }
            for (int i = 0; i < cantidad_puntos; i++) {
                System.out.print("•");
            }
            System.out.println("");
        }
    }

    public static void rectangulo2(int param, String simb) {
        System.out.println("---------");
        if (param >= 0) {
            param = param + 2;
        }

        if (param > 2) {
            param++;
        }
        for (int f = 0; f < param; f++) {
            for (int c = 0; c < param - 1; c++) {
                System.out.print(" ");
            }
            for (int i = 0; i < param - 1; i++) {
                System.out.print(simb);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("---------");
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 3; i++) {
                System.out.print("•");
            }
            System.out.println("");
        }

        rectangulo(4, 3, 3);
        rectangulo2(1, "♣");

    }
}
