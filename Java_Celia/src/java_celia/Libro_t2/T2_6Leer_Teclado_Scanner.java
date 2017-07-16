/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2;

import static java.lang.System.out;
import java.util.Scanner;

public class T2_6Leer_Teclado_Scanner {

    public static void main(String[] args) {

        out.println("Introduce cadena desde teclado");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Leer desde teclado : " + s);

    }
}
