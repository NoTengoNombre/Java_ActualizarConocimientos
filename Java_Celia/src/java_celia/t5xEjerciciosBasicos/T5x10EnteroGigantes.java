/**
 * @created on : 02-sep-2017, 22:54:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.Scanner;

public class T5x10EnteroGigantes {

    private static int[] array;

    public T5x10EnteroGigantes() {
        array = new int[10];
    }

    public int getNumeroAle() {
        int x = (int) (Math.random() * (1 + 1000));
        return x;
    }

    public int getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un numero mayor que 0 ");
        int numero = sc.nextInt();
        if (numero <= 0) {
            while (numero <= 0) {
                System.out.println("Intro un numero mayor que 0 ");
                numero = sc.nextInt();
            }
        }
        return numero;
    }

    public void getArray() {
        int total = 0;
        System.out.println("------- Array --------");
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumeroAle();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println();
        System.out.println("---------------------- ");
        System.out.println(total);
    }

    public static void main(String[] args) {

        T5x10EnteroGigantes t5 = new T5x10EnteroGigantes();
        t5.getArray();

    }
}
