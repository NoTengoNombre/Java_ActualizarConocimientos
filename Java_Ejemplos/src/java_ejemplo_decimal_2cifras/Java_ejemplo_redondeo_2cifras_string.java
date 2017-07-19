/**
 * @created on : 19-jul-2017, 18:56:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_decimal_2cifras;

import java.text.DecimalFormat;

public class Java_ejemplo_redondeo_2cifras_string {

    public static String dosCifras(double num) {
        DecimalFormat df = new DecimalFormat("0.00");
        String valor = df.format(num);
        System.out.println(valor);
        return valor;
    }

    public static void main(String[] args) {

        String dosCifras = dosCifras(100);

        if (dosCifras instanceof String) {
            System.out.println(dosCifras + " - Si es un String");
        } else {
            System.out.println(dosCifras + " - No es un String");
        }

        Object obj = 100;

        if (obj instanceof String) {
            System.out.println(obj + " - Si es un String");
        } else {
            System.out.println(obj + " - No es un String");
        }

        
        
    }
}
