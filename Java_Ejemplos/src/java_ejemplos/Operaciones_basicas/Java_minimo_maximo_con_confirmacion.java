/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

import java.util.Scanner;

public class Java_minimo_maximo_con_confirmacion {

    public static void main(String[] args) {
        int maximo = 0;
        int minimo = 10;
        int num;
        String salida = null;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero - 's' para Salir ");

            num = sc.nextInt();

            if (num < minimo) {
                minimo = num;
                System.out.println("Minimo : " + minimo);

            } else if (num > maximo) {
                maximo = num;
                System.out.println("Maximo : " + maximo);
            }
            System.out.println("'s' para Salir ");
            salida = sc.next();
        } while ("s".equals(salida) == false);

        System.out.println("Maximo : " + maximo);
        System.out.println("Minimo : " + minimo);
    }
}
