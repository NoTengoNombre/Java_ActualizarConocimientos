/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayCambiarPosicionDeLosNumeros {

//                                  0  1  2  3  4  5  6  7  8  9
    private static int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int[] arrayContenedorNum = new int[arrayNumeros.length];
    private static int aux;

    public static int getNumero() {
        int x = (int) (Math.random() * (1 + arrayNumeros.length - 1));
        return x;
    }

    public static void setIntercambiarPosicionArray() {

        for (int i = 0; i < arrayNumeros.length; i++) {

            int x = getNumero();
            int y = getNumero();

            aux = arrayNumeros[x];

            if (x == y) {
                y = getNumero();
            }

            arrayNumeros[x] = arrayNumeros[y];
            arrayNumeros[y] = aux;

            if (arrayNumeros[x] != arrayNumeros[y]) {
                arrayContenedorNum[x] = arrayNumeros[x];
            }
        }
    }

    public static void main(String[] args) {

        setIntercambiarPosicionArray();

        System.out.println("------------------");
        System.out.println("Lista de elementos");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }
        System.out.println("");
    }
}
