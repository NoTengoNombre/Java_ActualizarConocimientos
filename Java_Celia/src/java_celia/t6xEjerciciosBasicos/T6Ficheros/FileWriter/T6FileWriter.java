/**
 * @created on : 30-sep-2017, 22:56:55
 * @see http://chortle.ccsu.edu/java5/Notes/chap83/ch83_4.html
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FileWriter {

    public static void main(String[] args) {

        try {
            FileWriter escribirCaracteres = new FileWriter(new File("EscribirFileWriter.txt"));
            escribirCaracteres.write("La subclase FileWriter es una Subclase de OutputStreamWriter");
            escribirCaracteres.write("Subclase de OutputStreamWriter es subclase de la superclase Abstracta OutputStream ");
            escribirCaracteres.write("la superclase Abstracta Writer tiene metodos implementados y otros no ");
            escribirCaracteres.write("que seran implementados por las subclases ");

        } catch (IOException ex) {
            Logger.getLogger(T6FileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
