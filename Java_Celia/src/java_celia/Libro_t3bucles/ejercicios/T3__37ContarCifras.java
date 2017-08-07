/**
 * @created on : 07-ago-2017, 18:55:46
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__37ContarCifras {

    private static int numTecla;
    private static int par = 0;
    private static int impar = 0;

    public static int getTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un numero : ");
        numTecla = sc.nextInt();
        if (numTecla < 0 && numTecla > 10000) {
            System.out.println("Intro un numero entre 0 y 10000 ");
            numTecla = sc.nextInt();
        }
        return numTecla;
    }

    public static void getContarCifrasWhile(int numero) {
        int decremento = 100000; // 
        double incremento = 0.00001; //
        boolean salida = true;

        while ((numero > 0 || numero != 0) && salida == true) {
            decremento /= 10;
            if (numero > decremento || numero != 0) {
                incremento *= 10;
                int num = (int) (numero * incremento);
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                if (decremento < 1 || incremento == 1) {
                    salida = false;
                }
            }
        }
    }

    public static void getContarCifras(int numero) {
        int nu = 0;
        if (numero > 10000 || numero != 0) {
            int num = (int) (numero * 0.0001);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
                par++;
            } else {
                System.out.println("♦ Impar: " + num);
                impar++;
            }
            nu = numero % 10000;
            System.out.println("♦ Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 1000 || numero != 0) {
            int num = (int) (nu * 0.001);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
                par++;
            } else {
                System.out.println("♦ Impar: " + num);
                impar++;
            }
            nu = nu % 1000;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 100 || numero != 0) {
            int num = (int) (nu * 0.01);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
                par++;
            } else {
                System.out.println("♦ Impar: " + num);
                impar++;
            }
            nu = nu % 100;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 10 || numero != 0) {
            int num = (int) (nu * 0.1);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
                par++;
            } else {
                System.out.println("♦ Impar: " + num);
                impar++;
            }
            nu = nu % 10;
            System.out.println("Numero : " + nu);
        }

        System.out.println("-----------------------");

        if (nu > 1 || numero != 0) {
            int num = (int) (nu * 1);
            if (num % 2 == 0) {
                System.out.println("♦ Par: " + num);
                par++;
            } else {
                System.out.println("♦ Impar: " + num);
                impar++;
            }
            nu = nu % 1;
            System.out.println("Numero : " + nu);
        }
    }

    public static void getInfo() {
        System.out.println("------------------");
        System.out.println("Par : " + par);
        System.out.println("Impar : " + impar);
    }

    public static int getRandom() {
        int x = (int) (Math.random() * (1 + 90000) + 10000);
        System.out.println("Valor para descomponer : " + x);
        return x;
    }

    public static void main(String[] args) {
//        int teclado = getTeclado();
//        getContarCifras(getRandom());
//        getInfo();

        getContarCifrasWhile(getRandom());
        getInfo();
    }
}
