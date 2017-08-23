/**
 * @created on : 23-ago-2017, 12:31:50
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Polimorfismo;

/**
 *
 * @author Portatil_Bot
 */
public class VehiculoPolimorfico {

    private String marca;

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }
}

class Automovil1 extends VehiculoPolimorfico {

    private double consumo;

    /**
     *
     * @param c
     */
    public void setConsumo(double c) {
        consumo = c;
    }

    /**
     *
     * @return
     */
    public double getConsumo() {
        return consumo;
    }

}

class Todoterreno1 extends Automovil1 {

    /**
     *
     * @return
     */
    @Override
    public double getConsumo() {
        return getConsumo() * 1.2;
    }
}
