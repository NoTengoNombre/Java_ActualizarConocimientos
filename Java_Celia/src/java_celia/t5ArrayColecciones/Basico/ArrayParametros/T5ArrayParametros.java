/**
 * @created on : 28-ago-2017, 18:06:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.ArrayParametros;

/**
 * Array son OBJETOS y los OBJETOS pasan DIRECCIONES DE MEMORIA
 *
 * Array pueden modificarse en el interior del metodo y esa modificacion afecta
 * al exterior
 *
 * Si algun elemento del array se modifica en un metodo , tambien sera
 * modificado en el metodo desde que fue pasado
 *
 * @author Portatil_Bot
 */
public class T5ArrayParametros {

    public static void main(String[] args) {
        int serie[] = new int[15];
        metodo1(serie);

    }

    /**
     *
     * @param serie : declaracion de un parametro que es un array
     */
    public static void metodo1(int[] serie) {
    }
}
