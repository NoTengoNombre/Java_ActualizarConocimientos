/**
 * @created on : 11-sep-2017, 22:43:17
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.util.ArrayList;
import java.util.Arrays;

public class T5x28DecimalABinario {

    public static void main(String[] args) {

        int dividendo = 12;
        int divisor = 2;
        int cociente = 0;

        ArrayList<Integer> resto = new ArrayList<>();

        System.out.println("Resto : " + dividendo % divisor);
        System.out.println("");

        int x = 0;
        do {
            cociente = (dividendo / divisor);
            resto.add(dividendo % divisor);
            System.out.println("• Despues de dividir : " + cociente);
            dividendo = cociente;
            x++;
        } while (dividendo > 0);

        Integer[] a = new Integer[x];

        int xx = 0;
        for (Integer indice : resto) {
            a[xx] = indice;
            xx++;
        }

        System.out.println(a[a.length - 1]);
        System.out.println(a[a.length - 2]);
        System.out.println(a[a.length - 3]);
        System.out.println(a[a.length - 4]);

        int[] b = new int[a.length];

//               3 = 4 - 1         3,2,1,0
        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[(a.length - i) - 1];
            System.out.print(a[i]);
        }
        System.out.println("");

    }
}
