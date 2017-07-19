/**
 * @created on : 17-jul-2017, 9:03:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java_ejemplo_captura_teclado_String2 {

    static BufferedReader In = new BufferedReader(new InputStreamReader(System.in));

    // GetInt will ignore ANY input other than a valid integer
    public static int GetInt() throws java.io.IOException {
        while (true) {
            try {
                String s = (In.readLine()).trim();
                int y = (new Integer(s));
                return y;
            } catch (java.lang.NumberFormatException e) {
            }
        }
    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            System.out.println("Mensaje : " + e.getLocalizedMessage() + " - obtener Mensaje : " + e.getMessage());
        }
        System.out.println("You entered : " + username);

        System.out.println("----------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter user name : ");
        username = in.nextLine();
        System.out.println("You entered : " + username);

        System.out.println("----------------------------------");
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        System.out.println("Valor : " + c1);
        System.out.println("----------------------------------");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myint = keyboard.nextInt();
        System.out.println("Valor : " + myint);

    }
}
