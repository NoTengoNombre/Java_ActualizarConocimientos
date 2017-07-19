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
import java.text.DecimalFormat;
import java.util.Scanner;
import static java_ejemplo_decimal_2cifras.Java_ejemplo_redondeo_2cifras_decimales.getNum;

public class Java_ejemplo_obtener_parte_decimal {

    public static double getNum() {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        return valor;
    }

    public static void main(String[] args) {

        double parte_flotante = Math.floor(100.111);
        System.out.println(parte_flotante);

        double d = 123.4567;
        long l = (long) d;
        double dd = d - (double) l;

        System.out.println("Valor decimal : " + dd);

        DecimalFormat decimales = new DecimalFormat("0.00");
        double numero = 7.936427373645;

        Float numObject = new Float(numero);
        byte byteValue = numObject.byteValue();

        System.out.println("aqui :" + byteValue);

        String dosdecimales = decimales.format(numero);

//        System.out.println(dd);
        System.out.println(dosdecimales);

    }
}
