/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_6numerosOrdenados_leerNum {

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

    public static void getConsecutivos(int n1, int n2, int n3) {
        if (((++n1 == n2) && (++n2 == n3))) {
            System.out.println("♦ Si consecutivos");
        } else {
            System.out.println("♦ No consecutivos");
        }
    }

    public static void getListanumeros(int n1, int n2, int n3) {
//        int n1 = getNumero();
        System.out.println("• n1 : " + n1);
        System.out.println("• n2 : " + n2);
        System.out.println("• n3 : " + n3);
        if ((n1 < n2) && (n1 < n3)) {
            menor = n1;
            System.out.println("♣ menor n1 : " + n1);
            if (n2 < n3) {
                intermedio = n2;
                mayor = n3;
                System.out.println("♣ intermedio n2 : " + n2);
                System.out.println("♣ mayor n3 : " + n3);
                System.out.println("$$ Ordenados de menor a mayor $$ ");
            } else if (n3 < n2) {
                intermedio = n3;
                mayor = n2;
                System.out.println("♣ intermedio n3 : " + n3);
                System.out.println("♣ mayor n2 : " + n2);
            }
        }
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

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            getListanumeros((int) (Math.random() * (1 + 10) + 1), (int) (Math.random() * (1 + 10) + 1), (int) (Math.random() * (1 + 10) + 1));
            System.out.println("-----------");
        }

        int v1 = (int) (Math.random() * (1 + 3) + 1);
        System.out.println("valor 1: " + v1);
        int v2 = (int) (Math.random() * (1 + 3) + 1);
        System.out.println("valor 2: " + v2);
        int v3 = (int) (Math.random() * (1 + 3) + 1);
        System.out.println("valor 3: " + v3);

        getConsecutivos(v1, v2, v3);

    }
}
