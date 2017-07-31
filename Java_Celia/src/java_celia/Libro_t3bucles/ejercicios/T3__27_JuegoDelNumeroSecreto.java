/**
 * @created on : 31-jul-2017, 17:24:19
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__27_JuegoDelNumeroSecreto {

//    private static Scanner sc = new Scanner(System.in);
    private static int numeroTeclado;
//    private static int numeroTeclado;
    private static int numeroAlAzar;
    private static int contador;

    public static void setNumeroAlzar() {
        numeroAlAzar = (int) (Math.random() * (1 + 5) + 1);
        System.out.println("Numero al azar : " + numeroAlAzar);
    }

    public static void getComprobar() {
        System.out.println("♦ Introduce un valor por teclado: ");
        Scanner sc = new Scanner(System.in);
        do {
            numeroTeclado = sc.nextInt();
            if (numeroTeclado == numeroAlAzar) {
                System.out.println("Has acertado");
                contador++;
            }
            if (numeroTeclado < numeroAlAzar) {
                System.out.println("Has Fallado");
                System.out.println("El Numero : " + numeroTeclado + " es menor al numero secreto");
                contador++;
            }
            if (numeroTeclado > numeroAlAzar) {
                System.out.println("Has Fallado");
                System.out.println("El Numero " + numeroTeclado + " es mayor al numero secreto");
                contador++;
            }
        } while (numeroTeclado != numeroAlAzar);
    }

    public static void setMensaje() {
        if (contador == 1) {
            System.out.println("☻ Numero acertado a la 1º - Medalla de oro");
            System.out.println("☻ Numero de veces intentando : " + contador);
        }
        if (contador == 2) {
            System.out.println("♦ Genial ! medalla de plata");
            System.out.println("♦ Numero de veces intentando : " + contador);
        }
        if (contador == 3) {
            System.out.println("♣ Bien ! medalla de cobre");
            System.out.println("♣ Numero de veces intentando : " + contador);
        }
        if (contador == 4) {
            System.out.println("♠ Lo has Conseguido ! diploma de participación !");
            System.out.println("♠ Numero de veces intentando : " + contador);
        }
        if (contador >= 5) {
            System.out.println("◘ Demasiados intentos ! sigue practicando");
            System.out.println("◘ Numero de veces intentando : " + contador);
        }

    }

    public static void main(String[] args) {
        setNumeroAlzar();
        getComprobar();
        setMensaje();

//        System.out.println("Numero : " + numero1);
//        System.out.println("Numero : " + numeroAlzar);
//        int comprobar = getComprobar(1);
//        getComprobar();
//        System.out.println("Valor introducido : " + comprobar);
//        System.out.println("Contador : " + contador);
    }
}
