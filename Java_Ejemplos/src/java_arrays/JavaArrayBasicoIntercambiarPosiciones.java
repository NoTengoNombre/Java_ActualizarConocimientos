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
public class JavaArrayBasicoIntercambiarPosiciones {

    //                0  1  2 |3| 4  5  6  7  8  9
    static int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int aux1 = v[1];
    static int aux2 = v[2];
    static int aux3 = v[3];
    static int aux4 = v[4];
    static int aux5 = v[5];
    static int aux6 = v[6];
    static int aux7 = v[7];
    static int aux8 = v[8];
    static int aux9 = v[9];

    public static void main(String[] args) {

        v[1] = v[0];
        System.out.println("2ºPaso: aa[1] " + v[1]);
        v[2] = aux1;
        System.out.println("3ºPaso: aa[2] " + v[2]);
        v[3] = aux2;
        System.out.println("4ºPaso: aa[3] " + v[3]);
        v[4] = aux3;
        System.out.println("5ºPaso: aa[4] " + v[4]);
        v[5] = aux4;
        System.out.println("6ºPaso: aa[5] " + v[5]);
        v[6] = aux5;
        System.out.println("7ºPaso: aa[6] " + v[6]);
        v[7] = aux6;
        System.out.println("8ºPaso: aa[7] " + v[7]);
        v[8] = aux7;
        System.out.println("9ºPaso: aa[8] " + v[8]);
        v[9] = aux8;
        System.out.println("9ºPaso: aa[9] " + v[9]);

    }
}
