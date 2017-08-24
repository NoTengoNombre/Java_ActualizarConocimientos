/**
 * @created on : 24-ago-2017, 22:30:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej53Formas;

public class Circulo extends Forma {

    Circulo() {
    }

    @Override
    public void identidad() {
        System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
