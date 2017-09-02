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
public class ArrayManejarValoresIndices {

//                    0  1  2  3  4  5 
    static int[] v = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

        System.out.println("Suma el valor del indice con el numero asignado : ");
        System.out.println(v[5] + 11);
//                           ERROR - ese indice no existe
//        System.out.println(v[5] + v[11]);
        System.out.println("Suma el valor de los indices : ");
        System.out.println(v[5] + v[5]);

        System.out.println("Cambia el valor de v[5] por v[2]");
        v[5] = v[2];
        System.out.println("Se han intercambiado los valores entre v[5] a v[2] : " + v[5]);
        v[2] = v[5];
        System.out.println("Se han intercambiado los valores entre v[2] a v[5] : " + v[2]);
        System.out.println("----------------------------------------");
        for (int i = 0; i < v.length - 1; i++) {
            System.out.println(v[i] = v[i + 1]);
        }

    }

}
