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
public class JavaArrayBidimensional {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 3};
        int[] ab = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                if (a[i] == a[j]) {
                    ab[j] = i * 3;
                    System.out.println("Nueva asignacion : " + ab[j]);
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
