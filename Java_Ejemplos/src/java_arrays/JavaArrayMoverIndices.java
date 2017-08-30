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
public class JavaArrayMoverIndices {

//                      i =  0  1  2  3  4  5  6  7
//                      j =  0  1
    public static int[] a = {1, 2, 3, 4, 5, 6, 7, 3};

    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("--------------------------");
            System.out.println("• Indice i : " + i);
            for (int j = 1; j < a[j]; j++) {
                System.out.println("•• Valor i : " + i + " con a[i] : " + a[i]);
                System.out.println("♦♦ Valor j : " + j + " con a[j] : " + a[j]);
//                    2  ==   7
                if (a[i] == a[j]) {
                    System.out.println("________________________________");
                    System.out.println("◘◘ Valor Iguales " + a[i] + " = " + a[j] + " ◘◘ ");
                    System.out.println("◘◘ Valor de a[i] : " + a[i] + " ◘◘ ");
                    a[i] = 100;
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
