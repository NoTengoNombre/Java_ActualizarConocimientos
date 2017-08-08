/**
 * @created on : 08-ago-2017, 14:12:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_condicionales;

import java.util.Scanner;

public class JavaCondicionalesStringDentroIf {

    private static Scanner sc = new Scanner(System.in);

    public static void getTeclado() {
        sc = new Scanner(System.in);
        System.out.println("¿ Si o No ? ");
        String teclado = sc.next();

        while (((!teclado.equals("si")) && ((!teclado.equals("no"))))) {
            if (teclado.equals("si")) {
                System.out.println("Soy si ");
            }
            if (teclado.equals("no")) {
                System.out.println("Soy no ");
            }
            System.out.println("¿ Si o No ? ");
            teclado = sc.next();
        }
    }

    public static void main(String[] args) {

        getTeclado();

    }
}
