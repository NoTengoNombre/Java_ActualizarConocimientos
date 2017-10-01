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

        File f;
        String[] ficheros = {"text1.txt", "text2.txt"};
        String p = null;
        boolean w = false;
        try {
//            Para cada String en el array ficheros
            for (String nombre_fichero : ficheros) {
                f = new File(nombre_fichero);
                if (!f.exists()) {
                    f.createNewFile();
                    w = f.canWrite();
                    p = f.getAbsolutePath();
                    System.out.println("Ruta : " + p + " . Permiso escritura : " + w);
                }
                if (f.exists() && (nombre_fichero.equals("text2.txt"))) {
                    File f2 = new File("text3.txt");
                    f.renameTo(f2);
                    System.out.println("Ruta : " + p + " . Permiso escritura : " + w);
                }
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getLocalizedMessage() + " - " + e.getMessage());
        }
    }
}
