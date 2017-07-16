/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Java_Longitud_10_decimales {

    public static void main(String[] args) {

        int x = 3;
        x += 1;
        System.out.println(x);

        byte z = 6;
        z += 5;
        System.out.println(z);

        int q = 2;
        q %= 2;
        System.out.println(q);

        int qw = 2;
        qw %= 3;
        System.out.println(qw);

        double v0 = 4 / 7;
        System.out.println(v0);

        System.out.println("-----------------");
        int scale = 10;
        BigDecimal num1 = new BigDecimal(4);
        BigDecimal num2 = new BigDecimal(7);
        System.out.println(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());

        System.out.println("-----------------");
        BigDecimal num = new BigDecimal(4 / 7.0);
        System.out.println(num.toString());
        System.out.println("-----------------");
 
    }
}
