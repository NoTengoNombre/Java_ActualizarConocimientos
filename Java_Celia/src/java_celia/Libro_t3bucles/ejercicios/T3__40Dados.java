/**
 * @created on : 08-ago-2017, 16:47:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__40Dados {

    private final static Scanner SC = new Scanner(System.in);

    private static int fijarDinero;
    private static int apuesta;
    private static int restoDinero;

    private static int dado1;
    private static int dado2;
    private static int dado3;
    private static String res;
    private static int cc = 0;

    /**
     * Fijar dinero inicial para apostar
     */
    public static void setDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Introduce una cantidad de dinero para jugar entre 1 y 100 : ");
        fijarDinero = sc.nextInt();
        while (fijarDinero < 1 || fijarDinero > 100) {
            System.out.println("- Error : " + fijarDinero + " : Introduce una cantidad de dinero entre 1 y 100 : ");
            fijarDinero = sc.nextInt();
        }
    }

    /**
     * Hacer 1 apuesta siendo menor o igual al dinero Fijado
     */
    public static void setApuesta() {
        System.out.println("➯ Dinero para apostar : " + fijarDinero);
        Scanner sc = new Scanner(System.in);
        System.out.print("➯ Realiza una apuesta : ");
        apuesta = sc.nextInt();
        while (apuesta < 1 || apuesta > fijarDinero) {
            if (apuesta < 1) {
                System.out.println("➯ No puedes apostar menos dinero del que tienes : ");
                System.out.println("➯ Apuesta = " + apuesta + " : Dinero que posees = " + fijarDinero);
                System.out.print("➯ Introduce una nueva apuesta : ");
                apuesta = sc.nextInt();
            } else if (apuesta > fijarDinero) {
                System.out.println("➯ No puedes apostar mas dinero del que tienes : ");
                System.out.println("➯ Apuesta = " + apuesta + " : Dinero que posees = " + fijarDinero);
                System.out.print("➯ Introduce una nueva apuesta : ");
                apuesta = sc.nextInt();
            }
        }
        System.out.println("➯ Dinero apostado para jugar : " + apuesta);
    }

    /**
     * Hacer 1 apuesta siendo menor o igual al dinero Fijado
     */
    public static void setApuesta2() {
        System.out.println("◧ Dinero para apostar : " + restoDinero);
        Scanner sc = new Scanner(System.in);
        System.out.print("◧ Realiza una nueva apuesta : ");
        apuesta = sc.nextInt();
        while (apuesta < 1 || apuesta > restoDinero) {
            System.out.print("◧ Apuesta incorrecta : Realiza una nueva apuesta : ");
            apuesta = sc.nextInt();
            if (apuesta < 1) {
                System.out.println("◧ No puedes apostar menos dinero del que tienes : ");
                System.out.println("◧ Apuesta = " + apuesta + " : Dinero que posees = " + restoDinero);
                System.out.println("◧ Introduce una nueva apuesta : ");
                apuesta = sc.nextInt();
            }
            if (apuesta > fijarDinero) {
                System.out.println("◧ No puedes apostar mas dinero del que tienes : ");
                System.out.println("◧ Apuesta = " + apuesta + " : Dinero que posees = " + restoDinero);
                System.out.println("◧ Introduce una nueva apuesta : ");
                apuesta = sc.nextInt();
            }
        }
        System.out.println("◧ Dinero apostado para jugar : " + apuesta);
    }

    /**
     *
     */
    public static void setRestoDinero() {
        if ((apuesta <= fijarDinero) && (apuesta != 0)) {
            restoDinero = fijarDinero - apuesta;
            System.out.println("• Apuesta : " + apuesta);
            System.out.println("• Resto Dinero : " + restoDinero);
        }
    }

    /**
     *
     */
    public static void setRestoDinero2() {
        if ((apuesta <= restoDinero) && (restoDinero != 0)) {
            restoDinero = restoDinero - apuesta;
            System.out.println("❖ Apuesta : " + apuesta);
            System.out.println("❖ Resto Dinero : " + restoDinero);
        }
    }

    /**
     *
     */
    public static void setTiradaDados() {
        dado1 = (int) (Math.random() * (1 + 5) + 1);
        dado3 = (int) (Math.random() * (1 + 5) + 1);
        dado2 = (int) (Math.random() * (1 + 5) + 1);
    }

    /**
     *
     */
    public static void getComienzoDelJuego() {
        setDinero();
        setApuesta();
        setRestoDinero();

        cc = 0;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("⌘ Ronda : " + cc + " ⌘");
            System.out.println("---------------------------------------------------");
            if (cc >= 1) {
                System.out.println(" •••• Intro otra nueva apuesta •••• ");
                setApuesta2();
                setRestoDinero2();
            }

            setTiradaDados();

            System.out.println("◘ 1º Dado : " + dado1);
            System.out.println("◘ 2º Dado : " + dado2);
            System.out.println("◘ 3º Dado : " + dado3);

            if ((dado1 + dado2 + dado3) == 18) {
                apuesta *= 5;
                restoDinero += apuesta;
                System.out.println("---------------------------------------------------");
                System.out.println("✮ Apuesta Gananda ✮ ");
                System.out.println("♥ Premio : " + dado1 + " - " + dado2 + " - " + dado3 + " : Multiplicas x 5 el dinero apostado : " + apuesta + "  ");
                System.out.println("$$$ Tu dinero es de : " + restoDinero);
                System.out.println("---------------------------------------------------");
            }

            for (int i = 1; i <= 6; i++) {
                if (((dado1 == i) && (dado2 == i) && (dado3 == i))) {
                    apuesta *= 3;
                    restoDinero += apuesta;
                    System.out.println("---------------------------------------------------");
                    System.out.println("✮ Apuesta Gananda ✮ ");
                    System.out.println("♥ Premio : " + dado1 + " - " + dado2 + " - " + dado3 + " : Multiplicas x 3 el dinero apostado : " + apuesta + "  ");
                    System.out.println("$$$ Tu dinero es de : " + restoDinero);
                    System.out.println("---------------------------------------------------");
                }
            }

            for (int i = 1; i <= 6; i++) {
                if ((dado1 == i && dado2 == i) && dado3 != i) {
                    apuesta *= 2;
                    restoDinero += apuesta;
                    System.out.println("---------------------------------------------------");
                    System.out.println("✮ Apuesta Gananda ✮ ");
                    System.out.println("♥ Premio A : " + dado1 + " - " + dado2 + " - " + dado3 + " : Multiplicas x 2 el dinero apostado : " + apuesta + "  ");
                    System.out.println("$$$ Tu dinero actual es de : " + restoDinero);
                    System.out.println("---------------------------------------------------");
                }
                if ((dado2 == i && dado3 == i) && dado1 != i) {
                    apuesta *= 2;
                    restoDinero += apuesta;
                    System.out.println("---------------------------------------------------");
                    System.out.println("✮ Apuesta Gananda ✮ ");
                    System.out.println("♥ Premio B : " + dado1 + " - " + dado2 + " - " + dado3 + " : Multiplicas x 2 el dinero apostado : " + apuesta + "  ");
                    System.out.println("$$$ Tu dinero actual es de : " + restoDinero);
                    System.out.println("---------------------------------------------------");
                }
                if ((dado3 == i && dado1 == i) && dado2 != i) {
                    apuesta *= 2;
                    restoDinero += apuesta;
                    System.out.println("---------------------------------------------------");
                    System.out.println("✮ Apuesta Gananda ✮ ");
                    System.out.println("♥ Premio C : " + dado1 + " - " + dado2 + " - " + dado3 + " : Multiplicas x 2 el dinero apostado : " + apuesta + "  ");
                    System.out.println("$$$ Tu dinero actual es de : " + restoDinero);
                    System.out.println("---------------------------------------------------");
                }
            }

            if ((dado1 != dado2) && (dado2 != dado3) && (dado3 != dado1)) {
                if (restoDinero <= 0) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("✖ Lo siento no puedes seguir jugando");
                    System.out.println("$$$ Tu dinero actual es de : " + restoDinero);
                }
                System.out.println("---------------------------------------------------");
                System.out.println("✖ Lo siento : Tirada sin Premio");
                System.out.println("$$$ Tu dinero actual es de : " + restoDinero);
            }

            if (restoDinero <= 0) {
                res = "no";
            } else {
                System.out.println("✔ Para continuar jugando escriba 'si' || Para retirarte escriba 'no' ");
                res = SC.next();
                while ((!res.equals("si")) && (!res.equals("no"))) {
                    System.out.println("✖ Por favor : Para continuar jugando escriba 'si' || Para retirarte escriba 'no' ");
                    res = SC.next();
                }
            }
            cc++;
        } while (("si".equals(res)));
        System.out.println("---------------------------------------------------");
        System.out.println("• Fin del juego ");
        System.out.println("---------------------------------------------------");
        System.out.println("$$$ Dinero conseguido : " + restoDinero);
        System.out.println("⌘ Rondas alcanzadas : " + cc + " ⌘");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {

        getComienzoDelJuego();

    }
}
