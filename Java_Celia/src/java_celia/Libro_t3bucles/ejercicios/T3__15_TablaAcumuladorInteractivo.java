/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

/**
 *
 */
public class T3__15_TablaAcumuladorInteractivo {

    static int acumulador = 0;
    static int i = 0;

    public static void iterador() {
        Scanner sc = new Scanner(System.in);
        mensaje();

        int numero;

        do {
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Al intro el 0 - no se acumulará");
                System.out.println("Fin del programa");
                i++; // veces
            } else {
                acumulador = acumulador + numero;
                i++; // veces
            }
        } while (numero != 0 || numero > 0);
        if (acumulador == 0) {
            System.out.println(" el " + i + "º numero con el valor : " + acumulador + " no se tiene en cuenta");

        } else {
            System.out.println(" i - " + i);
            System.out.println("Media : " + acumulador / i);
        }
    }

    public static void main(String[] args) {

        iterador();
    }

    public static void mensaje() {
        System.out.println("-----------------------");
        System.out.println(" --- Intro un nº distinto de 0 --- ");
        System.out.println(" --- 0 o Negativo --- ");
        System.out.println("----- Para salir -------");
        System.out.println("-----------------------");
    }

}
