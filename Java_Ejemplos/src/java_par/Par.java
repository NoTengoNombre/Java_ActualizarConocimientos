/**
 * @created on : 07-ago-2017, 23:24:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_par;

public class Par {

    public static int getPar() {
        return 2;
    }

    public static void main(String[] args) {
        boolean num1;

        for (int i = 0; i < 11; i++) {
            num1 = (i % 2 != 0);
            System.out.println(i + " Impar : " + num1);
        }

        System.out.println("-----------------------");

        for (int i = 0; i < 11; i++) {
            num1 = (i % 2 == 0);
            System.out.println(i + " Par : " + num1);
        }

        System.out.println("-----------------------");
    }
}
