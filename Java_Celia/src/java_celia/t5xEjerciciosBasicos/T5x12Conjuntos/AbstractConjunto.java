/**
 * @created on : 03-sep-2017, 17:18:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12Conjuntos;

/**
 * Clase Abstract que contiene todos los metodos heredados de la Interface y que
 * se implementaran en las Subclases que hereden de esta clase Abstract
 *
 * @author Portatil_Bot
 */
public abstract class AbstractConjunto implements InterfaceConjunto {

    /**
     * Metodo Abstract
     *
     * Inserta Elemento
     *
     * @param obj
     */
    @Override
    public abstract void setInsertarElemento(Object obj);

    /**
     * Metodo Abstract
     *
     * Borra Elemento
     *
     * @param obj
     */
    @Override
    public abstract void setBorrarElementos(Object obj);

    /**
     * Metodo Abstract
     *
     * Si quito este metodo de la interfaz se quitará la posibilidad de
     * sobreescribir el metod
     *
     * Vacia Elementos
     */
    @Override
    public abstract void setVaciarConjunto();

    /**
     * Metodo Abstract
     *
     * Busca y comprueba si el elemento existe
     *
     * Si implemento este metodo no se implementará en las demas clases
     *
     * @param obj
     * @return
     */
    @Override
    public abstract int getEsta(Object obj);

}
