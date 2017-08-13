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
public class T3__43_TragaPerras5ArreglarRepeticionJuego1 {

    public static final Scanner SC = new Scanner(System.in);

    private static int num1;// numeros para las combinaciones
    private static int num2;// numeros para las combinaciones
    private static int num3;// numeros para las combinaciones
    private static double dineroTotal = 10; // dinero total para apostar
    private static String frutaString; // Muestra el nombre de la fruta
    private static int premio;// premio recibido
    private static int con;// premio recibido

// Muestra el nombre de la fruta
    private static final String MANZANAS = "MANZANAS";
    private static final String NARANJAS = "NARANJAS";
    private static final String LIMONES = "LIMONES";
    private static final String FRESAS = "FRESAS";
    private static final String SANDIAS = "SANDIAS";
    private static final String CEREZAS = "CEREZAS";

// Almacena el dibujo de la fruta
    private static String imgFruta;
// Almacena el dibujo de la fruta de los distintos numeros
    private static String frutaNumero1;
    private static String frutaNumero2;
    private static String frutaNumero3;

    /**
     * Fija el dinero con el que jugar y se almacena en una variable STATIC
     * dineroTotal
     *
     */
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

    /**
     * Cada vez que se inice una partida le resto 0.50 al total del dineroTotal
     * hasta que llega a 0 el dineroTotal
     */
    public static void setIniciarPartida() {
        if (con == 0) {
            dineroTotal -= 0.5;
            System.out.println("@ Introduce 1 moneda : " + dineroTotal + "\n");
            con++;
        } else {
            dineroTotal -= 0.5;
            System.out.println("@ Introduce otra moneda : " + dineroTotal + "\n");
        }
    }

    /**
     * Suma el premio al total del dinero
     *
     * @param dineroGanado
     */
    public static void setAnadirPremio(int dineroGanado) {
        dineroTotal += dineroGanado;

    }

    /**
     * Fija los numeros de los numeros aleatorios y el tipo de simbolo que
     * representa la fruta
     */
    public static void setNumeroAleatorios() {
        num1 = (int) (Math.random() * (1 + 5) + 1);
        num2 = (int) (Math.random() * (1 + 5) + 1);
        num3 = (int) (Math.random() * (1 + 5) + 1);
        frutaNumero1 = getFrutaEnPantalla(num1);
        frutaNumero2 = getFrutaEnPantalla(num2);
        frutaNumero3 = getFrutaEnPantalla(num3);
    }

    /**
     * Por cada numero pasado por parametro le corresponde un simbolo
     *
     * @param numeroFruta
     * @return Simbolo de la fruta
     */
    public static String getFrutaEnPantalla(int numeroFruta) {
        switch (numeroFruta) {
            case 1:
                imgFruta = "◎ MANZANAS ◎ ";
                break;
            case 2:
                imgFruta = "● NARANJAS ● ";
                break;
            case 3:
                imgFruta = "❂ LIMONES ❂ ";
                break;
            case 4:
                imgFruta = "♠ FRESAS ♠ ";
                break;
            case 5:
                imgFruta = "❍ SANDIAS ❍ ";
                break;
            case 6:
                imgFruta = "◍◍◍ CEREZAS ◍◍◍";
                break;
            default:
                break;
        }
        return imgFruta;
    }

