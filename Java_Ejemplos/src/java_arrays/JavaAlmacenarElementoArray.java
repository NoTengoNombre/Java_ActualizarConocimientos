/**
 * @created on : 11-ago-2017, 21:11:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Scanner;

public class JavaAlmacenarElementoArray {

    private final static Scanner SC = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {

//                     0  1  2  3  4  5  6  7  8  9
        int[] datos = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1};

        System.out.println("Introduce el " + datos[0] + " : ");
        if (datos[0] == (num = SC.nextInt())) {
            System.out.println(datos[0]);
        }

        System.out.println("Introduce el " + datos[0] + "" + datos[1]);
        if (datos[0] == (num = SC.nextInt())) {
            if (datos[1] == (num = SC.nextInt())) {
                System.out.println("Repite la serie : ");
                System.out.println(datos[0]);
                System.out.println(datos[1]);
            }

            System.out.println("Introduce el " + datos[0] + "" + datos[1] + "" + datos[2]);
            if (datos[0] == (num = SC.nextInt())) {
                if (datos[1] == (num = SC.nextInt())) {
                    if (datos[2] == (num = SC.nextInt())) {
                        System.out.println("Repite la serie : ");
                        System.out.println(datos[0]);
                        System.out.println(datos[1]);
                        System.out.println(datos[2]);
                    }

                    System.out.println();

                }
            }
        }
    }
}
