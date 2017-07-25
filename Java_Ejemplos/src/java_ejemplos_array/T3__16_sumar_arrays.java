/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_array;

/**
 *
 */
public class T3__16_sumar_arrays {

    public static void main(String[] args) {

        double[] serie = new double[10];
        double total = 0;

        for (int j = 0; j < serie.length; j++) {
            serie[j] = j;
            System.out.println("Valores : " + serie[j]);
        }

        for (int i = 0; i < serie.length; i++) {
            total += serie[i];
        }
        System.out.println("Total : " + total);
        System.out.println("Total : " + total / serie.length);

    }
}
