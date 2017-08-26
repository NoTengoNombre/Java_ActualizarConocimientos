/**
 * @created on : 25-ago-2017, 0:34:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.HerenciaGeometrica;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
        radio = 1.0;
    }

    /**
     *
     * @param r
     * @param color
     * @param relleno
     */
    public Circulo(double r, String color, boolean relleno) {
        super(color, relleno);
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double getArea() {
        return Math.PI * (radio * radio);
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "○ Soy un circulo de radio " + radio + " y esta es mi Superclase " + super.toString();
    }
}
