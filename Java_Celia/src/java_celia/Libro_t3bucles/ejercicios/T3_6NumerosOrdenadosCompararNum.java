/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_6NumerosOrdenadosCompararNum {

    static int c = 1;
    static int menor = 0;
    static int intermedio = 0;
    static int mayor = 0;

    public static int getNumero() throws IOException {
        System.out.println("Introduce el " + c++ + "º num");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = Integer.parseInt(br.readLine().trim());
        return num;
    }

    public static void main(String[] args) throws IOException {
//        int n1 = getNumero();
        int n1 = (int) (Math.random() * (1 + 10) + 1);
        int n2 = (int) (Math.random() * (1 + 10) + 1);
        int n3 = (int) (Math.random() * (1 + 10) + 1);

        System.out.println("• n1 : " + n1);
        System.out.println("• n2 : " + n2);
        System.out.println("• n3 : " + n3);

        //   1     2      1    3
        if ((n1 < n2) && (n1 < n3)) { // n1 - menor a todos
            menor = n1;
            System.out.println("♣ menor n1 : " + n1);
            if (n2 < n3) {
                intermedio = n2;
                mayor = n3;
                System.out.println("♣ intermedio n2 : " + n2);
                System.out.println("♣ mayor n3 : " + n3);
            } else if (n3 < n2) {
                intermedio = n3;
                mayor = n2;
                System.out.println("♣ intermedio n3 : " + n3);
                System.out.println("♣ mayor n2 : " + n2);
            }
        }
//            1    2       1    3
        if ((n2 < n1) && (n2 < n3)) {
            menor = n2;
            System.out.println("• menor n2 : " + n2);
//               2   3
            if (n1 < n3) {
                intermedio = n1;
                mayor = n3;
                System.out.println("• intermedio n1 : " + n1);
                System.out.println("• mayor n3 : " + n3);
            } else if (n3 < n1) {
                intermedio = n3;
                mayor = n1;
                System.out.println("• intermedio n3 : " + n3);
                System.out.println("• mayor n1 : " + n1);
            }
        }
        if ((n3 < n1) && (n3 < n2)) {
            menor = n3;
            System.out.println("☻ menor n3 : " + n3);
//               2   3
            if (n2 < n1) {
                intermedio = n2;
                mayor = n1;
                System.out.println("☻ intermedio n2 : " + n2);
                System.out.println("☻ mayor n1 : " + n1);
            } else if (n1 < n2) {
                intermedio = n1;
                mayor = n2;
                System.out.println("☻ intermedio n1 : " + n1);
                System.out.println("☻ mayor n2 : " + n2);
            }
        }

    }
}
