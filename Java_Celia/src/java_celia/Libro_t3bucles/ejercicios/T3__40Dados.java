/**
 * @created on : 08-ago-2017, 16:47:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__40Dados {

    private static int fijarDinero;
    private static int dineroApostado;
    private static int dado1;
    private static int dado2;
    private static int dado3;

    public static void setDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad de dinero : ");
        fijarDinero = sc.nextInt();
        while (fijarDinero < 1 || fijarDinero > 100) {
            System.out.println("Error : " + fijarDinero + " : Introduce una cantidad de dinero : ");
            fijarDinero = sc.nextInt();
        }
    }

    public static void setApuesta(int apuesta) {
        if (apuesta <= dineroApostado) {
            System.out.println("Apuesta realizada ");
        } else {
            System.out.println("Apuesta NO realizada ");
        }
    }

    public static void setTirada() {
        for (int i = 0; i < 10; i++) {
//            dado1 = (int) (Math.random() * (1 + 5) + 1);
            dado1 = (int) (Math.random() * (1 + 2) + 1);
            dado2 = (int) (Math.random() * (1 + 2) + 1);
            dado3 = (int) (Math.random() * (1 + 2) + 1);
        }
    }

    public static void getResultado() {
//        System.out.println("Dado 1 : " + dado1);
//        System.out.println("Dado 2 : " + dado2);
//        System.out.println("Dado 3 : " + dado3);

        dado1 = 2;
        dado2 = 2;
        dado3 = 4;

        if ((dado1 + dado2 + dado3) == 18) {
            System.out.println("!!! Premio x 6 - Aciertos : " + dado1 + " - " + dado2 + " - " + dado3);
        }

        for (int i = 1; i <= 5; i++) {
            if (((dado1 == i) && (dado2 == i) && (dado3 == i))) {
                System.out.println("!!! Premio x 3 - Aciertos : " + dado1 + " - " + dado2 + " - " + dado3);
            }
        }

        for (int i = 1; i <= 6; i++) {
            if ((dado1 == i && dado2 == i)) {
                System.out.println("Premio x 2 Aciertos - A : " + dado1 + " - " + dado2);
            }
            if ((dado2 == i && dado3 == i)) {
                System.out.println("Premio x 2 Aciertos - B : " + dado2 + " - " + dado3);
            }
            if ((dado3 == i && dado1 == i)) {
                System.out.println("Premio x 2 Aciertos - C : " + dado1 + " - " + dado3);
            }
        }
    }

    public static void main(String[] args) {

//        setDinero();
//        setTirada();
        getResultado();

    }
}
