/**
 * @created on : 01-oct-2017, 13:04:57
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

public class T6EjemploFileOutputStreamEscribirFlujoByteArchivo {

    public static void main(String[] args) {

        String nombreArchivo = "archivoConDatosBytes.txt";
        String contenidoArchivo = "Abrir un flujo 'stream' en un archivo 'txt' para escribir bytes dentro de él";
        File fichero = null;
        FileOutputStream fos = null;

        try {
            fichero = new File(nombreArchivo);
            fos = new FileOutputStream(fichero);

//Si el fichero no existe , lo creamos
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

// Convertimos el String en bytes para poder escribirlo
            byte[] contentInBytes = contenidoArchivo.getBytes();

            fos.write(contentInBytes);
            fos.flush();
            fos.close();

            System.out.println("Escritura realizada con exito");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirFlujoByteArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirFlujoByteArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileOutputStreamEscribirFlujoByteArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
