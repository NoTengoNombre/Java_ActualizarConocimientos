/**
 * @created on : 08-ago-2017, 12:38:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class JavaCapturarTecladoWhileIfResumido {

    private static boolean seguirJugando() {
        boolean valor = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 'si' o 'no' para comentar el juego ");

        String respuesta = sc.next();

        while (!(respuesta.equals("no"))) { 
            while ((!(respuesta.equals("si"))) && (!(respuesta.equals("no")))) {
                if ((!(respuesta.equals("si")))) {
                    System.out.println("Por favor introduzca 'si' o 'no' ");
                    System.out.print("para continuar jugando \n");
                    respuesta = sc.next();
                }
            }

            while ((respuesta.equals("si"))) {

                System.out.println("¿ Desea seguir jugando ?");
                System.out.print("Por favor introduzca 'si' o 'no' \n ");
                respuesta = sc.next();
            }
        }

        System.out.println("• Fin del juego " + valor);
        return valor;
    }

    public static void main(String[] args) {

        seguirJugando();
    }
}
