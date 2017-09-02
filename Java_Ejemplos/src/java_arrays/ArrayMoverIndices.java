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
public class ArrayMoverIndices {

//                     0   1   2   3   4   5 -> Longitud 6
    static int[] v = {11, 21, 31, 51, 61, 70};
    static int[] vAux = new int[v.length];
    static int[] v2 = new int[v.length];

    public static void main(String[] args) {

        System.out.println("Suma el valor del indice con el numero asignado : ");
//       La Longitud es 6 pero no existe un indice con 6 por eso da error
//       como maximo la longitud es 5
//      Longitud maxima = 6
//      Longitud real = 0 a 5
        System.out.println("Longitud : " + v.length);
        for (int i = v.length - 1; i > 0; i--) {
            vAux[i] = v[i - 1];
            System.out.println("i : " + i + " - " + vAux[i]);
        }

        int n = 12;
        int con = 0;

        System.out.println("Longitud aux : " + vAux.length);

        for (int i = 0; i < vAux.length - 1; i++) {
            System.out.println(i + " |" + vAux[i] + "| ");
            if (n <= vAux[i]) {
                vAux[i + 1] = v[i];
            }
            if (n <= vAux[i] && (con == 0)) {
                vAux[i] = n;
                con++;
            }
        }

        System.out.println("\n----------------------");

        for (int i = 1; i < vAux.length; i++) {
            System.out.print(vAux[i] + " ");
        }
        System.out.println();

    }
}
