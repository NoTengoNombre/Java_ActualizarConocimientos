/**
 * @created on : 09-sep-2017, 23:49:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringBuffer {

    /**
     * Metodo que coge por teclado una cadena y no modifica sus caracteres , es
     * una cadena mutable.
     *
     * String es una cadena
     *
     * coge correctamente los espacio entre caracteres '\u0020'
     *
     * @return
     * @throws IOException
     */
    public StringBuilder getTeclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("• Introduce una frase por teclado : ");
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        return sb;
    }
}
