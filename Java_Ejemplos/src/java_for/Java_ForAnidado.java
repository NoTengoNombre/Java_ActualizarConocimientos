/**
 * @created on : 21-jul-2017, 0:21:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for;

public class Java_ForAnidado {

    public static void main(String[] args) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + "f ");
            for (int c = 0; c < 10; c++) {
                System.out.print("|" + c);
            }
            System.out.println("");
        }
    }
}
