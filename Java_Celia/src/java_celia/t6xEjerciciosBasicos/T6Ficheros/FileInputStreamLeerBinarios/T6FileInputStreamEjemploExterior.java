/**
 * @created on : 30-sep-2017, 11:18:19
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileInputStreamLeerBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FileInputStreamEjemploExterior {

    public static void main(String[] args) {
        File originFile = new File("c:\\0_Java\\file1.txt");
        File destinationFile = new File("c:\\0_Java\\file2.txt");
        if (!originFile.exists() || destinationFile.exists()) {
            try {
                System.out.println("No existe el fichero");
                originFile.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(T6FileInputStreamEjemploExterior.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (originFile.exists()) {

            byte[] readData = new byte[1024];

            FileInputStream fis = null;
            FileOutputStream fos;

            try {
                fos = new FileOutputStream(originFile, true);
                int ii = 0;
                while (ii != fis.available()) {
                    fos.write(readData);
                }

                fis = new FileInputStream(originFile);
                fos = new FileOutputStream(destinationFile);
                int i = fis.read(readData);

                while (i != -1) {
                    fos.write(readData, 0, i);
                    i = fis.read(readData);
                }
            } catch (IOException ioe) {
                System.out.println("IOException Mensaje : " + ioe.getMessage() + " Localizacion : " + ioe.getLocalizedMessage());
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println("IOException Mensaje : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
                    Logger.getLogger(T6FileInputStreamEjemploExterior.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
