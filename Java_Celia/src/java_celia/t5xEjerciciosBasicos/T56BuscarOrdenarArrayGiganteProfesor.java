/**
 * @created on : 24-sep-2017, 19:01:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T56BuscarOrdenarArrayGiganteProfesor {

    public static void main(String[] args) {

        int[] array = MiArray.generar(1000);
        MiArray.mostrar(array);
        System.out.println("----------------------------");
        MiArray.ordenar(array);
        MiArray.mostrar(array);

        int numero = 1999;

        int posicion = MiArray.buscar(array, numero);

        if (posicion != -1) {
            System.out.println("El numero estaba en la posicion : " + posicion);
        } else {
            System.out.println("Numero no encontrado ");
        }

    }

}

class MiArray {

    /**
     * Generar un array con valores aleatorios
     *
     * @param tam
     * @return
     */
    public static int[] generar(int tam) {
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * tam * 2);
        }
        return a;
    }

    /**
     * Muestra el contenido del array
     *
     * @param a
     */
    public static void mostrar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * Ordena por el metodo de la burbuja
     *
     * @param a
     */
    public static void ordenar(int[] a) {
//                      0 < 10Longitud - 11Posiciones
        for (int i = 0; i < a.length; i++) {
//                          0 < 9Longitud - 10Posiciones
//                          0 < (Abrir Hueco)
            for (int j = 0; j < (a.length - 1); j++) {
//                  5[0] > 4[1]
                if (a[j] > a[j + 1]) {
//                       5    5[0]
                    int aux = a[j];
//                  4[0] = 4[1]
                    a[j] = a[j + 1];
//                  5[1]     =  5
                    a[j + 1] = aux;
                }
            }
        }
    }

    /**
     *
     * @param a
     * @param n
     * @return
     */
    public static int buscar(int a[], int n) {
        int encontrado = -1;
        int i = 0;
        while ((i < a.length) && (encontrado != -1)) {
            if (a[i] == n) {
                encontrado = i;
                System.out.println("La posicion esta en : " + i);
            }
            i++;
        }
        return encontrado;
    }
}
