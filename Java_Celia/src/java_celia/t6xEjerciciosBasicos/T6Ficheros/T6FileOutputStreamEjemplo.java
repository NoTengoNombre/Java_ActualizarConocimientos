/**
 * @created on : 26-sep-2017, 22:53:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FileOutputStreamEjemplo {

    public static void main(String[] args) throws IOException {

        FileOutputStream fops = null;
        File file;
        String contenido = "Este es el mensaje que escribiremos en el archivo / fichero";

        try {
            file = new File("mi_fichero.txt");
            fops = new FileOutputStream(file);

//          Si: el fichero no existe lo creamos 
            if (!file.exists()) {
                file.createNewFile();
            }
//Convertimos el String en Bytes para poder escribirlo
//FileOutPutStream solo admite bytes

            byte[] contentInBytes = contenido.getBytes();

            fops.write(contentInBytes);
            fops.flush();
            fops.close();

            System.out.println("Escritura realizada con exito");

        } catch (IOException ex) {

            Logger.getLogger(T6FileOutputStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (fops != null) {
                    fops.close();
                }
            } catch (IOException ioe) {
                Logger.getLogger(T6FileOutputStreamEjemplo.class.getName()).log(Level.SEVERE, null, ioe.getMessage());
            }
        }
    }
}
