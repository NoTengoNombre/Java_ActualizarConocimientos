/**
 * @created on : 06-sep-2017, 19:40:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

import java.util.Scanner;

public class T5x17PermutarFilas {

    private static int[][] array = new int[3][5];

    public static int getDatos(int f, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dato para la fila : " + f + " y la columna " + c + " por teclado.");
        int x = sc.nextInt();
        return x;
    }

    public static void setDatos() {
        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[f].length; c++) {
                array[f][c] = getDatos(f, c);
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static void setDatosOrdenados() {
        int[][] aux = new int[3][5];
        setDatos();
        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[f].length; c++) {
                if (f == 2) {
//                    System.out.print(array[f][c] + " ");
                    aux[0][c] = array[2][c];
                    array[2][c] = array[0][c];
                    array[0][c] = aux[0][c];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        setDatosOrdenados();
    }
}
