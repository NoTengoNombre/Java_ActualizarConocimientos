/**
 * @created on : 25-ago-2017, 0:45:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.HerenciaGeometrica;

public class Cuadrado extends Rectangulo {

    /**
     * Invoca al constructor vacio de la superclase
     */
    public Cuadrado() {
        super();
    }

    /**
     * Invoca constructor de la superClase
     *
     * @param lado
     */
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    /**
     *
     * @param lado
     * @param color
     * @param relleno
     */
    public Cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno);
    }

    /**
     *
     * @param a
     */
    @Override
    public void setAncho(double a) {
        super.setAncho(a);
        super.setAlto(a);
    }

    /**
     *
     * @param a
     */
    @Override
    public void setAlto(double a) {
        super.setAncho(a);
        super.setAlto(a);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " ☐ Soy un cuadrado de lado " + super.getAncho() + " y esta es mi SuperClase : " + super.toString();
    }
}
