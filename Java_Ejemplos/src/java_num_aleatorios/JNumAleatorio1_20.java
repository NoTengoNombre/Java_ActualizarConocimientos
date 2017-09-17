/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_num_aleatorios;

import static java_ejemplo_ordenacion_array.JavaMetodosQuicksort.quickSortEn;

/**
 *
 * @author Portatil_Bot
 */
public class JNumAleatorio1_20 {

    public static int[] array = new int[100];

    public int getNumRandom(int minimo, int maximo) {
        int x = (int) (Math.random() * (minimo + maximo));
        return x;
    }

    public int[] meterNumDentroArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumRandom(1, 20);
        }
        return array;
    }

    public int[] ordenarArrayConQuickSort(int[] arrayParam, int minLongitud, int maxLongitud) {
        quickSortEn(arrayParam, minLongitud, maxLongitud);
        return arrayParam;
    }

    public void verArrayOrdenado(int[] arrayParam, int minLongitud, int maxLongitud) {
        meterNumDentroArray();
        ordenarArrayConQuickSort(arrayParam, minLongitud, maxLongitud);
        for (int indice : arrayParam) {
            System.out.print(indice + "|");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        JNumAleatorio1_20 jna = new JNumAleatorio1_20();
        jna.verArrayOrdenado(array, 0, 99);

    }
}
