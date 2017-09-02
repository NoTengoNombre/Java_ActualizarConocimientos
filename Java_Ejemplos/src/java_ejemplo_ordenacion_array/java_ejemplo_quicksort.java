/**
 * @created on : 25-jul-2017, 14:03:41
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_ordenacion_array;

public class java_ejemplo_quicksort {

    public static void main(String[] args) {
        int[] lista1 = new int[10];

        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = (int) (Math.random() * (1 + 100) + 1);
            System.out.println("no ordenados : " + lista1[i]);
        }

        System.out.println("--------------------------------");

//        quicksort(lista1, 0, lista1.length - 1);
//        for (int i = 0; i < lista1.length; i++) {
//            System.out.println("ordenados: " + lista1[i]);
//        }
        System.out.println("--------------------------------");
        int[] a = quicksort_devuelve(lista1, 0, lista1.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ver: " + a[i]);
        }

    }

    public static void quicksort(int lista1[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = lista1[(i + j) / 2];
        do {
            while (lista1[i] < pivote) {
                i++;
            }
            while (lista1[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = lista1[i];
                lista1[i] = lista1[j];
                lista1[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(lista1, izq, j);
        }
        if (i < der) {
            quicksort(lista1, i, der);
        }
    }

    public static int[] quicksort_devuelve(int lista1[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = lista1[(i + j) / 2];
        do {
            while (lista1[i] < pivote) {
                System.out.println("pivote : " + pivote);
                System.out.println("VALOR : " + lista1[i]);
                i++;
            }
            while (lista1[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = lista1[i];
                lista1[i] = lista1[j];
                lista1[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(lista1, izq, j);
        }
        if (i < der) {
            quicksort(lista1, i, der);
        }
        return lista1;
    }
}
