/**
 * @created on : 24-ago-2017, 22:25:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej53Formas;

public class FormaTest {

    public static void main(String[] args) {

        Forma f = new Circulo();
        f.identidad();
        Circulo c = new Circulo();
//        ((Forma) c).identidad();
        c.identidad();
//        ((Circulo) f).identidad();
        f.identidad();
        Forma f2 = new Forma() {
            @Override
            public void identidad() {
                System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
            }

            @Override
            public String toString() {
                return getClass().getName();
            }
        };

        f2.identidad();
        f.identidad();

    }
}
