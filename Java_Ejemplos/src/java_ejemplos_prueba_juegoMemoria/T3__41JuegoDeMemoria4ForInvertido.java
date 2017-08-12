/**
 * @created on : 12-ago-2017, 9:58:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_prueba_juegoMemoria;

import java.util.Scanner;

public class T3__41JuegoDeMemoria4ForInvertido {

    private static final int NUM = 123456789;
    private static final Scanner SC = new Scanner(System.in);
    private static int num;
    private static int nivel;
    private static int gradoDificultad;

    public static void nivelDificultad() {
        System.out.println("• Niveles de Dificultad : ");
        System.out.println("• nivel : 1 = Facil ");
        System.out.println("• nivel : 2 = Medio ");
        System.out.println("• nivel : 3 = Alto ");
        System.out.println("• nivel : 4 = Dificil ");
        System.out.println("• nivel : 5 = Ultra Dificil ");
        System.out.println("• Elige un nivel de dificultad : ");
        nivel = SC.nextInt();
        while (nivel < 1 || nivel > 5) {
            System.out.println("• Por favor : Elija un nivel de dificultad entre 1 y 4 : ");
            nivel = SC.nextInt();
        }
        System.out.println("• Nivel elegido : " + nivel + " ");
        switch (nivel) {
            case 1:
                gradoDificultad = 3000;
                break;
            case 2:
                gradoDificultad = 2000;
                break;
            case 3:
                gradoDificultad = 1000;
                break;
            case 4:
                gradoDificultad = 500;
                break;
            case 5:
                gradoDificultad = 200;
                break;
            default:
                System.out.println("✖✖ Error al elegir el nivel de dificultad ✖✖");
                break;
        }
    }

    public static void comenzarJuego() throws InterruptedException {
        nivelDificultad();
        for (int i = 100000000; (i > 0); i /= 10) {
            System.out.println("✮ Intro un numero ✮ ");
            System.out.print(NUM / i);
            Thread.sleep(gradoDificultad);
            System.out.print("\b\b\b\b\b");
            num = SC.nextInt();
            if (NUM / i == num) {
                System.out.println(NUM / i);
            } else {
                System.out.println("✖✖ Lo siento : Has introducido un valor incorrecto en la secuencia ✖✖");
                i = 0;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        comenzarJuego();
    }
}
