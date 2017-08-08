/**
 * @created on : 07-ago-2017, 19:24:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_moduloResto;

public class ModuloRestoDecimales2 {

    public static void main(String[] args) {

        int numero = 23456;
        int nu = 0;

        if (numero > 10000) {
            int num = (int) (numero * 0.0001);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
            } else {
                System.out.println("♦ Impar: " + num);
            }
            nu = numero % 10000;
            System.out.println("♦ Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 1000) {
            int num = (int) (nu * 0.001);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
            } else {
                System.out.println("♦ Impar: " + num);
            }
            nu = nu % 1000;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 100) {
            int num = (int) (nu * 0.01);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
            } else {
                System.out.println("♦ Impar: " + num);
            }
            nu = nu % 100;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 10) {
            int num = (int) (nu * 0.1);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
            } else {
                System.out.println("♦ Impar: " + num);
            }
            nu = nu % 10;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 1) {
            int num = (int) (nu * 1);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
            } else {
                System.out.println("♦ Impar: " + num);
            }
            nu = nu % 1;
            System.out.println("Numero : " + nu);
        }

    }
}
