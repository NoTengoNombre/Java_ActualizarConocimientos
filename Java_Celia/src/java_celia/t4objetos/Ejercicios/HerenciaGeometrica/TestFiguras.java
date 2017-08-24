/**
 * @created on : 24-ago-2017, 18:48:50
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.HerenciaGeometrica;

public class TestFiguras {

    public static void main(String[] args) {

        System.out.println("----------------");
        Figura f1 = new Figura();
        f1.toString();
        System.out.println("♦ ¿ Esta relleno ? " + f1.estaRelleno());

        System.out.println("----------------");
        Figura f2 = new Figura("verde", false);
        f2.toString();
        System.out.println("♦ ¿ Esta relleno ? " + f2.estaRelleno());

        System.out.println("----------------");
        Circulo c1 = new Circulo();
        System.out.println("• Area : " + c1.getArea());
        System.out.println("• Perimetro : " + c1.getPerimetro());
        c1.toString();

        System.out.println("----------------");
        Circulo c2 = new Circulo(2, "Amarillo", true);
        System.out.println("• Area : " + c2.getArea());
        System.out.println("• Perimetro : " + c2.getPerimetro());
        c2.toString();

        System.out.println("----------------");
        Circulo c3 = new Circulo(c2);
        System.out.println("• Area : " + c3.getArea());
        System.out.println("• Perimetro : " + c3.getPerimetro());
        c3.toString();

        System.out.println("----------------");
        Rectangulo r1 = new Rectangulo();
        r1.toString();
        Rectangulo r2 = new Rectangulo(5, 6);
        r2.toString();

        System.out.println("----------------");
        Cuadrado cu1 = new Cuadrado();
        cu1.toString();
        Cuadrado cu2 = new Cuadrado(7);
        cu2.toString();
    }
}
