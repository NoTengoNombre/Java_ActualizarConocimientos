/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim9xxArreglarFallos5PalillosEscogidos {

    private static final Scanner SC = new Scanner(System.in);

//    Los distintos montones para almacenar la cantidad de palillos
    private static final int MONTON1 = 1;
    private static final int MONTON2 = 2;
    private static final int MONTON3 = 3;
    private static int monton;

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
    private static int turnoActual;

    private static int palillosCogidos;

//    private static int palillosRetirar;
    private static boolean hayPalillosParaRestar = false;

    private static boolean sigueJugando = false;

    /**
     * 1- Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     */
    public static void crearPalillosParaMontones() {
        palillosDelMonton1 = (int) (Math.random() * (1 + 4) + 2);
        palillosDelMonton2 = (int) (Math.random() * (1 + 4) + 2);
        palillosDelMonton3 = (int) (Math.random() * (1 + 4) + 2);
//        palillosDelMonton1 = 2;
//        palillosDelMonton2 = 1;
//        palillosDelMonton2 = 5;

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
     *
     */
    public static void verResultado() {
        System.out.println("♦ ----------------- RESULTADOS ----------------- ♦ ");
        System.out.println("♦ Monton 1 : " + palillosDelMonton1 + " palillos ♦ ");
        System.out.println("♦ Monton 2 : " + palillosDelMonton2 + " palillos ♦ ");
        System.out.println("♦ Monton 3 : " + palillosDelMonton3 + " palillos ♦ ");
        System.out.println("♦ ---------------------------------------------- ♦ ");
    }

    /**
     * Coge palillos entre 1 y 2
     *
     * @param turno
     * @return
     */
    public static int coger1o2PalillosDelMonton(int turno) {
        int palillosRetirar = 0;

        if (turno == 1) { //Si el turno es 1 pide que cojas los palillos entre 1 y 2
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
            System.out.println("• El Ordenador cogio : " + palillosRetirar + " palillos");
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
     * @param turnoTemporal
     * @return
     */
    public static int elegirMonton(int turnoTemporal) {

//    Almacena la cantidad de palillos que tiene cada Monton
        System.out.println("◘ Mi turno temporal : " + turnoTemporal);
        turnoActual = turnoTemporal;

        if (TURNO1 == turnoActual) {
            System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");
            montonElegido = SC.nextInt();

            while ((montonElegido <= 0 || montonElegido > 3)) { // Con esto me ahorro poner los 3 tipos distintos de montones
                System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ◘ ");
                montonElegido = SC.nextInt();
            }

            if (montonElegido == MONTON1) {
                if (comprobarMonton(montonElegido)) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON1 + " con " + palillosDelMonton1 + " palillos ◘ ");
                }
            }

            if (montonElegido == MONTON2) {
                if (comprobarMonton(montonElegido)) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON2 + " con " + palillosDelMonton2 + " palillos ◘ ");
                }
            }

            if (montonElegido == MONTON3) {
                if (comprobarMonton(montonElegido)) {
                    System.out.println("◘ El 'Jugador' eligio el monton " + MONTON3 + " con " + palillosDelMonton3 + " palillos ◘ ");
                }
            }
        }

        System.out.println("◘ Monton elegido por el jugador : " + montonElegido + " ◘ ");

        if (TURNO2 == turnoActual) {

            System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
            System.out.print("♨ El 'ORDENADOR' elige entre el monton 1 , monton 2 , monton 3 ♨\n");

            do {

                montonElegido = (int) (Math.random() * (1 + 2) + 1);
                System.out.println("♨ Monton de palillos elegidos por el 'Ordenador' : " + montonElegido + " ♨ ");
                System.out.println(" ---------------------------------------------- ");
                if (montonElegido == 1) { // si palillos es 0 : se descarta ese monton
                    if (comprobarMonton(montonElegido)) { // al ser true porque comprueba todas las condiciones 
                        montonElegido = monton;
                        valorEncontrado = true;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " ♨");
                    } else {
                        valorEncontrado = false;
                    }
                }

                if (montonElegido == 2) { // si palillos es 0 : se descarta ese monton
                    if (comprobarMonton(montonElegido)) {
                        montonElegido = monton;
                        valorEncontrado = true;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " ♨");
                    } else {
                        valorEncontrado = false;
                    }
                }

                if (montonElegido == 3) { // si palillos es 0 : se descarta ese monton
                    if (comprobarMonton(montonElegido)) {
                        montonElegido = monton;
                        valorEncontrado = true;
                        System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " ♨");
                    } else {
                        valorEncontrado = false;
                    }
                }
            } while (valorEncontrado == false);
        }
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
//        System.out.println("◘♨ Monton elegido : " + montonElegido + " ♨◘");
        return montonElegido; // devuelve monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     * Comprueba si el monton tiene palillos pero elegirMonton ya lo hace , Este
     * metodo esta indicado en el libro
     *
     * Devuelve true o false si el monton de palillos elegido tiene 1 o mas
     * palillos.
     *
     * @param montonParametro
     * @return true o false
     */
    public static boolean comprobarMonton(int montonParametro) {

        boolean montonConPalillos = false;

        System.out.println("♠ Monton Palillos 1 ♠ " + palillosDelMonton1);
        System.out.println("♠ Monton Palillos 2 ♠ " + palillosDelMonton2);
        System.out.println("♠ Monton Palillos 3 ♠ " + palillosDelMonton3);

        monton = montonParametro;

        while (montonConPalillos == false) {

            if (turnoActual == TURNO1) {

                if (MONTON1 == monton) {
                    if (palillosDelMonton1 > 0) {
                        System.out.println("♠ Monton Seleccionado : " + MONTON1 + " con : " + palillosDelMonton1 + " palillos ♠");
                        montonConPalillos = true;
                        montonElegido = MONTON1;
                    } else {
                        System.out.println("♠ Por favor elige otro monton distinto a " + MONTON1 + " ♠");
                        monton = SC.nextInt();
                        while (monton <= 0 || monton > 3) {
                            System.out.println("♠ Por favor elige otro monton distinto a " + MONTON1 + " ♠");
                            monton = SC.nextInt();
                        }
                    }
                }

                if (MONTON2 == monton) {
                    if (palillosDelMonton2 > 0) {
                        System.out.println("♠ Monton Seleccionado : " + MONTON2 + " con : " + palillosDelMonton2 + " palillos ♠");
                        montonConPalillos = true;
                        montonElegido = MONTON2;
                    } else {
                        System.out.println("♠♠ Por favor elige otro monton distinto a " + MONTON2 + " ♠");
                        monton = SC.nextInt();
                        while (monton <= 0 || monton > 3) {
                            System.out.println("♠♠  Por favor elige otro monton distinto a " + MONTON2 + " ♠");
                            monton = SC.nextInt();
                        }
                    }
                }

                if (MONTON3 == monton) {
                    if (palillosDelMonton3 > 0) {
                        System.out.println("♠ Monton Seleccionado : " + MONTON3 + " con : " + palillosDelMonton3 + " palillos ♠");
                        montonConPalillos = true;
                        montonElegido = MONTON3;
                    } else {
                        System.out.println("♠ Por favor elige otro monton distinto a " + MONTON3 + " ♠");
                        monton = SC.nextInt();
                        while (monton <= 0 || monton > 3) {
                            System.out.println("♠♠  Por favor elige otro monton distinto a " + MONTON2 + " ♠");
                            monton = SC.nextInt();
                        }
                    }
                }
            }

//            Turno del Ordenador
            if (turnoActual == TURNO2) {
                if (MONTON1 == monton) {
                    if (palillosDelMonton1 > 0) {
                        montonConPalillos = true;
                        monton = MONTON1;
                    } else {
                        if (palillosDelMonton2 > 0) {
                            monton = MONTON2;
                            montonConPalillos = true;
                        }
                        if (palillosDelMonton3 > 0) {
                            monton = MONTON3;
                            montonConPalillos = true;
                        }
                    }
                }

                if (MONTON2 == monton) {
                    if (palillosDelMonton2 > 0) {
                        monton = MONTON2;
                        montonConPalillos = true;
                    } else {
                        if (palillosDelMonton1 > 0) {
                            monton = MONTON1;
                            montonConPalillos = true;
                        }
                        if (palillosDelMonton3 > 0) {
                            monton = MONTON3;
                            montonConPalillos = true;
                        }
                    }
                }

                if (MONTON3 == monton) {
                    if (palillosDelMonton3 > 0) {
                        monton = MONTON3;
                        montonConPalillos = true;
                    } else {
                        if (palillosDelMonton1 > 0) {
                            monton = MONTON1;
                            montonConPalillos = true;
                        }
                        if (palillosDelMonton2 > 0) {
                            monton = MONTON2;
                            montonConPalillos = true;
                        }
                    }
                }
            }
            System.out.println("----------------------------------------------");
        }
        return montonConPalillos; // si tiene palillos true / no tiene palillos false
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

        System.out.println("○ Monton Elegido : " + montonElegido);

        palillosCogidos = coger1o2PalillosDelMonton(turno);

        System.out.println("○ Palillos cogidos : " + palillosCogidos + " ○");

        palilloPermitidos = comprobarPalillos(palillosCogidos, montonElegido);

        return palilloPermitidos;
    }

    /**
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
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("♦ Monton Elegido : " + montonElegido);

        palillosCogidos = palillosCogidosArgu;

        if (turnoActual == 1) {

            while (hayPalillosParaRestar == false) {

                if (montonElegido == MONTON1) {
//                          2                       2              2
                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton1)) {
                        if ((palillosCogidos == 2 && palillosDelMonton1 == 2) && (palillosDelMonton2 + palillosDelMonton3 <= 0)) {
                            System.out.println("♦♦ No puedes restar " + palillosCogidos + " palillos al monton 1 ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("♦♦ Elige el nunero 1 ");
                                palillosCogidos = SC.nextInt();
                            }
                        }
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
                            if (palillosCogidos == 0) {
                                while (palillosCogidos == 0) {
                                    System.out.println("No puedes introducir un valor que sea 0 ");
                                    palillosCogidos = SC.nextInt();
                                }
                            }
                        }
                    }
                }

                if (montonElegido == MONTON2) {

                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton2)) {
                        if ((palillosCogidos == 2 && palillosDelMonton2 == 2) && (palillosDelMonton1 + palillosDelMonton3 <= 0)) {
                            System.out.println("♦♦ No puedes restar " + palillosCogidos + " palillos al monton 1 ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("♦♦ Elige el nunero 1 ");
                                palillosCogidos = SC.nextInt();
                            }
                        }
                        System.out.println("♦ Has elegido quitar " + palillosCogidos + " del monton " + MONTON2);
                        hayPalillosParaRestar = true;
                    } else {
                        System.out.println("♦ Error : El monton " + MONTON2 + " solo tiene : " + palillosDelMonton2 + " palillos");
                        while ((palillosCogidos > palillosDelMonton2)) {
                            System.out.println("♦ La cantidad de palillos del monton " + MONTON2 + " es menor que la que has ingresado");
                            System.out.println("♦ Palillos ingresados : " + palillosCogidos);
                            System.out.println("♦ En el monton " + MONTON2 + " hay " + palillosDelMonton2 + " palillos");
                            System.out.println("♦ Vuelve a elegir palillos que sean menores de " + palillosDelMonton2);
                            palillosCogidos = SC.nextInt();
                            if (palillosCogidos == 0) {
                                while (palillosCogidos == 0) {
                                    System.out.println("No puedes introducir un valor que sea 0 ");
                                    palillosCogidos = SC.nextInt();
                                }
                            }
                        }
                    }
                }

                if (montonElegido == MONTON3) {
                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton3)) {
//                                2                    2                             0                    + 1
                        if ((palillosCogidos == 2 && palillosDelMonton3 == 2) && (palillosDelMonton1 + palillosDelMonton2 <= 0)) {
                            System.out.println("♦♦ No puedes restar " + palillosCogidos + " palillos al monton 1 ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("♦♦ Elige el nunero 1 ");
                                palillosCogidos = SC.nextInt();
                            }
                        }
                        System.out.println("♦ Has elegido quitar " + palillosCogidos + " del monton " + MONTON3);
                        hayPalillosParaRestar = true;
                    } else {
                        System.out.println("♦ Error : El monton " + MONTON3 + " solo tiene : " + palillosDelMonton3 + " palillos");
                        while ((palillosCogidos > palillosDelMonton3)) {
                            System.out.println("♦ La cantidad de palillos del monton " + MONTON3 + " es menor que la que has ingresado");
                            System.out.println("♦ Palillos ingresados : " + palillosCogidos);
                            System.out.println("♦ En el monton " + MONTON3 + " hay " + palillosDelMonton3 + " palillos");
                            System.out.println("♦ Vuelve a elegir palillos que sean menores de " + palillosDelMonton3);
                            palillosCogidos = SC.nextInt();
                            if (palillosCogidos == 0) {
                                while (palillosCogidos == 0) {
                                    System.out.println("No puedes introducir un valor que sea 0 ");
                                    palillosCogidos = SC.nextInt();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (turnoActual == 2) {

            while (hayPalillosParaRestar == false) {

                if (montonElegido == MONTON1) {
                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton1)) {
                        if ((palillosCogidos == 2 && palillosDelMonton1 == 2) && (palillosDelMonton2 + palillosDelMonton3 <= 0)) {
                            System.out.println("Ⓞ No puedes restar " + palillosCogidos + " palillos al monton 1 Ⓞ ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("ⓄⓄ Elige 1 palillo ⓄⓄ ");
                                palillosCogidos = 1;
                            }
                        }
                        System.out.println("Ⓞ Has elegido quitar " + palillosCogidos + " del monton " + MONTON1 + " Ⓞ");
                        hayPalillosParaRestar = true;
                    } else {
                        System.out.println("Ⓞ Error : El monton " + MONTON1 + " solo tiene : " + palillosDelMonton1 + " palillos Ⓞ");
                        while ((palillosCogidos > palillosDelMonton1)) {
                            System.out.println("Ⓞ La cantidad de palillos del monton " + MONTON1 + " es menor que la que has ingresado Ⓞ");
                            System.out.println("Ⓞ Palillos ingresados : " + palillosCogidos);
                            System.out.println("Ⓞ En el monton " + MONTON1 + " hay " + palillosDelMonton1 + " palillos");
                            System.out.println("Ⓞ Vuelve a elegir palillos que sean menores de " + palillosDelMonton1);
                            int palillosMenores = (int) (Math.random() * (0 + 2) + 1);
                            System.out.println("Ⓞ Valor asignado : ");
                            palillosCogidos = palillosMenores;
                        }
                    }
                }

                if (montonElegido == MONTON2) {
                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton2)) {
                        if ((palillosCogidos == 2 && palillosDelMonton2 == 2) && (palillosDelMonton1 + palillosDelMonton3 <= 0)) {
                            System.out.println("Ⓞ No puedes restar " + palillosCogidos + " palillos al monton 2 Ⓞ ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("ⓄⓄ Elige 1 palillo ⓄⓄ ");
                                palillosCogidos = 1;
                            }
                        }
                        System.out.println("Ⓞ Has elegido quitar " + palillosCogidos + " del monton " + MONTON2 + " Ⓞ");
                        hayPalillosParaRestar = true;
                    } else {
                        System.out.println("Ⓞ Error : El monton " + MONTON2 + " solo tiene : " + palillosDelMonton2 + " palillos Ⓞ");
                        while ((palillosCogidos > palillosDelMonton2)) {
                            System.out.println("Ⓞ La cantidad de palillos del monton " + MONTON2 + " es menor que la que has ingresado Ⓞ");
                            System.out.println("Ⓞ Palillos ingresados : " + palillosCogidos);
                            System.out.println("Ⓞ En el monton " + MONTON2 + " hay " + palillosDelMonton2 + " palillos");
                            System.out.println("Ⓞ Vuelve a elegir palillos que sean menores de " + palillosDelMonton2);
                            int palillosMenores = (int) (Math.random() * (0 + 2) + 1);
                            System.out.println("Ⓞ Valor asignado : ");
                            palillosCogidos = palillosMenores;
                        }
                    }
                }

                if (montonElegido == MONTON3) {
                    if (palillosCogidos > 0 && (palillosCogidos <= palillosDelMonton3)) {
                        if ((palillosCogidos == 2 && palillosDelMonton3 == 2) && (palillosDelMonton1 + palillosDelMonton2 <= 0)) {
                            System.out.println("Ⓞ No puedes restar " + palillosCogidos + " palillos al monton 3 Ⓞ ");
                            while (palillosCogidos >= 2 || palillosCogidos <= 0) {
                                System.out.println("ⓄⓄ Elige 1 palillo ⓄⓄ ");
                                palillosCogidos = 1;
                            }
                        }
                        System.out.println("Ⓞ Has elegido quitar " + palillosCogidos + " del monton " + MONTON3 + " Ⓞ");
                        hayPalillosParaRestar = true;
                    } else {
                        System.out.println("Ⓞ Error : El monton " + MONTON3 + " solo tiene : " + palillosDelMonton3 + " palillos Ⓞ");
                        while ((palillosCogidos > palillosDelMonton3)) {
                            System.out.println("Ⓞ La cantidad de palillos del monton " + MONTON3 + " es menor que la que has ingresado Ⓞ");
                            System.out.println("Ⓞ Palillos ingresados : " + palillosCogidos);
                            System.out.println("Ⓞ En el monton " + MONTON3 + " hay " + palillosDelMonton3 + " palillos");
                            System.out.println("Ⓞ Vuelve a elegir palillos que sean menores de " + palillosDelMonton3);
                            int palillosMenores = (int) (Math.random() * (0 + 2) + 1);
                            System.out.println("Ⓞ Valor asignado : ");
                            palillosCogidos = palillosMenores;
                        }
                    }
                }

            }

        }
        hayPalillosParaRestar = false;
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
    public static void restarDeCadaMontonLosPalillos(int turno, int monton, int palillosARestar) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("☥ Turno : " + turno);
        System.out.println("☥ Monton : " + monton);
        System.out.println("☥ Palillos a restar : " + palillosARestar);
        System.out.println("-----------------------------------------------------------------------------");

        if (turno == 1) {

            if (monton == MONTON1) {
                System.out.println("☥ Has elegido el monton 1 : ☥ ");
                palillosDelMonton1 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton1);
            }

            if (monton == MONTON2) {
                System.out.println("☥ Has elegido el monton 2 : ☥");
                palillosDelMonton2 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton2);
            }

            if (monton == MONTON3) {
                System.out.println("☥ Has elegido el monton 3 : ☥");
                palillosDelMonton3 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton3);

            }
        }

        if (turno == 2) {

            if (monton == MONTON1) {
                System.out.println("☥ Has elegido el monton 1 : ");
                palillosDelMonton1 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton1);
            }

            if (monton == MONTON2) {
                System.out.println("☥ Has elegido el monton 2 : ");
                palillosDelMonton2 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton2);
            }

            if (monton == MONTON3) {
                System.out.println("☥ Has elegido el monton 3 : ");
                palillosDelMonton3 -= palillosARestar;
                System.out.println("☥ Total : " + palillosDelMonton3);

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

        if (turno > 0 && turno <= 2) {
            if (palillosDelMonton1 == 1 && (palillosDelMonton2 == 0 && palillosDelMonton3 == 0)) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("○○ El monton: " + MONTON1 + " - tiene : " + palillosDelMonton1 + " palillos");
                System.out.println("○○ El monton: " + MONTON2 + " - tiene : " + palillosDelMonton2 + " palillos");
                System.out.println("○○ El monton: " + MONTON3 + " - tiene : " + palillosDelMonton3 + " palillos");
                String jugador = (turno == 1) ? "Jugador" : "Ordenador";
                System.out.println("○○ Ganador es el : " + jugador);
                System.out.println("○○ Fin del juego");
                System.out.println("-----------------------------------------------------------------------------");
                sigueJugando = true;
                if (palillosDelMonton1 == 0 && (palillosDelMonton2 >= 0 || palillosDelMonton3 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                    sigueJugando = false;
                }
            }

            if (palillosDelMonton2 == 1 && (palillosDelMonton1 == 0 && palillosDelMonton3 == 0)) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("○○ El monton: " + MONTON1 + " - tiene : " + palillosDelMonton1 + " palillos");
                System.out.println("○○ El monton: " + MONTON2 + " - tiene : " + palillosDelMonton2 + " palillos");
                System.out.println("○○ El monton: " + MONTON3 + " - tiene : " + palillosDelMonton3 + " palillos");
                String jugador = (turno == 1) ? "Jugador" : "Ordenador";
                System.out.println("○○ Ganador es el : " + jugador);
                System.out.println("○○ Fin del juego");
                System.out.println("-----------------------------------------------------------------------------");
                sigueJugando = true;
                if (palillosDelMonton2 == 0 && (palillosDelMonton1 >= 0 || palillosDelMonton3 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                    sigueJugando = false;
                }
            }

            if (palillosDelMonton3 == 1 && (palillosDelMonton1 == 0 && palillosDelMonton2 == 0)) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("○○ El monton: " + MONTON1 + " - tiene : " + palillosDelMonton1 + " palillos");
                System.out.println("○○ El monton: " + MONTON2 + " - tiene : " + palillosDelMonton2 + " palillos");
                System.out.println("○○ El monton: " + MONTON3 + " - tiene : " + palillosDelMonton3 + " palillos");
                String jugador = (turno == 1) ? "Jugador" : "Ordenador";
                System.out.println("○○ Ganador es el : " + jugador);
                System.out.println("○○ Fin del juego");
                System.out.println("-----------------------------------------------------------------------------");
                sigueJugando = true;
                if (palillosDelMonton3 == 0 && (palillosDelMonton1 >= 0 || palillosDelMonton2 >= 0)) {
                    System.out.println("○○ Sigue jugando ");
                    sigueJugando = false;
                }
            }
        }
        if (sigueJugando == false) {
            verResultado();
        }
    }

    public static void lanzarJuego() {
        crearPalillosParaMontones();

        do {
            elegirMonton(2);
            restarDeCadaMontonLosPalillos(2, montonElegido, elegirPalillos(2));
            comprobarFinJuego(2);
        } while (sigueJugando == false);

    }

    public static void main(String[] args) {

        lanzarJuego();
    }
}
