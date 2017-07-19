/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Portatil_Bot
 */
public class t3_1positivo_negativo {

    public static int setNum() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Introduce el valor : ");
        BufferedReader br = new BufferedReader(isr);
        int num = Integer.parseInt(br.readLine());
        return num;
    }

    public static void getParImparPosNega(int setNum) {

        if (setNum % 2 != 0 && setNum > 1) {
            System.out.println("El numero " + setNum + " es positivo e impar");
        } else if (-setNum % 2 == 0 && setNum <= 1) {
            System.out.println("El numero " + setNum + " es negativo y par");
        }
        if (setNum % 2 == 0 && setNum > 1) {
            System.out.println("El numero " + setNum + " es positivo y par");
        } else if (setNum % 2 != 0 && setNum <= 1) {
            System.out.println("El numero " + setNum + " es negativo e impar");
        }
    }

    public static void getPositivo_Negativo(int setNum) {
        System.out.println("El 0 es par y un valor neutro");
        System.out.println("Introduce el valor : " + setNum);
        int n = setNum;

        if (n < (~n)) {
            System.out.println("Negativo : " + n);
        } else if (n == 0) {
            System.out.println("Valor " + n + " es neutro");
        } else {
            System.out.println("Positivo : " + n);
        }
    }

    public static void main(String[] args) throws IOException {

        getPositivo_Negativo(setNum());
        System.out.println("-----------------");
        getParImparPosNega(setNum());

    }
}
