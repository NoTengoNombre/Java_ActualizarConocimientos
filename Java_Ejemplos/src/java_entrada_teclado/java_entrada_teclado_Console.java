/**
 * @created on : 20-ago-2017, 20:27:40
 * @see java.io.ObjectInputStream.readLine() This method does not properly
 * convert bytes to characters. see DataInputStream for the details and
 * alternatives. java.io.DataInputStream.readLine() This method does not
 * properly convert bytes to characters. As of JDK 1.1, the preferred way to
 * read lines of text is via the BufferedReader.readLine() method. Programs that
 * use the DataInputStream class to read lines can be converted to use the
 * BufferedReader class by replacing code of the form: DataInputStream d = new
 * DataInputStream(in);
 *
 * with: BufferedReader d = new BufferedReader(new InputStreamReader(in));
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_entrada_teclado;

import java.io.Console;

public class java_entrada_teclado_Console {

    public static String getLetraConsola() {

        Console console = System.console();
        String s = console.readLine();
        return s;
    }

    public static int getNumeroConsola() {

        Console console = System.console();
        int i = Integer.parseInt(console.readLine());
        return i;
    }

    public static void main(String[] args) {

        getLetraConsola();

    }
}
