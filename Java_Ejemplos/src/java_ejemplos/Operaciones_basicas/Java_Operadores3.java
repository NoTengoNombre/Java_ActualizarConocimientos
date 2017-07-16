/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

import java.math.BigDecimal;

public class Java_Operadores3 {

    public static void main(String[] args) {

        double x = 4 % 7;

        System.out.println(x);

        System.out.println("-----------------");
        BigDecimal num = new BigDecimal(4 % 7.0);
        System.out.println(num.toString());
        System.out.println("-----------------");

    }
}
