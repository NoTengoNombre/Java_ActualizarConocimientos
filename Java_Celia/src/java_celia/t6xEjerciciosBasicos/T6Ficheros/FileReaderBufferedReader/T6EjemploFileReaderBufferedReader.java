/**
 * @created on : 01-oct-2017, 19:35:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileReaderBufferedReader {

    public static void main(String[] args) {

        String nombreFichero = "lecturaFileReaderConBufferedReader.txt";
        String linea = null;

        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader bf = new BufferedReader(fr);

            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileReaderBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje de Error : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileReaderBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje de Error : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        }

    }
}
