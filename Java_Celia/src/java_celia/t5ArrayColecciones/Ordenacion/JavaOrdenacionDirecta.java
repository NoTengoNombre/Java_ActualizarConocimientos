/**
 * @created on : 28-ago-2017, 9:35:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class JavaOrdenacionDirecta {

    public static void main(String[] args) {

        int minimo;

        int[] vector = {14, 92, 85, 43, 53, 21, 12, 03, 45};

        for (int i = 0; i < vector.length; i++) {
//            14       14
            minimo = vector[i];
//                      0                0
            int posicionamiento_minimo = i;
//                   0   0  0 < 14
            for (int j = i; j < vector.length; j++) {
//                    92          14   
                if (vector[j] < minimo) {
//                    92        92
                    minimo = vector[j];
//                            0              0
                    posicionamiento_minimo = j;
                }
            }
//                           0                  92
            vector[posicionamiento_minimo] = vector[i];
//                 0      14
            vector[i] = minimo;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }
}
