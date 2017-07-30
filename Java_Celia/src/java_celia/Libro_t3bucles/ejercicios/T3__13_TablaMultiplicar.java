/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

/**
 *
 */
public class T3__13_TablaMultiplicar {

    public static void multiplicar(int n) {
        for (int i = 0; i < 11; i++) {
            int res = n * i;
            System.out.println(n + " x " + i + " = " + res);
        }
    }

    public static void main(String[] args) {
        multiplicar(4);

    }
}
