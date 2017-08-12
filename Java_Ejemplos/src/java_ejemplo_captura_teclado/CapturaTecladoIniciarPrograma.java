/**
 * @created on : 11-ago-2017, 21:45:42
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class CapturaTecladoIniciarPrograma {

    private final static Scanner SC = new Scanner(System.in);
    private static int num = SC.nextInt();

    public static void main(String[] args) {

        System.out.println("1º Pide por teclado");
        System.out.println("2º Ejecuta el resto del codigo ");

        int[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Longitud : " + datos.length);

        while (num < 10) {
            System.out.println("Valor : " + num++);
        }

    }
}
