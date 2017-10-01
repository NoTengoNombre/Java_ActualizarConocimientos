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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploBusquedaFileInputStream {

    public static char leerArchivoEnCaracteres() {
        File file = null;
        int contenido = 0;
        try {
            String nombreFich = "contar.txt";
            file = new File(nombreFich);
            FileInputStream fis = null;
            fis = new FileInputStream(file);
            System.out.println("Tamaño del fichero: " + fis.available());
            while ((contenido = fis.read()) != -1) {
                System.out.println((char) contenido);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploBusquedaFileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploBusquedaFileInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return (char) contenido;
    }

    /**
     * Lectura secuencial de bytes sobre un FileInputStream
     *
     * devolvera un -1 cuando alcancemos EOF
     *
     * @param file
     */
    public static void buscarFicheroSecuencial(File file) {

        int pos = 1;
        byte contenido;
        boolean encontrado = false;

        FileInputStream fis;

        try {

            fis = new FileInputStream(file);

            while ((((contenido = (byte) fis.read()) != -1)) && (encontrado == false)) {
                System.out.printf("\n \u001b[33m Posicion %4d - Caracter %4c : ", pos, contenido);
                if ((char) contenido == 'X') {
                    encontrado = true;
                }
                pos++;
            }

            if (encontrado == true) {
                System.out.println("\n\u001b[35m Hemos encontrado el caracter X : " + " - Posicion : " + pos);

            } else {
                System.out.println("\n\u001b[35m No hemos encontrado el caracter X : " + " - Posicion : " + pos);
            }

        } catch (IOException ioe) {
            System.out.println("Error Mensaje : " + ioe.getMessage() + " Localiza el mensaje : " + ioe.getLocalizedMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("contar.txt");
        leerArchivoEnCaracteres();
        buscarFicheroSecuencial(f);

    }
}
