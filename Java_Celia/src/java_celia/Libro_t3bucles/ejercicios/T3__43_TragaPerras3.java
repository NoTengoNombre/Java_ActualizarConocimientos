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
public class T3__43_TragaPerras3 {

    public static final Scanner SC = new Scanner(System.in);

    private static int num1;
    private static int num2;
    private static int num3;
    private static int premio;
    private static double dineroTotal = 100;
    private static String frutaString;

    private static final String MANZANAS = "MANZANA";
    private static final String NARANJAS = "NARANJA";
    private static final String LIMONES = "LIMON";
    private static final String FRESAS = "FRESAS";
    private static final String SANDIAS = "SANDIAS";
    private static final String CEREZAS = "CEREZAS";

    private static String imgFruta;
    private static String frutaNumero1;
    private static String frutaNumero2;
    private static String frutaNumero3;
    private static String iniciarJuego;

    public static void setDineroInicial() {
        System.out.println(" *** BIENVENIDO AL JUEGO DE LA TRAGAPERRAS *** ");
        System.out.println("¿Con cuánto dinero desea empezar (de 1 a 50 euros) ? ");
        dineroTotal = SC.nextInt();
        while (dineroTotal < 1 || dineroTotal > 50) {
            try {
                System.out.println(" Introduce una cantidad entre 1 a 50 euros ");
                dineroTotal = SC.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error ! " + e.getLocalizedMessage() + " Mensaje " + e.getMessage());
            }
        }
    }

    public static void setIniciarPartida() {
        dineroTotal = dineroTotal - 0.50;
        System.out.println("Introduce otra moneda : " + dineroTotal);
    }

    public static void setAnadirPremio() {
        dineroTotal = dineroTotal + premio;
        System.out.println("Dinero Disponible : " + dineroTotal);
    }

    public static void setNumeroAleatorios() {
        num1 = (int) (Math.random() * (1 + 5) + 1);
        num2 = (int) (Math.random() * (1 + 5) + 1);
        num3 = (int) (Math.random() * (1 + 5) + 1);
        frutaNumero1 = getFrutaEnPantalla(num1);
        frutaNumero2 = getFrutaEnPantalla(num2);
        frutaNumero3 = getFrutaEnPantalla(num3);
//        num1 = 1; num2 = 2; num3 = 1;
    }

    public static String getFrutaEnPantalla(int frutaNumero) {
        switch (frutaNumero) {
            case 1:
                imgFruta = "Օ MANZANAS ";
                break;
            case 2:
                imgFruta = "● NARANJAS ";
                break;
            case 3:
                imgFruta = "❂ LIMONES";
                break;
            case 4:
                imgFruta = "♠ FRESAS ";
                break;
            case 5:
                imgFruta = "❍ SANDIAS ";
                break;
            case 6:
                imgFruta = "◎ CEREZAS ";
                break;
            default:
                break;
        }
        return imgFruta;
    }

