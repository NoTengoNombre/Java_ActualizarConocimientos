/**
 * @created on : 29-sep-2017, 23:05:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.EjemploFlujos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6ModificarComportamientoFlujos {

    public static void main(String[] args) {
        String cadena = null;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            cadena = bf.readLine();
        } catch (IOException ex) {
            Logger.getLogger(T6ModificarComportamientoFlujos.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(cadena);

    }
}
