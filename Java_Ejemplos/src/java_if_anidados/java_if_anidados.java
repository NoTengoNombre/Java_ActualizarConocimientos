/**
 * @created on : 12-ago-2017, 1:10:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_if_anidados;

import java.util.Scanner;

public class java_if_anidados {

    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1 Intro : ");
        int x = SC.nextInt();
        if (x == 1) {
            System.out.println("2 Intro : ");
            x = SC.nextInt();
            if (x == 2) {
                System.out.println("3 Intro : ");
                x = SC.nextInt();
                if (x == 3) {
                    System.out.println("4 Intro : ");
                    x = SC.nextInt();

                }
            }
        }
    }
}
