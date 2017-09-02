/**
 * @created on : 01-sep-2017, 9:38:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.Scanner;

public class T59ArrayCrecienteConArray {

    private static final int LONGITUDMAXIMA = 10;
    private static int[] array = new int[LONGITUDMAXIMA];

    public static int getNumeroPorTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n♦ Introduce un numero mayor que 0 y menor que : " + array[array.length - 1]);
        System.out.println("♦♦ Intro -1 para salir : ");
        int num = sc.nextInt();
        if ((num < 1 || num > array[array.length - 1]) && (num != -1)) {
            while ((num < 1 || num > array[array.length - 1]) && (num != -1)) {
                System.out.println("♠ Introduce un numero teclado mayor que 0 y menor que : " + array[array.length - 1]);
                System.out.println("♠♠ Intro -1 para salir : ");
                num = sc.nextInt();
            }
        }
        return num;
    }

    public static int getGenerarNumeroAleatorio() {
        int x = (int) (Math.random() * (1 + 100) + 1);
        return x;
    }

    public static void setCrearArray() {
        for (int i = 0; i < LONGITUDMAXIMA; i++) {
            array[i] = getGenerarNumeroAleatorio();
        }
    }

    public static void getVerArrayGenerado() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void setOrdenarQuickSort(int iz, int de) {
        int i, j, pivote, numero;

        i = iz;
        j = de;
        pivote = array[(iz + de) / 2];

        do {
            while (array[i] < pivote) {
                i++;
            }
            while (pivote < array[j]) {
                j--;
            }

            if (i <= j) {
                numero = array[i];
                array[i] = array[j];
                array[j] = numero;
                i++;
                j--;
            }
        } while (i <= j);

        numero = array[i];
        array[i] = array[de];
        array[de] = numero;

        if (iz < j) {
            setOrdenarQuickSort(iz, j);
        }
        if (i < de) {
            setOrdenarQuickSort(i, de);

        }
    }

    public static void setInsertarElemento() {
        setCrearArray();
        System.out.println("\t  --------------------  ");
        System.out.println("\t---- Sin Ordenar ---- ");
        System.out.println("\t  --------------------  ");
        getVerArrayGenerado();
        setOrdenarQuickSort(0, LONGITUDMAXIMA - 1);
        System.out.println("\t  --------------------  ");
        System.out.println("\t---- Con Ordenacion ---- ");
        System.out.println("\t  --------------------  ");
        getVerArrayGenerado();

        int[] a = array;
        int num = getNumeroPorTeclado();

        do {

            if (num == -1) {
                num = -1;
            } else {
                System.out.println("---------------------------");
                getVerArrayGenerado();
                System.out.println("---------------------------");

                int varI = 0;

                for (int i = 0; i < a.length; i++) {
                    if (a[i] < num) {
                        varI++;
                    }
                }

                for (int i = a.length - 1; i > 0; i--) {
                    if (a[i - 1] > num) {
                        a[i] = a[i - 1];
                    }
                }

                for (int i = 0; i < a.length; i++) {
                    if (num <= a[0]) {
                        a[0] = num;
                    }
                    if (varI > i) {
                        a[varI] = num;
                    }
                    System.out.print(a[i] + " ");
                }
                num = getNumeroPorTeclado();
            }
        } while (num != -1);
    }

    public static void setIniciarPrograma() {
        setInsertarElemento();
    }

    public static void main(String[] args) {

        setIniciarPrograma();

    }
}
