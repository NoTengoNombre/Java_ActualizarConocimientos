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

public class JavaScannerEvitarLetraEnNum {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 1;

        System.out.println("♦ Numero : " + num);

        double highestNumber = 0d;
        final HighestNumberFinder1 highestNumberFinder = new HighestNumberFinder1();
        Double number;

        do {
            System.out.println("Introduce un número: ");
            number = highestNumberFinder.askForNumber();
            highestNumber = number > highestNumber ? number : highestNumber;
        } while (number != -1);

        System.out.println("Usted ha introducido " + highestNumberFinder.getExceptionCounter() + " veces letras");
        System.out.println("El número más alto fue: " + highestNumber);
    }

}

class HighestNumberFinder1 {

    private static byte exceptionCounter = 0;

    public Double askForNumber() {
        final Scanner READER = new Scanner(System.in);
        Double number = null;

        try {
            
            number = READER.nextDouble();

        } catch (InputMismatchException ex) {
            System.out.println("Ha introducido una letra. Ingrese un número");
            exceptionCounter++;
            number = askForNumber();
        }
        return number;
    }

    public byte getExceptionCounter() {
        return exceptionCounter;
    }

}
