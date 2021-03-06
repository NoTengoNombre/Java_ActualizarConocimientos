/**
 * @created on : 07-sep-2017, 12:20:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

import java.util.Scanner;

public class T5x19GeometriaDeMatrices {

    private static final int[][] MATRIZ = new int[5][5];

    public static int setNumeros() {
        int x = (int) (Math.random() * (1 + 8) + 1);
        return x;
    }

    public static int setFijarNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce por teclado un numero mayor que 0 y menor que 100");
        int n = sc.nextInt();
        if (n < 1 || n > 100) {
            while (n < 1 || n > 100) {
                System.out.println("el numero " + n + " es invalido");
                System.out.println("Por favor : Introduce por teclado un numero mayor que 0 y menor que 100");
                n = sc.nextInt();
            }
        }
        return n;
    }

    public static void setValoresEnArray() {
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
//                MATRIZ[f][c] = setNumeros();
                MATRIZ[f][c] = +1;
                System.out.print(MATRIZ[f][c] + " | ");
            }
            System.out.println("");
        }
    }

    public static void setVerValoresDiagonal() {
        setValoresEnArray();
        System.out.println("");
        for (int f = 0; f < MATRIZ.length; f++) {
            System.out.println("f : " + f);
            for (int c = 0; c < MATRIZ[f].length; c++) {
            }
        }
    }

    public static int[][] setMostrarDiagonal(int n) {
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
// Siempre va a representar las posiciones [0][0] aunque se traten de columnas 
                MATRIZ[c][c] = n + 1;
                System.out.print(MATRIZ[f][c] + " ");
            }
            System.out.println("");
        }
        return MATRIZ;
    }

    public static void setSumarDiagonalSuperior() {
        setMostrarDiagonal(setFijarNumeros());
        int[][] arrayIntermedio = new int[5][5];
        int n = 0;
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
                MATRIZ[f][c] = setFijarNumeros();
                if ((f <= c) && (c <= MATRIZ.length)) {
                    n += MATRIZ[f][c];
                    arrayIntermedio[f][c] = MATRIZ[f][c];
                }
                System.out.print(MATRIZ[f][c] + "|");
            }
            System.out.print(" -> fila : " + n + " \n");
        }
        System.out.println("Total de valores : " + n);

        int nc = 0;
        for (int f = 0; f < arrayIntermedio.length; f++) {
            for (int c = 0; c < arrayIntermedio.length; c++) {
                System.out.print(arrayIntermedio[f][c] + "|");
                if ((f <= c) && (c <= MATRIZ.length)) {
                    nc += MATRIZ[f][c];
                    arrayIntermedio[f][c] = MATRIZ[f][c];
                }
            }
            System.out.print(" -> fila : " + nc + " \n");
        }
        System.out.println("Total de valores : " + nc);
        System.out.println(" ");
    }

    public static void main(String[] args) {

//        setSumarDiagonalSuperior();
        setMostrarDiagonal(10);
        setSumarDiagonalSuperior();
    }

}
