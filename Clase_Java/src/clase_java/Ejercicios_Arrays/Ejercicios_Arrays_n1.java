/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_java.Ejercicios_Arrays;

import java.util.Scanner;

/**
 *
 * @author Portatil_Bot
 */
public class Ejercicios_Arrays_n1 {

    /**
     *
     * @param a
     */
    public static void mostrarArray(int a[]) {
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    /**
     *
     * @return
     */
    public static int[] leerArray() {

        Scanner sc = new Scanner(System.in);

        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce número: ");
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static void main(String[] args) {

//        Variable para almacenar el array 
        int[] a;

//        Metodo devuelve un array 
        a = leerArray();
//        Muestra el array         
        mostrarArray(a);
    }
}
