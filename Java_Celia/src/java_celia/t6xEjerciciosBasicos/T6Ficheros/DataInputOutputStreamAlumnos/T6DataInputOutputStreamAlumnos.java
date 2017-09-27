/**
 * @created on : 27-sep-2017, 9:48:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.DataInputOutputStreamAlumnos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escribe en archivo y lee lo escrito desde el mismo archivo
 *
 * @author Portatil_Bot
 */
public class T6DataInputOutputStreamAlumnos {

    private static FileOutputStream fOutput;
    private static FileInputStream fInput;
    private static DataOutputStream datosOutput;
    private static DataInputStream datosInput;
    private static File f;

    public static void main(String[] args) throws IOException {

//        Leer datos desde teclado 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
//            Escribir en el fichero abriendo una transmision
            fOutput = new FileOutputStream("alumnos.txt");
//            Escribir en el fichero para especificar el tipo
            datosOutput = new DataOutputStream(fOutput);
//            Recorre el bucle 2 veces
            for (int i = 0; i < 2; i++) {
                System.out.println("Numero de Alumno/a : " + i);
                System.out.println("Introduce un nombre : ");
//                Introduce un valor tipo cadena
                String nombre = bf.readLine();

                System.out.println("Introduce un edad : ");
//                Introduce un valor tipo entero
                int edad = Integer.parseInt(bf.readLine());
//                Escribe en el fichero el dato segun su tipo : UTF - para String
                datosOutput.writeUTF(nombre);
//                Escribe en el fichero el dato segun su tipo - Int - para edad
                datosOutput.writeInt(edad);
            }
//            Si no existe despues de escribir con la transmision de DataOutputStream
//Si es distinto de null porque se ha creado una 'transmision'
            if (datosOutput != null) {
//               cierra la transimision
                datosOutput.close();
//               cierra el fichero
                fOutput.close();
            }
        } catch (IOException ioe) {
            System.out.println("Mensaje salida : " + ioe.getMessage() + " - " + ioe.getLocalizedMessage());
        }

        try {
//          Crea un archivo/fichero tipo alumnos
            f = new File("alumnos.txt");
//          Si: existe fichero
            if (f.exists()) {
//              crea un flujo para lee el archivo
                fInput = new FileInputStream(f);
//              crea un flujo para leer el archivo o fichero
                datosInput = new DataInputStream(fInput);
                String nombre;
                int edad;
                System.out.println("Contenido del fichero alumno.txt");
//              Si el contenido esta disponible y es mayor que 0
                while (fInput.available() > 0) {
//                  lee los bytes leidos del 'stream' y los convierte mediante UTF
                    nombre = datosInput.readUTF();
                    System.out.println("Nombre : " + nombre);
//                  lee los bytes leidos del 'stream' y los convierte mediante int
                    edad = datosInput.readInt();
                    System.out.println("Edad : " + edad);
                }
            }
//          Si: Los datos de entrada son distintos de null
//          Si existe transimision 
            if (datosInput != null) {
//              Cierra el flujo de tipo DataInputStream
                datosInput.close();
//              Cierra el fichero
                fInput.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(T6DataInputOutputStreamAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            System.out.println("Error : " + e.getLocalizedMessage() + " - " + e.getMessage());
        }

    }

}
