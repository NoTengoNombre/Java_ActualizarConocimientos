/**
 * @created on : 20-sep-2017, 10:17:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.CompararPosicionConNumero;

import java.util.Arrays;

public class JavaArrayCompararPosicionConNumero {

    public static void main(String[] args) {

        int numero;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0}; // longitud 10 - posiciones 9
        System.out.println("Array : " + array.length);

        int[] arrayContenedor = new int[array.length];
        System.out.println("Array Contenedor : " + arrayContenedor.length);

        for (int j = 0; j < array.length - 1; j++) {
            numero = (int) (Math.random() * (1 + 10));
            for (int k = j; k < array.length - 1; k++) {
                System.out.println("Numero Generado : " + numero);
//                  0      10
                if (k < array.length - 1) {
//                         5          0[1]
                    if (numero == array[k + 1]) {
//                                    0[?]
                        arrayContenedor[k + 1] = (int) (Math.random() * (1 + 10));
                    } else {
//                                    0[5]    5
                        arrayContenedor[k + 1] = numero;
                    }
                }
            }
        }

        System.out.println("------------------------------");
        System.out.println(Arrays.toString(arrayContenedor));
        System.out.println("------------------------------");

    }
}
