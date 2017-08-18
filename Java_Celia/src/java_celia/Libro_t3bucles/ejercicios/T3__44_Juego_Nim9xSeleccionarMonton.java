/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim9xSeleccionarMonton {

    private static final Scanner SC = new Scanner(System.in);
    private static int numeroPalillos; // variable para elegir el monton 

    private static int palillos1;
    private static int palillos2;
    private static int palillos3;

    private static int montonPalillos1;
    private static int montonPalillos2;
    private static int montonPalillos3;

    private static int montonElegido;

    private static boolean cierre1;
    private static boolean cierre2;
    private static boolean cierre3;

    private static boolean parar;
    private static boolean tienePalillos;

    private static int turno;
    private static int palillos;
    private static int palillosRestar;
    private static int palillosRetirar;
    private static boolean correcto;

    private static int finDelJuego = 0;

    /**
     * 1- Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     */
    public static void crearMontonesyPalillos() {
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
     * 2- Elijo un monton del cual quiero coger palillos.
     *
     * monton - atributo con la cantidad de palillos
     *
     * Que tiene uno de los monton 1 , monton 2 , monton 3 ,
     *
     */
    private static int elegirMonton(int turnoParametro) {

        System.out.println("\t \t 1 Turno Actual : " + turnoParametro);

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
                montonPalillos1 = montonElegido;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 2) {
                numeroPalillos = palillos2;
                montonPalillos2 = montonElegido;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
            if (montonElegido == 3) {
                numeroPalillos = palillos3;
                montonPalillos3 = montonElegido;
                System.out.println("◘ El 'Jugador' eligio el monton " + montonElegido + " con " + numeroPalillos + " palillos ◘ ");
            }
        }

        if (turnoParametro == 2) {

            System.out.println("\t \t 2 Turno Actual : " + turnoParametro);

            turno = turnoParametro;

            boolean salirIf1 = false;
            boolean salirIf2 = false;
            boolean salirIf3 = false;

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");

            int contador = 1;

            do {

                montonElegido = (int) (Math.random() * (1 + 2) + 1);

                if (montonElegido == 1 && salirIf1 == false) {
                    if (palillos1 > 1) {
                        System.out.println("♨ Monton Palillos 1 : " + palillos1);
                        numeroPalillos = palillos1;
                        montonPalillos1 = montonElegido;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        montonPalillos1 = montonElegido;
                        System.out.println("♨ Numero de Palillos 1 : " + numeroPalillos);
                    }
                    salirIf1 = true;
                    contador++;
                }

                if (montonElegido == 2 && salirIf2 == false) {
                    if (palillos2 > 1) {
                        System.out.println("♨ Monton Palillos 2 : " + palillos2);
                        numeroPalillos = palillos2;
                        montonPalillos2 = montonElegido;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 2 : " + numeroPalillos);
                    }
                    salirIf2 = true;
                    contador++;
                }

                if (montonElegido == 3 && salirIf3 == false) {
                    if (palillos3 > 1) {
                        System.out.println("♨ Monton Palillos 3 : " + palillos3);
                        numeroPalillos = palillos3;
                        montonPalillos3 = montonElegido;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + numeroPalillos + " palillos ♨");
                    } else {
                        numeroPalillos = 0;
                        System.out.println("♨ Numero de Palillos 3 : " + numeroPalillos);
                    }
                    salirIf3 = true;
                    contador++;
                }

            } while (numeroPalillos <= 1 && contador <= 3);
        }
        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     * 3 - Le pasamos un monton y comprueba si ese monton tiene palillos
     *
     * Si tiene palillos añade a los atributos de la clase el numero del monton
     * y el numero de palillos
     *
     * Si el monton no tiene palillos devuelve false
     *
     * @param montElegido
     * @return
     */
    public static boolean comprobarMonton(int montElegido) {

        System.out.println("\t \t 3 Turno Actual : " + turno);

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
                            if (palillos1 > 1) { // si hay palillos
                                montonElegido = 1;
                                numeroPalillos = palillos1;
                                montonPalillos1 = montonElegido;
                                tienePalillos = true;
                                parar = true;
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos1 + "");
                                montonElegido = 1;
                                numeroPalillos = 0;
                                montonPalillos1 = montonElegido;
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
                                montonPalillos2 = montonElegido;
                                tienePalillos = true;
                                parar = true; // para el while porque devuelve palillos
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos2 + "");
                                montonElegido = 2;
                                numeroPalillos = 0;
                                montonPalillos2 = montonElegido;
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
                                montonPalillos3 = montonElegido;
                                tienePalillos = true;
                                parar = true; // para el while porque devuelve palillos
                            } else {
                                System.out.println("♥ Error : ese monton no tiene tantos palillos : " + palillos3 + "");
                                montonElegido = 3;
                                numeroPalillos = 0;
                                montonPalillos3 = montonElegido;
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
        return tienePalillos; // devuelve si el monton elegido tiene palillos
    }

    /**
     * 4 - Verifica si en cada monton de palillos hay palillos para retirar
     * dentro del total de palillos que le corresponda a cada monton
     * seleccionado.
     *
     * @param palillosRetirar
     * @return
     */
    public static boolean comprobarPalillos(int palillosRetirar) {

        System.out.println("\t \t 4 Turno Actual : " + turno);

        if (montonPalillos1 == 1 && (palillosRetirar <= palillos1)) {
            correcto = true;
        } else {
            System.out.println("♦ Error : ese monton no tiene tantos palillos : " + palillos1);
            correcto = false;
        }

        if (montonPalillos2 == 2 && (palillosRetirar <= palillos2)) {
            correcto = true;
        } else {
            System.out.println("• Error : ese monton no tiene tantos palillos : " + palillos2);
            correcto = false;
        }

        if (montonPalillos3 == 3 && (palillosRetirar <= palillos3)) {
            correcto = true;
        } else {
            System.out.println("◘ Error : ese monton no tiene tantos palillos : " + palillos3);
            correcto = false;
        }
        return correcto;
    }

    /**
     * 5 - Dependiendo el turno (1 o 2) coge un numero de palillos comprendido
     * entre 1 y 2 y comprueba si en el monton de palillos hay palillos para
     * retirar Si es así retira el numero indicado sino , retira 0
     *
     * @param turno
     * @return
     */
    public static int elegirPalillos(int turno) {

        System.out.println("\t \t 5 Turno Actual : " + turno);

        int palillosRetirados;

        do {

            palillosRetirados = numeroPalillosARetirar(turno); // 1 o 2

            if (comprobarPalillos(palillosRetirados)) {
                System.out.println("○ Palillos extraidos : " + palillosRetirados);
                return palillosRetirados;
            } else {
                System.out.println("○ Error: ese montón no tiene tantos palillos");
            }
            System.out.println("○ Introduce un numero de palillos validos :  ");

        } while (comprobarPalillos(palillosRetirados));

        return palillosRetirados;
    }

    /**
     * 6 - Coge palillos entre 1 y 2
     *
     * @param turno
     * @return
     */
    public static int numeroPalillosARetirar(int turno) {

        System.out.println("\t \t 6 Turno Actual : " + turno);

        if (turno == 1) {
            System.out.println("• ¿ Cuantos palillos quieres retirar ? • ");
            System.out.println("• Coge palillos entre 1 y 2 • ");
            palillosRetirar = SC.nextInt();
            while (palillosRetirar <= 0 || palillosRetirar > 2) {
                System.out.println("• Por favor : Coge palillos entre 1 a 2 ");
                palillosRetirar = SC.nextInt();
            }
            System.out.println("• La cantidad de palillos son : " + palillosRetirar);
            return palillosRetirar;
        }
        if (turno == 2) {
            palillosRetirar = (int) (Math.random() * (1 + 1) + 1);
            System.out.println("• Palillos cogidos por el Ordenador : " + palillosRetirar);
        }
        return palillosRetirar;
    }

    /**
     * 7 - Dentro de un turno (1 o 2) elige el monton y resta palillos del total
     * de cada monton
     *
     * @param turno
     */
    public static void restarCadaMonton(int turno) {

        System.out.println("\t \t Turno Actual : " + turno);

        int monton;

        if (turno <= 2) {
            System.out.println("♠ Elije un monton : ♠ ");
            monton = SC.nextInt();
            while (monton < 0 && monton > 3) {
                System.out.println("♠ Por favor : Elija un monton entre 1 , 2 , 3 : ♠ ");
                monton = SC.nextInt();
            }

            if (monton == montonPalillos1) {
                System.out.println("♠ Has elegido el monton 1 : ");
                palillosRestar = SC.nextInt();

                while (palillosRestar < 1 || palillosRestar > 6) {
                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
                    montonPalillos1 -= palillosRestar;
                }
                System.out.println("♠ palillos 1 : " + palillosRestar);
            }

            if (monton == montonPalillos2) {
                System.out.println("♠ Has elegido el monton 2 : ");
                palillosRestar = SC.nextInt();

                while (palillosRestar < 1 || palillosRestar > 6) {
                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
                    montonPalillos2 -= palillosRestar;
                }
                System.out.println("♠ palillos 2 : " + palillosRestar);
            }

            if (monton == montonPalillos3) {
                System.out.println("♠ Has elegido el monton 3 : ");
                palillosRestar = SC.nextInt();

                while (palillosRestar < 1 || palillosRestar > 6) {
                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
                    montonPalillos3 -= palillosRestar;
                }
                System.out.println("♠ palillos 3 : " + palillosRestar);
            }
        }
    }

    /**
     * 8 - Obtiene el turno y dice quien es el ganador mediante el monton que
     * tenga 1 palillo
     *
     * @param turno
     */
    public static void comprobarFinJuego(int turno) {

        System.out.println("\t \t 7 Turno Actual : " + turno);

        if (turno <= 2) {
            if (palillos1 == 1 && (palillos2 == 0 && palillos3 == 0)) {
                System.out.println("○ monton1 : " + montonElegido + " - monton1palillos : " + palillos1);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                finDelJuego = 1;
                if (palillos1 == 0 && (palillos2 >= 0 || palillos3 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (palillos2 == 1 && (palillos1 == 0 && palillos3 == 0)) {
                System.out.println("○ monton2 : " + montonElegido + " - monton2palillos : " + palillos2);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                finDelJuego = 1;
                if (palillos2 == 0 && (palillos1 >= 0 || palillos3 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }

            if (palillos3 == 1 && (palillos1 == 0 && palillos2 == 0)) {
                System.out.println("○ monton3 : " + montonElegido + " - monton3palillos : " + palillos3);
                System.out.println("○ Ganador : " + turno);
                System.out.println("○ Fin del juego");
                finDelJuego = 1;
                if (palillos3 == 0 && (palillos1 >= 0 || palillos2 >= 0)) {
                    System.out.println("Sigue jugando ");
                }
            }
        }
    }

    public static void lanzarJuego(int turno) {

        System.out.println("\t \t Turno Actual : " + turno);

        int contador = 0;
        int palillosElegidos;
        if (contador == 0) {
            crearMontonesyPalillos();
        }

        elegirMonton(turno);
        comprobarMonton(montonElegido);
        palillosElegidos = elegirPalillos(turno);
        comprobarPalillos(palillosElegidos);
        int palilosRetirar = numeroPalillosARetirar(turno);
        restarCadaMonton(palilosRetirar);
        comprobarFinJuego(turno);

    }

    public static void main(String[] args) {

        crearMontonesyPalillos();
        elegirMonton(2);

    }

}
