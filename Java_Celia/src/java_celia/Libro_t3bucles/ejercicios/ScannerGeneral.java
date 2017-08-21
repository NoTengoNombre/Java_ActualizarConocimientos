/**
 * @created on : 21-ago-2017, 13:02:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class ScannerGeneral {

    private static final Scanner SC = new Scanner(System.in);

    public ScannerGeneral() {
    }

    /**
     * Devuelve un num int
     *
     * @return num
     */
    private static int getNumero() {
        System.out.println("Intro numero : ");
        int n = SC.nextInt();
        return n;
    }
}
