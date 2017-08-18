/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim9xxArreglarFallos1 {

    private static final Scanner SC = new Scanner(System.in);

//    Los distintos montones para almacenar la cantidad de palillos
    private static final int MONTON1 = 1;
    private static final int MONTON2 = 2;
    private static final int MONTON3 = 3;

//    Almacena la cantidad de palillos que tiene cada Monton
    private static int palillos1;
    private static int palillos2;
    private static int palillos3;

//Se utiliza para que el ordenador no elija un monton de palillos que tenga un numero 
//de palillos igual a 0
    private static boolean valorEncontrado;

    private static int montonElegido;

    private static int turno;
    private static final int TURNO1 = 1;
    private static final int TURNO2 = 2;
    private static int palillosRetirar;
    private static boolean correcto;

    private static boolean romperWhile;
    private static int finDelJuego;

    /**
     * 1- Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     */
    public static void crearPalillosParaMontones() {
//        palillos1 = (int) (Math.random() * (1 + 4) + 2);
//        palillos1 = (int) (Math.random() * (1 + 4) + 2);
        palillos1 = 0;
//        palillos2 = (int) (Math.random() * (1 + 4) + 2);
        palillos2 = 1;
//        palillos3 = (int) (Math.random() * (1 + 4) + 2);
        palillos3 = 1;

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + palillos1 + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + palillos2 + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + palillos3 + " palillos ♦ ");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
    }

    /**
     * Coge palillos entre 1 y 2
     *
     * Si el turno es 1 pide que cojas
     *
     * Si el turno es 2 el ordenador coge los palillos entre 1 y 2
     *
     * @param turno
     * @return
     */
    public static int coger1o2PalillosDelMonton(int turno) {

        palillosRetirar = 0;
//Si el turno es 1 pide que cojas los palillos entre 1 y 2
        if (turno == 1) {
            System.out.println("• Coge palillos entre 1 y 2 • ");
            palillosRetirar = SC.nextInt();
            while (palillosRetirar <= 0 || palillosRetirar > 2) {
                System.out.println("• Por favor : Coge palillos entre 1 a 2 ");
                palillosRetirar = SC.nextInt();
            }
            System.out.println("• La cantidad de palillos cogidos son : " + palillosRetirar);
        }
//Si el turno es 2 el ordenador coge los palillos entre 1 y 2
        if (turno == 2) {
            palillosRetirar = (int) (Math.random() * (1 + 1) + 1);
            System.out.println("• Palillos cogidos por el Ordenador : " + palillosRetirar);
        }
        return palillosRetirar;
    }

    /**
     * 2- Elijo un monton de palillos y comprueba que tiene palillos
     *
     * monton - atributo con el numero de palillos
     *
     * monton 1 , monton 2 , monton 3
     *
     */
    public static int elegirUnMonton(int turnoActual) {
//    Almacena la cantidad de palillos que tiene cada Monton
        montonElegido = 0;

        System.out.println("\t \t Turno Actual : " + turnoActual);

        if (TURNO1 == turnoActual) {

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");

            montonElegido = SC.nextInt();

            while ((montonElegido <= 0 || montonElegido > 3)) { // Con esto me ahorro poner los 3 tipos distintos de montones
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ◘ ");
                montonElegido = SC.nextInt();
            }
            System.out.println("Monton elegido : " + montonElegido);

            while (romperWhile == false) {

                if (montonElegido == 1 && palillos1 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON1 + " con " + palillos1 + " palillos ◘ ");
                    romperWhile = true;
                } else {
                    while (montonElegido != 2 && montonElegido != 3) {
                        System.out.println("A - Por favor : Elige otro monton : ");
                        montonElegido = SC.nextInt();
                    }
                }

                if (montonElegido == 2 && palillos2 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON2 + " con " + palillos2 + " palillos ◘ ");
                    romperWhile = true;
                } else {
                    while (montonElegido != 1 && montonElegido != 3) {
                        System.out.println("B - Por favor : Elige otro monton : ");
                        montonElegido = SC.nextInt();
                    }
                }

                if (montonElegido == 3 && palillos3 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON3 + " con " + palillos3 + " palillos ◘ ");
                    romperWhile = true;
                } else {
                    while (montonElegido != 1 && montonElegido != 2) {
                        System.out.println("C - Por favor : Elige otro monton : ");
                        montonElegido = SC.nextInt();
                    }
                }
            }
        }

        if (TURNO2 == turnoActual) {

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");

            do {
                montonElegido = (int) (Math.random() * (1 + 2) + 1);
                System.out.println("♨ Monton de palillos elegidos por el 'Ordenador' : " + montonElegido);

                if ((montonElegido == 1 && palillos1 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 1;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillos1 + " palillos ♨");
                }

                if ((montonElegido == 2 && palillos2 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 2;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillos2 + " palillos ♨");
                }

                if ((montonElegido == 3 && palillos3 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 3;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillos3 + " palillos ♨");
                }

            } while (valorEncontrado == false);
        }

        System.out.println("♨ Monton elegido : " + montonElegido);

        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     * Comprueba si el monton tiene palillos pero elegirUnMonton ya lo hace ,
     * Este metodo esta indicado en el libro
     *
     * Devuelve true o false si el monton de palillos elegido tiene 1 o mas
     * palillos.
     *
     * @param monton
     * @return true o false
     */
    public static boolean comprobarMonton(int monton) {

        boolean valor = false;

        System.out.println("♠ Comprobar Monton ♠");

        if (MONTON1 == monton && (palillos1 > 0)) {
            System.out.println("♠ Monton: " + MONTON1 + " con : " + palillos1);
            valor = true;
        }

        if (MONTON2 == monton && (palillos2 > 0)) {
            System.out.println("♠ Monton: " + MONTON2 + " con : " + palillos2);
            valor = true;
        }

        if (MONTON3 == monton && (palillos3 > 0)) {
            System.out.println("♠ Monton: " + MONTON3 + " con : " + palillos3);
            valor = true;
        }
        return valor;
    }

    /**
     * Dependiendo el turno (1 o 2) coge un numero de palillos comprendido entre
     * 1 y 2 y comprueba si en el monton de palillos hay palillos para retirar
     *
     * Si es así retira el numero indicado sino pide otro
     *
     * @param turno
     * @return palillosCogidos
     */
    public static int elegirPalillos(int turno) {
        int palillosCogidos = 0;

//      Muestra si es jugador/ordenador
        String jugador = (turno == 1) ? "Jugador" : "Ordenador";
        System.out.println("\t \t ○ Turno Actual : " + jugador);

        do {
            // El jugador/ordenador coge entre 1 o 2 palillos
            palillosCogidos = coger1o2PalillosDelMonton(turno);

// Comprueba que los palillos pasados por parametro se pueden coger del monton seleccionado           
            if (comprobarPalillos(palillosCogidos)) {
                System.out.println("○ Palillos extraidos : " + palillosCogidos);
            } else {
                System.out.println("○ Error: ese montón no tiene tantos palillos " + palillosCogidos);
            }

        } while (comprobarPalillos(palillosCogidos));

        return palillosCogidos;
    }

    /**
     * Verifica si en cada monton de palillos hay palillos para retirar dentro
     * del total de palillos que le corresponda a cada monton seleccionado.
     *
     * Si el número de palillos elegidos es igual o menor que los que quedán en
     * el montón,
     *
     * devuelve correcto = verdadero;
     *
     * si no, devuelve correcto = falso.
     *
     * @param palillosCogidos
     * @return
     */
