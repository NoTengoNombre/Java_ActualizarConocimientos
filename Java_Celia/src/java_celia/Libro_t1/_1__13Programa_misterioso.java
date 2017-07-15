/**
 * @created on : 14-jul-2017, 22:54:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _1__13Programa_misterioso {

    public static void main(String[] args) {

        int i = 0x100;
        i = i >>> 1;
        System.out.println(i);

        System.out.println(" -------------- ");
        int scale = 10;
        BigDecimal num1 = new BigDecimal(100);
        BigDecimal num2 = new BigDecimal(16);

        System.out.println(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());
 
    }
}
