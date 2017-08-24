/**
 * @created on : 24-ago-2017, 19:44:17
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej49Rector;

public class TestProfesor {

    public static void main(String[] args) {

        Profesor p1 = new Profesor();
        p1.getNombre();
        p1.getSueldo();
        p1.toString();

        System.out.println("---------------------");
        Profesor p2 = new Profesor("Dennis", 1200);
        p2.toString();
        System.out.println("Sueldo : " + p2.getSueldo());

        System.out.println("---------------------");
        Rector r1 = new Rector(p2);
        r1.toString();
        System.out.println("Sueldo: " + r1.getSueldo());

    }
}
