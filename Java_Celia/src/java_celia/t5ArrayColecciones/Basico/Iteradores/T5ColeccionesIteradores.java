/**
 * @created on : 29-ago-2017, 0:51:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Metodo especial para recorrer ArrayList
 *
 * w* @author Portatil_Bot
 */
public class T5ColeccionesIteradores {

    public static void main(String[] args) {

        ArrayList<Integer> miArray = new ArrayList<>();
        miArray.add(1);
        miArray.add(2);
        miArray.add(3);
        miArray.add(4);
        miArray.add(5);
        miArray.add(6);

        System.out.println(miArray);

        Iterator it = miArray.iterator();

        while (it.hasNext()) {
            System.out.println("Iterador : " + it.next());
        }

    }
}
