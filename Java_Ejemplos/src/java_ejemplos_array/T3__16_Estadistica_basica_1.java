/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_array;

import java.util.Scanner;

/**
 *
 */
public class T3__16_Estadistica_basica_1 {

    public static void main(String[] args) {

        int[] serie = new int[10];
        int max = 0;
        int minimo = 10;

        for (int j = 0; j < serie.length; j++) {
            serie[j] = (int) (Math.random() * (1 + 10) + 1);
            System.out.println("El valor es : " + serie[j]);
//            max = serie[j];
        }

        for (int a = 0; a < serie.length; a++) {

            if (serie[a] > max) {
                max = serie[a];
                System.out.printf("\u001B[31m Numero maximo es : " + max + "\n");
            }

            if (serie[a] < minimo) {
//                System.out.println("Valor minimo es : " + minimo);
//                System.out.println("Valor serie[a] minima es : " + serie[a]);
                minimo = serie[a];
                System.out.printf("\u001B[33m Numero minimo es : " + minimo + "\n");
            }

        }
        System.out.printf("\u001B[31m ♦ Numero maximo es : " + max + "\n");
        System.out.printf("\u001B[33m ♦ Numero minimo es : " + minimo + "\n");
    }
}
