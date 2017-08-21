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

public class JavaScannerEvitarLetra {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 1;

        System.out.println("♦ Numero : " + num);

        double numeroAlto = 0d;

        final BuscarNumeroAlto numeroMasAlto = new BuscarNumeroAlto();
        Double numero;

        do {
            System.out.println("Introduce un número: ");
            numero = numeroMasAlto.compruebaNumero();
            numeroAlto = numero > numeroAlto ? numero : numeroAlto;
        } while (numero != -1);

        System.out.println("Usted ha introducido " + numeroMasAlto.contarExcepciones() + " veces letras");
        System.out.println("El número más alto fue: " + numeroAlto);
    }

}

class BuscarNumeroAlto {

    private static byte contadorExcepciones = 0;

    public Double compruebaNumero() {

        final Scanner READER = new Scanner(System.in);

        Double numeroDoble = null;

        try {

            numeroDoble = READER.nextDouble();

        } catch (InputMismatchException ex) {
            System.out.println("Ha introducido una letra. Ingrese un número");
            contadorExcepciones++;
            numeroDoble = compruebaNumero();
        }
        return numeroDoble;
    }

    public byte contarExcepciones() {
        return contadorExcepciones;
    }

}
