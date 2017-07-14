/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t1;

/**
 *
 * @author Portatil_Bot
 */
public class _1_5Calcular_Expresiones {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 8;

        double ej_a = 4 / 2 * 3 / 6 + 6 / 2 / 1 / 4 * 2;
        System.out.println("Valor es : " + ej_a);

        double ej_b = (7 * (10 - 5) % 3) * 4 + 9;
        System.out.println("Valor es : " + ej_b);

        double ej_c = 3 * a - 4 * b / Math.pow(c, 2);
        System.out.println("Valor es : " + ej_c);

        double ej_d = 7 % 5 % 3;
        System.out.println("Valor es : " + ej_d);

        double ej_e = b * a - Math.pow(b, 2 * 4 / c);
        System.out.println("Valor es : " + ej_e);

        double ej_f = Math.sqrt(Math.pow(b, 2));
        System.out.println("Valor es : " + ej_f);

        double ej_g = (((b + c) / 2 * a + 10) * 3 * b) - 6;
//        double ej_g = ((b + c) / 2 * a + 10);
        System.out.println("Valor es : " + ej_g);

        double ej_h = Math.sqrt(b * b);
        System.out.println("Valor es : " + ej_h);

        double ej_i = 7 / 2;
        System.out.println("Valor es : " + ej_i);

        double ej_j = Math.round(81.4) + Math.round(81.6);
        System.out.println("Valor es : " + ej_j);

        double ej_k = 7 % 2;
        System.out.println("Valor es : " + ej_k);

        boolean ej_l = Math.round(Math.sqrt(c)) > Math.abs(-(a ^ 2));
        System.out.println("Valor es : " + ej_l);

        double ej_m = 0 % 5;
        System.out.println("Valor es : " + ej_m);

        double ej_n = 7 * 10 - 50 % 3 * 4 + 9;
        System.out.println("Valor es : " + ej_n);

    }
}
