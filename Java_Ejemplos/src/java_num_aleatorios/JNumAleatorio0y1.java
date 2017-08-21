/**
 * @created on : 14-ago-2017, 13:17:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class JNumAleatorio0y1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * (1 + 1));
            System.out.print(x);
        }
        System.out.println("");

    }
}
