/**
 * @created on : 23-ago-2017, 13:13:18
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Polimorfismo;

/**
 * Clase hija Automovil de la clase Padre Vehiculo
 *
 * @author Portatil_Bot
 */
public class Automovil extends Vehiculo {

    protected double consumo;

    public void setConsumo(double c) {
        this.consumo = c;
    }

    public double getConsumo() {
        return consumo;
    }

}
