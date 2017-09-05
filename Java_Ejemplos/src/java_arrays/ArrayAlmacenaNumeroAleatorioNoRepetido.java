/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAlmacenaNumeroAleatorioNoRepetido {

//                                  0  1  2  3  4
    private static int[] numeros = {1, 2, 3, 4, 5};
    private static int[] almacenarNumeros = new int[numeros.length];
    private static int aux;

    public static int getNumero() {
        int x = (int) (Math.random() * (1 + numeros.length - 1));
        System.out.println("♦♦♦ Numero Generado : " + x);
        return x;
    }

    public static void intercambiarPosicionArray() {

        for (int i = 0; i < numeros.length; i++) {

            int x = getNumero();
            int y = getNumero();

            System.out.println("1º numero aleatorio : " + x);
            System.out.println("2º numero aleatorio : " + y);
            System.out.println("----------------------------------------");

            aux = numeros[x];

            System.out.println("• Valor numeros[" + x + "] : " + numeros[x]);
            System.out.println("• Valor Auxiliar : " + aux);

            if (x == y) {
                y = getNumero();
                System.out.println("♠ Valor numeros[" + y + "] : " + numeros[y]);
            }

            numeros[x] = numeros[y];
            numeros[y] = aux;

            System.out.println("----------------------------------------");
            System.out.println("♥ Valor numeros[" + x + "] : " + numeros[x]);
            System.out.println("♥ Valor Auxiliar : " + aux);
            System.out.println("♥ Valor numeros[" + y + "] : " + numeros[y]);

            if (numeros[x] != numeros[y]) {
                almacenarNumeros[x] = numeros[x];
                System.out.println("♦ AlmacenarNumeros : " + almacenarNumeros[x]);
            }
        }
    }

    public static void main(String[] args) {

        intercambiarPosicionArray();

        System.out.println("------------------");
        System.out.println("Lista de elementos");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
}
