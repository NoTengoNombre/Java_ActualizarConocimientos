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
import java.util.Scanner;

public class T5x28DecimalABinario {

    public static void main(String[] args) {
        DecimalToBinario btb = new DecimalToBinario();
        btb.getNumeroDecimalToBinario(btb.getNumero());
    }
}

class DecimalToBinario {

    public int getNumero() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero :");
        n = sc.nextInt();
        if (n <= 0) {
            while (n <= 0) {
                System.out.println("Introduce un numero :");
                n = sc.nextInt();
            }
        }
        return n;

    }

    public String getNumeroDecimalToBinario(int dividendo) {
        int cociente;
        int divisor = 2;

        ArrayList<Integer> resto = new ArrayList<>();

        int x = 0;
        do {
            cociente = (dividendo / divisor);
            resto.add(dividendo % divisor);
            dividendo = cociente;
            x++;
        } while (dividendo > 0);

        Integer[] a = new Integer[x];

        int xx = 0;
        for (Integer indice : resto) {
            a[xx] = indice;
            xx++;
        }

        int[] b = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[(a.length - i) - 1];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println("");
        String cadena = Arrays.toString(b);
        return cadena;
    }
}
