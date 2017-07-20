/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

public class Java_division2 {

    public static void main(String[] args) {

        double decimal1 = 1 / 100000;
        System.out.println("division decimal : " + decimal1);

        double decimal2 = 1 / 10000;
        System.out.println("division decimal : " + decimal2);

        double decimal3 = 1 / 1000;
        System.out.println("division decimal : " + decimal3);

        double decimal4 = 1 / 100;
        System.out.println("division decimal : " + decimal4);

        double decimal5 = 1 / 10;
        System.out.println("division decimal : " + decimal5);

        double decimal6 = 1 / 1;
        System.out.println("division decimal : " + decimal6);

        int n = 1111;
        int c = 0;

        System.out.println("" + (n / 1));
        System.err.println((n / 1) >= 1.0);
        if ((n / 1) >= 1.0) {
            c++;
        }
        if ((n / 10) >= 1.0) {
            c++;
        }

        if ((n / 100) >= 1.0) {
            c++;
        }

        if ((n / 1000) >= 1.0) {
            c++;
        }

        System.err.println((n / 10) >= 1.0);
        System.err.println((n / 100) >= 1.0);
        System.err.println((n / 1000) >= 1.0);
        System.err.println((n / 10000) >= 1.0);
        System.err.println((n / 100000) >= 1.0);

        System.out.println("Total : " + c);
    }
}
