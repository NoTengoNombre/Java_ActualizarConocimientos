/**
 * @created on : 29-ago-2017, 13:00:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Map - Interfaces
 *
 * HashMap - Clase Clave/Valor
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_Maps_HashMap {

    public static void main(String[] args) {
//      Map = Interfaces
//      HashMap = Clase
        Map<String, Integer> datos = new HashMap<>();
        datos.put("Zara", 16);
        datos.put("Mahnaz", 23);
        datos.put("Ayan", 12);
        datos.put("Daisy", 14);

        System.out.println();
        System.out.println("○ Map Elements ");
        System.out.println(datos);

//        Recorrer con Funciones Lambda
        datos.forEach((k, v) -> System.out.println("• Key : " + k + " - • Value : " + v));

        System.out.println("--------------------------------------------");

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
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            System.out.println("♠ Clave = " + entry.getKey() + " - ♥ Valor = " + entry.getValue());
        }

    }

}
