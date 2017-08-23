/**
 * @created on : 22-ago-2017, 20:39:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces;

/**
 * Utilidad es SERVIR de molde para FORMAR OTRAS CLASES que si implemente el
 * codigo
 *
 * @author Portatil_Bot
 */
public class Rectangulo implements FiguraGeometrica {

    private double base, altura;

    public Rectangulo(double b, double h) {
        base = b;
        altura = h;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

}
