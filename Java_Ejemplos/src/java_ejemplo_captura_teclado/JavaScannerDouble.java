/**
 * @created on : 31-jul-2017, 14:32:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class JavaScannerDouble {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.next();
        double decimalValue = Double.parseDouble(data);
        System.out.println("Decimal value : " + decimalValue);

        double response = decimalValue / 0.1;

        System.out.println("response : " + response);

    }

}
