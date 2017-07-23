/**
 * @created on : 21-jul-2017, 0:21:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for;

public class Java_Matriz {

    public static void main(String[] args) {
        for (int f = 0; f < 5; f++) {
            System.out.print("f" + f + "|");
            for (int c = 0; c < 5; c++) {
                System.out.print("c" + c + "/");
            }
            System.out.println("");
        }

        System.out.println("-------------------");

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("/f" + f + "|c" + c + "\\ ");
            }
            System.out.println("");
        }

        System.out.println("-------------------");

        for (int f = 0; f < 5; f++) {
            for (int c = f; c < 5; c++) {
                System.out.print("/f" + f + "|c" + c + "\\ ");
            }
            System.out.println("");
        }
    }
}
