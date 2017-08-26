/**
 * @created on : 25-ago-2017, 0:04:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.Animal;

public class PerroGatoPrueba {

    public static void main(String[] args) {
        Perro p = new Perro("Boddy", 4, "Chihuahua");
        Gato g = new Gato("Sisifo", 3);

        p.setRaza("Pasto Aleman");
        g.quitaVida();

        System.out.println(p.toString());
        System.out.println(g.toString());
    }
}
