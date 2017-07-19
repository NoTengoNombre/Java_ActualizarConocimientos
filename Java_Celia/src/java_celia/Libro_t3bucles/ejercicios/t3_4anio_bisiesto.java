/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Portatil_Bot
 */
public class t3_4anio_bisiesto {

    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static void main(String[] args) {

//        int num = getNum();
        for (int i = 0; i < 100; i++) {
            int num = (int) ((Math.random() * 100 + 1900));
            boolean anio = (num % 4 == 0 && (num % 400 == 0 || num % 100 != 0));
            if (anio == true) {
                System.out.printf("\u001B[31mAnio Bisiesto : " + num + " \n");
            } else {
                System.out.printf("\u001B[33mAnio NO bisiesto :  " + num + " \n");
            }
        }

    }
}
