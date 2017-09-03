/**
 * @created on : 03-sep-2017, 17:14:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12Conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hace una llamada directa a la interface InterfaceConjunto para poder invocar
 * sus metodos abstract y su metodo implementando STATIC
 *
 * @author Portatil_Bot
 */
public class ConjuntoDeCaracteres extends AbstractConjunto implements InterfaceConjunto {

    /**
     * Para que no de errores necesita la Interfaces List<TipoElemento> y que
     * referencie a un ArrayList<String> para que no de errores
     */
    private static final List<String> ARRAY = new ArrayList<String>();

    /**
     * Metodo static de tipo Interfaces List<String> que devuelve una Interfaces
     * de tipo Collection la cual tiene definido un ARRAY que es un objeto de la
     * clase ArrayList
     *
     * @return Objeto ARRAY tipo ArrayList<String> con todos los valores que se
     * haya metido dentro a traves de sus metodos
     */
    public static List<String> getARRAY() {
        return Collections.unmodifiableList(ARRAY);
    }

    /**
     * Metodo Subclase : inserta 1 elemento especifico dentro del Array
     *
     * @param obj
     */
    @Override
    public void setInsertarElemento(Object obj) {
        ARRAY.add((String) obj);
    }

    /**
     * Metodo Subclase : borra 1 elemento especifico del Array
     *
     * @param obj
     */
    @Override
    public void setBorrarElementos(Object obj) {
        ARRAY.remove(obj);
    }

    /**
     * Metodo Subclase : borra todos los elementos del Array
     *
     */
    @Override
    public void setVaciarConjunto() {
        ARRAY.clear();
    }

    /**
     * Metodo Subclase
     *
     * @param obj
     * @return -1 Si no existe , Mayor de 1 Si existe
     */
    @Override
    public int getEsta(Object obj) {
        return ARRAY.indexOf(obj);
    }

}
