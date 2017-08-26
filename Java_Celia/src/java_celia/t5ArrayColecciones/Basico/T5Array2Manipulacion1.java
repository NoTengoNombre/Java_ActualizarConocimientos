/**
 * @created on : 25-ago-2017, 11:53:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5Array2Manipulacion1 {

    public static void main(String[] args) {

        int[] v = new int[10];

        for (int i : v) {
            System.out.println("♦ serie" + v[i]);
        }

        System.out.println("---------------------------");

        for (int i = 0; i < v.length; i++) {
            System.out.printf("Escribe el valor del elemento nº i %d ", i);
//            v[i] = SC.nextInt();
            v[i] = i;
            System.out.println();
        }
        System.out.println("----------");

        for (int i = 0; i <= 9; i++) {
            System.out.println("El elemento nº i " + i + " vale " + v[i]);
        }
        
        

    }
}
