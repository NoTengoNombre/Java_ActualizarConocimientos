/**
 * @created on : 22-ago-2017, 21:25:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ClasesAbstractas;

public abstract class Vehiculo {

    private int peso;

    /**
     * Metodo convecional
     *
     * @param p
     */
    public void setPeso(int p) {
        peso = p;
    }

    /**
     * Metodo abstracto : No se implementa aqui
     *
     * @return
     */
    public abstract int getVelocidadMaxima();
}
