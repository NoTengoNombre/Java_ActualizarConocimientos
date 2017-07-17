/**
 * @created on : 17-jul-2017, 17:39:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

public class T2_5Conversor_bytes2 {

    private float n_bits;
    private float n_bytes;
    private float b_cantidad;
    private String tipo_unidad;
    private float valor;

    public T2_5Conversor_bytes2(String unidad, int cantidad) {
        if ("Byte".equalsIgnoreCase(unidad)) {
            b_cantidad = cantidad;
            tipo_unidad = unidad;
        }
        if ("bit".equalsIgnoreCase(unidad)) {
            b_cantidad = cantidad;
            tipo_unidad = unidad;
        }
    }

    void get_unidad() {
        System.out.println("ver unidad : " + tipo_unidad);
    }

    double getByte() {
        n_bits = b_cantidad * 1;
        return n_bits;
    }

    double getBits() {
        n_bytes = b_cantidad * 8;
        return n_bytes;
    }

    double getKiloByte() {
        n_bytes = (float) (b_cantidad * (Math.pow(10, 3)));
        return n_bytes;
    }

    double getKibiBytes() {
        n_bits = (float) (b_cantidad * (Math.pow(2, 10)));
        return n_bits;
    }

    double getKilo() {
        if ("Byte".equalsIgnoreCase(tipo_unidad)) {
            valor = (float) (b_cantidad * (Math.pow(10, 3)));
        }
        if ("bit".equalsIgnoreCase(tipo_unidad)) {
            valor = (float) (b_cantidad * (Math.pow(2, 10)));
        }
        return valor;
    }

    public static void main(String[] args) {

        T2_5Conversor_bytes2 t = new T2_5Conversor_bytes2("Byte", 1);
        t.get_unidad();
        double aByte = t.getByte();
        System.out.println(" Byte " + aByte);

        T2_5Conversor_bytes2 t1 = new T2_5Conversor_bytes2("Byte", 1);
        t1.get_unidad();
        double aByte2 = t1.getBits();
        System.out.println(" Bits " + aByte2);

        T2_5Conversor_bytes2 t2 = new T2_5Conversor_bytes2("Byte", 1);
        t2.get_unidad();
        double kilobyte = t2.getKiloByte();
        System.out.println(" bytes " + kilobyte);

        T2_5Conversor_bytes2 t2_1 = new T2_5Conversor_bytes2("bit", 1);
        t2_1.get_unidad();
        double kibibytes = t2_1.getKibiBytes();
        System.out.println(" bits " + kibibytes);

        T2_5Conversor_bytes2 t2_2 = new T2_5Conversor_bytes2("bit", 1);
        t2_2.get_unidad();
        double kilo = t2_2.getKilo();
        System.out.println("" + kilo);

        T2_5Conversor_bytes2 t2_3 = new T2_5Conversor_bytes2("Byte", 1);
        t2_3.get_unidad();
        double kilo1 = t2_3.getKilo();
        System.out.println("" + kilo1);

    }
}
