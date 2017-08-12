/**
 * @created on : 12-ago-2017, 9:58:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;

public class T3__41JuegoDeMemoriaFinal {

    private static final Scanner SC = new Scanner(System.in);
    private static long Secuencia;
    private static int num;
    private static int nivel;
    private static int gradoDificultad;
    private static final int[] ARRAY = new int[9];
    private static int rondas = 0;

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
                gradoDificultad = 700;
                break;
            case 5:
                gradoDificultad = 500;
                break;
            default:
                System.out.println("✖✖ Error al elegir el nivel de dificultad ✖✖");
                break;
        }
    }

    public static int getTeclado() {
        rondas++;
        System.out.println("✮ Ronda : " + rondas + " - Introduce la secuencia de numeros ✮ ");
        num = SC.nextInt();
        return num;
    }

    public static void generarArray() throws InterruptedException {
        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = (int) (Math.random() * (1 + 2) + 1);
        }

        String strOfInts = Arrays.toString(ARRAY).replaceAll("\\[|\\]|,|\\s", "");
        Secuencia = Long.parseLong(strOfInts);
    }

    public static void rondasAlcanzadas() {
        if (nivel < 4) {
            System.out.println(" ♥ Felicidades : Para obtener tu Ranking debes poner el nivel de dificultad a 4 o mayor ♥ ");
            System.out.println(" ♥ Intentalo de nuevo ♥ ");
        } else {
            switch (rondas) {
                case 1:
                    System.out.println(" • Intentalo otra vez , No estas atento !!! ");
                    break;
                case 2:
                    System.out.println(" ○ No esta mal ○ ");
                    break;
                case 3:
                    System.out.println(" ◘ Sigue mejorando ◘");
                    break;
                case 4:
                    System.out.println(" ♦ Bien , continua practicando ♦ ");
                    break;
                case 5:
                    System.out.println(" ◎ Muy bien : Nivel Medio ◎ ");
                    break;
                case 6:
                    System.out.println(" ◭ Genial : Nivel chico/a atento/a ◭ ");
                    break;
                case 7:
                    System.out.println(" ◩ Diploma : Nivel lince ◩ ");
                    break;
                case 8:
                    System.out.println(" ◓ Medalla de Cobre : Nivel inteligente ◓ ");
                    break;
                case 9:
                    System.out.println(" ☺ Medalla de Plata : Nivel Superdotado ☺ ");
                    break;
                case 10:
                    System.out.println(" ☻ Medalla de Oro : Nivel Genio ☻ ");
                    break;
            }
        }
    }

    public static void comenzarJuego() throws InterruptedException, AWTException {
        nivelDificultad();
        generarArray();

        for (int i = 100000000; (i > 0); i /= 10) {
            System.out.println("✮ Comienza el Juego  ✮ ");
            System.out.print(Secuencia / i);
            Thread.sleep(gradoDificultad);
            System.out.print("\b\b");
            num = getTeclado();
            if (Secuencia / i == num) {
                Robot pressbot = new Robot();
                pressbot.keyPress(17); // Holds CTRL key.
                pressbot.keyPress(76); // Holds L key.
                pressbot.keyRelease(17); // Releases CTRL key.
                pressbot.keyRelease(76); // Releases L key.
            } else {
                System.out.println("✖✖ Has introducido un valor incorrecto en la secuencia ✖✖");
                System.out.println("✖✖ Fin del juego ✖✖");
                i = 0;
            }
        }
        System.out.println(" ♥ Rondas Alcanzadas " + rondas + " ♥ ");
    }

    public static void main(String[] args) throws InterruptedException, AWTException {

        comenzarJuego();
        rondasAlcanzadas();
    }
}
