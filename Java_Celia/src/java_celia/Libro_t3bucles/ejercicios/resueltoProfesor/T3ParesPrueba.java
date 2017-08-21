/**
 * @created on : 21-ago-2017, 0:09:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3ParesPrueba {

    private static final Scanner SC = new Scanner(System.in);

    public T3ParesPrueba() {
    }

    public static void main(String[] args) {

        T3Pares pares = new T3Pares();
//        int n1 = pares.leerNumero();
//        int n2 = pares.leerNumero();

        System.out.println("Intro num 1");
        int n1 = (int) (Math.random() * (1 + 10) + 1);
        System.out.println("Intro num 2");
        int n2 = (int) (Math.random() * (1 + 10) + 1);

        pares.mostrarPares(n1, n2);
    }
}
