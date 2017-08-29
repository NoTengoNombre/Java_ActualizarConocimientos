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
import java.util.LinkedHashSet;

/**
 * Set o Conjuntos
 *
 * Colecciones Objeto no pueden repetirse ( solo 1 instancia )
 *
 * Clases : LinkedHashSet ( coleccion ordenada pero mas lenta que HashSet)
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Set_LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(89);
        lhs.add(59);
        lhs.add(29);
        lhs.add(19);
        lhs.add(49);
        lhs.add(69);
        lhs.add(79);
        lhs.add(39);

        System.out.println(lhs);

        Iterator it = lhs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "|");
        }
        System.out.println("");

        LinkedHashSet<String> linkedset = new LinkedHashSet<>();
        linkedset.add("Objeto 1");
        linkedset.add("Objeto 2");
        linkedset.add("Objeto 3");
        linkedset.add("Objeto 4");
        linkedset.add("Objeto 5");
        linkedset.add("Objeto 6");
        linkedset.add("Objeto 7");

        System.out.println("---------------");
        System.out.println("Ver la lista : " + linkedset);
        System.out.println("Tamaño : " + linkedset.size());
        System.out.println("Objeto 5 borrado ? : " + linkedset.remove("Objeto 5"));
        System.out.println("Objeto 5 borrado ? : " + linkedset.remove("Objeto 3"));
        System.out.println("Objeto 8 borrado ? : " + linkedset.remove("Objeto 8"));
        System.out.println("Objeto 7 esta ? : " + linkedset.contains("Objeto 7"));
        System.out.println("Ver la lista actualizada : " + linkedset);
        System.out.println("---------------");

        
        
    }

}
