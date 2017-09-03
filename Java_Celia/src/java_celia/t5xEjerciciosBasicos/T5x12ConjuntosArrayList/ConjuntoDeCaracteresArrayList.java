/**
 * @created on : 03-sep-2017, 17:14:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12ConjuntosArrayList;

import java.util.ArrayList;

/**
 * Hace una llamada directa a la interface InterfaceConjunto para poder invocar
 * sus metodos abstract y su metodo implementando STATIC
 *
 * @author Portatil_Bot
 */
public class ConjuntoDeCaracteresArrayList extends AbstractConjuntoArrayList implements InterfaceConjuntoArrayList {

    private static ArrayList array;

    @Override
    public void setInsertarElemento(ArrayList elemento) {
        array.add(elemento);
    }

    @Override
    public void setBorrarElementos(ArrayList array) {

    }

    @Override
    public void setVaciarConjunto() {
    }

}
