/**
 * @created on : 19-jul-2017, 18:56:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_decimal_2cifras;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Java_ejemplo_redondeo_2cifras_decimales {

    public static double getNum() {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        return valor;
    }

    public static void main(String[] args) {

        System.out.println("Devuelve decimal con 2 cifras que se puede usar ");

        BigDecimal bd = new BigDecimal(getNum());
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue());

        System.out.println("Sacar el valor de 2 decimales " + (double) Math.round(3.14159265 * 100d) / 100d);

        double probar = (double) (Math.round((100/100) * 100d) / 100d);
        
        

    }
}
