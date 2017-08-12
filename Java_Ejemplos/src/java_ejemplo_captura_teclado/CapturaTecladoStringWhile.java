/**
 * @created on : 17-jul-2017, 9:03:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class CapturaTecladoStringWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor : ");
        String cadena = sc.nextLine();
        System.out.println("Resultado : " + cadena);

        if (cadena instanceof String) {
            System.out.println("Si");
        }

        System.out.println("Introduce 'si' para repetir : ");
        cadena = sc.nextLine();
        while (!cadena.equals("si") && !cadena.equals("no")) {
            System.out.println("Introduce una cadena para probar");
            cadena = sc.nextLine();
            System.out.println("Valor de la cadena : " + cadena);
        }
    }
}
