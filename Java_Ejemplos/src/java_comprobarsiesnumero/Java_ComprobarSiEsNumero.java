/**
 * @created on : 20-ago-2017, 22:44:15
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_comprobarsiesnumero;

public class Java_ComprobarSiEsNumero {

    public static void main(String[] args) {

        Object x = Integer.parseInt("1");

        if (x instanceof Integer) {
            System.out.println("Es integer ");
        } else {
            System.out.println("No ess integer ");
        }

        if (x == null) {
            System.out.println("Es integer ");
        } else {
            System.out.println("No es integer ");
        }

    }

}
