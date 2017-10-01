/**
 * @created on : 01-oct-2017, 13:16:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileOutputStreamEscribirBinarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileOutputStreamEscribirFlujoByteArchivoDirecto {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("archivoConDatosBinariosFos.txt");
            String mensaje = "Abrimos un flujo de datos directo para escribir en memoria secundaria sin usar un objeto File";
            byte[] arrayBytesConMensajes = mensaje.getBytes();

            try {

                fos.write(arrayBytesConMensajes);
                fos.flush();
                fos.close();

            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileOutputStreamEscribirFlujoByteArchivoDirecto.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirFlujoByteArchivoDirecto.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
