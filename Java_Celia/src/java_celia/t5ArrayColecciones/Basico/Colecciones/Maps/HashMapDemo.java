/**
 * @created on : 29-ago-2017, 14:55:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * un HashMap, es una colección de objetos, (como los Arrays), pero estos no
 * tienen orden.
 *
 * Cada Objeto se identifica mediante un id "clave"
 *
 * Hash - hace referencia a la tecnica de organizacion de archivos 'Hashing'
 * almacena los registros en una direccion del archivo que es generada por una
 * funcion la cual se le aplica sobre la llave del registor
 *
 * @author Portatil_Bot
 */
public class HashMapDemo {

    public static void main(String[] args) {

//        Create a hash map
        HashMap hm = new HashMap();

//        Put elements to the Map
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

//        Get a set of the entries 
        Set set = hm.entrySet();

//        Get an Iterator
        Iterator i = set.iterator();

//        Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }

        System.out.println("----------------------------");

        double balance = ((Number) hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara´s new balance : " + hm.get("Zara"));

    }
}
