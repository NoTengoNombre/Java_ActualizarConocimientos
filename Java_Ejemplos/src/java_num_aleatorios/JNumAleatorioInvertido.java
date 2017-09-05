/**
 * @created on : 05-sep-2017, 0:14:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class JNumAleatorioInvertido {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            int x = (int) ((1 + 10) * Math.random());
            System.out.println(x);
        }

    }
}
