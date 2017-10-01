/**
 * @created on : 30-sep-2017, 12:30:48
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
import java.io.IOException;

public class T6FileInputStreamMetodoAvailable {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f = new File("contar2.txt");
        FileInputStream fisLeerBinarios = new FileInputStream(f);
        FileOutputStream fosEscribirBinarios = new FileOutputStream(f, true);

        int content;
        int cantidad;

        if ((f.exists()) && (f.canRead())) {
            String rutaCompleta = f.getAbsolutePath();
            System.out.println("• Ver ruta : " + rutaCompleta);
            cantidad = fisLeerBinarios.available();
            System.out.println("♦ Tamaño del fichero : " + cantidad);

            String aniadirNuevoContenido = "\n Aniado nuevo contenido al final del fichero";

            byte[] contenido = aniadirNuevoContenido.getBytes();
            System.out.println("Contenido en bytes : " + contenido.length);

            fosEscribirBinarios.write(contenido, 0, aniadirNuevoContenido.length());

//            fosEscribirBinarios.write(contenido);
            fosEscribirBinarios.flush();

            while ((content = fisLeerBinarios.read()) != - 1) {
                System.out.print((char) content);
            }

            fosEscribirBinarios.close();
            fisLeerBinarios.close();

        }
        System.out.println();

    }

}
