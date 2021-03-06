/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T2_7Leer_Numero_mismo_try_catch_distinto_bloque {

    public static void main(String[] args) {
        String nombre = null;
        int edad = 0;

        System.out.println("Ahora teclea tu nombre : ");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            nombre = buff.readLine();
        } catch (IOException ex) {
            Logger.getLogger(T2_7Leer_Numero_mismo_try_catch_distinto_bloque.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Ahora teclea tu edad : ");

        try {
            edad = Integer.parseInt(buff.readLine());
        } catch (IOException ex) {
            Logger.getLogger(T2_7Leer_Numero_mismo_try_catch_distinto_bloque.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Nombre : " + nombre + " Edad : " + edad);
    }
}
