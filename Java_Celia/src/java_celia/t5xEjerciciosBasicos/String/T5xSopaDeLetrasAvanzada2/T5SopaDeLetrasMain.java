/**
 * @created on : 18-sep-2017, 9:56:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasFilasColumnas.setGenerarSopa;
import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasFilasColumnas.setPalabraSopaLetras;
import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasFilasColumnas.setVerMatrizSopaLetras;

public class T5SopaDeLetrasMain {

//    private static char[][] matriz;
    public static void setLanzarPrograma() {

        setGenerarSopa();
        setPalabraSopaLetras();
        setVerMatrizSopaLetras();

    }

    public static void main(String[] args) {
        setLanzarPrograma();

    }
}