//                                                  1 , 2
    public static boolean comprobarPalillos(int palillosCogidos) {

        System.out.println("\t \t comprobarPalillos - Turno Actual : " + turno);
//                 1                       1               1
        if (palillosCogidos > 0 && palillosCogidos <= palillos1) {
            System.out.println("♦ El monton " + MONTON1 + " tiene palillos suficientes : " + palillos1);
            correcto = true;
        } else {
            System.out.println("♦ Error : el monton " + MONTON1 + " no tiene palillos suficientes : " + palillos1);
            correcto = false;
        }

        if (palillosCogidos > 0 && palillosCogidos <= palillos2) {
            System.out.println("♦ El monton " + MONTON2 + " tiene palillos suficientes : " + palillos2);
            correcto = true;
        } else {
            System.out.println("♦ Error : el monton " + MONTON2 + " no tiene palillos suficientes : " + palillos2);
            correcto = false;
        }

        if (palillosCogidos > 0 && palillosCogidos <= palillos3) {
            System.out.println("♦ El monton " + MONTON3 + " tiene palillos suficientes : " + palillos3);
            correcto = true;
        } else {
            System.out.println("♦ Error : el monton " + MONTON3 + " no tiene palillos suficientes : " + palillos3);
            correcto = false;
        }

        return correcto;
    }

    /**
     * 7 - Dentro de un turno (1 o 2) elige el monton y resta palillos del total
     * de cada monton
     *
     * @param turno
     */
//    public static void restarCadaMonton(int turno) {
//
//        System.out.println("\t \t Turno Actual : " + turno);
//
//        int monton;
//
//        if (turno <= 2) {
//            System.out.println("♠ Elije un monton : ♠ ");
//            monton = SC.nextInt();
//            while (monton < 0 && monton > 3) {
//                System.out.println("♠ Por favor : Elija un monton entre 1 , 2 , 3 : ♠ ");
//                monton = SC.nextInt();
//            }
//
//            if (monton == MONTON1) {
//                System.out.println("♠ Has elegido el monton 1 : ");
//                palillosRestar = SC.nextInt();
//
//                while (palillosRestar < 1 || palillosRestar > 6) {
//                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
//                    monton1 -= palillosRestar;
//                }
//                System.out.println("♠ palillos 1 : " + palillosRestar);
//            }
//
//            if (monton == monton2) {
//                System.out.println("♠ Has elegido el monton 2 : ");
//                palillosRestar = SC.nextInt();
//
//                while (palillosRestar < 1 || palillosRestar > 6) {
//                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
//                    monton2 -= palillosRestar;
//                }
//                System.out.println("♠ palillos 2 : " + palillosRestar);
//            }
//
//            if (monton == monton3) {
//                System.out.println("♠ Has elegido el monton 3 : ");
//                palillosRestar = SC.nextInt();
//
//                while (palillosRestar < 1 || palillosRestar > 6) {
//                    System.out.println("♠ Por favor : coge un numero de palillos entre 1 y 6 ");
//                    monton3 -= palillosRestar;
//                }
//                System.out.println("♠ palillos 3 : " + palillosRestar);
//            }
//        }
//    }
    /**
     * 8 - Obtiene el turno y dice quien es el ganador mediante el monton que
     * tenga 1 palillo
     *
     * @param turno
     */
    public static void comprobarFinJuego(int turno) {

//        System.out.println("\t \t 7 Turno Actual : " + turno);
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

    public static void main(String[] args) {

        crearPalillosParaMontones();
        elegirUnMonton(2);
//        System.out.println(comprobarMonton(3));
//        comprobarPalillos(1);
//        elegirPalillos(1);
//        coger1o2PalillosDelMonton(1);
    }

}
