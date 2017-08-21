/**
 * @created on : 17-ago-2017, 19:40:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;



public class JavaScannerSoloNumeros {
        Scanner sc = new Scanner(System.in);

    public static int introNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int num1 = sc.nextInt();
        return num1;
    }

    public static int introNumero2(Scanner sc) {
        sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int num1 = sc.nextInt();
        return num1;
    }

    public static void main(String[] args) {


    }
}
