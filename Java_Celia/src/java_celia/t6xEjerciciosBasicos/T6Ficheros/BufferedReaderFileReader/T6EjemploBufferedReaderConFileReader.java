/**
 * @created on : 30-sep-2017, 21:02:25
 * @see http://chortle.ccsu.edu/java5/Notes/chap84/ch84_4.html
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.BufferedReaderFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploBufferedReaderConFileReader {

    public static void main(String[] args) {

//        Nombre del archivo dentro de un String 
        String fileName = "contar2.txt";
//        Almaceno cada linea
        String line;

        try {
//            Creo un buffer para llenarlo de bytes y transformos los bytes en caracteres ASCII los datos del archivo que quiero que lea
            try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
//              lee cada linea de texto y lo almacena dentro del objeto String 'objeto inmutable'
                line = in.readLine();
//              si el objeto line llega a null , no hay más lineas que leer
                while (line != null) {
                    System.out.println(line);
                    line = in.readLine(); // cuando llega al final del fichero y no hay datos 'line' se convierte en null
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploBufferedReaderConFileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Mensaje : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploBufferedReaderConFileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Mensaje : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        }
    }
}
