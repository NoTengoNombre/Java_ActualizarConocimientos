
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_7ContarCifras2 {

    private static int c = 0;

    public void contarCifras(int n) {

        System.out.println("" + (n / 1));

        if ((n / 1) >= 1.0 && (n / 1) >= 1.0) {
            c++;
        }
        if ((n / 10) >= 1.0) {
            c++;
        }
        if ((n / 100) >= 1.0) {
            c++;
        }
        if ((n / 1000) >= 1.0) {
            c++;
        }
        if ((n / 10000) >= 1.0) {
            c++;
        }
        if ((n / 100000) >= 1.0) {
            c++;
        }
        if ((String.valueOf(n).length()) > 5) {
            System.out.println("El numero es demasiado largo ");
        } else {
            System.out.println("Total : " + c);
        }
    }

    public static void main(String[] args) {
        T3_7ContarCifras2 tc = new T3_7ContarCifras2();
        tc.contarCifras(-1111);
    }

}