    public static int getFruta3Figuras(int fruta) {
        for (int i = 0; i < 7; i++) {
            if (i == fruta && i == 1) {
                frutaString = MANZANAS;
                premio = 5;
                System.out.println("Triple Aciertos " + i + " - " + i + " - " + i + " " + frutaString + " - Premio de " + premio + " ");
                setAnadirPremio();
            }
            if (i == fruta && i == 2) {
                frutaString = NARANJAS;
                premio = 5;
                System.out.println("Triple Aciertos " + i + " - " + i + " - " + i + " " + frutaString + " - Premio de " + premio + " ");
                setAnadirPremio();
            }
            if (i == fruta && i == 3) {
                frutaString = LIMONES;
                premio = 5;
                System.out.println("Triple Aciertos " + i + " - " + i + " - " + i + " " + frutaString + " - Premio de " + premio + " ");
                setAnadirPremio();
            }
            if (i == fruta && i == 4) {
                frutaString = FRESAS;
                premio = 10;
                System.out.printf("\t\t   " + i + " - " + i + " - " + i + "\n");
                System.out.printf("\t \t ⋖ 3º Premio ⋗ \n");
                System.out.printf("\t       ✸ Triple " + frutaString + " ✸\n ");
                System.out.printf("\t\t  Premio de " + premio + " € \n");
                setAnadirPremio();

            }
            if (i == fruta && i == 5) {
                frutaString = SANDIAS;
                premio = 20;
                System.out.printf("\t\t     " + i + " - " + i + " - " + i + "\n");
                System.out.printf("\t \t ⋖⋖ 2º Premio ⋗⋗ \n");
                System.out.printf("\t       ✯✯ Triple " + frutaString + " ✯✯\n ");
                System.out.printf("\t\t    Premio de " + premio + " € \n");
                setAnadirPremio();
            }
            if (i == fruta && i == 6) {
                frutaString = CEREZAS;
                premio = 30;
                System.out.printf("\t\t     " + i + " - " + i + " - " + i + "\n");
                System.out.printf("\t \t ⋖⋖⋖ 1º Premio ⋗⋗⋗  \n");
                System.out.printf("\t       ✪✪✪ Triple " + frutaString + " ✪✪✪\n ");
                System.out.printf("\t\t    Premio de " + premio + " € \n");
                setAnadirPremio();
            }
        }
        return fruta;
    }

    public static int getFruta2Figuras(int x, int y) {
        for (int i = 0; i < 7; i++) {
            if (i == x && i == y && i == 1) {
                frutaString = MANZANAS;
                premio = 1;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
            if (i == x && i == y && i == 2) {
                frutaString = NARANJAS;
                premio = 1;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
            if (i == x && i == y && i == 3) {
                frutaString = LIMONES;
                premio = 1;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
            if (i == x && i == y && i == 4) {
                frutaString = FRESAS;
                premio = 1;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
            if (i == x && i == y && i == 5) {
                frutaString = SANDIAS;
                premio = 2;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
            if (i == x && i == y && i == 6) {
                frutaString = CEREZAS;
                premio = 3;
                System.out.println(" 2 Aciertos " + frutaString + " -> " + premio + " euros ");
                setAnadirPremio();
            }
        }
        return premio;
    }

    public static void setIniciarJuego() {
        do {
            setIniciarPartida();
            setAnadirPremio();
            setNumeroAleatorios();
            System.out.println(frutaNumero1 + " - " + frutaNumero2 + " - " + frutaNumero3);
            for (int i = 0; i < 7; i++) {
                if (num1 == i && num2 == i && num3 == i) {
                    if (getFruta3Figuras(i) == i) {
                    }
                }
                if (num1 == i && num2 == i && (num3 != num1 || num3 != num2)) {
                    if (getFruta2Figuras(num1, num2) == i) {
                    }
                }
                if (num2 == i && num3 == i && (num1 != num2 || num1 != num3)) {
                    if (getFruta2Figuras(num2, num3) == i) {
                    }
                }
                if (num1 == i && num3 == i && (num2 != num1 || num2 != num3)) {
                    if (getFruta2Figuras(num1, num3) == i) {
                    }
                }
                if (i == 6 && premio == 0) {
                    System.out.println("Sin Premio");
                }
            }

            System.out.print("¿ Desea jugar otra vez (S/N) ? ");
            iniciarJuego = SC.next();

            while (!(iniciarJuego.equals("s")) || (!(iniciarJuego.equals("n")))) {
                System.out.print(" Por favor escriba (S/N)  ");
                iniciarJuego = SC.next();
            }

            System.out.println("Dinero Total : " + dineroTotal);

        } while ((iniciarJuego.equals("s") && dineroTotal > 0) && (!iniciarJuego.equals("n") || dineroTotal < 0));
        System.out.println("Dinero Total : " + dineroTotal);
    }

    public static void main(String[] args) {
        setIniciarJuego();
    }

}
