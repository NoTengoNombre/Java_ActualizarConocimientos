/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim9xArreglarTodo1 {

    private static final Scanner SC = new Scanner(System.in);
    private static int numeroPalillos; // variable para elegir el monton 
    private static int montonPalillos1;
    private static int montonPalillos2;
    private static int montonPalillos3;

    private static int montonElegido;

    private static boolean cierre1;
    private static boolean cierre2;
    private static boolean cierre3;

    private static boolean parar;
    private static boolean tienePalillos;
    private static int turnoOrdenador;

    /**
     * Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     *
     */
    public static void crearMontones() {
        montonPalillos1 = (int) (Math.random() * (1 + 4) + 2);
        montonPalillos2 = (int) (Math.random() * (1 + 4) + 2);
        montonPalillos3 = (int) (Math.random() * (1 + 4) + 2);

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + montonPalillos1 + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + montonPalillos2 + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + montonPalillos3 + " palillos ♦ ");
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
                numeroPalillos = montonPalillos1;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 2) {
                numeroPalillos = montonPalillos2;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 3) {
                numeroPalillos = montonPalillos3;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
        }

        if (turno == 2) {

            turnoOrdenador = 2;

            boolean cierreOrdenador1 = false;
            boolean cierreOrdenador2 = false;
            boolean cierreOrdenador3 = false;

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");

            int contador = 1;

            do {

                montonElegido = (int) (Math.random() * (1 + 2) + 1);

                if (montonElegido == 1 && cierreOrdenador1 == false) {
                    if (montonPalillos1 > 1) {
                        System.out.println("♨ Monton Palillos 1 : " + montonPalillos1);
                        numeroPalillos = montonPalillos1;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 1 : " + numeroPalillos);
                    }
                    cierreOrdenador1 = true;
                    contador++;
                }

                if (montonElegido == 2 && cierreOrdenador2 == false) {
                    if (montonPalillos2 > 1) {
                        System.out.println("♨ Monton Palillos 2 : " + montonPalillos2);
                        numeroPalillos = montonPalillos2;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 2 : " + numeroPalillos);
                    }
                    cierreOrdenador2 = true;
                    contador++;
                }

                if (montonElegido == 3 && cierreOrdenador3 == false) {
                    if (montonPalillos3 > 1) {
                        System.out.println("♨ Monton Palillos 3 : " + montonPalillos3);
                        numeroPalillos = montonPalillos3;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 3 : " + numeroPalillos);
                    }
                    cierreOrdenador3 = true;
                    contador++;
                }

            } while (numeroPalillos <= 1 && contador <= 3);
        }
        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
    }

    public static boolean comprobarMonton(int montElegido) {
        int contador = 0;

        System.out.println("♥ Numero del monton elegido : " + montElegido);

        if (turnoOrdenador == 2) {
            parar = true;
        }

        while (contador < 3 && parar == false) {

            switch (montElegido) {
                case 1:
                    if (cierre1 == false) {
                        if (montonPalillos1 > 1) {
                            montonElegido = 1;
                            numeroPalillos = montonPalillos1;
                            tienePalillos = true;
                            parar = true;
                        } else {
                            System.out.println("♥ Error : ese monton no tiene tantos palillos : " + montonPalillos1 + "");
                            montonElegido = 1;
                            numeroPalillos = 0;
                            tienePalillos = false;
                            cierre1 = true;
                            contador++;
                        }
                    }
                    break;
                case 2:
                    if (cierre2 == false) {
                        if (montonPalillos2 > 1) {
                            montonElegido = 2;
                            numeroPalillos = montonPalillos2;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("♥ Error : ese monton no tiene tantos palillos : " + montonPalillos2 + "");
                            montonElegido = 2;
                            numeroPalillos = 0;
                            tienePalillos = false;
                            cierre2 = true;
                            contador++;
                        }
                    }
                    break;
                case 3:
                    if (cierre3 == false) {
                        if (montonPalillos3 > 1) {
                            montonElegido = 3;
                            numeroPalillos = montonPalillos3;
                            tienePalillos = true;
                            parar = true; // para el while porque devuelve palillos
                        } else {
                            System.out.println("♥ Error : ese monton no tiene tantos palillos : " + montonPalillos3 + "");
                            montonElegido = 3;
                            numeroPalillos = 0;
                            tienePalillos = false;
                            cierre3 = true;
                            contador++;
                        }
                    }
                    break;
                default:
                    System.out.println("!! ♥ No existe ese monton de palillos ♥ !! ");
                    break;
            }

            if (tienePalillos == false && contador < 3) {
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

    public static void main(String[] args) {
        crearMontones();
        elegirMonton(2);
//        boolean valor = comprobarMonton(elegirMonton(1));

//        System.out.println("El valor es : " + valor);
        System.out.println("----------------------");
        System.out.println("Monton Elegido : " + montonElegido);
        System.out.println("Numero de Palillos : " + numeroPalillos);
        System.out.println("----------------------");

    }

}
