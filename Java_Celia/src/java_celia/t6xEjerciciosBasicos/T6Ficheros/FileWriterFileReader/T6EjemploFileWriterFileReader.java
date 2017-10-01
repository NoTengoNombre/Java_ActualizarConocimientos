/**
 * @created on : 01-oct-2017, 18:59:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileWriterFileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileWriterFileReader {

    public static void main(String[] args) {

        FileWriter fw = null;
        FileReader fr = null;
        int c = 0;
        int i = 0;
        char[] cad = new char[100];

        try {
            fw = new FileWriter("fileWriter&fileReader4.txt");
            fr = new FileReader("fileWriter&fileReader4.txt");

            String str = "♦ Creamos un archivo con la subclase FileWriter ,"
                    + "• lo leemos con la subclase FileReader, volvemos a escribirlo otra vez "
                    + "♠ con FileWriter";

            System.out.println("Longitud de la frase : " + str.length());

            for (int j = 0; j < cad.length; j++) {
                System.out.println(str.charAt(j));
                cad[j] = str.charAt(j);
                fw.write(cad[j]);
            }

            while (c != -1) {
                i = 0;
                c = fr.read();
                while ((c != -1) && (i < cad.length)) {
                    cad[i] = (char) c;
                    i++;
                    c = fr.read();
                }
                fw.write(cad);
                fw.flush();
                fr.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileWriterFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileWriterFileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
