/**
 * @created on : 17-jul-2017, 9:03:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaEjemploCapturaTecladoString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        double d = keyboard.nextDouble();
        System.out.println("Valor es : " + d);

        System.out.println("------------------------------");

        String str = null;
        String mi_string = null;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = String.valueOf(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(JavaEjemploCapturaTecladoString.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Valor " + str);

        if (str instanceof String) {
            System.out.println("si :  " + str);
        }

        boolean es_string = str.getClass().equals(Type.class);
        System.out.println("Valor : " + es_string);

        if (str instanceof String) {
            mi_string = (String) str;
            System.out.println("Si es String ");
        } else {
            System.out.println("No es String ");
        }
    }
}
