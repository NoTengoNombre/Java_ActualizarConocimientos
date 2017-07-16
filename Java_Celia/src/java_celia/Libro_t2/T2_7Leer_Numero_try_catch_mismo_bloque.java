/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T2_7Leer_Numero_try_catch_mismo_bloque {

    public static void main(String[] args) {

        String nombre = null;
        int edad = 0;

        System.out.println("Introduce Nombre : ");
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            try {
                nombre = buff.readLine();
            } catch (IOException ex) {
                Logger.getLogger(T2_7Leer_Numero.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Introduce Edad : ");
            edad = Integer.parseInt(buff.readLine());

        } catch (IOException ex) {
            Logger.getLogger(T2_7Leer_Numero.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Nombre : " + nombre + " Edad " + edad);

    }
}
