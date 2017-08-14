/**
 * @created on : 14-ago-2017, 11:32:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__44_Juego_Nim {

    private static final Scanner SC = new Scanner(System.in);
    private static int monton; // variable para elegir el monton 
    private static int monton1palillos;
    private static int monton2palillos;
    private static int monton3palillos;

    private static int montonSelec;

    private static boolean repetir = true;

    /**
     * Se encarga de crear 3 montones asignandole a cada uno de ellos una
     * cantidad aleatoria de palillos ( 3 y 6 )
     *
     */
    public static void setCrearMontones() {
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
     * Elijo un monton del cual quiero coger palillos.
     *
     * monton - atributo con la cantidad de palillos
     *
     * Que tiene uno de los monton 1 , monton 2 , monton 3 ,
     *
     *
     */
    private static int setElegirMonton() {
        setCrearMontones();
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.print("◘ Elige el monton 1 , monton 2 , monton 3 ◘");
        int elegirMonton = SC.nextInt();
        while (elegirMonton <= 0 || elegirMonton > 3) {
            System.out.println("◘ Error: Por favor - Elige entre el monton 1 , monton 2 , monton 3 ");
            elegirMonton = SC.nextInt();
        }
        if (elegirMonton == 1) {
            monton = monton1palillos;
            System.out.println("◘ El monton elegido es el : " + monton);
            return monton; // monton seleccionado e incluye la cantidad de palillos
        }
        if (elegirMonton == 2) {
            monton = monton2palillos;
            System.out.println("◘ El monton elegido es el : " + monton);
            return monton; // monton seleccionado e incluye la cantidad de palillos

        }
        if (elegirMonton == 3) {
            monton = monton3palillos;
            System.out.println("◘ El monton elegido es el : " + monton);
            return monton; // monton seleccionado e incluye la cantidad de palillos
        }
        return monton; // monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     *
     * @return
     */
    private static int setElegirMontonOrdenador() {
        setCrearMontones();
        System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        System.out.print("♨ El ordenador elige el monton 1 , monton 2 , monton 3 ♨\n");
        int elegirMonton = (int) (Math.random() * (1 + 2) + 1);
        if (elegirMonton == 1) {
            monton = monton1palillos;
            System.out.println("♨ El monton 1 de palillos elegidos tiene : " + monton + " palillos ♨");
            return monton; // monton seleccionado e incluye la cantidad de palillos
        }
        if (elegirMonton == 2) {
            monton = monton2palillos;
            System.out.println("♨ El monton 2 de palillos elegidos tiene : " + monton + " palillos ♨");
            return monton; // monton seleccionado e incluye la cantidad de palillos

        }
        if (elegirMonton == 3) {
            monton = monton3palillos;
            System.out.println("♨ El monton 3 de palillos elegidos es el 3 con tienen : " + monton + " palillos ♨");
            return monton; // monton seleccionado e incluye la cantidad de palillos
        }
        return monton; // monton 1 | monton 2 | monton 3 + palillos
    }

    /**
     * Comprueba si el monton elegido tiene algun palillo.
     *
     * Devuelve true - SI tiene palillos el monton elegido
     *
     * Devuelve false - NO tiene algun palillo devuelve false
     *
     * @return true o false
     */
    public static int getComprobarMonton() {
        int con = 0;
        System.out.println("♠ Elige un monton entre los montones 1 , 2 , 3 ♠ ");
        int elegirMonton = SC.nextInt();

        while (elegirMonton <= 0 || elegirMonton > 3) {
            System.out.println("♠ Por favor elegir un monton correcto entre 1 , 2 , 3 ♠ ");
            elegirMonton = SC.nextInt();
        }

        while (repetir == true) {

            if (con >= 1) {
                System.out.println("♠ Error: ese montón ya no tiene palillos ♠ ");
                elegirMonton = SC.nextInt();
            }

            if (elegirMonton == 1) {
                if (monton1palillos >= 1) {
                    System.out.println("♠ Monton " + elegirMonton + " tiene " + monton1palillos + " palillos ");
                    repetir = false;
                    montonSelec = elegirMonton;
                } else {
                    System.out.println("♠ Monton " + elegirMonton + " : NO tiene palillos ");
                }
            }

            if (elegirMonton == 2) {
                if (monton2palillos >= 1) {
                    System.out.println("♠ Monton " + elegirMonton + " tiene " + monton2palillos + " palillos ");
                    repetir = false;
                    montonSelec = elegirMonton;
                } else {
                    System.out.println("♠ Monton " + elegirMonton + " : NO tiene palillos ");
                }
            }

            if (elegirMonton == 3) {
                if (monton3palillos >= 1) {
                    System.out.println("♠ Monton " + elegirMonton + " tiene " + monton3palillos + " palillos ");
                    repetir = false;
                    montonSelec = elegirMonton;
                } else {
                    System.out.println("♠ Monton " + elegirMonton + " : NO tiene palillos ");
                }
            }
            con++;
        }
        return montonSelec;
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
            setElegirMonton();
            if (getComprobarMonton() >= 1) {
                devolverNumeroMonton = getComprobarMonton();
                return devolverNumeroMonton;
            }
        }
        if (pTurno == 2) {
            setElegirMontonOrdenador();
            if (getComprobarMonton() >= 1) {
                devolverNumeroMonton = getComprobarMonton();
                return devolverNumeroMonton;
            }
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
//        setCrearMontones();
        setElegirMonton();
//        getComprobarMonton();
//        setElegirMontonOrdenador();
        getElegirPalillos(1);
        System.out.println("Monton seleccionado : " + getComprobarMonton());
    }

}
