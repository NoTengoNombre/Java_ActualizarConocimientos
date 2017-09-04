/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAlmacenaNumeroAleatorioNoRepetido {

    private static int[] numeros = {1, 2, 3, 4, 5};
    private static int[] almacenar = new int[numeros.length];
    private static int x;

    public static int getNumero() {
        return x = (int) ((1 + 10) * Math.random());
    }

    public static int[] setArray() {

        return null;
    }

    public static void main(String[] args) {

        int x = (int) ((1 + 10) * Math.random());
        System.out.println(x);
    }
}
