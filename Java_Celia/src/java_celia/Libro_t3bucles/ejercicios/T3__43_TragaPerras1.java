/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Portatil_Bot
 */
public class T3__43_TragaPerras1 {

    public static final Scanner SC = new Scanner(System.in);

    public static double dineroInicial = 100;
    public static double dineroTotal;
    public static double apuesta;
    public static int x;
    public static int y;
    public static int z;
    public static int fruta;
    public static int premio;
    public static String frutaString;

    public static final int MANZANA = 1;
    public static final int NARANJA = 2;
    public static final int LIMON = 3;
    public static final int FRESA = 4;
    public static final int SANDIA = 5;
    public static final int CEREZA = 6;

    public static final String MANZANAS = "MANZANA";
    public static final String NARANJAS = "NARANJA";
    public static final String LIMONES = "LIMON";
    public static final String FRESAS = "FRESAS";
    public static final String SANDIAS = "SANDIAS";
    public static final String CEREZAS = "CEREZAS";

    public static void setDineroInicial() {
        System.out.println(" *** BIENVENIDO AL JUEGO DE LA TRAGAPERRAS *** ");
        System.out.println("¿Con cuánto dinero desea empezar (de 1 a 50 euros) ? ");
        dineroInicial = SC.nextInt();
        while (dineroInicial < 1 || dineroInicial > 50) {
            try {
                System.out.println(" Introduce una cantidad entre 1 a 50 euros ");
                dineroInicial = SC.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error ! " + e.getLocalizedMessage() + " Mensaje " + e.getMessage());
            }
        }
    }

    public static void setApuesta1() {
        dineroTotal = dineroInicial - 0.50;
        System.out.println(dineroTotal);
    }

    public static void setApuesta2() {
        dineroTotal -= 0.50;
        System.out.println(dineroTotal);
    }

    public static void setNumeroAleatorios() {
        x = (int) (Math.random() * (1 + 5) + 1);
        y = (int) (Math.random() * (1 + 5) + 1);
        z = (int) (Math.random() * (1 + 5) + 1);
    }

    /**
     *
     * @param fruta
     * @return
     */
    public static int getFruta3Figuras(int fruta) {
        for (int i = 0; i < 7; i++) {
            if (i == fruta && i == 1) {
                frutaString = MANZANAS;
                premio = 5;
            }
            if (i == fruta && i == 2) {
                frutaString = NARANJAS;
                premio = 5;
            }
            if (i == fruta && i == 3) {
                frutaString = LIMONES;
                premio = 5;
            }
            if (i == fruta && i == 4) {
                frutaString = FRESAS;
                premio = 10;
            }
            if (i == fruta && i == 5) {
                frutaString = SANDIAS;
                premio = 20;
            }
            if (i == fruta && i == 6) {
                frutaString = CEREZAS;
                premio = 30;
            }
        }
        return fruta;
    }

    public static int getFruta2Figuras(int fruta) {
        for (int i = 0; i < 7; i++) {
            if (i == fruta && i == 1) {
                frutaString = MANZANAS;
                premio = 5;
            }
            if (i == fruta && i == 2) {
                frutaString = NARANJAS;
                premio = 5;
            }
            if (i == fruta && i == 3) {
                frutaString = LIMONES;
                premio = 5;
            }
            if (i == fruta && i == 4) {
                frutaString = FRESAS;
                premio = 10;
            }
            if (i == fruta && i == 5) {
                frutaString = SANDIAS;
                premio = 20;
            }
            if (i == fruta && i == 6) {
                frutaString = CEREZAS;
                premio = 30;
            }
        }
        return fruta;
    }

    public static void setJugada() {
        setNumeroAleatorios();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        for (int i = 0; i < 7; i++) {
            if (x == i && y == i && z == i) {
                if (getFruta3Figuras(i) == i) {
                    System.out.println(" 3 " + frutaString + " -> " + premio + " euros ");
                }
                if (x == i && y == i) {
                    if (getFruta2Figuras(i) == i) {
                    System.out.println(" 2 " + frutaString + " -> " + premio + " euros ");
                    }
                }

            }

//                if (i == CEREZA) {
//                    System.out.println(" 2 CEREZAS + 3 euros ");
//                }
//                if (i == SANDIA) {
//                    System.out.println(" 2 SANDIAS + 2 euros ");
//                }
//                if (i == FRESA) {
//                    System.out.println(" 2 FRESAS + 1 euros ");
//                }
//                if (i == LIMON) {
//                    System.out.println(" 2 LIMONES + 1 euros ");
//                }
//                if (i == NARANJA) {
//                    System.out.println(" 2 NARANJAS + 1 euros ");
//                }
//                if (i == MANZANA) {
//                    System.out.println(" 2 MANZANAS + 1 euros ");
//                }
//
//            }
//            if (y == i && z == i) {
//                if (i == CEREZA) {
//                    System.out.println(" 2 CEREZAS + 3 euros ");
//                }
//                if (i == SANDIA) {
//                    System.out.println(" 2 SANDIAS + 2 euros ");
//                }
//                if (i == FRESA) {
//                    System.out.println(" 2 FRESAS + 1 euros ");
//                }
//                if (i == LIMON) {
//                    System.out.println(" 2 LIMONES + 1 euros ");
//                }
//                if (i == NARANJA) {
//                    System.out.println(" 2 NARANJAS + 1 euros ");
//                }
//                if (i == MANZANA) {
//                    System.out.println(" 2 MANZANAS + 1 euros ");
//                }
//
//            }
//            if (z == i && x == i) {
//                if (i == CEREZA) {
//                    System.out.println(" 2 CEREZAS + 3 euros ");
//                }
//                if (i == SANDIA) {
//                    System.out.println(" 2 SANDIAS + 2 euros ");
//                }
//                if (i == FRESA) {
//                    System.out.println(" 2 FRESAS + 1 euros ");
//                }
//                if (i == LIMON) {
//                    System.out.println(" 2 LIMONES + 1 euros ");
//                }
//                if (i == NARANJA) {
//                    System.out.println(" 2 NARANJAS + 1 euros ");
//                }
//                if (i == MANZANA) {
//                    System.out.println(" 2 MANZANAS + 1 euros ");
//                }
//            }
        }
    }

    public static void main(String[] args) {
        setJugada();
    }

}
