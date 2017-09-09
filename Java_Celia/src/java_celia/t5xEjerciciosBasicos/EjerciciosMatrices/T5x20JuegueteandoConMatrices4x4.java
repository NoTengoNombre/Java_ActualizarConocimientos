/**
 * @created on : 08-sep-2017, 23:42:48
 * @see
 * @since
 * @version 1 - Diferente a la version del profesor porque llega hasta la mitad
 * de las columnas centrales
 *
 * Solo funciona con dimension 4 x 4
 *
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

import java.util.Scanner;

public class T5x20JuegueteandoConMatrices4x4 {

    public static int getValorPorTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tIntroduce una opcion entre 1 y 3");
        int n = sc.nextInt();
        if (n < 0 || n > 3) {
            while (n < 0 || n > 3) {
                System.out.println("Valor introducido " + n);
                System.out.println("Introduce un valor entre 1 y 3");
                n = sc.nextInt();
            }
        }
        return n;
    }

    public static int[][] setFijarCuadrado() {
        int[][] ar = new int[4][4];

        int ii = 10;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = ii++;
            }
        }
        return ar;
    }

    public static int[][] getVerCuadrado() {
        int[][] ar = new int[4][4];

        int ii = 10;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = ii++;
                System.out.print("|" + ar[i][j] + "|");
            }
            System.out.println("");
        }
        return ar;
    }

    public static void setVerCuadrado(int[][] ar) {
        System.out.println("---------------");
        getVerCuadrado();
        System.out.println("---------------\n");
        System.out.println("-------------- Secuencia del cuadrado de numeros ---------------\n");
        for (int f = 0; f < ar.length; f++) {
            for (int c = 0; c < ar[f].length; c++) {
                if ((f == 0) && (c <= ar.length)) {
                    System.out.print(ar[f][c]);
                    System.out.print(" ");
                }
                if ((f >= 1) && (c == ar.length - 1)) { // para no llegar al final del cuadrado
                    if (f <= ar.length - 2) {
                        System.out.print(ar[f][c]);
                        System.out.print(" ");
                    }
                }
                if (f == ar.length - 1) {
                    System.out.print(ar[f][((ar.length - 1) - c)]);
                    System.out.print(" ");
                }
                if ((f == ar.length - 1) && (c == ar.length - 1)) {
                    System.out.print(ar[ar.length - 2][f - 3]);
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 3][f - 3]);
                }
            }
        }
        System.out.println("\n");
    }

    public static void setVerEspiral(int[][] ar) {
        System.out.println("---------------");
        getVerCuadrado();
        System.out.println("---------------\n");
        System.out.println("--------------- Espiral de numeros -----------------\n");
        for (int f = 0; f < ar.length; f++) {
            for (int c = 0; c < ar[f].length; c++) {
                if ((f == 0) && (c <= ar.length)) {
                    System.out.print(ar[f][c]);
                    System.out.print(" ");
                }
                if ((f >= 1) && (c == ar.length - 1)) {
                    if (f <= ar.length - 2) {
                        System.out.print(ar[f][c]);
                        System.out.print(" ");
                    }
                }
                if (f == ar.length - 1) {
                    System.out.print(ar[f][((ar.length - 1) - c)]);
                    System.out.print(" ");
                }
                if ((f == ar.length - 1) && (c == ar.length - 1)) {
                    System.out.print(ar[ar.length - 2][f - 3]);
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 3][f - 3]);
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 3][f - 2]);
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 3][f - 1]);
                }
                if ((f == ar.length - 1) && (c == ar.length - 1)) {
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 2][f - 1]);
                    System.out.print(" ");
                    System.out.print(ar[ar.length - 2][f - 2]);
                }
            }
        }
        System.out.println("\n-------------------------------------");
    }

    public static void setMenu() {
        System.out.println("Elige alguna de estas opciones para ver el Array de distinta forma ");
        System.out.println("Opcion 1 - Ver matriz completa ");
        System.out.println("Opcion 2 - ⻷ Ver matriz con su elementos en forma perimetral");
        System.out.println("Opcion 3 - ↻ Ver matriz con su elementos en forma espiral");
        System.out.println("Opcion 0 - Para salir del menu");

        int[][] ar = setFijarCuadrado();

        int n2 = getValorPorTeclado();
        do {
            System.out.println("Opcion elegida por el usuario : " + n2);
            switch (n2) {
                case 0:
                    n2 = 0;
                    break;
                case 1:
                    getVerCuadrado();
                    break;
                case 2:
                    ar = setFijarCuadrado();
                    setVerCuadrado(ar);
                    break;
                case 3:
                    ar = setFijarCuadrado();
                    setVerEspiral(ar);
                    break;
                default:
                    break;
            }
            if (n2 != 0) {
                System.out.println("Elige otra opcion o pulsa 0 para salir ");
                n2 = getValorPorTeclado();
                System.out.println("Ha seleccionado : " + n2);
            }
            if (n2 == 0) {
                System.out.println("Gracias por participar ");
            }
        } while (n2 != 0);
    }

    public static void main(String[] args) {

//        setMenu();
        int[][] ar = setFijarCuadrado();
        setVerCuadrado(ar);
    }
}
