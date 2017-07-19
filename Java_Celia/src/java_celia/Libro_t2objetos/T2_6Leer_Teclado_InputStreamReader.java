/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T2_6Leer_Teclado_InputStreamReader {

    public static void main(String[] args) {

        String dato = null;
        System.out.println("Introduce mensaje");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);

        try {

            dato = buff.readLine();

        } catch (IOException ex) {
            System.out.println("Error entrada por teclado : " + ex.getMessage() + " - " + ex.getLocalizedMessage());
            Logger.getLogger(T2_6Leer_Teclado_InputStreamReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Introduce mensaje : " + dato);

    }
}
