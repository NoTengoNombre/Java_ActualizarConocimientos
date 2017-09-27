/**
 * @created on : 26-sep-2017, 23:13:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6FileInputStreamEjemplo {

    public static void main(String[] args) {
//        Selecciono el archivo 
        File file = new File("mi_fichero.txt");
//        Creo el flujo de salida del archivo
        FileInputStream fis = null;

        try {
            int content;
//            Objeto abre el archivo / fichero
            fis = new FileInputStream(file);
            System.out.println("Tamanio del fichero : " + fis.available());
//Asigna el contenido del fichero a una variable int para comprobar si llega al final de fichero que es -1
            int i = 0;
            while ((content = fis.read()) != -1) {
//                Convierte el byte leido en un caracter para mostrarlo
                System.out.format("%2d %14c \n", i, ((char) content));
                i++;
            }
        } catch (IOException ioe) {
            System.out.println("Error : " + ioe.getLocalizedMessage() + " - " + ioe.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(T6FileInputStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
