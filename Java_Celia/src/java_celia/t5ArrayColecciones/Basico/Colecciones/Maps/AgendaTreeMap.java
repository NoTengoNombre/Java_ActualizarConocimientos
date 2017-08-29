/**
 * @created on : 29-ago-2017, 15:56:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Elementos ordenados por clave
 *
 * Definen 2 referencias de la interfaz SortedMap
 *
 * 1º se colocan las claves que se encuentran entre A y O - Metodo
 * submap("A","O");
 *
 * 2º Almacena las claves desde la P hacia el final
 *
 * Si se usa Clase String - comparteTo no se redifine
 *
 * Si se usa otras clases se tiene que redifinir , comparteTo , equals ,
 * hashCode
 *
 * @author Portatil_Bot
 */
public class AgendaTreeMap {

    public static void main(String[] args) {

//        Instanciamos un objeto de la clase TreeMap
        TreeMap agenda = new TreeMap();

//        Agregar pares 'clave-valor' al HashMap
        System.out.println("---- Agenda ------ ");
        agenda.put("Doctor", "(+52)-4000-5000");
        agenda.put("Casa", "(888)-4500-3400");
        agenda.put("Hermano", "(575)-2042-3233");
        agenda.put("Tio", "(421)-1010-0020");
        agenda.put("Oficina", "(304)-5205-8454");
        agenda.put("Suegros", "(334)-6105-4334");
        agenda.put("Abogado", "(756)-1205-3454");
        agenda.put("Papa", "(55)-9555-3270");
        agenda.put("Tienda", "(874)-2400-8600");
        agenda.put("Zaratrusta", "(874)-2400-8600");
        System.out.println("---- ------- ------ ");
        // Notese que el orden del TreeMap refleja un orden ascendente 
        // en sus elementos independientemente del orden de insercion. 
        // Debido al uso de String se refleja un orden alfabetico 
        mostrarMapa(agenda);

//        Definir dos Interfaces de SortedMap y le indicamos mediante los metodos subMap los criterios de busqueda
        SortedMap agendaAO = agenda.subMap("A", "O");
        SortedMap agendaP_Z = agenda.tailMap("P");

        System.out.println("---- Agenda A-O ------ ");
//Pasamos los objetos al metodo mostrarMapa para que los recorra mediante una iteracion
        mostrarMapa(agendaAO);

//Pasamos los objetos al metodo mostrarMapa para que los recorra mediante una iteracion
        System.out.println("---- Agenda P-Z ------ ");
        mostrarMapa(agendaP_Z);
    }

    /**
     *
     *
     * @param agenda Objeto de tipo Map
     */
    public static void mostrarMapa(Map agenda) {
        System.out.println("Agenda con " + agenda.size() + " telefonos");

        for (Iterator it = agenda.keySet().iterator(); it.hasNext();) {
            String clave = (String) it.next();
            String valor = (String) agenda.get(clave);
            System.out.println(clave + " : " + valor);

        }
    }
}
