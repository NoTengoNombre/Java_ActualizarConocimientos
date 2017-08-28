/**
 * @created on : 27-ago-2017, 23:20:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class T5Array1OrdenacionQuickSort {

//                                        0   1    2    3   4    5   6    7    8   9    10
    private static final int[] VECTOR = {92, 843, 342, 142, 41, 94, 123, 192, 134, 34, 493};

    /**
     * Ordenacion quicksort
     *
     * @param izquierda - Indica el indice menor - posicion 0
     * @param derecha - Indica el indice mayor - posicion 10
     */
    public static void ordenaArray(int izquierda, int derecha) {

//        variables locales
        int iz, de, vector_intermedio, posicion;
//               0
        iz = izquierda;
//              10
        de = derecha;
//                    5                     
//                  (94)                  0   +    10     / 2
        vector_intermedio = VECTOR[(izquierda + derecha) / 2];

        do {           //  0        5
//                       (92) <   (94)
            while (VECTOR[iz] < vector_intermedio) {
//               0 , 1 , 2 , 3 , 4  
                iz++;
            }  //               5             10
//                            (94)   <      (493)                  
            while (vector_intermedio < VECTOR[de]) {
//                10 , 9 , 8 , 7 , 6
                de--;
            }
//               0 <= 10
            if (iz <= de) {
//                  0             0  
//                  92           (92)
                posicion = VECTOR[iz];
//                      0           10
//                     493         493
                VECTOR[iz] = VECTOR[de];
//                     10        0
//                    493       92
                VECTOR[de] = posicion;
                iz++; // 1 2 3 4 5
                de--; // 10 9 8 7 6
            }
//                0    10
        } while (iz <= de);
//          1             0
//         493           493
        posicion = VECTOR[iz];
//             10             10
        VECTOR[iz] = VECTOR[derecha];
//               1            1
        VECTOR[derecha] = posicion;

        if (izquierda < de) {
            ordenaArray(izquierda, de);
        }
        if (iz < derecha) {
            ordenaArray(iz, derecha);
        }
    }

    public static void main(String[] args) {

        ordenaArray(0, 10);

        for (int v = 0; v < VECTOR.length; v++) {
            System.out.println(VECTOR[v]);
        }
    }
}
