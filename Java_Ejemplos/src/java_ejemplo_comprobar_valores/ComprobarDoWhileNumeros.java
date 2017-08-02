/**
 * @created on : 31-jul-2017, 9:40:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_comprobar_valores;

import java.util.Scanner;

public class ComprobarDoWhileNumeros {

    private static String cadena;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un letra a o s: ");

        do {
            System.out.println("• - Intro un simbolo entre  '/' , '+' , '*' , '-' ");
            cadena = sc.next();
        } while (!(cadena.equals("/") || (cadena.equals("+") || (cadena.equals("*") || (cadena.equals("-"))))));
        {
            System.out.println("♣ Valor : " + cadena);
        }
    }
}
