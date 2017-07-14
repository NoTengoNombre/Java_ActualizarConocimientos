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
public class Ejercicios_Arrays_n2 {

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

    public static int contarPares(int a[]) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarImpares(int a[]) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarNulos(int a[]) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                //System.out.println("Valor : " + a[i] + " - " + contador + " - Veces ");
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        int[] a;
        a = generarArray();
        mostrarArray(a);
        System.out.println();
        System.out.println("El número de pares es: " + contarPares(a));
        System.out.println("El número de impares es: " + contarImpares(a));
        System.out.println("El numero de nulos es : " + contarNulos(a));
    }
}
