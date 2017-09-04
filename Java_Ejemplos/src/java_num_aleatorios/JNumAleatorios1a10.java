/**
 * @created on : 04-sep-2017, 11:10:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class JNumAleatorios1a10 {

    public static int getX() {
        int x = (int) (Math.random() * (1 + 8) + 1);
        return x;
    }

    public static void main(String[] args) {

        System.out.println(getX());
    }
}
