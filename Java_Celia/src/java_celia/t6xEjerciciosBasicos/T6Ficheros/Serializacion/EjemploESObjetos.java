/**
 * @created on : 27-sep-2017, 12:10:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Portatil_Bot
 */
public class EjemploESObjetos {

    /**
     * Creamos "objetos static" de las distintas clases para que SOLO haya una
     * copia de él por cada clase instanciada
     */
    static File f;
    static FileOutputStream fo;
    static ObjectOutputStream oos;
    static FileInputStream fi;
    static ObjectInputStream ois;

    public static void main(String[] args) {

        String[] nombres = {"Pepe Tardo", "Ana Bolizante", "Jaime Tralleta"};

        int[] edades = {15, 19, 47};

        try {
//            Crea el objeto que creara una transmision hacia el archivo
            fo = new FileOutputStream("personasSerializables.txt");
//            Crea un objeto que se usará para serializarlo
            oos = new ObjectOutputStream(fo);

            for (int i = 0; i < nombres.length; i++) {
//Invocamos la clase Persona para craer un objeto 
//con las caracteristicas que tiene el constructor
// En cada vuelta del bucle se crea un objeto 'p' con los datos de los arrays
                Persona p = new Persona(nombres[i], edades[i]);
//Ese objeto se 'serializa' y se envia a la transmision del objeto indicado
                oos.writeObject(p);
            }

//            Si hay transmision se cierra la transmision y el archivo
            if (oos != null) {
                oos.close();
                fo.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploESObjetos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploESObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }

//        LECTURA DEL FICHERO
        try {
            f = new File("personasSerializables.txt");
            if (f.exists()) {
                fi = new FileInputStream(f);
                ois = new ObjectInputStream(fi);
                Persona p = null;

//              Mientras: archivo esta disponible : 
//                        available - crea una estimacion de cuantos bytes queda antes de llegar a EOF
                while (fi.available() > 0) {
                    p = (Persona) ois.readObject();
                    p.mostrar();
                }
            }

        } catch (FileNotFoundException exfile) {
            Logger.getLogger(EjemploESObjetos.class.getName()).log(Level.SEVERE, null, exfile);
        } catch (IOException | ClassNotFoundException ioe) {
            Logger.getLogger(EjemploESObjetos.class.getName()).log(Level.SEVERE, null, ioe);
        }

    }

}
