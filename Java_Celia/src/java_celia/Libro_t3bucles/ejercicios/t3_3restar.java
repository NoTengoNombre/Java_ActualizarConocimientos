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
public class t3_3restar {

    public static int c = 1;

    public static int setNum() {
        System.out.println("Intro " + c++ + "º num ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static int getMayorMenor(int set1, int set2) {
        int num1 = set1;
        int num2 = set2;
        int suma_total;
        int aux;

        System.out.println("Entrada Num1 : " + num1 + " Num2 : " + num2);

        if (num1 < num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;

            System.out.println("Num1 : " + num1 + " Num2 : " + num2);
            suma_total = num1 - num2;
            System.out.println("Suma total : " + suma_total);
        } else {
            System.out.println("Num1 : " + num1 + " Num2 : " + num2);
            suma_total = num1 - num2;
            System.out.println("Suma total : " + suma_total);
        }
        return suma_total;
    }

    public static void main(String[] args) {
        getMayorMenor(setNum(), setNum());
    }
}
