/**
 * @created on : 22-ago-2017, 20:42:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces;

public class Circulo implements FiguraGeometrica {

    private double radio;

    public Circulo(double r) {
        radio = r;
    }

    @Override
    public double area() {
        return 3.14 * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * 3.14 * radio;
    }

}
