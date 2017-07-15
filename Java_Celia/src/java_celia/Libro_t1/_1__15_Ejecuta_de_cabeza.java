package java_celia.Libro_t1;

import java.math.BigDecimal;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class _1__15_Ejecuta_de_cabeza {

    public static void main(String[] args) {

        int num1 = 5;
        num1 += num1 - 1 * 4 + 1;
        System.out.println(num1);
        System.out.println("--------------");
        num1 += num1 - 1 * 4;
        System.out.println("--------------");
        System.out.println(num1);

        int num2 = 4;
        num2 %= 7 * num2 % 3 * 7;
        System.out.println(num2);
        
        BigDecimal num3 = new BigDecimal(4 / 7.0);
       
        System.out.println("--------------");
        System.out.println(num3.toString());
        System.out.println("--------------");
        


    }
}
