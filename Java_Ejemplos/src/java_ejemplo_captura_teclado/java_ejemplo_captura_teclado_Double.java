/**
 * @created on : 17-jul-2017, 9:03:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.util.Scanner;

public class java_ejemplo_captura_teclado_Double {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        double d = keyboard.nextDouble();
        System.out.println("Valor es : " + d);
        
        

    }
}
