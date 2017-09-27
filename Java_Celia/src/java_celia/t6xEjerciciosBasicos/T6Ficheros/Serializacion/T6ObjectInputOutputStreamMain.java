/**
 * @created on : 27-sep-2017, 11:52:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion.T6ObjectInputOutputStreamPersona.fo;
import static java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion.T6ObjectInputOutputStreamPersona.oos;

public class T6ObjectInputOutputStreamMain {

    public static void main(String[] args) {

        String[] nombres = {"Pepe 1", "Pepa 2", "Pepo 3"};

        int[] edades = {15, 31, 43};

//    Escritura del fichero
        try {

            fo = new FileOutputStream("personaSerializable.txt");
            oos = new ObjectOutputStream(fo);

            for (int i = 0; i < nombres.length; i++) {
//                Persona p = new Persona(nombres,edades);
            }

        } catch (Exception e) {

        }
    }

}
