/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAlmacenaNumeroAleatorioNoRepetidoError2 {

//                                  0  1  2  3  4
    private static int[] numeros = {1, 2, 3, 4, 5};

    public static int getNumero() {
        int x = (int) (Math.random() * (1 + numeros.length - 1));
        return x;
    }

    public static void setComprobarNumeroDelArray() {
        int aux;
        for (int i = 0; i < numeros.length; i++) {
//           1           v1[0]
            aux = numeros[i];
//               v1[0]         3[2]
            numeros[i] = numeros[getNumero()];
//               v1[2]           =  1
            numeros[getNumero()] = aux;
        }
    }

    public static void main(String[] args) {

        setComprobarNumeroDelArray();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
}
