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
public class T3__16_Estadistica_basica {

    static int[] serie = new int[10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int num;
        int max;
        int min;

        do {
            System.out.println("Intro un numero : ");
            num = sc.nextInt();

            serie[i] = num;
            System.out.println("El valor de la posicion " + i + " es : " + serie[i]);
            i++;

        } while (i < 10);

        for (int j = 0; j < serie.length; j++) {

            System.out.println("El valor es : " + serie[j]);

            if (serie[j] < num) {
                min = serie[j];
                System.out.println("Numero minimo es : " + min);

            } else if (serie[j] > num) {
                max = serie[j];
                System.out.println("Numero maximo es : " + max);
            }

        }
        System.out.println("Numero total es : " + i);
    }
}
