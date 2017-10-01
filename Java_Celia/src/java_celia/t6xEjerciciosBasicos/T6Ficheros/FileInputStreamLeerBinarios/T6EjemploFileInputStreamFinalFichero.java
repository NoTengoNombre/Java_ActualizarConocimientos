/**
 * @created on : 27-sep-2017, 20:02:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileInputStreamLeerBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class T6EjemploFileInputStreamFinalFichero {

    private static FileInputStream fis = null;

    /**
     * Lectura secuencial de bytes sobre un FileInputStream
     *
     * devolvera un -1 cuando alcancemos EOF
     *
     * @param file
     */
    public static void leerFicheroSecuencial(File file) {
        int posicion = 0;
        byte contenido;

        try {

            fis = new FileInputStream(file);
            contenido = (byte) fis.read();

            while ((contenido = (byte) fis.read()) != -1) {

                posicion++;
                System.out.printf("\n \u001b[32m Caracter No Encontrado en la Posicion %d %2d %4c ", posicion, contenido, (char) contenido);

                if ((char) contenido == 'X') {
                    System.out.printf("\n \u001b[35m Caracter Encontrado en la Posicion %d %2d %4c ", posicion, contenido, (char) contenido);
                }
            }
            System.out.println("");
        } catch (IOException ioe) {
            System.out.println("Error Mensaje : " + ioe.getMessage() + " Localiza el mensaje : " + ioe.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {

        File f = new File("contar.txt");
        leerFicheroSecuencial(f);

    }
}
