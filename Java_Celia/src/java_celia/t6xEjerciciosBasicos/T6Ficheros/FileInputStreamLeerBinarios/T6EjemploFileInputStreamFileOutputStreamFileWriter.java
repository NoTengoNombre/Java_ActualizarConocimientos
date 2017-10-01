/**
 * @created on : 01-oct-2017, 17:52:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileInputStreamLeerBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileInputStreamFileOutputStreamFileWriter {

    public static void main(String[] args) {

        File file;
        FileWriter fw = null;
        FileOutputStream fop = null;
        FileInputStream fis = null;
        String mensaje = "A) Archivo que abre un flujo de entrada para escribir y luego otro flujo para leer";

        try {

            file = new File("fileInputStreamParaLeer3.txt");

            if (!file.exists()) {
                System.out.println("♦ No existe el archivo fileInputStreamParaLeer3.txt");
                file.createNewFile();
//                fw = new FileWriter(file);
                fop = new FileOutputStream(file);
                fop.write(mensaje.getBytes());
//                fw.write(mensaje);
                fop.flush();
//                fw.flush();

            } else {
                System.out.println("♦♦ Existe el archivo fileInputStreamParaLeer3.txt");
//                fw = new FileWriter(file);
                fop = new FileOutputStream(file);
                fop.write(mensaje.getBytes());
//                fw.write(mensaje);
                fop.flush();
//                fw.flush();
            }

            if (file.exists()) {
                fis = new FileInputStream(file);
                System.out.println("Tamaño del fichero : " + fis.available());

                int contenido;

                while ((contenido = fis.read()) != -1) {
                    System.out.print((char) contenido);
                }
                System.out.println("");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileInputStreamFileOutputStreamFileWriter.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Mensaje : " + ex.getMessage() + " Error Localizacion : " + ex.getLocalizedMessage());
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileInputStreamFileOutputStreamFileWriter.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Mensaje : " + ex.getMessage() + " Error Localizacion : " + ex.getLocalizedMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileInputStreamFileOutputStreamFileWriter.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error Mensaje : " + ex.getMessage() + " Error Localizacion : " + ex.getLocalizedMessage());
            }
        }
    }
}
