/**
 * @created on : 29-ago-2017, 1:22:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.ColeccionesAvanzadas;

import java.util.HashSet;

/**
 * Colecciones Objeto no pueden repetirse ( solo 1 instancia )
 *
 * Clases : HashSet ( coleccion no ordenada muy rapida)
 *
 * Clases : LinkedHashSet( ordenada y lenta)
 *
 * Clases : TreeSet ( arbol binario equilibrado)
 *
 *
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Set {

    public static void main(String[] args) {
//        Clases : HashSet ( coleccion no ordenada muy rapida)
        HashSet hs = new HashSet();
        hs.add(190);
        hs.add(123);
        hs.add(233);
        hs.add(444);
        hs.add(125);
        hs.add(363);
        hs.add(547);

    }

}
