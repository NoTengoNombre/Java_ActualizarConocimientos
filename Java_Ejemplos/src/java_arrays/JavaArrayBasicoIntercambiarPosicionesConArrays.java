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
public class JavaArrayBasicoIntercambiarPosicionesConArrays {

    //                0  1  2 |3| 4  5
    static int[] v = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

        System.out.println(v[0] + 1);
//        aux = v[1];
////                        1<-2      1
//        System.out.println(v[1] = v[0]);
//        aux2 = v[2];
////                        2<-3     2
//        System.out.println(v[2] = aux);
////                        3<-4     3
//        System.out.println(v[3] = aux2);
        int[] arAux = new int[v.length];

        System.out.println("-----------------");
        for (int i = 0; i < v.length - 1; i++) {
            arAux[i] = v[i + 1];
            System.out.println(i + " : valor de arAux[i] : " + arAux[i]);
        }

    }
}
