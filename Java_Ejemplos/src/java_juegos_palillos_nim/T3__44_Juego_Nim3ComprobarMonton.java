/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_juegos_palillos_nim;

import java.util.Scanner;

public class T3__44_Juego_Nim3ComprobarMonton {

    private static final Scanner SC = new Scanner(System.in);
    private static int monton; // variable para elegir el monton 
    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

    private static int montonElegido;

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
     *
     */
    private static int elegirMontonUsuario() {
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.print("◘ Elige entre el monton 1 , monton 2 , monton 3 ◘ \n");
        montonElegido = SC.nextInt();
        while (montonElegido <= 0 || montonElegido > 3) {
            System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ");
            montonElegido = SC.nextInt();
        }
        if (montonElegido == 1) {
            monton = monton1palillos;
            System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + monton + " palillos ");
            return montonElegido; // monton seleccionado e incluye la cantidad de palillos
        }
        if (montonElegido == 2) {
            monton = monton2palillos;
            System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + monton + " palillos ");
            return montonElegido; // monton seleccionado e incluye la cantidad de palillos

        }
        if (montonElegido == 3) {
            monton = monton3palillos;
            System.out.println("◘ El 'Humano' eligio el monton " + montonElegido + " con " + monton + " palillos ");
            return montonElegido; // monton seleccionado e incluye la cantidad de palillos
        }
        return montonElegido; // monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     *
     * @return
     */
    private static int elegirMontonOrdenador() {
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.print("♨ El 'ORDENADOR' elige entre monton 1 , monton 2 , monton 3 ♨\n");
        montonElegido = (int) (Math.random() * (1 + 2) + 1);
        if (montonElegido == 1) {
            monton = monton1palillos;
            System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + monton + " palillos ♨");
        }
        if (montonElegido == 2) {
            monton = monton2palillos;
            System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + monton + " palillos ♨");

        }
        if (montonElegido == 3) {
            monton = monton3palillos;
            System.out.println("♨ El 'ORDENADOR' eligio el monton " + montonElegido + " tiene : " + monton + " palillos ♨");
        }
        return montonElegido; // monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     * Comprueba si el monton elegido tiene algun palillo.
     *
     * Devuelve true - SI tiene palillos el monton elegido
     *
     * Devuelve false - NO tiene algun palillo devuelve false
     *
     * @param montonElegido
     *
     * @return true o false
     */
    public static boolean getComprobarMonton(int montonElegido) {

        boolean tienePalillos = false;

        if (montonElegido == 1) {
            if (monton >= 1) {
                System.out.println("♠ El Monton " + montonElegido + " tiene " + monton + " palillos ");
                tienePalillos = true;
            } else {
                System.out.println("♠ El Monton " + montonElegido + " No tiene " + monton + " palillos ");
                tienePalillos = false;
            }
        }
        if (montonElegido == 2) {
            if (monton >= 1) {
                System.out.println("♠ El Monton " + montonElegido + " tiene " + monton + " palillos ");
                tienePalillos = true;
            } else {
                System.out.println("♠ El Monton " + montonElegido + " No tiene " + monton + " palillos ");
                tienePalillos = false;
            }
        }
        if (montonElegido == 3) {
            if (monton >= 1) {
                System.out.println("♠ El Monton " + montonElegido + " tiene " + monton + " palillos ");
                tienePalillos = true;
            } else {
                System.out.println("♠ El Monton " + montonElegido + " No tiene " + monton + " palillos ");
                tienePalillos = false;
            }
        }
        return tienePalillos;
    }

    /**
     * Encarga de pedir usuario elija un monton.
     *
     * El ordenador elija un montón al azar.
     *
     * Despues llama al metodo getComprobarMonton para ver el monton elegido
     * correcto ,
     *
     * SI ES ASI devuelve un monton elegido SINO mostrara un mensaje de error
     *
     * El monton no tiene palillos y volvera a pedir que elija un monton
     *
     * @param pTurno
     * @return
     */
    public static int getElegirPalillos(int pTurno) {

        int devolverNumeroMonton = 0;

        if (pTurno == 1) {
            devolverNumeroMonton = elegirMontonUsuario();

        }
        if (pTurno == 2) {
            devolverNumeroMonton = elegirMontonOrdenador();

        }
        return devolverNumeroMonton;
    }

    /**
     * Dependiendo del valor del turno.
     *
     * Pide al usuario que elija numero de palillos quiere retirar o el
     * ordenador elija al azar entre 1 y 2
     *
     * Luego llama a comprobarPalillos , decide
     *
     * SI el numero de palillos elegido es correcto
     *
     * SI ES ASI , se devuelve el numeor de palillos elegidos SINO se muestra un
     * mensaje de error
     *
     * Vuelve a pedir que se introduzca un numero de palillos
     *
     * @return
     */
    public static int getElegirPalillos() {
        return 0;
    }

    /**
     * Si el numero de palillos elegidos es IGUAL o MENOR que el monton devuelve
     * correcto = true SINO devuelve correcto = false
     *
     * @return true o false
     */
    public static boolean getComprobarPalillos() {

        return true;
    }

    /**
     * Mira si en todos los montones queda por retirar un palillo
     *
     * Si es asi , el juego acaba , SINO continua el juego
     *
     * Si solo queda 1 palillo el jugador de ese turno gana
     *
     * @return
     */
    public static boolean getComprobarFinJuego() {
        return true;
    }

    public static void main(String[] args) {
//        getPalillos();
        crearMontones();
//        getElegirMontonUsuario();
        getComprobarMonton(elegirMontonOrdenador());
//        getElegirPalillos(2);
//        System.out.println("Monton seleccionado : " + getComprobarMonton());
    }

}
