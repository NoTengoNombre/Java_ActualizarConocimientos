/**
 * @created on : 21-jul-2017, 0:21:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for;

public class Java_for_rombos {

    public static void main(String[] args) {

        for (int f = 1; f < 7; f = f + 2) {
            for (int k = 7; k >= f; k = k - 2) {
                System.out.print(" ");
            }
            for (int x = 0; x < f; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int f = 7; f >= 1; f = f - 2) {
            for (int k = f; k <= 7 + 2; k = k + 2) {
                System.out.print(" ");
            }
            for (int x = f - 2; x > 0; x--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

