/**
 * @created on : 11-ago-2017, 9:06:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_prueba_juegoMemoria;

import java.util.Scanner;

public class T3__41JuegoDeMemoria3doWhile {

    public static int nivelDificultad;
    public static long longitudNumeros;
    public static long numeroADescomponer;
    public static int[] numeros = new int[11];
    public static Scanner sc = new Scanner(System.in);
    public static int numero;
    public static int secuencia;
    private static int contador = 10;

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
        for (int f = 0; f < 11; f++) {
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
        do {
            secuencia++;
            if (contador <= 10) {
                System.out.println("Secuencia : " + secuencia);
//                System.out.println("Indice " + contador + " : " + numeros[contador]);
                System.out.print("Numero a Adivinar : " + numeros[contador]);
                Thread.sleep(3000);
                System.out.print("\b\b\b\b\b");
                int respuesta = getNumero();

                if (secuencia == 11) {
                    System.out.println("Felicidades has ganado la partida");
                    contador = 11;
                } else if (respuesta == numeros[contador]) {
                    System.out.println("-----------------------");
                    System.out.println("Acierto : " + contador);
                    System.out.println("-----------------------");
                    contador--;
                    setSecuenciaTroceadaIf();

                } else {
                    System.out.println("-----------------------");
                    System.out.println("No Acierto");
                    System.out.println("-----------------------");
                    contador = 11;
                }
            }
        } while (contador <= 10);

    }

    public static void main(String[] args) throws InterruptedException {
        setSecuenciaTroceadaIf();
//        getNumero();
    }
}
