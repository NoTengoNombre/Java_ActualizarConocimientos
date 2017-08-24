/**
 * @created on : 24-ago-2017, 16:11:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.AdivinanzaEj47;

public class Adivinanza {

    /**
     * 
     * @param i
     */
    Adivinanza(int i) {
        this("Soy un enigma");
        System.out.println("Mi numero es : " + i);
    }

    /**
     *
     * @param s
     */
    public Adivinanza(String s) {
        System.out.println(s);
    }

    /**
     *
     */
    void saluda() {
        System.out.println("Hola.");
    }

    public static void main(String[] args) {

        new Adivinanza(8).saluda();
    }
}
