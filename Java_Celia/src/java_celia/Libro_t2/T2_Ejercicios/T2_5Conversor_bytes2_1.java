/**
 * @created on : 17-jul-2017, 17:39:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

public class T2_5Conversor_bytes2_1 {

    private static float n_bits;
    private static float n_bytes;
    private static float bytes;
    private static float bits;
    private static float cantidad;

    public T2_5Conversor_bytes2_1(int cantidad, String unidad) {
        if ("B".equals(unidad)) {
            bytes = cantidad * 10;
        }
        if ("b".equals(unidad)) {
            bits = cantidad * 8;
        }
    }

    double getKilobytes() {
        n_bytes = (float) (cantidad * (Math.pow(bytes, 3)));
        return n_bytes;
    }

    double getKibibytes() {
        n_bits = (float) (cantidad * (Math.pow(2, 3)));
        return n_bits;
    }

    double getMega() {
        n_bytes = (float) (cantidad * Math.pow(10, 6));
        return n_bytes;
    }

    double getGiga() {
        n_bytes = (float) (cantidad * Math.pow(10, 9));
        return n_bytes;
    }

    double getTera() {
        n_bytes = (float) (cantidad * Math.pow(10, 12));
        return n_bytes;
    }

    double getPeta() {
        n_bytes = (float) (cantidad * Math.pow(10, 15));
        return n_bytes;
    }

    double getExa() {
        n_bytes = (float) (cantidad * Math.pow(10, 18));
        return n_bytes;
    }

    double getZetta() {
        n_bytes = (float) (cantidad * Math.pow(10, 21));
        return n_bytes;
    }

    double getYotta() {
        n_bytes = (float) (cantidad * Math.pow(10, 24));
        return n_bytes;
    }

    public static void main(String[] args) {

    }
}
