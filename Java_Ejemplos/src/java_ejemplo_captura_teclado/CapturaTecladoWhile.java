/**
 * @created on : 12-ago-2017, 1:49:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.IOException;
import java.util.Scanner;

public class CapturaTecladoWhile {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Intro numero entre 1 y 3 : ");
        int num = SC.nextInt();
        while (num <= 0 || num > 3) {
            System.out.println("Intro numero entre 1 y 3 : ");
            num = SC.nextInt();
        }

        System.out.println("Intro un numero:  " + num);
    }
}
