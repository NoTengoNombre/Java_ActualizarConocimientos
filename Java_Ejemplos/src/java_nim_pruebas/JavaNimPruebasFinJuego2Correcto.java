/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_nim_pruebas;

import java.util.Scanner;

public class JavaNimPruebasFinJuego2Correcto {

    private static final Scanner SC = new Scanner(System.in);

    private static int numPalillos; // variable para elegir el monton 
    private static int montonElegido;

    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

    private static int monton1 = 1;
    private static int monton2 = 2;
    private static int monton3 = 3;

    public static void crearMontones() {

        monton1palillos = (int) (Math.random() * (1 + 1));
        monton2palillos = (int) (Math.random() * (1 + 1));
        monton3palillos = (int) (Math.random() * (1 + 1));

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + monton1palillos + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + monton2palillos + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + monton3palillos + " palillos ♦ ");
    }

    public static void comprobarFinJuego(int turno) {

        if (turno <= 2) {
            if (monton1palillos == 1 && (monton2palillos == 0 && monton3palillos == 0)) {
                System.out.println("○ monton1 : " + monton1 + " - monton1palillos : " + monton1palillos);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (monton1palillos == 0 && (monton2palillos >= 0 || monton3palillos >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (monton2palillos == 1 && (monton1palillos == 0 && monton3palillos == 0)) {
                System.out.println("○ monton2 : " + monton2 + " - monton2palillos : " + monton2palillos);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (monton2palillos == 0 && (monton1palillos >= 0 || monton3palillos >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (monton3palillos == 1 && (monton1palillos == 0 && monton2palillos == 0)) {
                System.out.println("○ monton3 : " + monton3 + " - monton3palillos : " + monton3palillos);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (monton3palillos == 0 && (monton1palillos >= 0 || monton2palillos >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

        }
    }

    public static void main(String[] args) {
        crearMontones();

        System.out.println("----------------------");
        System.out.println("MontonElegido : " + montonElegido);
        System.out.println("NumPalillos : " + numPalillos);
        System.out.println("----------------------");

        comprobarFinJuego((int) (Math.random() * (1 + 1) + 1));

    }

}
