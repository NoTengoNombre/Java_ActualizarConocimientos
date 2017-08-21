/**
 * @created on : 17-ago-2017, 19:03:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaScannerEvitarLetraEnNumLimpio {

    public static double compruebaNumero() {

        final Scanner READER = new Scanner(System.in);

        Double numeroDoble = null;

        try {

            numeroDoble = READER.nextDouble();

        } catch (InputMismatchException ex) {
            System.out.println("Ha introducido una letra. Ingrese un número : ");
            numeroDoble = compruebaNumero();
        }
        return numeroDoble;
    }

    public static void main(String[] args) {

        compruebaNumero();

    }
}
