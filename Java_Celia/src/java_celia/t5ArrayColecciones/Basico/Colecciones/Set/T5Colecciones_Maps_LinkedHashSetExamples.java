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
 * No permite valores repetidos , Solo tiene valores Unicos
 *
 * Proporciona todas operaciones y permite valores nulos , mantiene el orden de
 * inserccion
 *
 * LinkedHashSet es extendida por HashSet la cual implementa la interfaz Set
 *
 * Set interfaz hereda de Collection y la interfaz Iterable dentro del orden
 *
 *
 * public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable
 * , Serializable
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
public class T5Colecciones_Maps_LinkedHashSetExamples {

    public static void main(String[] args) {

        LinkedHashSet<String> al = new LinkedHashSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add(null);

        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
