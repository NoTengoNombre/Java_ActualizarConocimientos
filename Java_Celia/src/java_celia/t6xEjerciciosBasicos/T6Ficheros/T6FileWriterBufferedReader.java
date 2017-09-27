/**
 * @created on : 27-sep-2017, 0:46:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FileWriterBufferedReader {

    public static void main(String[] args) {

//        El nombre del fichero que vamos a utilizar
        String nombreFich = "temporal.txt";

//        Esta variable contendra el texto de cada linea del fichero
        String linea = null;

        try {
//            Leer el fichero 
            FileReader fr = new FileReader(nombreFich);
            BufferedReader buff = new BufferedReader(fr);

            while ((linea = buff.readLine()) != null) {
// Mostramos el contenido del fichero en pantalla
                System.out.println(linea);
            }
            buff.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6FileWriterBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Obtener mensaje : " + ex.getMessage() + " - localizacion : " + ex.getLocalizedMessage());
            System.out.println("No existe el archivo o no se encontro");
        } catch (IOException ex) {
            Logger.getLogger(T6FileWriterBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Obtener mensaje : " + ex.getMessage() + " - localizacion : " + ex.getLocalizedMessage());
            System.out.println("Error en la lectura ");
        }

    }
}
