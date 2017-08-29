/**
 * @created on : 29-ago-2017, 1:22:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set o Conjuntos
 *
 * Colecciones Objeto no pueden repetirse ( solo 1 instancia )
 *
 * Clases : HashSet ( coleccion no ordenada muy rapida)
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Set_Hashset {

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

        System.out.println(hs);

        /**
         * Por defecto loadFactor es 0.75 - Factor de Carga Cuanto mayor es el
         * valor decrece el espacio de carga pero aumenta el coste de busqueda
         * sobre todo en la operaciones de 'get' y 'put'
         */
        HashSet<Float> hs1 = new HashSet(10, (float) 0.75);

        hs1.add(Float.MAX_VALUE);
        hs1.add(Float.MIN_NORMAL);
        hs1.add(Float.MIN_VALUE);
        hs1.add(Float.NEGATIVE_INFINITY);
        hs1.add(Float.POSITIVE_INFINITY);
        hs1.add(Float.POSITIVE_INFINITY);
        hs1.add(Float.POSITIVE_INFINITY);
        hs1.add(Float.min(1, 12));
        hs1.add(Float.max(11, 300));
        System.out.println(hs1);

        Iterator it = hs1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
