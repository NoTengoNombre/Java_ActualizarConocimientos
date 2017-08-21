/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_juegos_palillos_nim;

import java.util.Scanner;

public class T3__44_Juego_Nim9xElegirPalillos {

    private static final Scanner SC = new Scanner(System.in);
    private static int numeroPalillos; // variable para elegir el monton 

    private static int palillos1;
    private static int palillos2;
    private static int palillos3;

    private static int montonElegido;

    private static boolean cierre1;
    private static boolean cierre2;
    private static boolean cierre3;

    private static boolean parar;
    private static boolean tienePalillos;

    private static int turno;
    private static int palillos;
    private static boolean correcto;

    /**
     * Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     */
    public static void crearMontones() {
        palillos1 = (int) (Math.random() * (1 + 4) + 2);
        palillos2 = (int) (Math.random() * (1 + 4) + 2);
        palillos3 = (int) (Math.random() * (1 + 4) + 2);

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + palillos1 + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + palillos2 + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + palillos3 + " palillos ♦ ");
    }

    /**
     * Coge palillos entre 1 y 2
     *
     * @param turno
     * @return
     */
    public static int numeroPalillosRetirar(int turno) {
        if (turno == 1) {
            System.out.println("• ¿ Cuantos palillos quieres retirar ? • ");
            System.out.println("• Coge palillos entre 1 y 2 • ");
            palillos = SC.nextInt();
            while (palillos <= 0 || palillos > 2) {
                System.out.println("• Por favor : Coge los palillos de entre 1 a 2 ");
                palillos = SC.nextInt();
            }
            System.out.println("• La cantidad de palillos son : " + palillos);
            return palillos;
        }
        if (turno == 2) {
            palillos = (int) (Math.random() * (1 + 1) + 1);
            System.out.println("• Palillos cogidos por el Ordenador : " + palillos);
        }
        return palillos;
    }

    /**
     * Elijo un monton del cual quiero coger palillos.
     *
     * monton - atributo con la cantidad de palillos
     *
     * Que tiene uno de los monton 1 , monton 2 , monton 3 ,
     *
     */
    private static int elegirMonton(int turnoParametro) {

        System.out.println("\t \t Turno Actual : " + turnoParametro);

        if (turnoParametro == 1) {

            turno = turnoParametro;

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");
            montonElegido = SC.nextInt();

            while (montonElegido <= 0 || montonElegido > 3) { // Con esto me ahorro poner los 3 tipos distintos de montones
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ◘ ");
                montonElegido = SC.nextInt();
            }
            if (montonElegido == 1) {
                numeroPalillos = palillos1;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 2) {
                numeroPalillos = palillos2;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 3) {
                numeroPalillos = palillos3;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
        }

        if (turnoParametro == 2) {

            turno = turnoParametro;

            boolean cierreOrdenador1 = false;
            boolean cierreOrdenador2 = false;
            boolean cierreOrdenador3 = false;

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");

            int contador = 1;

            do {

                montonElegido = (int) (Math.random() * (1 + 2) + 1);

                if (montonElegido == 1 && cierreOrdenador1 == false) {
                    if (palillos1 > 1) {
                        System.out.println("♨ Monton Palillos 1 : " + palillos1);
                        numeroPalillos = palillos1;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 1 : " + numeroPalillos);
                    }
                    cierreOrdenador1 = true;
                    contador++;
                }

                if (montonElegido == 2 && cierreOrdenador2 == false) {
                    if (palillos2 > 1) {
                        System.out.println("♨ Monton Palillos 2 : " + palillos2);
                        numeroPalillos = palillos2;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 2 : " + numeroPalillos);
                    }
                    cierreOrdenador2 = true;
                    contador++;
                }

                if (montonElegido == 3 && cierreOrdenador3 == false) {
                    if (palillos3 > 1) {
                        System.out.println("♨ Monton Palillos 3 : " + palillos3);
                        numeroPalillos = palillos3;
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

    /**
     *
     * @param montElegido
     * @return
     */
    public static boolean comprobarMonton(int montElegido) {
        int elegido;
        int contador = 0;

        System.out.println("♥ Numero del monton elegido : " + montElegido);

        if (turno == 2) {
            parar = true;
        }

        if (turno == 1) {
            while (contador < 3 && parar == false) {

                switch (montElegido) {
                    case 1:
                        if (cierre1 == false) {
                            if (palillos1 > 1) {
                                montonElegido = 1;
                                numeroPalillos = palillos1;
                                tienePalillos = true;
                                parar = true;
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos1 + "");
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
                            if (palillos2 > 1) {
                                montonElegido = 2;
                                numeroPalillos = palillos2;
                                tienePalillos = true;
                                parar = true; // para el while porque devuelve palillos
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos2 + "");
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
                            if (palillos3 > 1) {
                                montonElegido = 3;
                                numeroPalillos = palillos3;
                                tienePalillos = true;
                                parar = true; // para el while porque devuelve palillos
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos3 + "");
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
                    elegido = SC.nextInt();
                    montonElegido = elegido;
                    while (montElegido < 0 || montElegido > 3) {
                        System.out.println("♦♦ Por favor : Elige un monton entre 1 , 2 , 3 : ♦♦");
                        elegido = SC.nextInt();
                        montonElegido = elegido;
                    }
                }
            }
        }
        return tienePalillos;
    }

    /**
     *
     * @param palillosRetirar
     * @return
     */
    public static boolean comprobarPalillos(int palillosRetirar) {

        if (montonElegido == 1 && (palillosRetirar <= palillos1)) {
            correcto = true;
        } else {
            System.out.println("♦ Error : ese monton no tiene tantos palillos : " + palillos1);
            correcto = false;
        }

        if (montonElegido == 2 && (palillosRetirar <= palillos2)) {
            correcto = true;
        } else {
            System.out.println("• Error : ese monton no tiene tantos palillos : " + palillos2);
            correcto = false;
        }

        if (montonElegido == 3 && (palillosRetirar <= palillos3)) {
            correcto = true;
        } else {
            System.out.println("◘ Error : ese monton no tiene tantos palillos : " + palillos3);
            correcto = false;
        }
        return correcto;
    }

    /**
     *
     * @param turno
     * @return
     */
    public static int elegirPalillos(int turno) {

        int palillosExtraidos = 0;
        int palillosRetirar = numeroPalillosRetirar(turno);

        if (comprobarPalillos(palillosRetirar)) {
            palillosExtraidos = palillosRetirar;
            System.out.println("○ Palillos extraidos : " + palillosExtraidos);
        } else {
            System.out.println("○ Error: ese montón no tiene tantos palillos");
        }

        return palillosExtraidos;
    }

    public static void comprobarFinJuego(int turno) {

        if (turno <= 2) {
            if (palillos1 == 1 && (palillos2 == 0 && palillos3 == 0)) {
                System.out.println("○ monton1 : " + montonElegido + " - monton1palillos : " + palillos1);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (palillos1 == 0 && (palillos2 >= 0 || palillos3 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (palillos2 == 1 && (palillos1 == 0 && palillos3 == 0)) {
                System.out.println("○ monton2 : " + montonElegido + " - monton2palillos : " + palillos2);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (palillos2 == 0 && (palillos1 >= 0 || palillos3 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (palillos3 == 1 && (palillos1 == 0 && palillos2 == 0)) {
                System.out.println("○ monton3 : " + montonElegido + " - monton3palillos : " + palillos3);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                if (palillos3 == 0 && (palillos1 >= 0 || palillos2 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }
        }
    }

    public static void main(String[] args) {
        crearMontones();
//        boolean valor = comprobarMonton(elegirMonton(2));

//        System.out.println("El valor devuelto es : " + valor);
//        System.out.println("----------------------");
//        numeroPalillosRetirar(1);
        int ep = elegirPalillos(2);
        System.out.println("♠ Palillos extraidos " + ep);

//        System.out.println("Monton Elegido : " + montonElegido);
//        System.out.println("Numero de Palillos : " + numeroPalillos);
//        System.out.println("----------------------");
//        numeroPalillosRetirar();
    }

}
