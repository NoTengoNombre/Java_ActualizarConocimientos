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
public class T3__43_TragaPerras {

    public static final Scanner SC = new Scanner(System.in);

    public static double dineroInicial = 100;
    public static double dineroTotal;
    public static double apuesta;
    public static int x;
    public static int y;
    public static int z;

    public static final int MANZANA = 1;
    public static final int NARANJA = 2;
    public static final int LIMON = 3;
    public static final int FRESA = 4;
    public static final int SANDIA = 5;
    public static final int CEREZA = 6;

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
    
    
    public static void setJugada() {
        setNumeroAleatorios();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//        x = 6;
//        y = 6;
//        z = 6;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
        for (int i = 0; i < 7; i++) {
//            if (x == i && y == i && z == i) {
//                if (i == CEREZA) {
//                    System.out.println(" 3 CEREZA + 30 euros ");
//                }
//                if (i == SANDIA) {
//                    System.out.println(" 3 SANDIAS + 20 euros ");
//                }
//                if (i == FRESA) {
//                    System.out.println(" 3 FRESAS + 10 euros ");
//                }
//                if (i == LIMON) {
//                    System.out.println(" 3 LIMONES + 5 euros ");
//                }
//                if (i == NARANJA) {
//                    System.out.println(" 3 NARANJA + 5 euros ");
//                }
//                if (i == MANZANA) {
//                    System.out.println(" 3 MANZANA + 5 euros ");
//                }
//            }

            if (x == i && y == i) {
                if (i == CEREZA) {
                    System.out.println(" 2 CEREZAS + 3 euros ");
                }
                if (i == SANDIA) {
                    System.out.println(" 2 SANDIAS + 2 euros ");
                }
                if (i == FRESA) {
                    System.out.println(" 2 FRESAS + 1 euros ");
                }
                if (i == LIMON) {
                    System.out.println(" 2 LIMONES + 1 euros ");
                }
                if (i == NARANJA) {
                    System.out.println(" 2 NARANJAS + 1 euros ");
                }
                if (i == MANZANA) {
                    System.out.println(" 2 MANZANAS + 1 euros ");
                }

            }
            if (y == i && z == i) {
                if (i == CEREZA) {
                    System.out.println(" 2 CEREZAS + 3 euros ");
                }
                if (i == SANDIA) {
                    System.out.println(" 2 SANDIAS + 2 euros ");
                }
                if (i == FRESA) {
                    System.out.println(" 2 FRESAS + 1 euros ");
                }
                if (i == LIMON) {
                    System.out.println(" 2 LIMONES + 1 euros ");
                }
                if (i == NARANJA) {
                    System.out.println(" 2 NARANJAS + 1 euros ");
                }
                if (i == MANZANA) {
                    System.out.println(" 2 MANZANAS + 1 euros ");
                }

            }
            if (z == i && x == i) {
                if (i == CEREZA) {
                    System.out.println(" 2 CEREZAS + 3 euros ");
                }
                if (i == SANDIA) {
                    System.out.println(" 2 SANDIAS + 2 euros ");
                }
                if (i == FRESA) {
                    System.out.println(" 2 FRESAS + 1 euros ");
                }
                if (i == LIMON) {
                    System.out.println(" 2 LIMONES + 1 euros ");
                }
                if (i == NARANJA) {
                    System.out.println(" 2 NARANJAS + 1 euros ");
                }
                if (i == MANZANA) {
                    System.out.println(" 2 MANZANAS + 1 euros ");
                }
            }
        }
    }

    public static void main(String[] args) {
        setJugada();
    }

}
