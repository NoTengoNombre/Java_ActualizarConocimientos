/**
 * @created on : 17-jul-2017, 17:39:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

public class T2_5Conversor_bytes {

    private static float n_bits;
    private static float n_bytes;
    private static float cantidad;

    public T2_5Conversor_bytes(int cantidad, double unidad) {
    }

    double getByte() {
        n_bytes = cantidad * 1;
        return n_bytes;
    }

    double getBits() {
        n_bytes = cantidad * 8;
        return n_bytes;
    }

    double getKiloByte() {
        n_bytes = (float) (cantidad * (Math.pow(10, 3)));
        return n_bytes;
    }

    double getmegaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 6));
        return n_bytes;
    }

    double getgigaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 9));
        return n_bytes;
    }

    double getteraByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 12));
        return n_bytes;
    }

    double getpetaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 15));
        return n_bytes;
    }

    double getexaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 18));
        return n_bytes;
    }

    double getzettaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 21));
        return n_bytes;
    }

    double getyottaByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 24));
        return n_bytes;
    }
///////////////////////////////////////////////////////    
///////////////////////////////////////////////////////    
///////////////////////////////////////////////////////    

    double getKibiByte() {
        n_bytes = (float) (cantidad * Math.pow(10, 18));
        return n_bytes;
    }

    double getGigabytes() {
        return cantidad * 8;
    }

    double getGibibytes() {
        return cantidad * 2;
    }

    public static void main(String[] args) {

    }
}
