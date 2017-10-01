/**
 * @created on : 01-oct-2017, 17:30:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileOutputStreamEscribirBinarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileOutputStreamEscribirBinariosFileWriter {

    public static void main(String[] args) {

        File file;
        FileWriter fw = null;
        String contenido = "1 Abrimos un flujo binario hacia el fichero para escribri en el";
        contenido += "\n2 Abierto el flujo escribimos una consecución de bytes que se transforma en caracteres";
        contenido += " dentro de archivo mediante la clase FileWriter";
        contenido += "\n3 Escribimos la consecución de bytes convertidos a caracteres dentro del fichero";
        contenido += "\n4 Despues de escribir cerramos el fichero";
        contenido += "\n5 Sistema ideal para acceso directo y aleatorio";

        try {
            file = new File("AFileOutputStream.txt");
            fw = new FileWriter(file);

            if (!file.exists()) {
                file.createNewFile();
            }

            fw.write(contenido);
            fw.flush();
            fw.close();

            System.out.println("Escritura realizada con exito");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinariosFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinariosFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(T6EjemploFileOutputStreamEscribirBinariosFileWriter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
