/**
 * @created on : 15-jul-2017, 12:13:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class java_num_aleatorios {

    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {

            double valor = (double) (Math.random() * (0 + 10) + 1);
            System.out.println(valor);
            System.out.println("------------");
        }

    }
}
