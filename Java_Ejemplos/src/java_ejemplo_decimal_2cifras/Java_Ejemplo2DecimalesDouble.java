/**
 * @created on : 07-ago-2017, 11:37:04
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_decimal_2cifras;

public class Java_Ejemplo2DecimalesDouble {

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        double dosCifras = round(200.34567, 2);
        System.out.println("Valor: " + dosCifras);
    }

}
