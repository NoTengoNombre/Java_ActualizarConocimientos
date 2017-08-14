/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim7ArreglarComprobarMonton2 {

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

    /**
     * Coger palillos del monton
     *
     * @return palillo
     */
    public static int getPalillos() {
        System.out.println("• Coge palillos de entre 1 a 2 ");
        int palillo = SC.nextInt();
        while (palillo <= 0 || palillo > 2) {
            System.out.println("• Por favor : Coge los palillos de entre 1 a 2 ");
            palillo = SC.nextInt();
        }
        System.out.println("• La cantidad de palillos son : " + palillo);
        return palillo;
    }

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
     * Elijo un monton del cual quiero coger palillos.
     *
     * monton - atributo con la cantidad de palillos
     *
     * Que tiene uno de los monton 1 , monton 2 , monton 3 ,
     *
     */
    private static int elegirMonton(int turno) {
        System.out.println("\t \t Turno Actual : " + turno);
        if (turno == 1) {
            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");
            montonElegido = SC.nextInt();

            while (montonElegido <= 0 || montonElegido > 3) {
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ");
                montonElegido = SC.nextInt();
            }

            if (montonElegido == 1) {
                numPalillos = monton1palillos;
                System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ");
            }
            if (montonElegido == 2) {
                numPalillos = monton2palillos;
                System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ");
            }
            if (montonElegido == 3) {
                numPalillos = monton3palillos;
                System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ");
            }
        }
        if (turno == 2) {

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");
            montonElegido = (int) (Math.random() * (1 + 2) + 1);

            if (montonElegido == 1) {
                numPalillos = monton1palillos;
                System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numPalillos + " palillos ♨");
            }
            if (montonElegido == 2) {
                numPalillos = monton2palillos;
                System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numPalillos + " palillos ♨");
            }
            if (montonElegido == 3) {
                numPalillos = monton3palillos;
                System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numPalillos + " palillos ♨");
            }
        }
        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     *
     * @param montElegido
     * @return
     */
    public static boolean comprobarMonton(int montElegido) {

        boolean salir = true;
        int contador = 0;

//        System.out.println(" numPalillos : " + numPalillos);
        montonElegido = montElegido;

        System.out.println(" numPalillos : " + numPalillos);

        while (contador <= 3) {
            System.out.println("Introduce otro monton : " );

            if (montonElegido == 1 && salir != false) {
                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montonElegido + " tiene " + numPalillos + " palillos ");
                    tienePalillos = true;
                } else {
                    System.out.println("♠ Error: El monton " + montonElegido + " : Tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    salir = false;
                    contador++;
                }
            }
            if (montonElegido == 1 && salir != false) {
                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montonElegido + " tiene " + numPalillos + " palillos ");
                    tienePalillos = true;
                } else {
                    System.out.println("♠ Error: El monton " + montonElegido + " : Tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    salir = false;
                    contador++;
                }
            }
            if (montonElegido == 1 && salir != false) {
                if (numPalillos >= 1) {
                    System.out.println("♠ El monton " + montonElegido + " tiene " + numPalillos + " palillos ");
                    tienePalillos = true;
                } else {
                    System.out.println("♠ Error: El monton " + montonElegido + " : Tiene " + numPalillos + " palillos ");
                    tienePalillos = false;
                    salir = false;
                    contador++;
                }
            }
        }
        return tienePalillos;
    }

    public static void main(String[] args) {
//        getPalillos();
//        crearMontones();
        boolean x = comprobarMonton(elegirMonton(1));
        System.out.println("----------------------");
        System.out.println("devuelve : " + x);
        System.out.println("montonElegido : " + montonElegido);
        System.out.println("numPalillos : " + numPalillos);
        System.out.println("----------------------");

//        elegirPalillos(2);
//        System.out.println("Monton seleccionado : " + comprobarMonton());
    }

}
