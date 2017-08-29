/**
 * @created on : 29-ago-2017, 13:00:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Map - Interfaces
 *
 * HashMap - Clase Clave/Valor
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Maps_HashMapExamples {

    public static void main(String[] args) {
//      Map = Interfaces
//      HashMap = Clase
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");

        Set<String> keys = lhm.keySet();

        System.out.println("--------------------------------------------");
        for (String k : keys) {
            System.out.println(k + " --- " + lhm.get(k));
        }
        System.out.println("--------------------------------------------");

        System.out.println("Map contiene valor 'This is first element' ? " + lhm.containsValue("This is first element"));

        /**
         * Map - Interfaces
         *
         * .Entry - Interfaces
         *
         * .Entry<Clave,Valor>
         *
         * - datos.entrySet()
         *
         */
    }

}
