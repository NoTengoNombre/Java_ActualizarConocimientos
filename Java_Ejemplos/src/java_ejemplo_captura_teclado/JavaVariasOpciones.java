/**
 * @created on : 31-jul-2017, 12:50:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class JavaVariasOpciones {

    private static Scanner sc = null;
    private static int con;
    private static int numA = 0;
    private static int numB = 0;

    public static int setNumero() {
        sc = new Scanner(System.in);
        int num = 0;
        con++;
        if (con == 1) {
            System.out.println("Introduce un numero A: ");
            numA = sc.nextInt();
            con--;
        }
        if (con == 0) {
            System.out.println("Introduce un numero B: ");
            numB = sc.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        int x = 0;
        do {
            setNumero();
            System.out.println("A : " + numA);
            System.out.println("B : " + numB);
            System.out.println("Suma : " + numA + numB);
            x++;
        } while (x <= 3);
    }

}
