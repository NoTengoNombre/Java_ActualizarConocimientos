
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_7contar_cifras1 {

    private static int c = 0;
    private int n1 = 0;
    private int n2 = 0;
    private int n3 = 0;
    private int n4 = 0;

    public T3_7contar_cifras1() {
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
    }

    public void contarCifras2(int n) {
        int c1 = 0;
        System.out.println("numeros : " + c1);
        if ((n / 1) >= 1 && (n / 1) <= 9) {
            System.out.println("estoy entre 1 y 9 - " + n);
            c1++;
        }
        if ((n / 1) >= 10 && (n / 1) <= 99) {
            System.out.println("estoy entre 10 y 99 - " + n);
            c1++;
        }
        if ((n / 1) >= 100 && (n / 1) <= 999) {
            System.out.println("estoy entre 100 y 999 - " + n);
            c1++;
        }
        if ((n / 1) >= 1000 && (n / 1) <= 9999) {
            System.out.println("estoy entre 1000 y 9999 - " + n);
            c1++;
        }
        if ((n / 1) >= 10000 && (n / 1) <= 99999) {
            System.out.println("estoy entre 10000 y 99999 - " + n);
            c1++;
        }
        if ((n / 1) >= 100000 && (n / 1) <= 999999) {
            System.out.println("estoy entre 100000 y 999999 - " + n);
            c1++;
        }
    }

    public void contarCifras3(int n) {
        int suma = 0;

        if ((n / 100000) >= 1.0 && (n / 1) >= 100000 && (n / 1) <= 999999) {
            System.out.println("estoy entre 100000 y 999999 - " + n);
            suma = suma + 1;
        }
        if ((n / 10000) >= 1.0 && (n / 1) >= 10000 && (n / 1) <= 99999) {
            System.out.println("estoy entre 10000 y 99999 - " + n);
            suma = suma + 1;
        }
        if ((n / 1000) >= 1.0 && (n / 1) >= 1000 && (n / 1) <= 9999) {
            System.out.println("estoy entre 1000 y 9999 - " + n);
            suma = suma + 1;
        }
        if ((n / 100) >= 1.0 && (n / 1) >= 100 && (n / 1) <= 999) {
            System.out.println("estoy entre 100 y 999 - " + n);
            suma = suma + 1;
        }
        if ((n / 10) >= 1.0 && (n / 1) >= 10 && (n / 1) <= 99) {
            System.out.println("estoy entre 10 y 99 - " + n);
            suma = suma + 1;
        }
        if ((n / 1) >= 1.0 && (n / 1) >= 1 && (n / 1) <= 9) {
            System.out.println("estoy entre 1 y 9 - " + n);
            suma = suma + 1;
        }

        System.out.println("numero total : " + suma);
    }

    public static void main(String[] args) {
        T3_7contar_cifras1 tc = new T3_7contar_cifras1();
//        tc.contarCifras(55512);
        tc.contarCifras3(11);

    }

    public void contarCifras(int n) {
        c = 0;
        int total = 5512;
        if ((total / 1) < 100.000) {
            System.out.println("valor 1 " + n);
            c++;
        }
        if ((total / 1) < 10.000) {
            System.out.println("valor 2 " + n);
            c++;
        }
        if ((total / 1) < 1.000) {
            System.out.println("valor 3 " + n);
            c++;
        }
        if ((total / 1) < 100) {
            System.out.println("valor 4 " + n);
            c++;
        }
        if (total / 1 < 10) {
            System.out.println("valor 5 " + n);
            c++;
        }
        if (total / 1 < 1) {
            System.out.println("valor 6 " + n);
            c++;
        }
        System.out.println("----------");
        System.out.println("num1 " + n1);
        System.out.println("num2 " + n2);
        System.out.println("num3 " + n3);
        System.out.println("num4 " + n4);
        System.out.println("contador final : " + c);
    }
}
