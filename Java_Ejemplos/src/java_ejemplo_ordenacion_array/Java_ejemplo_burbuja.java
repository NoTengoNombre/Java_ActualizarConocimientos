/**
 * @created on : 25-jul-2017, 14:16:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_ordenacion_array;

public class Java_ejemplo_burbuja {

    /**
     * Algoritmos de ordenación burbuja peor en tiempo de ejecución, solamente
     * es recomendable su uso para ordenar listas con un número pequeño de
     * elementos.
     *
     * @return
     */
    public static int[] leerArray_burbuja() {
//        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
//            System.out.println("Introduce número: ");
//            ar[i] = sc.nextInt();
            ar[i] = (int) (Math.random() * (1 + 100) + 1);
        }
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
        return ar; // devuelve el array ordenado
    }

    /**
     *
     * @param a
     */
    public static void mostrarArray(int a[]) {
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] b;
        //        Metodo devuelve un array 
        b = leerArray_burbuja();
        mostrarArray(b);
    }

}
