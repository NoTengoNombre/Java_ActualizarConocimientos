/**
 * @created on : 25-ago-2017, 13:05:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class T5Array1OrdenacionBurbuja {

    private static int[] longitudArray = {1, 5, 7, 9, 3, 8, 4, 6, 2};
    private static int longitud = longitudArray.length; // longitud 9

    /**
     * Ordenacion burbuja
     *
     * @param v
     */
    static void ordenacionBurbuja(int v[]) {

        System.out.println("Longitud del array : " + longitud);

        int i, j, elem;
// longitud i - 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9
        for (i = 1; i < longitud; i++) {
// longitud j - 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1
            for (j = longitud - 1; j >= i; j--) {
//                  8-1 = 7 >  8 
                System.out.println(j + " - VALOR de v[j - 1] " + v[j - 1]);
                System.out.println(j + " - VALOR de v[j] " + v[j]);
                if (v[j - 1] > v[j]) {
                    elem = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = elem;
                }
            }
        }
    }

    /**
     * Ordenacion directa
     *
     * @param v
     */
    void ordenaArray(int[] v) {
        int i, j, minimo, posicion_minimo; // 4 elementos
//      0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 
        for (i = 0; i < longitud; i++) {
            minimo = v[i]; // almaceno valor de cada elemento
            posicion_minimo = i; // almaceno el rango
//      0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9
            for (j = i; j < longitud; j++) {
                if (v[j] < minimo) {
                    minimo = v[j];
                }
            }
            v[posicion_minimo] = v[i];
            v[i] = minimo;
        }
    }

    public static void main(String[] args) {

        System.out.println("Longitud del array : " + longitud);
        System.out.println("Cada posicion tiene : " + longitudArray[1]);
        System.out.println("Cada posicion tiene : " + longitudArray[2]);
        System.out.println("Cada posicion tiene : " + longitudArray[3]);
        System.out.println("Cada posicion tiene : " + longitudArray[4]);
        System.out.println("Cada posicion tiene : " + longitudArray[5]);
        System.out.println("Cada posicion tiene : " + longitudArray[6]);
        System.out.println("Cada posicion tiene : " + longitudArray[7]);
        System.out.println("Cada posicion tiene : " + longitudArray[8]);

        ordenacionBurbuja(longitudArray);

    }
}
