/**
 * @created on : 28-sep-2017, 0:32:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ObjectOutputInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectOutputInputStreamEjemploTodoEn1 {

    static File f;
    static FileInputStream fi;
    static FileOutputStream fo;
    static ObjectInputStream ois;
    static ObjectOutputStream oos;

    public static void main(String[] args) {
        String[] nombres = {"Pepe Tardo", "Ana Bolizante", "Jaime Tralleta"};
        int[] edades = {15, 29, 47};

// Escritura del fichero
        try {
            fo = new FileOutputStream("alumnos2.txt");
            oos = new ObjectOutputStream(fo);

            for (int i = 0; i < nombres.length; i++) {
                Persona p = new Persona(nombres[i], edades[i]);
                oos.writeObject(p);
            }
            if (oos != null) {
                oos.close();
                fo.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

// Lectura del fichero
        try {
            f = new File("alumnos2.txt");
            if (f.exists()) {
                fi = new FileInputStream(f);
                ois = new ObjectInputStream(fi);

                Persona p = null;

                while (fi.available() > 0) {
                    p = (Persona) ois.readObject();
                    p.mostrar();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectOutputInputStreamEjemploTodoEn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectOutputInputStreamEjemploTodoEn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectOutputInputStreamEjemploTodoEn1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
