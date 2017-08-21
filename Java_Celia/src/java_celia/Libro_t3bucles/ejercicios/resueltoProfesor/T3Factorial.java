/**
 * @created on : 21-ago-2017, 12:17:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3Factorial {

    private static final Scanner SC = new Scanner(System.in);

    /**
     *
     * @param indice
     * @return
     */
    public long getCalcularFactorial(long indice) {

        long indiceLocal;
        long factorial;

        if (indice == 0) {
            factorial = 1;
        } else {
            indiceLocal = Math.abs(indice); // obtengo el valor positivo
            factorial = indice; // Factorial es el indice
            while (indiceLocal != 1) { // Decrementa el numero del indice
                indiceLocal--;
//                                       5 4 3 2 -> 1 != 1 se para
                factorial *= indiceLocal;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {

        T3Factorial factorial = new T3Factorial();
        System.out.println("Introduce un numero : ");

//        long nc = Long.parseLong(System.console().readLine());
        long n = SC.nextLong();

        System.out.println("Factorial es : \n " + n + " ! = " + factorial.getCalcularFactorial(n));

    }
}
