/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_nim_pruebas;

import java.util.Scanner;

public class JavaNimPruebasSwitch1doWhile {

    private static final Scanner SC = new Scanner(System.in);
    private static int numPalillos; // variable para elegir el monton 
    private static int montonElegido;
    private static boolean tienePalillos;

    private static boolean cierre1;
    private static boolean cierre2;
    private static boolean cierre3;

    private static boolean parar;

    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

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
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
    }

    /**
     *
     * @param montElegido
     * @return
     */
    public static boolean comprobarMonton(int montElegido) {
        int contador = 0;
        System.out.println("Numero del Monton elegido : " + montElegido);

        do {

            switch (montElegido) {
                case 1:
//                    System.out.println("contador 1 : " + contador);
                    if (cierre1 == false) {
                        if (monton1palillos > 0) {
                            montonElegido = 1;
                            numPalillos = monton1palillos;
                            tienePalillos = true;
                            parar = true;
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos");
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
                        if (monton2palillos > 0) {
                            montonElegido = 2;
                            numPalillos = monton2palillos;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos");
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
                        if (monton3palillos > 0) {
                            montonElegido = 3;
                            numPalillos = monton3palillos;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("Error : ese monton no tiene tantos palillos");
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
                System.out.println("Elige otro monton : ");
                System.out.println("Fin de la vuelta " + contador);
                montElegido = SC.nextInt();
            }
        } while (contador <= 2 && parar == false);

        return tienePalillos;
    }

    public static void main(String[] args) {
//        getPalillos();
//        crearMontones();
//        boolean x = comprobarMonton(elegirMonton(1));

        boolean x = comprobarMonton(3);

        System.out.println("----------------------");
        System.out.println("Devuelve : " + x);
        System.out.println("MontonElegido : " + montonElegido);
        System.out.println("NumPalillos : " + numPalillos);
        System.out.println("----------------------");

    }

}
