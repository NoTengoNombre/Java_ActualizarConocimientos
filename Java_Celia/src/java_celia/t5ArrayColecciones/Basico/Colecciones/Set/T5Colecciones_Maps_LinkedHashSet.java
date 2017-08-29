/**
 * @created on : 29-ago-2017, 13:00:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Map - Interfaces
 *
 * LinkedHashMap - Extension de HashSet pero no añade miembros propios
 *
 * Mantiene enlazadas una lista de enlaces de la entrada fijada dentro del orden
 * en el cual ellos han sido insertadas
 *
 * Esto permite iteracion de orden de inserccion sobre el conjunto
 *
 * Cuando se realiza un ciclo a traves de un LinkedHashSet utlizando un iterador
 * los elementos se devolveran en el orden en que se insertaron
 *
 * El codigo hash se utiliza como indice en el que se almacenan los datos
 * asociados con la clave
 *
 * La transformacion de la clave en su codigo hash se realiza automaticamente
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Maps_LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);

        Iterator<String> setIterator = hs.iterator();
        while (setIterator.hasNext()) {
            System.out.print(setIterator.next() + " ");
        }
        System.out.println("");
    }

}
