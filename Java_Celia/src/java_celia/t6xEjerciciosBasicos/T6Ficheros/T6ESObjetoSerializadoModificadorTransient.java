/**
 * @created on : 27-sep-2017, 11:05:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

/**
 * Wikipedia : consiste en un proceso de codificación de un objeto en un medio
 * de almacenamiento (como puede ser un archivo, o un buffer de memoria) con el
 * fin de transmitirlo a través de una conexión en red como una serie de bytes o
 * en un formato más legible como XML o JSON, entre otros.
 *
 * La serie de bytes o el formato pueden ser usados para crear un nuevo objeto
 * que es idéntico en todo al original, incluido su estado interno (por tanto,
 * el nuevo objeto es un clon del original).
 *
 * La serialización es un mecanismo ampliamente usado para transportar objetos a
 * través de una red, para hacer persistente un objeto en un archivo o base de
 * datos, o para distribuir objetos idénticos a varias aplicaciones o
 * localizaciones.
 *
 * Serializar : Convertir un objeto en una cadena de bytes para poderse
 * transimitir entre distintos dispositivos y poderlo formar
 *
 * Serializar un objeto necesita invoca la interfaz Serializable
 *
 * @author Portatil_Bot
 */
public class T6ESObjetoSerializadoModificadorTransient implements java.io.Serializable {

    /**
     * Impide la seralizacion de este atributo
     */
    private transient int dato;
}
