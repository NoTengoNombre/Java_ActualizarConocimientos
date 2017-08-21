/**
 * @created on : 21-ago-2017, 18:58:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3CalculadoraBasica {

    public static double getSuma(double n1, double n2) {
        return n1 + n2;
    }

    public static double getResta(double n1, double n2) {
        return n1 - n2;
    }

    public static double getDivide(double n1, double n2) {
        return n1 / n2;
    }

    public static double getMultiplica(double n1, double n2) {
        double x = n1 * n2;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(getSuma(10, 20));
        System.out.println(getResta(10, 20));
        System.out.println(getDivide(10, 20));
        System.out.println(getMultiplica(10, 20));
    }

}
