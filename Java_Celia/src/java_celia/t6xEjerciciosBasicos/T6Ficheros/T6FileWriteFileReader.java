/**
 * @created on : 27-sep-2017, 0:01:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class T6FileWriteFileReader {

    public static void main(String[] args) {
        int c = 0;
        int i = 0;
        char[] cad = new char[100];

        try {

//            Lee lo que hay dentro de este archivo
            FileReader finput = new FileReader("fichero_origen.txt");
//            Escribe en su interior lo que hay dentro del anterior 1archivo
            FileWriter foutput = new FileWriter("fichero_destino.txt");

//            El valor c == -1 indicara fin del fichero de ent  rada
            while (c != -1) {
                i = 0; // Contador para indexar el array de caracteres
                c = finput.read();
                while ((c != -1) && (i < 100)) {
                    cad[i] = (char) c; // Guardamos el caracter en el array
                    i++;
                    c = finput.read();
                }
//                Escribimos en el array
                foutput.write(cad);
            }
            if (finput != null) {
                finput.close();
            }
            if (foutput != null) {
                foutput.close();
            }
        } catch (IOException ioe) {
            System.out.println(" " + ioe.getMessage() + " - " + ioe.getLocalizedMessage());
        }
    }
}
