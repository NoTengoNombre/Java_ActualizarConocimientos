/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

/**
 * Genera un array con elementos no repetidos mediante numeros aleatorios
 *
 * @author Portatil_Bot
 */
public class ArrayAlmacenaNumeroAleatorioNoRepetidoResumen {

//                                  0  1  2  3  4
    private static int[] numeros = {1, 2, 3, 4, 5};
    private static int[] almacenarNumeros = new int[numeros.length];
//    Auxilar para intercambiar posiciones
    private static int aux;

    public static int getNumero() {
        int x = (int) (Math.random() * (1 + numeros.length - 1));
        System.out.println("♦ Numero Generado : " + x + " ♦♦♦");
        return x;
    }

    public static void intercambiarPosicionArray() {

//                      0 < 4 numeros
        for (int i = 0; i < numeros.length; i++) {

            int v1 = getNumero();
            int v2 = getNumero();

            aux = numeros[v1];

            numeros[v1] = numeros[v2];
            numeros[v2] = aux;

            if (numeros[v1] != numeros[v2]) {
                almacenarNumeros[v1] = numeros[v1];

            }
        }
    }

    public static void main(String[] args) {

        intercambiarPosicionArray();

        System.out.println("------------------");
        System.out.println("♣ Lista de elementos");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
}
