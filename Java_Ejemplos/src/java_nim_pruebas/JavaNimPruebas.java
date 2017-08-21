/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_nim_pruebas;

import java.util.Scanner;

public class JavaNimPruebas {

    private static final Scanner SC = new Scanner(System.in);
    private static int numPalillos; // variable para elegir el monton 

    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

    private static int montonElegido;

//    private static boolean comprobadorDeMonton1 = true;
//    private static boolean comprobadorDeMonton2 = true;
//    private static boolean comprobadorDeMonton3 = true;
    private static boolean tienePalillos;
    private static int contador; // para salir del bucle

    private static boolean salir; // para salir del bucle
    private static boolean salir1monton = true; // para salir del bucle
    private static boolean salir2monton = true; // para salir del bucle
    private static boolean salir3monton = true; // para salir del bucle

    /**
     * Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     *
     */
    public static void crearMontones() {
        monton1palillos = (int) (Math.random() * (1 + 4) + 2);
        monton2palillos = (int) (Math.random() * (1 + 4) + 2);
        monton3palillos = (int) (Math.random() * (1 + 4) + 2);

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + monton1palillos + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + monton2palillos + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + monton3palillos + " palillos ♦ ");
    }

    /**
     *
     * @param montElegido
     * @return
     */
    public static boolean comprobarMonton(int montElegido) {

        System.out.println("Monton de palillos : " + montElegido);

        while (contador < 3 && salir == false) {

            if (montElegido == 1 && salir1monton != false) {

                salir1monton = false;

                System.out.println("Monton A " + montElegido);

                numPalillos = monton1palillos;

                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montElegido + " tiene " + numPalillos + " palillos ");
                    montonElegido = montElegido;
                    tienePalillos = true;
                    salir = true;
                } else {
                    System.out.println("♠ Error: El monton " + montElegido + " : tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    contador++;
                }
            }

            if (montElegido == 2 && salir2monton != false) {

                salir2monton = false;

                System.out.println("Monton B " + montElegido);

                numPalillos = monton2palillos;

                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montElegido + " tiene " + numPalillos + " palillos ");
                    montonElegido = montElegido;
                    tienePalillos = true;
                    salir = true;
                } else {
                    System.out.println("♠ Error: El monton " + montElegido + " : tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    contador++;
                }
            }

            if (montElegido == 3 && salir3monton != false) {

                salir3monton = false;

                System.out.println("Monton C " + montElegido);

                numPalillos = monton3palillos;

                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montElegido + " tiene " + numPalillos + " palillos ");
                    montonElegido = montElegido;
                    tienePalillos = true;
                    salir = true;
                } else {
                    System.out.println("♠ Error: El monton " + montElegido + " : tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    contador++;
                }
            }

            if (tienePalillos == false) {
                System.out.println("Elige otro monton con palillos : ");
                montElegido = SC.nextInt();
                montonElegido = montElegido;
            }

            if (contador == 2) {
                salir = true;
            }

        }
        return tienePalillos;
    }

    public static void main(String[] args) {
//        getPalillos();
//        crearMontones();
//        boolean x = comprobarMonton(elegirMonton(1));

        boolean x = comprobarMonton(1);

        System.out.println("----------------------");
        System.out.println("Devuelve : " + x);
        System.out.println("MontonElegido : " + montonElegido);
        System.out.println("NumPalillos : " + numPalillos);
        System.out.println("----------------------");

    }

}
