/**
 * @created on : 29-ago-2017, 1:22:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Set;

import java.util.TreeSet;

/**
 * Set o Conjuntos
 *
 * Colecciones Objeto no pueden repetirse ( solo 1 instancia )
 *
 * Clases : TreeSet ( Arbol binario equilibrado, para busqueda de informacion )
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Set_TreeSet {

    public static void main(String[] args) {

        String o8 = "Objeto 8";

        TreeSet ts = new TreeSet();
        ts.add("Objeto 1");
        ts.add("Objeto 2");
        ts.add("Objeto 3");
        ts.add("Objeto 4");
        ts.add("Objeto 5");
        ts.add("Objeto 6");
        ts.add("Objeto 7");
        ts.add(o8);

        System.out.println(ts);

    }

}
