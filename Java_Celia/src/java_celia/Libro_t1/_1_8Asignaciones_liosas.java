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
public class _1_8Asignaciones_liosas {

    public static void main(String[] args) {

        System.out.println("Ejercicio A ");
        int a, b, c;
        a = 3;
        b = 4;
        c = a + 2 * b;
        c = c + b;
        b = c - a;
        a = b * c;
        System.out.println(a + b + c);

        System.out.println("Ejercicio B ");
        double x;
        x = 2.0;
        x = Math.pow((x + x), 2);
        x = Math.sqrt(x + Math.sqrt(x) + 5);
        System.out.println(x);

        System.out.println("Ejercicio C ");

        int xx, yy;
        boolean zz;
        xx = 5;
        yy = xx - 2;
        xx = yy * yy + 1;
        zz = (xx > (yy + 5));
        System.out.println("x Vale " + xx + ", y vale " + yy + " y z vale " + zz);

        System.out.println("Ejercicio D ");

        int aaa, bbb;
        aaa = 10;
        bbb = 5;
        aaa = bbb;
        bbb = aaa;

        System.out.println("Vale a " + aaa + " - Vale b " + bbb);

    }
}
