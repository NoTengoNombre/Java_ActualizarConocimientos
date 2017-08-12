/**
 * @created on : 11-ago-2017, 2:03:02
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_limpiar_consola;

import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class LimpiarConsola1 {

    public void wipeConsole() throws AWTException {
        Robot robbie = new Robot();
        //shows the Console View
        robbie.keyPress(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyRelease(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyPress(KeyEvent.VK_C);
        robbie.keyRelease(KeyEvent.VK_C);

        //clears the console
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_F10);
        robbie.keyRelease(KeyEvent.VK_SHIFT);
        robbie.keyRelease(KeyEvent.VK_F10);
        robbie.keyPress(KeyEvent.VK_R);
        robbie.keyRelease(KeyEvent.VK_R);
    }

    public static void main(String... arg) throws IOException, InterruptedException, AWTException {

        LimpiarConsola1 l =  new LimpiarConsola1();
        l.wipeConsole();
    }

}
