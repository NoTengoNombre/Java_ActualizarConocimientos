/**
 * @created on : 01-oct-2017, 16:44:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ClaseFile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6ClaseFile {

    public static void main(String[] args) {

        File fichero = null;
        String[] ficheros = {"ficheroArray1.txt", "ficheroArray2.txt"};
        try {
            for (String nombre_fichero : ficheros) {
                fichero = new File(nombre_fichero);
                if (!fichero.exists()) {
                    fichero.createNewFile();
                    String ruta = fichero.getAbsolutePath();
                    System.out.println("• Ruta : " + ruta + " Permisos escritura : " + fichero.canWrite());
                } else {
                    String ruta = fichero.getAbsolutePath();
                    System.out.println("♦ Ruta : " + ruta + " Permisos escritura : " + fichero.canWrite());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(T6ClaseFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje de error : " + ex.getMessage() + " Localización : " + ex.getLocalizedMessage());
        }
    }
}
