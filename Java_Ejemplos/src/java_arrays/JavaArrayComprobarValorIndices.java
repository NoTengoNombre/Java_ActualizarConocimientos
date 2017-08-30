/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays;

/**
 *
 * @author Portatil_Bot
 */
public class JavaArrayComprobarValorIndices {

//                           0  1  2  3  4  5  6  7
    public static int[] a = {1, 2, 3, 4, 5, 4, 7, 3};

    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("• Indice i : " + i);
            for (int j = i + 1; j < a.length; j++) {
                System.out.println("•• Valor i : " + i + " con a[i] : " + a[i]);
                System.out.println("♦♦ Valor j : " + j + " con a[j] : " + a[j]);
//                    2  ==   7
                if (a[i] == a[j]) {
                    System.out.println("--------------------------");
                    System.out.println("◘◘ Valor Iguales " + a[i] + " = " + a[j] + " ◘◘ ");
                    System.out.println("◘◘ Valor de a[i] : " + a[i] + " ◘◘ ");
                    a[i] = (int) (Math.random() * (1 + 49) + 1);
                }
            }
        }
        System.out.println("--------------------------");

        for (int x = 0; x < a.length; x++) {
            System.out.println("♠ valor i " + x + " de a[i] : " + a[x]);
        }
        System.out.println("--------------------------");

    }
}
