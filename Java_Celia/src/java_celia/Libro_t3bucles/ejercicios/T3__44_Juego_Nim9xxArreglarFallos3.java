/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim9xxArreglarFallos3 {

    private static final Scanner SC = new Scanner(System.in);

//    Los distintos montones para almacenar la cantidad de palillos
    private static final int MONTON1 = 1;
    private static final int MONTON2 = 2;
    private static final int MONTON3 = 3;

//    Almacena la cantidad de palillos que tiene cada Monton
    private static int palillosDelMonton1;
    private static int palillosDelMonton2;
    private static int palillosDelMonton3;

//Se utiliza para que el ordenador no elija un monton de palillos que tenga un numero 
//de palillos igual a 0
    private static boolean valorEncontrado;

    private static int montonElegido;

    private static final int TURNO1 = 1;
    private static final int TURNO2 = 2;

    private static int palillosRetirar;

    private static boolean romperWhile;
    private static int finDelJuego;
    private static int palillosRestar;

    /**
     * 1- Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     */
    public static void crearPalillosParaMontones() {
//        palillos1 = (int) (Math.random() * (1 + 4) + 2);
        palillosDelMonton1 = 3;
//        palillos2 = (int) (Math.random() * (1 + 4) + 2);
        palillosDelMonton2 = 1;
//        palillos3 = (int) (Math.random() * (1 + 4) + 2);
        palillosDelMonton3 = 2;

        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Bienvenido al Juego de Nim ♦ ");
        System.out.println("♦ El contenido actual de los montones es:");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.println("♦ Monton 1 : " + palillosDelMonton1 + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + palillosDelMonton2 + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + palillosDelMonton3 + " palillos ♦ ");
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
    }

    /**
     * Coge palillos entre 1 y 2
     *
     * @param turno
     * @return
     */
    public static int coger1o2PalillosDelMonton(int turno) {

        palillosRetirar = 0;
//Si el turno es 1 pide que cojas los palillos entre 1 y 2
        if (turno == 1) {
            System.out.println("• ¿ Cuantos palillos quieres coger ? : Tienen que ser entre 1 y 2 • ");
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
     * @param turnoActual
     * @return
     */
    public static int elegirMonton(int turnoActual) {

//    Almacena la cantidad de palillos que tiene cada Monton
        if (TURNO1 == turnoActual) {

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");
            montonElegido = SC.nextInt();

            while ((montonElegido <= 0 || montonElegido > 3)) { // Con esto me ahorro poner los 3 tipos distintos de montones
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ◘ ");
                montonElegido = SC.nextInt();
            }
            System.out.println("◘ Monton elegido : " + montonElegido);

            while (romperWhile == false) {

                if (montonElegido == 1 && palillosDelMonton1 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON1 + " con " + palillosDelMonton1 + " palillos ◘ ");
                    romperWhile = true;
                } else {
                    while (montonElegido != 2 && montonElegido != 3) {
                        System.out.println("A - Por favor : Elige otro monton : ");
                        montonElegido = SC.nextInt();
                    }
                }

                if (montonElegido == 2 && palillosDelMonton2 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON2 + " con " + palillosDelMonton2 + " palillos ◘ ");
                    romperWhile = true;
                } else {
                    while (montonElegido != 1 && montonElegido != 3) {
                        System.out.println("B - Por favor : Elige otro monton : ");
                        montonElegido = SC.nextInt();
                    }
                }

                if (montonElegido == 3 && palillosDelMonton3 > 0) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON3 + " con " + palillosDelMonton3 + " palillos ◘ ");
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

                if ((montonElegido == 1 && palillosDelMonton1 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 1;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillosDelMonton1 + " palillos ♨");
                }

                if ((montonElegido == 2 && palillosDelMonton2 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 2;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillosDelMonton2 + " palillos ♨");
                }

                if ((montonElegido == 3 && palillosDelMonton3 > 0)) { // si palillos es 0 : se descarta ese monton
                    montonElegido = 3;
                    valorEncontrado = true;
                    System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " porque tiene : " + palillosDelMonton3 + " palillos ♨");
                }

            } while (valorEncontrado == false);
        }

        System.out.println("♨ Monton elegido : " + montonElegido + " ♨ ");

        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
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
//                                       1 o 2 
    public static int elegirPalillos(int turno) {
        int palilloPermitidos;
//      Muestra si es jugador/ordenador
        String jugador = (turno == 1) ? "Jugador" : "Ordenador";
        System.out.println("\t ○ Turno Actual : " + jugador);
//           1 2 3                   1 o 2           
        montonElegido = elegirMonton(turno);

//        System.out.println("○ Monton Elegido : " + montonElegido);

        //------------------- El jugador/ordenador coge entre 1 o 2 palillos
        int palillosCogidos = coger1o2PalillosDelMonton(turno);

        System.out.println("○ Palillos cogidos : " + palillosCogidos);

        System.out.println("○ Comprobar los palillos : ");

        palilloPermitidos = comprobarPalillos(palillosCogidos, montonElegido);

        return palilloPermitidos;
    }

    /**
     *
     * Verifica si en cada monton de palillos hay palillos para coger dentro del
     * total de palillos que le corresponda a cada monton seleccionado.
     *
     * Si el número de palillos elegidos es igual o menor que los que quedán en
     * el montón,
     *
     * devuelve correcto = verdadero;
     *
     * si no, devuelve correcto = falso.
     *
     * @param palillosCogidosArgu
     * @param montonElegido
     * @return
     */
    public static int comprobarPalillos(int palillosCogidosArgu, int montonElegido) {

        System.out.println("♦ Monton Elegido : " + montonElegido);

        int palillosCogidos = palillosCogidosArgu;

        boolean hayPalillosParaRestar = false;

        while (hayPalillosParaRestar == false) {

            if (montonElegido == MONTON1) {
                if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton1)) {
                    System.out.println("♦ Has elegido quitar " + palillosCogidos + " del monton " + MONTON1);
                    hayPalillosParaRestar = true;
                } else {
                    System.out.println("♦ Error : El monton " + MONTON1 + " solo tiene : " + palillosDelMonton1 + " palillos");
                    while ((palillosCogidos > palillosDelMonton1)) {
                        System.out.println("♦ La cantidad de palillos del monton " + MONTON1 + " es menor que la que has ingresado");
                        System.out.println("♦ Palillos ingresados : " + palillosCogidos);
                        System.out.println("♦ En el monton " + MONTON1 + " hay " + palillosDelMonton1 + " palillos");
                        System.out.println("♦ Vuelve a elegir palillos que sean menores de " + palillosDelMonton1);
                        palillosCogidos = SC.nextInt();
                    }
                }
            }

            if (montonElegido == MONTON2) {
                if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton2)) {
                    System.out.println("♦ Has elegido quitar " + palillosCogidos + " palillos del monton " + MONTON2);
                    hayPalillosParaRestar = true;
                } else {
                    System.out.println("♦ Error : El monton " + MONTON2 + " solo tiene : " + palillosDelMonton2 + " palillos");
                    while ((palillosCogidos > palillosDelMonton2)) {
                        System.out.println("♦ La cantidad de palillos del monton " + MONTON2 + " es menor que la que has ingresado");
                        System.out.println("♦ Palillos ingresados : " + palillosCogidos);
                        System.out.println("♦ En el monton " + MONTON2 + " hay " + palillosDelMonton2 + " palillos");
                        System.out.println("♦ Vuelve a elegir palillos que sean menores de " + palillosDelMonton2);
                        palillosCogidos = SC.nextInt();
                    }
                }
            }

            if (montonElegido == MONTON3) {
                if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton3)) {
                    System.out.println("♦ Has elegido quitar " + palillosCogidos + " del monton " + MONTON3);
                    hayPalillosParaRestar = true;
                } else {
                    System.out.println("♦ Error : El monton " + MONTON3 + " solo tiene : " + palillosDelMonton3 + " palillos");
                    while ((palillosCogidos > palillosDelMonton3) || (palillosCogidos == 0)) {
                        System.out.println("♦ La cantidad de palillos del monton " + MONTON3 + " es menor que la que has ingresado");
                        System.out.println("♦ Palillos ingresados : " + palillosCogidos);
                        System.out.println("♦ En el monton " + MONTON3 + " hay " + palillosDelMonton3 + " palillos");
                        System.out.println("♦ Vuelve a elegir palillos que sean menores de " + palillosDelMonton3);
                        palillosCogidos = SC.nextInt();
                    }
                }
            }

        }
        return palillosCogidos;
    }

    /**
     * 7 - Dentro de un turno (1 o 2) elige el monton y resta palillos del total
     * de cada monton
     *
     * @param turno
     * @param monton
     * @param palillosARestar
     */
