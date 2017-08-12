/**
 * @created on : 12-ago-2017, 10:35:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_switch_if;

import java.util.Scanner;

public class java_switch_if {

    private static final Scanner SC = new Scanner(System.in);
    private static int nivel;
    private static int gradoDificultad;

    public static void nivelDificultad() {
        System.out.println("• Elige un nivel de dificultad : ");
        nivel = SC.nextInt();
        switch (nivel) {
            case 1:
                gradoDificultad = 3000;
        }
        if (nivel == 1) {
            gradoDificultad = 3000;
        }
        if (nivel == 2) {
            gradoDificultad = 2000;

        }
        if (nivel == 3) {
            gradoDificultad = 1000;

        }
        if (nivel == 4) {
            gradoDificultad = 500;

        }
    }
}
