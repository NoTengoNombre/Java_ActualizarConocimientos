/**
 * @created on : 27-sep-2017, 23:27:50
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

public class T6EjemploLeerArchivoMostrarCaracteresEnBytes {

    /**
     *
     * @return
     */
    public static File leerArchivoEnBytes() {
        // El nombre del fichero que vamos a utilizar
        String nombreFich = "contar.txt";
//        Creamos un nuevo fichero
        File file = new File(nombreFich);

        FileInputStream fileinput = null;
        try {
            fileinput = new FileInputStream(file);
            System.out.println("Tamaño del fichero : " + fileinput.available());
            int content;

            while ((content = fileinput.read()) != -1) {
//Convierte el byte leido en un char para mostrarlo
                System.out.println(content);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploBusquedaFileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploBusquedaFileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fileinput != null) {
                    fileinput.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploBusquedaFileInputStream.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error IO : " + ex.getMessage() + " - " + " Mensaje : " + ex.getLocalizedMessage());
            }

        }
        return file;
    }

    public static void main(String[] args) {

        leerArchivoEnBytes();
    }
}