//                                                         1          3                1              
    public static void restarDeCadaMontonLosPalillos(int turno, int monton, int palillosARestar) {

        System.out.println("Turno Actual : " + turno);

        if (turno <= 2) {

            if (monton == MONTON1) {
//                System.out.println("♠ Has elegido el monton 1 : ");
                palillosDelMonton1 -= palillosARestar;
                System.out.println("♠ Total : " + palillosDelMonton1);
            }

            if (monton == MONTON2) {
//                System.out.println("♠ Has elegido el monton 2 : ");
                palillosDelMonton2 -= palillosARestar;
                System.out.println("♠ Total : " + palillosDelMonton2);
            }

            if (monton == MONTON3) {
//                System.out.println("♠ Has elegido el monton 3 : ");
                palillosDelMonton3 -= palillosARestar;
                System.out.println("♠ Total : " + palillosDelMonton3);

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

//        System.out.println("\t \t 7 Turno Actual : " + turno);
        if (turno <= 2) {
            if (palillosDelMonton1 == 1 && (palillosDelMonton2 == 0 && palillosDelMonton3 == 0)) {
                System.out.println("○○ Monton 1 : " + montonElegido + " - tiene : " + palillosDelMonton1 + " palillos");
                System.out.println("○○ Ganador : " + turno);
                System.out.println("○○ Fin del juego");
                finDelJuego = 1;
                if (palillosDelMonton1 == 0 && (palillosDelMonton2 >= 0 || palillosDelMonton3 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                }
            }

            if (palillosDelMonton2 == 1 && (palillosDelMonton1 == 0 && palillosDelMonton3 == 0)) {
                System.out.println("○○ Monton 2 : " + montonElegido + " - tiene : " + palillosDelMonton2 + " palillos");
                System.out.println("○○ Ganador : " + turno);
                System.out.println("○○ Fin del juego");
                finDelJuego = 1;
                if (palillosDelMonton2 == 0 && (palillosDelMonton1 >= 0 || palillosDelMonton3 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                }
            }

            if (palillosDelMonton3 == 1 && (palillosDelMonton1 == 0 && palillosDelMonton2 == 0)) {
                System.out.println("○○ Monton 3 : " + montonElegido + " - tiene : " + palillosDelMonton3 + " palillos");
                System.out.println("○○ Ganador : " + turno);
                System.out.println("○○ Fin del juego");
                finDelJuego = 1;
                if (palillosDelMonton3 == 0 && (palillosDelMonton1 >= 0 || palillosDelMonton2 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                }
            }
        }
    }

    public static void main(String[] args) {

        crearPalillosParaMontones();
        int elegirPalillos = elegirPalillos(1);
        restarDeCadaMontonLosPalillos(1, montonElegido, elegirPalillos);
        comprobarFinJuego(1);
    }

}
