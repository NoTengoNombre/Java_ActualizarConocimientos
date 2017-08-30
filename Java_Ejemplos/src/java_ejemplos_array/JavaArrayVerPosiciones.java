/**
 * @created on : 27-ago-2017, 13:58:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_array;

public class JavaArrayVerPosiciones {

    public static void main(String[] args) {

        int posicion_minimo = 0;
        int i = 0;

        int[] v = {5, 3, 1};

        int minimo = v[i];
        System.out.println("Minimo : " + minimo);
        v[posicion_minimo] = v[i];
        System.out.println("v[posicion_minimo] : " + v[posicion_minimo]);
        v[i] = minimo;
        System.out.println("v[i] : " + v[i]);
    }
}
