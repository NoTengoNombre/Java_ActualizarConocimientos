/**
 * @created on : 12-ago-2017, 9:58:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_prueba_juegoMemoria;

import java.util.Scanner;

public class T3__41JuegoDeMemoria7ConArrayConvertido {

//    private static final int NUM = 123456789;
    private static final Scanner SC = new Scanner(System.in);
    private static int num;
    private static int nivel;
    private static int gradoDificultad;
    private static final int[] ARRAY = new int[10];
    private static int contador = 0;

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
            System.out.println("• Por favor : Elija un nivel de dificultad entre 1 y 5 : ");
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

    public static void generarArray() throws InterruptedException {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            ARRAY[contador] = (int) (Math.random() * (1 + 2) + 1);
//            System.out.print(ARRAY[contador]);
        }
        total = ARRAY[contador];
        System.out.println("total : " + total);
    }

    public static void comenzarJuego() throws InterruptedException {
        nivelDificultad();

        for (int i = 100000000; (i > 0); i /= 10) {
            System.out.println("✮ Introduce la secuencia de numeros ✮ ");
            System.out.print(ARRAY[contador] / i);
            Thread.sleep(gradoDificultad);
            System.out.print("\b\b");
            num = SC.nextInt();
            if (ARRAY[contador] / i == num) {
                System.out.println(ARRAY[contador] / i);
            } else {
                System.out.println("✖✖ Has introducido un valor incorrecto en la secuencia ✖✖");
                System.out.println("✖✖ Fin del juego ✖✖");
                i = 0;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

//        comenzarJuego();
        generarArray();
    }
}
