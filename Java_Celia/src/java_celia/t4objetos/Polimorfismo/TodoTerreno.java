/**
 * @created on : 23-ago-2017, 13:13:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Polimorfismo;

/**
 * Clase hija TodoTerreno de la clase Padre Automovil
 *
 * @author Portatil_Bot
 */
public class TodoTerreno extends Automovil {

    @Override
    public double getConsumo() {
        return consumo * 1.2;
    }

}
