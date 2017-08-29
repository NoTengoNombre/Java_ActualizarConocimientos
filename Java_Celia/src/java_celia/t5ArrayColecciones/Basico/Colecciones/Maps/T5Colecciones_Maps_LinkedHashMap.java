/**
 * @created on : 29-ago-2017, 17:35:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Esta clase extiende HashMap y mantiene una lista vinculada de las entradas en
 * el mapa, en el orden en que fueron insertadas. Esto permite iteración de
 * orden de inserción sobre el mapa. Es decir, al iterar un LinkedHashMap, los
 * elementos se devolverán en el orden en que fueron insertados.
 *
 * Crear LinkedHashMap que regrese elementos en el orden el cual ellos fueron
 * accedidos por ultima vez
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Maps_LinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put("Zara", new Double(3434.34));
        lhm.put("Mahnaz", new Double(123.22));
        lhm.put("Ayan", new Double(1378.00));
        lhm.put("Daisy", new Double(99.22));
        lhm.put("Qadir", new Double(-19.34));

        Set setDatos = lhm.entrySet();

        Iterator itera = setDatos.iterator();

        while (itera.hasNext()) {
            Map.Entry me = (Map.Entry) itera.next();
            System.out.println("Clave : " + me.getKey());
            System.out.println("Valor : " + me.getValue());
            System.out.println("-------------------------");
        }
    }
}
