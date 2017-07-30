/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class JavaEjemploDivision {

    public static void main(String[] args) {
        Fraccion s1 = new Fraccion(66, 8);
        Fraccion s2 = new Fraccion(96, 8);
    }
}

class Fraccion1 {

    double num;
    double den;

    public Fraccion1() {
        num = 0;
        den = 1;
    }

    public Fraccion1(double x, double y) {
        num = x;
        den = y;
    }

    Fraccion1 sumar(Fraccion1 a, Fraccion1 b) {
        Fraccion1 c = new Fraccion1();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    Fraccion1 restar(Fraccion1 a, Fraccion1 b) {
        Fraccion1 c = new Fraccion1();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    @Override
    public String toString() {
        String texto = num + " / " + den;
        return texto;
    }
}
