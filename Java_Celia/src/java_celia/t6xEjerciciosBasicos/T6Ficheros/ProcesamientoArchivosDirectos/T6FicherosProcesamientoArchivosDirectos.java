/**
 * @created on : 28-sep-2017, 23:00:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ProcesamientoArchivosDirectos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FicherosProcesamientoArchivosDirectos {

    public static void main(String[] args) {

        File f;
        FileReader fos;
        char c[] = new char[20];

        try {
            f = new File("leerBytes.txt");
            fos = new FileReader(f);
            for (int i = 0; i < f.length(); i++) {
                int posicion = fos.read(c, 1, 19);
                System.out.println("Valor dado por la posicion : " + posicion);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6FicherosProcesamientoArchivosDirectos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error File Mensaje : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        } catch (IOException ex) {
            Logger.getLogger(T6FicherosProcesamientoArchivosDirectos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
