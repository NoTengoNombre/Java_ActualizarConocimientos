/**
 * @created on : 21-ago-2017, 0:09:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3ParesYNones {

    /**
     * Muestra la lista de numeros pares e impares
     *
     * @param a menor
     * @param b mayor
     * 
     * @param paresOImpares
     */
    public void mostrar(int a, int b, String paresOImpares) {

        if (paresOImpares.equals("pares")) {
            T3Pares p = new T3Pares();
            p.mostrarPares(a, b);
        }
        if (paresOImpares.equals("impares")) {
            T3Impares p = new T3Impares();
            p.mostrarImpares(a, b);
        }
    }

    public static void main(String[] args) {

        T3ParesYNones t3pyn = new T3ParesYNones();
        t3pyn.mostrar(1, 10, "impares");

    }

}
