/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.out;

public class T2_5Paquetes_System_Entrada_Datos {

    public static void main(String[] args) {
//        variable local almacenar el valor
        System.out.print("Intro caracter : ");
        char c = ' ';
        try {
            c = (char) System.in.read(); // coger desde teclado
        } catch (IOException ex) {
            Logger.getLogger(T2_5Paquetes_System_Entrada_Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : " + ex.getMessage());
        }
        out.println("La letra es : " + c);
    }
}
