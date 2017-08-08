/**
 * @created on : 07-ago-2017, 17:10:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_decremento;

public class JavaDecremento {

    public static void main(String[] args) {

        double valor = 0.30;
 
        double g = 9.80;
        while (valor > 0) {
            System.out.println("Gravedad : " + g);
            valor -= 0.01;
            g -= valor;
        }

    }
}
