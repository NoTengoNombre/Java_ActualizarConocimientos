/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_java.Ejercicios_Arrays;

/**
 *
 * @author Portatil_Bot
 */
public class Ejercicios_Arrays_n2_pares {

    public static int[] generarArray() {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            int x = (int) (Math.random() * 100 + 1);
            a[i] = x;
        }
        return a;
    }

    public static void mostrarArray(int a[]) {
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a;
        a = generarArray();
        mostrarArray(a);

    }
}
