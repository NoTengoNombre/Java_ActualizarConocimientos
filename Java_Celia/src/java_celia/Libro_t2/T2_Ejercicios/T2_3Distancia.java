/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class T2_3Distancia {

    static double km;
    static double m;

    public static void set_millas_a_km(double millas) {
        km = 1.852 / millas;
        BigDecimal big = new BigDecimal(km);
        BigDecimal doubleValue = big.setScale(2, RoundingMode.HALF_UP);
        System.out.println(millas + " - millas a km : " + doubleValue + " km ");
    }

    public static void set_millas_a_metros(double millas) {
        m = 1852 * millas;
        System.out.println(millas + " - millas a metros : " + m + " metros ");
    }

    public static BigDecimal get_millas_a_km() {
        BigDecimal big = new BigDecimal(km);
        BigDecimal doubleValue = big.setScale(2, RoundingMode.HALF_UP);
        return doubleValue;
    }

    public static double get_millas_a_m() {
        return T2_3Distancia.m;
    }

    public static void main(String[] args) {

        set_millas_a_km(11);
        set_millas_a_metros(11);

        System.out.println("millas a km : " + get_millas_a_km());
        System.out.println("millas a m : " + get_millas_a_m());

    }

}
