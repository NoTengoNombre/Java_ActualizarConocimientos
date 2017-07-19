/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

import java.math.BigDecimal;

public class Java_modulo_resto {

    public static void main(String[] args) {

        int num = 2;
        num += num + 2;
        System.out.println(num);
        System.out.println("--------------");

        int num1 = 5;
        num1 += num1 - 1 * 4;
        System.out.println(num1);

        System.out.println("--------------");
        int num2 = 4 % 28;
        System.out.println(num2);

        System.out.println("--------------");
        double num4 = 28 % 21;
        System.out.println(num4);

        System.out.println("--------------");
        double num5 = 4 % 7;
        System.out.println(num5);

    }
}
