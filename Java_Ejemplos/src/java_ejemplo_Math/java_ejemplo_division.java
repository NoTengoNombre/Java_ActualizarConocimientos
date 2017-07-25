/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

public class java_ejemplo_division {

    public static void main(String[] args) {
        Fraccion s1 = new Fraccion(66, 8);
        Fraccion s2 = new Fraccion(96, 8);
    }
}

class Fraccion {

    double num;
    double den;

    public Fraccion() {
        num = 0;
        den = 1;
    }

    public Fraccion(double x, double y) {
        num = x;
        den = y;
    }

    Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    Fraccion restar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public String toString() {
        String texto = num + " / " + den;
        return texto;
    }
}
