/**
 * @created on : 11-ago-2017, 9:06:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_prueba_juegoMemoria;

import java.util.Scanner;

public class T3__41JuegoDeMemoria1 {

    public static int nivelDificultad;
    public static long longitudNumeros;
    public static long numeroADescomponer;
    public static int[] numeros = new int[10];
    public static Scanner sc = new Scanner(System.in);
    public static int numero;
    private static int contador = 1;
    private static int f;

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

    public static void setSecuenciaTroceadaIf() throws InterruptedException {
        setSecuencia();
        while (contador <= 10) {
            if (f == 0) {
                System.out.println(f);
                System.out.print(" 1 : " + numeros[f]);
                Thread.sleep(1000);
                System.out.print("\b\b\b\b\b");
                System.out.println("Introduce un numero : ");
                int numero1 = getNumero();
                if (numero1 == numeros[f]) {
                    System.out.println("Acierto");
                    contador++;
                } else {
                    System.out.println("No Acierto");
                }
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
