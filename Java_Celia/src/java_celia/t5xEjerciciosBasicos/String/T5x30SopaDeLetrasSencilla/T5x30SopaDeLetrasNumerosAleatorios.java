/**
 * @created on : 12-sep-2017, 13:07:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla;

import java.io.IOException;

public class T5x30SopaDeLetrasNumerosAleatorios {

    /**
     * Genera una letra de forma aleatoria
     *
     * @return
     * @throws IOException
     */
    public static char getLetraAleatoria() throws IOException {
        char palabra = (char) (Math.random() * (26) + 'a');
        return palabra;
    }

    /**
     * Genera una letra de forma aleatoria
     *
     * @return
     */
    public static int getValorAleatorio1a8() {
        int x = (int) (Math.random() * (1 + 6) + 1);
        return x;
    }

}
