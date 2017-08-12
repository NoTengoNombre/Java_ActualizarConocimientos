/**
 * @created on : 11-ago-2017, 9:06:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_prueba_juegoMemoria;

import java.util.Scanner;

public class T3__41JuegoDeMemoria {

    public static int nivelDificultad;
    public static long longitudNumeros;
    public static long numeroADescomponer;
    public static int[] numeros = new int[10];
    public static Scanner sc = new Scanner(System.in);
    public static int numero;
    private static int contador = 1;

    public static void getNivelDificultad(int nivel) {
        if (nivelDificultad == 1) {
            System.out.println("Nivel Facil");
        }
        if (nivelDificultad == 2) {
            System.out.println("Nivel Medio");
        }
        if (nivelDificultad == 3) {
            System.out.println("Nivel Dificil");
        }
    }

    public static long setGenerarNumero() {
        longitudNumeros = (long) (Math.random() * (1 + 2) + 1);
        return longitudNumeros;
    }

    public static void setSecuencia() {
        for (int f = 0; f < 10; f++) {
            numeros[f] = (int) setGenerarNumero();
        }
    }

    public static int getNumero() {
        System.out.println("Introduce un numero entre 1 y 3 ");
        int num = sc.nextInt();
        while (num < 1 || num > 3) {
            System.out.println("Error : Introduce un numero entre 1 y 3 ");
            num = sc.nextInt();
        }
        return num;
    }

    public static void setSecuenciaTroceada() throws InterruptedException {
        setSecuencia();
        for (int f = 0; f < 10; f++) {
//            getNumero();
            switch (f) {
                case 0:
                    System.out.println(f);
                    System.out.print(" 1 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 1:
                    System.out.println(f);
                    System.out.print(" 2 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 2:
                    System.out.println(f);
                    System.out.print(" 3 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 3:
                    System.out.println(f);
                    System.out.print(" 4 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 4:
                    System.out.println(f);
                    System.out.print(" 5 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 5:
                    System.out.println(f);
                    System.out.print(" 6 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 6:
                    System.out.println(f);
                    System.out.print(" 7 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 7:
                    System.out.println(f);
                    System.out.print(" 8 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 8:
                    System.out.println(f);
                    System.out.print(" 9 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 9:
                    System.out.println(f);
                    System.out.print(" 10 : " + numeros[f]);
                    Thread.sleep(1000);
                    System.out.print("\b\b\b\b\b");
                    break;
                case 10:
                    System.out.print("\nFIN\n");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static void setSecuenciaTroceadaIf() throws InterruptedException {
        setSecuencia();
        for (int f = 0; f < 1; f++) {
//            getNumero();
            if (f == 0) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 1) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 2) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 3) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 4) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 5) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 6) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 7) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 8) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 9) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
            if (f == 10) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        setSecuenciaTroceadaIf();
//        getNumero();
    }
}
