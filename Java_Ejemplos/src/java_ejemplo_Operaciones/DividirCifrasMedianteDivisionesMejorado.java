/**
 * @created on : 12-ago-2017, 8:59:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

import java.util.Scanner;

public class DividirCifrasMedianteDivisionesMejorado {

    private static final int NUM = 123456789;
    private static final Scanner SC = new Scanner(System.in);
    private static String cadena;
    private static int num;

    public static void main(String[] args) {

//        System.out.println("Intro 's'");
//        cadena = SC.next();
//        for (int i = 100000000; (i > 0) && (cadena.equals("s")); i /= 10) {
//        
        for (int i = 100000000; (i > 0); i /= 10) {
            System.out.println(NUM / i);
            System.out.println("Intro un numero : ");
            num = SC.nextInt();
            if (NUM / i == num) {
//                System.out.println(i + " : NUM / i");
                System.out.println(NUM / i);
//                System.out.println(i + " : num");
//                System.out.println(num);
            } else {
                i = 0;
            }
        }

    }
}
