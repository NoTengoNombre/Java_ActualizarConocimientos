/**
 * @created on : 26-sep-2017, 20:32:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

import java.io.File;
import java.io.IOException;

public class T6File {

    public static void main(String[] args) {

        File f = null;
        String[] ficheros = {"text1.txt", "text2.txt"};

        try {
//            Para cada String en el array ficheros
            for (String nombre_fichero : ficheros) {
                f = new File(nombre_fichero);

                if (!f.exists()) {
                    f.createNewFile();

                    boolean w = f.canWrite();

                    String r = f.getAbsolutePath();

                    System.out.println("Ruta : " + r + " . Permiso escritura : " + w);
                }

            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getLocalizedMessage() + " - " + e.getMessage());
        }
    }
}
