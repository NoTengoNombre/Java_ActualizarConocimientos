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
import java.text.DecimalFormat;

public class Java_Operadores2 {

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

        int scale = 10;
        BigDecimal num1 = new BigDecimal(4);
        BigDecimal num2 = new BigDecimal(7);
        System.out.println(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());

    }
}
