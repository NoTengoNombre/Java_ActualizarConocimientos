/**
 * @created on : 12-ago-2017, 1:49:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapturaInputStreamReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Intro valor : ");
        int num = br.read();
        System.out.print(num);

    }
}
