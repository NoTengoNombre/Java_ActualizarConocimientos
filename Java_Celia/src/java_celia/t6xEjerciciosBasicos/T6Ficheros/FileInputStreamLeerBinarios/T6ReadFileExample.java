/**
 * @created on : 30-sep-2017, 0:42:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileInputStreamLeerBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6ReadFileExample {

    public static void main(String[] args) {
        File file = new File("mi_fichero.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            System.out.println("Tamaño del fichero : " + fis.available());

            int content;

            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6ReadFileExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6ReadFileExample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(T6ReadFileExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
