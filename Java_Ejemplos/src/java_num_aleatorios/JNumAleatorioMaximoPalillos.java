/**
 * @created on : 14-ago-2017, 13:17:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class JNumAleatorioMaximoPalillos {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int palillosMenores = (int) (Math.random() * (0 + 2) + 1);

            System.out.print(" " + palillosMenores);
        }
            System.out.println("");

    }
}
