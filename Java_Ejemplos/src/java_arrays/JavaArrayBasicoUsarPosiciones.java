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
public class JavaArrayBasicoUsarPosiciones {

    public static void main(String[] args) {
//                 0  1  2  3 |4| 5  6  7  8   9
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("---- Lo indices estan controlados ---- ");
        System.out.println("Longitud : " + (a.length));
        System.out.println("Posicion 9  : valor " + (a[9]));
        System.out.println("Posicion 8  : valor " + (a[8]));
        System.out.println("Posicion 7  : valor " + (a[7]));
        System.out.println("Posicion 6  : valor " + (a[6]));
        System.out.println("Posicion 5  : valor " + (a[5]));
        System.out.println("-------------------------------");
        System.out.println("Longitud -1 : " + (a.length - 1));
        System.out.println("Posicion 9  : valor " + (a[9] - 1));
        System.out.println("Posicion 8  : valor " + (a[8] - 1));
        System.out.println("Posicion 7  : valor " + (a[7] - 1));
        System.out.println("Posicion 6  : valor " + (a[6] - 1));
        System.out.println("Posicion 5  : valor " + (a[5] - 1));
        System.out.println("------------- Operaciones Basicas ------------------");
        System.out.println("Sumar indices (a[9] + a[9]) : valor " + (a[9] + a[9]));
        System.out.println("Restar indices (a[9] - a[9]) : valor " + (a[9] - a[9]));
        System.out.println("Asignar indices (a[9] = a[0]) : valor " + (a[9] = a[0]));
        System.out.println("•• ERROR PORQUE SALE FUERA DEL RANGO ••");
        System.out.println("\t\t a[9 + 1] ");
        System.out.println("••••••••••••••• MOVER INDICES •••••••••••••••");
        System.out.println(" P  P  P  P |P| P  P  P  P  P");
        System.out.println(" 0  1  2  3 |4| 5  6  7  8  9");
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");
        System.out.println("a[6] = " + a[6]);
        System.out.println("Insertamos en la posicion a[6] el valor de a[5] ");
        System.out.println("(a[6] = a[5]): " + (a[6] = a[5]));
        System.out.println("a[6] = " + a[6]);

//                 0  1  2 |3| 4  5  6  7  8  9
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int x = 3;
        System.out.println("---------------");
        System.out.println("Indice [3] - " + v[x]);
        System.out.println("---------------");
//           4       4
        int aux0 = v[0];
        int aux1 = v[1];
        int aux2 = v[2];
        int aux3 = v[3];
        int aux4 = v[4];
        int aux5 = v[5];
        int aux6 = v[6];
        int aux7 = v[7];
        int aux8 = v[8];

        System.out.println("2ºPaso: aa[3] " + v[0]);
        v[1] = v[0];
        System.out.println("2ºPaso: aa[3] " + v[1]);
        v[2] = v[1];
        System.out.println("2ºPaso: aa[3] " + v[2]);
        v[3] = v[2];
        System.out.println("2ºPaso: aa[3] " + v[3]);
        v[4] = v[3];
        System.out.println("2ºPaso: aa[3] " + v[4]);
        v[5] = v[4];
        System.out.println("2ºPaso: aa[3] " + v[5]);
        v[6] = v[5];
        System.out.println("2ºPaso: aa[3] " + v[6]);
        v[7] = v[6];
        System.out.println("2ºPaso: aa[3] " + v[7]);
        v[8] = v[7];
        System.out.println("3ºPaso: aa[4] " + v[8]);
        v[9] = v[8];
        System.out.println("3ºPaso: aa[4] " + v[9]);

    }
}
