/**
 * @created on : 25-ago-2017, 10:55:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.Colores;

public class Color {

    public Color() {
        System.out.println(" ------ Forma sin instancia , solo ejecuta el codigo ----- ");
        new Blanco();
        new Negro();
        System.out.println(" ---------------------------------------------------------- ");
    }

    /**
     *
     */
    class Blanco {

        public Blanco() {
            System.out.println("Soy un color blanco ");
        }
    }

    /**
     *
     */
    class Negro {

        public Negro() {
            System.out.println("Soy un color negro ");
        }
    }

    void pintaBlanco() {
        Blanco b1 = new Blanco();
    }

    void pintaNegro() {
        Negro n1 = new Negro();
    }

    public static void main(String[] args) {

        Color c = new Color();
        System.out.println("----- Forma con instancia ------ ");
        c.pintaBlanco();
        c.pintaNegro();
    }
}
