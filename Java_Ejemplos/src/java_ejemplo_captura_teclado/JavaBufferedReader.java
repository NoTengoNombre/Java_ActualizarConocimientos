/**
 * @created on : 17-jul-2017, 9:03:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Intro un numero : ");
        int v = Integer.parseInt(br.readLine());
        System.out.println("Valor : " + v);

    }
}
