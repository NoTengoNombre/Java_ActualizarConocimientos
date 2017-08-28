/**
 * @created on : 28-ago-2017, 17:27:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.BusquedaSecuencial;

public class T5BusquedaBinariaExterna {

//    static final int[] VECTOR = {90, 50, 100, 70, 80, 60, 20, 10, 30, 40};
    static final int[] VECTOR = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    /**
     *
     * @param vector
     * @param dato
     * @return
     */
    public static int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int x = busquedaBinaria(VECTOR, 10);
        System.out.println(x);

    }
}
