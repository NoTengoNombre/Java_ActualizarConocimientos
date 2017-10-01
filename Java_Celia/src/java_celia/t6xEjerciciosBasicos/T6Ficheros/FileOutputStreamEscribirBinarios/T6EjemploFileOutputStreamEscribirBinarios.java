/**
 * @created on : 30-sep-2017, 0:24:10
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileOutputStreamEscribirBinarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileOutputStreamEscribirBinarios {

    public static void main(String[] args) {

        FileOutputStream fop = null;
        File file;
        String content = "FileOuputStream Para Archivos Binarios de organizacion secuencial , acceso directo o indirecto(aleatorio)";
        try {
            file = new File("fileoutputstream.txt");
            fop = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
//            Ahora viene la conversion a bytes
            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Escritura realizada con exito");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
