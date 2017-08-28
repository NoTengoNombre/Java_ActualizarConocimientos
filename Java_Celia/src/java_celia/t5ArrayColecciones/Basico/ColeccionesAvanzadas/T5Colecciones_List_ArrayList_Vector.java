/**
 * @created on : 29-ago-2017, 1:08:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.ColeccionesAvanzadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Colecciones ordenadas :
 *
 * List - Interfaz
 *
 * Objetos repetidos en secuencia y pueden accederse forma aleatoria o
 * secuencial : ArrayList y Vector
 *
 * @author Portatil_Bot
 */
public class T5Colecciones_List_ArrayList_Vector {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");

        for (Object indice : al) {
            System.out.println("Ejemplo: " + indice);
        }

        Vector v = new Vector();

        v.addAll(al);

        for (Object i1 : v) {
            System.out.println("Ejemplo i1 = " + i1);
        }

    }

}
