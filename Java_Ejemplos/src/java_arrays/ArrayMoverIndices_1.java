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
public class ArrayMoverIndices_1 {

//                     0   1   2   3   4   5 
    static int[] v = {11, 21, 31, 41, 51, 61};
    static int[] vAux = new int[v.length];
    static int[] v2 = new int[v.length];

    public static void main(String[] args) {

        System.out.println("Suma el valor del indice con el numero asignado : ");
// Aunque la longitud es 5 
// Cuando llegue al maximo que es 4 
// se le puede sumar [i + 1] para que tenga el indice 5 y muestre el valor

        for (int i = 0; i < v.length; i++) {
            vAux[i] = v[i];
        }

        System.out.println("-------------------");
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " +-+ " + vAux[i]);
        }
        System.out.println("-------------------");

        System.out.println("longitud : " + v.length);
        System.out.println("vAux : " + vAux[0]);

        int numero = 30;
//                      0 <     5
        for (int i = 0; i < v.length - 1; i++) {
//                 1  =   11[0]    
            v2[i + 1] = vAux[i];
//                             0              0
            System.out.println(i + " - " + v2[i]);
            if (numero < v2[i]) {
                v2[i] = numero;
                System.out.println(i + " - " + v2[i]);
            }
        }

    }

}
