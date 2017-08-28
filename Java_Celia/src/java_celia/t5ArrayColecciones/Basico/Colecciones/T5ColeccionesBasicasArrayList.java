/**
 * @created on : 29-ago-2017, 0:04:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones;

import java.util.ArrayList;

public class T5ColeccionesBasicasArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> miArray = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            miArray.add((int) (Math.random() * 500));
        }

        for (int i = 0; i < miArray.size(); i++) {
            System.out.printf("%d", miArray.get(i));
            System.out.print("-");
        }
    }
}
