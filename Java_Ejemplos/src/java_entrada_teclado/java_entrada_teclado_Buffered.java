/**
 * @created on : 20-ago-2017, 20:27:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_entrada_teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class java_entrada_teclado_Buffered {

    public static int getNumero() {
        int numero = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce un numero : ");
            String s = br.readLine();
            numero = Integer.parseInt(s);
        } catch (IOException ex) {
            Logger.getLogger(java_entrada_teclado_Buffered.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }

    public static void main(String[] args) {
        int n = getNumero();
        if (n == 1) {
            System.out.println("Soy un int :  " + n);
        }
    }
}
