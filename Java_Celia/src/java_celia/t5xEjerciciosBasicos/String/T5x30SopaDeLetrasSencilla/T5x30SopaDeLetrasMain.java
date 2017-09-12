/**
 * @created on : 12-sep-2017, 9:19:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla.T5x30SopaDeLetrasMatriz.setEjecutarSopa;

public class T5x30SopaDeLetrasMain {

    public static void main(String[] args) {

        try {
            setEjecutarSopa();
        } catch (IOException ex) {
            Logger.getLogger(T5x30SopaDeLetrasMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
