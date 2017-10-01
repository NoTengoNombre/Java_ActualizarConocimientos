/**
 * @created on : 01-oct-2017, 17:07:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.FileOutputStreamEscribirBinarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T6EjemploFileOutputStreamEscribirBinarios2 {

    private static File fichero = null;
    private static FileOutputStream fop = null;

    public static void main(String[] args) {

        String contenido = "1 Abrimos un flujo binario hacia el fichero para escribri en el";
        contenido += "\n 2 Abierto el flujo escribimos una consecución de bytes dentro de el";
        contenido += "\n 3 Escribimos la consecución de bytes dentro del fichero";
        contenido += "\n 4 Despues de escribir cerramos el fichero";
        contenido += "\n 5 Sistema ideal para acceso directo y aleatorio";

        try {

            fichero = new File("fosEjEscribirFlujos.txt");

            fop = new FileOutputStream(fichero);

            if (!fichero.exists()) {
                fichero.createNewFile();
                System.out.println("A) Escritura realizada con exito");
                byte[] contenidoEnBytes = contenido.getBytes();
                fop.write(contenidoEnBytes);
                fop.flush();
            } else {
                System.out.println("El fichero ya estaba creado anteriormente : " + fichero.getAbsolutePath());
                System.out.println("B) Escritura realizada con exito");
                byte[] contenidoEnBytes = contenido.getBytes();
                fop.write(contenidoEnBytes);
                fop.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fop.close();
            } catch (IOException ex) {
                Logger.getLogger(T6EjemploFileOutputStreamEscribirBinarios2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
