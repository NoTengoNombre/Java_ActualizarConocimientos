/**
 * @created on : 21-ago-2017, 12:17:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3Fibonacci {

//    variable local
    private final int numElementos;

    /**
     * Constructor que inicializa la variable local
     *
     * @param n
     */
    public T3Fibonacci(int n) {
        numElementos = n;
    }

    /**
     * Devuelve sucesion de elementos
     *
     * @return sucesion long
     */
    public long[] getCalcularFibonnaci() {
//      fijar comienzo
        long a = 0;
        long b = 1;

        long[] sucesion = new long[numElementos];

        sucesion[0] = a; // posicion 0 
        sucesion[1] = b; // posicion 1

//        empieza en indice 2 porque la posicion 0 , 1 tiene ya elementos
        for (int i = 2; i < numElementos; i++) {
            sucesion[i] = a + b;
            a = b;
            b = sucesion[i];
        }
        return sucesion;
    }

    public static void main(String[] args) {

        System.out.println("Intro un numero : ");
        int num = SC.nextInt();
//        int num = Integer.parseInt(System.console().readLine());

        while (num <= 1) {
            System.out.println("! Solo numeros mayores que 1 !");
            System.out.println("! Intentelo de nuevo : !");
            num = SC.nextInt();
//            num = Integer.parseInt(System.console().readLine());
        }

        T3Fibonacci fib = new T3Fibonacci(num);

        long[] sucesion;
        sucesion = fib.getCalcularFibonnaci();

        for (int i = 0; i < num; i++) {
            System.out.print(sucesion[i] + " ");
        }
        System.out.println();

    }

}
