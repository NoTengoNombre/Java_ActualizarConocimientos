/**
 * @created on : 01-sep-2017, 9:38:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T59ArrayCrecienteArrayList {

    private static List<Integer> array = new ArrayList<Integer>(10);
    private static int LONGITUDMAXIMA = 10;
    private static int salida;

    public static int getNumeroAleatorio() {
        int x = (int) (Math.random() * (1 + 100) + 1);
        return x;
    }

    public static void setNumeroArray() {

        for (int i = 0; i < LONGITUDMAXIMA; i++) {
            array.add(getNumeroAleatorio());
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n• Sin Ordenar\n" + array);
        System.out.println("• Tamaño total : " + array.size());
    }

    public static void setOrdenarQuickSort(int izquierda, int derecha) {
        int izq, der, pivote, numero;

        izq = izquierda;
        der = derecha;
        pivote = array.get((izquierda + derecha) / 2);

        do {
            while (array.get(izq) < pivote) {
                izq++;
            }
//
            while (pivote < array.get(der)) {
                der--;
            }

            if (izq <= der) {
                numero = array.get(izq);
                array.set(izq, array.get(der));
                array.set(der, numero);
                izq++;
                der--;
            }
        } while (izq <= der);

        numero = array.get(izq);
        array.set(izq, array.get(derecha));
        array.set(derecha, numero);

        if (izquierda < der) {
            setOrdenarQuickSort(izquierda, der);
        }
        if (izq < derecha) {
            setOrdenarQuickSort(izq, derecha);
        }
    }

    public static int setInsertarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        if (n == - 1) {
            n = -1;
        } else {
            while (n <= 0 || n >= array.get(LONGITUDMAXIMA - 1)) {
                if (n <= 0 || n >= array.get(LONGITUDMAXIMA - 1)) {
                    System.out.println("Introduce un numero que este por encima de 0 : ");
                    n = sc.nextInt();
                }
            }
        }
        return n;
    }

    public static void setBuscar() {
        setNumeroArray();
        setOrdenarQuickSort(0, LONGITUDMAXIMA - 1);

        System.out.println("\t   -------------------- ");
        System.out.println("\t   ---- Sin Ordenacion ---- ");
        System.out.println("\t   -------------------- ");
        System.out.println(array);

//Numero a buscar
        int num;
        int vaDer = 0;
        do {
            num = setInsertarNumero();
            if (num == -1) {
                salida = -1;
            } else {
                for (int d = LONGITUDMAXIMA - 1; d > 0; d--) {
                    if (array.get(d) > num) {
                        vaDer = d;
                    }
                }
                
                int x = array.get(0);
                System.out.println("Valor : " + x);
                if ((num < x)) {
                    array.add(0, num);
                    array.remove(array.size() - 1);
                } else {
                    array.add(vaDer, num);
                    array.remove(array.size() - 1);
                }
                System.out.println("\t   -------------------- ");
                System.out.println("\t   ---- Ordenacion ---- ");
                System.out.println("\t   -------------------- ");
                System.out.println(array);
            }
        } while (num != (-1) && (salida == 0));
        System.out.println("\t   -------------------- ");
        System.out.println("\t   ---- Ordenacion ---- ");
        System.out.println("\t   -------------------- ");
        System.out.println(array);
    }

    public static void main(String[] args) {
        setBuscar();
    }
}
