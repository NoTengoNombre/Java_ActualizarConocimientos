/**
 * @created on : 03-sep-2017, 17:18:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12ConjuntosArrayList;

import java.util.ArrayList;

public abstract class AbstractConjuntoArrayList implements InterfaceConjuntoArrayList {

    /**
     * Inserta Elemento
     *
     * @param array
     */
    @Override
    public abstract void setInsertarElemento(ArrayList array);

    /**
     * Borra Elemento
     *
     * @param array
     */
    @Override
    public abstract void setBorrarElementos(ArrayList array);

    /**
     * Si quito este metodo de la interfaz se quitará la posibilidad de
     * sobreescribir el metod
     *
     * Vacia Elementos
     */
    @Override
    public abstract void setVaciarConjunto();

    /**
     * Busca y comprueba si el elemento existe
     *
     * Si implemento este metodo no se implementará en las demas clases
     *
     * @param e
     * @return
     */
    @Override
    public int getEsta(ArrayList e) {
        return 0;
    }

}
