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
public class _1_6Convertir_Expresiones {

    public static void main(String[] args) {

        int M = ((int) (Math.random() * (1 + 100) + 1));
        int N = ((int) (Math.random() * (1 + 100) + 1));
        int P = ((int) (Math.random() * (1 + 100) + 1));
        int Q = ((int) (Math.random() * (1 + 100) + 1));

        double x = ((int) (Math.random() * (1 + 100) + 1));
        double y = ((int) (Math.random() * (1 + 100) + 1));
        double m = ((int) (Math.random() * (1 + 100) + 1));
        double n = ((int) (Math.random() * (1 + 100) + 1));
        double p = ((int) (Math.random() * (1 + 100) + 1));
        double q = ((int) (Math.random() * (1 + 100) + 1));
        double r = ((int) (Math.random() * (1 + 100) + 1));
        double s = ((int) (Math.random() * (1 + 100) + 1));

        double a = (M / N) + P;
        System.out.println("Valor : " + a);

        double b = M + (N / P - Q) + P;
        System.out.println("Valor : " + b);

        double c = (x + y) / (a - b);
        System.out.println("Valor : " + c);

        double d = 2 * (Math.sin(1) + Math.cos(2)) / Math.tan(3);
        System.out.println("Valor : " + d);

        d = 2 * (Math.sin(1) + Math.cos(2)) / Math.tan(3);
        System.out.println("Valor : " + d);

        double e = (m + n / p) / (q - r / s);
        System.out.println(e);

        double f = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(f);

    }
}
