/**
 * @created on : 24-ago-2017, 20:06:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej50Colores;

public class Color {

    public void pintaBlanco() {
        Blanco b = new Blanco();
    }

    public void pintaNegro() {
        Negro n = new Negro();
    }

    class Blanco {

        public Blanco() {
            System.out.println("Soy el constructor Blanco");
        }
    }

    class Negro {

        public Negro() {
            System.out.println("Soy el constructor Negro");
        }
    }

    public static void main(String[] args) {

        Color c = new Color();
        c.pintaBlanco();
        c.pintaNegro();
    }
}
