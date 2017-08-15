/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim8conSwitch {

    private static final Scanner SC = new Scanner(System.in);
    private static int numPalillos; // variable para elegir el monton 
    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

    private static int montonElegido;

    private static boolean cierre1;
    private static boolean cierre2;
    private static boolean cierre3;

    private static boolean parar;
    private static boolean tienePalillos;

    /**
     * Coger palillos del monton
     *
     * @return palillo
     */
    public static int getPalillos() {
        System.out.println("• ¿ Cuantos palillos quieres retirar ? • ");
        System.out.println("• Coge palillos entre 1 y 2 • ");
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
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ◘ ");
                montonElegido = SC.nextInt();
            }

            if (montonElegido == 1) {
                numPalillos = monton1palillos;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ◘ ");
            }
            if (montonElegido == 2) {
                numPalillos = monton2palillos;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ◘ ");
            }
            if (montonElegido == 3) {
                numPalillos = monton3palillos;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numPalillos + " palillos ◘ ");
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

    public static boolean comprobarMonton(int montElegido) {
        int contador = 0;
        System.out.println("Numero del Monton elegido : " + montElegido);

        while (contador < 3 && parar == false) {

            if (contador == 0 && montElegido == 1) {
                cierre1 = false;
            }

            if (contador == 0 && montElegido == 2) {
                cierre2 = false;
            }

            if (contador == 0 && montElegido == 3) {
                cierre3 = false;
            }

            switch (montElegido) {
                case 1:
                    if (cierre1 == false) {
                        if (monton1palillos > 1) {
                            montonElegido = 1;
                            numPalillos = monton1palillos;
                            tienePalillos = true;
                            parar = true;
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos : " + monton1palillos + "");
                            montonElegido = 1;
                            numPalillos = 0;
                            tienePalillos = false;
                            cierre1 = true;
                            contador++;
                        }
                    }
                    break;
                case 2:
                    if (cierre2 == false) {
                        if (monton2palillos > 1) {
                            montonElegido = 2;
                            numPalillos = monton2palillos;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos : " + monton2palillos + "");
                            montonElegido = 2;
                            numPalillos = 0;
                            tienePalillos = false;
                            cierre2 = true;
                            contador++;
                        }
                    }
                    break;
                case 3:
                    if (cierre3 == false) {
                        if (monton3palillos > 1) {
                            montonElegido = 3;
                            numPalillos = monton3palillos;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos : " + monton3palillos + "");
                            montonElegido = 3;
                            numPalillos = 0;
                            tienePalillos = false;
                            cierre3 = true;
                            contador++;
                        }
                    }
                    break;
                default:
                    System.out.println("!! No existe ese monton de palillos !! ");
                    break;
            }

            if (tienePalillos == false) {
                System.out.println("♦ Elige otro monton ♦");
                montElegido = SC.nextInt();
                montonElegido = montElegido;
                while (montElegido < 0 || montElegido > 3) {
                    System.out.println("♦♦ Por favor : Elige un monton entre 1 , 2 , 3 : ♦♦");
                    montElegido = SC.nextInt();
                    montonElegido = montElegido;
                }
            }
        }

        return tienePalillos;
    }

    public static boolean elegirPalillos(int turno) {
        getPalillos();
        return false;
    }

    public static void main(String[] args) {
//        getPalillos();
//        crearMontones();
        boolean x = comprobarMonton(elegirMonton(2));
//        System.out.println("----------------------");
        System.out.println("Devuelve : " + x);
        System.out.println("montonElegido : " + montonElegido);
        System.out.println("numPalillos : " + numPalillos);
        System.out.println("----------------------");

//        elegirPalillos(2);
//        System.out.println("Monton seleccionado : " + comprobarMonton());
    }

}
