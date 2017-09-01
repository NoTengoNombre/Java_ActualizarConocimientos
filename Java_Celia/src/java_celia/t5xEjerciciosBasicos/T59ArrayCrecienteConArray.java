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

public class T59ArrayCrecienteConArray {

    private static List<Integer> array = new ArrayList<Integer>(10);
    private static int LONGITUDMAXIMA = 10;

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

    public static void setBuscar() {

        setNumeroArray();
        setOrdenarQuickSort(0, LONGITUDMAXIMA - 1);

        System.out.println("--------------------- ");
        System.out.println("---- Ordenacion ----- ");
        System.out.println("--------------------- ");
        System.out.println(array);

//Numero a buscar
        int num = 30;
        int contador = 0;

        System.out.println("");

        System.out.println(array);
    }

    public static void main(String[] args) {

//        System.out.println(getNumeroAleatorio());
        setBuscar();
    }
}
