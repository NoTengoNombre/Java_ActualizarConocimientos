/**
 * @created on : 31-jul-2017, 9:40:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_comprobar_valores;

import java.util.Scanner;

public class ComprobarWhile {

    private static String c;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("• - Intro un simbolo entre  '/' , '+' , '*' , '-' ");
        c = sc.next(); // 1

        System.out.println("Valor : " + c);

//      Se niega toda la condicion metida entre parentesis
        while (!(c.equals("+") || (c.equals("-")) || (c.equals("/")) || (c.equals("*")))) {
            System.out.println("Error : " + c);
            c = sc.next();
        }
        System.out.println("fin " + c);
    }
}
