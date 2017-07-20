/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

/**
 * 3.14 = 3.14 - [3.14] = 3.14 - 3 = 0.14
 *
 * 5 = 5 - [5] = 5 - 5 = 0
 *
 * -8.21 = [-8.21] = -8.21 - [-8.21] = -8.21 - (-9) = 0.79
 *
 * Math.round ( redondea al valor más próximo )
 *
 *
 * @author Portatil_Bot
 */
public class T3_5fraccion {

    public static double getNum() {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }

    public static long redondeo(double num) {
        long round = Math.round(num);
        return round;
    }

    public static void main(String[] args) {

        System.out.println("Intro numero : ");
//        valor con parte entera y 2 decimales
        double valor_racional = getNum();
        System.out.println("Valor racional : " + valor_racional);

//        me quedo parte entera
        int parte_entera = (int) valor_racional;
        System.out.println("Parte entera : " + parte_entera);
        System.out.println("Parte racional : " + (double) Math.round(valor_racional));

//        operacion para obtener la parte decimal
        double parte_decimal = (double) valor_racional - parte_entera;
        System.out.println("Parte decimal extensa :  " + parte_decimal);

//        if ((double) parte_entera != valor_racional) { // si es positivo y decimal
        if (0 < valor_racional) { // si es positivo y decimal
            double valor = (double) (Math.round(parte_decimal * 100d) / 100d);
            System.out.println("Parte decimal redondeada : " + valor);
        }

        if (parte_decimal == 0.0) { // si es positivo sin decimal
            int fraccional_entero = parte_entera - parte_entera;
            System.out.println("Fraccional entera : " + fraccional_entero);
        }

        if (valor_racional < 0) { // si es negativo y decimal
            double valor_incremento = --parte_entera;
            double resultado = valor_incremento - valor_racional;
            double ver = (Math.round(resultado * 100d) / 100d);
            System.out.println("3 resultado : " + ver);
        }

    }

}
