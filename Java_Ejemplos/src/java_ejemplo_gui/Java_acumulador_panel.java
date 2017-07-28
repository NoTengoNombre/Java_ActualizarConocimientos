/**
 * @created on : 22-jul-2017, 21:34:49
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_gui;

import javax.swing.JOptionPane;

public class Java_acumulador_panel {

    public static void main(String[] args) {
        int counter = 0;
        int accumulator = 0;
        while (counter < 5) {
            counter = counter + 1;
            accumulator = accumulator + Integer.parseInt(JOptionPane.showInputDialog("Ingresar el " + counter + "º número"));
        }
        JOptionPane.showMessageDialog(null, "La suma de los 5 números es " + accumulator);

    }
}
