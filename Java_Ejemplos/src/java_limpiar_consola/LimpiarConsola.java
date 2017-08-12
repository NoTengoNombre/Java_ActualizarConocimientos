/**
 * @created on : 11-ago-2017, 2:03:02
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_limpiar_consola;

import java.io.IOException;

public class LimpiarConsola {

    public void boldSizeOfString() {
        String strNormalSize = "\033[0;0m";
        String strBoldSize = "\033[0;1m";
        System.out.println(strNormalSize + "My Name is Anthony Gonsalves" + strBoldSize);
    }

    public static void main(String... arg) throws IOException, InterruptedException {
//        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        System.out.println("1231");
//        System.out.println("1231");

        LimpiarConsola l = new LimpiarConsola();
        l.boldSizeOfString();

        System.out.print("hello");
        Thread.sleep(1000); // Just to give the user a chance to see "hello".
        System.out.print("\b");
        System.out.print("world");
        System.out.println(""); 
    }

}