    /**
     *
     * @param indice
     * @return
     */
    public static void getPremio3Aciertos(int indice) {
        for (int in = 0; in < 7; in++) {
            if (in == indice && in == 1) {
                frutaString = MANZANAS;
                premio = 5;
                System.out.printf("\t     ⋖ 6º Premio ⋗ \n");
                System.out.println("☻ Trio de " + frutaString + " - Premio de " + premio + " € ");
                setAnadirPremio(premio);
            }
            if (in == indice && in == 2) {
                frutaString = NARANJAS;
                premio = 5;
                System.out.printf("\t     ⋖ 5º Premio ⋗ \n");
                System.out.println("☻ Trio de " + frutaString + " - Premio de " + premio + " € ");
                setAnadirPremio(premio);
            }
            if (in == indice && in == 3) {
                frutaString = LIMONES;
                premio = 5;
                System.out.printf("\t     ⋖ 4º Premio ⋗ \n");
                System.out.println("☻ Trio de " + frutaString + " - Premio de " + premio + " € ");
                setAnadirPremio(premio);
            }
            if (in == indice && in == 4) {
                frutaString = FRESAS;
                premio = 10;
                System.out.printf("\t     ⋖ 3º Premio ⋗ \n");
                System.out.printf("\t      ✸ Triple " + frutaString + " ✸\n ");
                System.out.printf("\t\tPremio de " + premio + " € \n");
                setAnadirPremio(premio);
            }
            if (in == indice && in == 5) {
                frutaString = SANDIAS;
                premio = 20;
                System.out.printf("\t      ⋖⋖ 2º Premio ⋗⋗ \n");
                System.out.printf("\t    ✯✯ Triple " + frutaString + " ✯✯\n ");
                System.out.printf("\t\tPremio de " + premio + " € \n");
                setAnadirPremio(premio);
            }
            if (in == indice && in == 6) {
                frutaString = CEREZAS;
                premio = 30;
                System.out.printf("\t  ⋖⋖⋖ 1º Premio ⋗⋗⋗  \n");
                System.out.printf("\t   ✪✪✪ Triple " + frutaString + " ✪✪✪\n ");
                System.out.printf("\t\tPremio de " + premio + " € \n");

                setAnadirPremio(premio);
            }
        }
    }

    public static void getPremio2Aciertos(int x, int y) {
        for (int i = 0; i < 7; i++) {
            if (i == x && i == y && i == 1) {
                frutaString = MANZANAS;
                premio = 1;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
            if (i == x && i == y && i == 2) {
                frutaString = NARANJAS;
                premio = 1;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
            if (i == x && i == y && i == 3) {
                frutaString = LIMONES;
                premio = 1;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
            if (i == x && i == y && i == 4) {
                frutaString = FRESAS;
                premio = 1;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
            if (i == x && i == y && i == 5) {
                frutaString = SANDIAS;
                premio = 2;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
            if (i == x && i == y && i == 6) {
                frutaString = CEREZAS;
                premio = 3;
                System.out.println("★★ 2 Aciertos : Pareja de " + frutaString + " ★★");
                System.out.println("      ★★ Has ganado " + premio + " euros ★★");
                setAnadirPremio(premio);
            }
        }
    }

    public static void setIniciarJuego() {

//        do {
        String respuesta;
        do {
            setIniciarPartida();
            setNumeroAleatorios();

            System.out.println("---------------------------------------------");
            System.out.println(frutaNumero1 + "| " + frutaNumero2 + " | " + frutaNumero3);

            for (int i = 0; i < 7; i++) {
                if (num1 == i && num2 == i && num3 == i) {
                    getPremio3Aciertos(i);
                }
                if (num1 == i && num2 == i && (num3 != num1 || num3 != num2)) {
                    getPremio2Aciertos(num1, num2);
                }
                if (num2 == i && num3 == i && (num1 != num2 || num1 != num3)) {
                    getPremio2Aciertos(num2, num3);
                }
                if (num1 == i && num3 == i && (num2 != num1 || num2 != num3)) {
                    getPremio2Aciertos(num1, num3);
                }
                if (i == 6 && (num1 != num2 && num2 != num3 && num1 != num3)) {
                    System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
                    System.out.println("☠☠☠  \t\tSin Premio\t\t☠☠☠");
                    System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
                }
            }

            System.out.println("\t$ Dinero Disponible : " + dineroTotal);
            System.out.println("---------------------------------------------\n");

            System.out.println("Escriba 'si' o 'no' para continuar el juego ");
            respuesta = SC.next();

        } while ((dineroTotal > 0) && (!(respuesta.equals("no"))));
        if (dineroTotal <= 0) {
            System.out.println(" ☢  ☢ Has perdido todo el dinero  ☢  ☢ ");
        } else {
            System.out.println("$$$ Dinero Ganado " + dineroTotal + " $$$ ");
        }
    }

    public static void main(String[] args) {

        setIniciarJuego();
    }

}
