/**
 * @created on : 07-sep-2017, 12:20:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

public class T5x19GeometriaDeMatricesMultiplesformas {

    private static final int[][] MATRIZ = new int[5][5];

    public static int setNumeros() {
        int x = (int) (Math.random() * (1 + 8) + 1);
        return x;
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

    public static void setMostrarDiagonal() {
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {

                if (MATRIZ[f][f] != MATRIZ[f][c]) {
                    MATRIZ[f][f] = 1;
                    System.out.print(MATRIZ[f][f]);
                } else {
                    MATRIZ[f][c] = 2;
                    System.out.print(MATRIZ[c][c]);
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void setMostrarDiagonal2() {
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
// Siempre va a representar las posiciones [0][0] aunque se traten de columnas 
                MATRIZ[c][c] = f + 1;
                System.out.print(MATRIZ[f][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void setMostrarDiagonal3() {
        for (int f = 0; f < MATRIZ.length; f++) {
            MATRIZ[f][f] += 1;
            for (int c = 0; c < MATRIZ[f].length; c++) {
                MATRIZ[f][c] += 2;
                System.out.print(MATRIZ[f][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void setNoMostrarPuntosFF() {
        int[][] array = new int[5][5];
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
                MATRIZ[f][c] = c + 1;
                if (MATRIZ[f][f] < MATRIZ[f][c]) {
                    array[f][c] = MATRIZ[f][c];
                    System.out.print(array[f][c]);
                }
                System.out.print(MATRIZ[f][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void setSumarDiagonalSuperior() {
        int[][] arrayIntermedio = new int[5][5];
        int n = 0;
        for (int f = 0; f < MATRIZ.length; f++) {
            for (int c = 0; c < MATRIZ[f].length; c++) {
                MATRIZ[f][c] = 1;
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

        setSumarDiagonalSuperior();
    }

}
