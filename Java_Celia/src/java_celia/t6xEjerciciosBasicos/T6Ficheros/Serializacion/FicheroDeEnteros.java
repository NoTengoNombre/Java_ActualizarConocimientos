/**
 * @created on : 27-sep-2017, 16:28:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FicheroDeEnteros {

    static RandomAccessFile fichero = null;
    //                     objeto                    crea otro objeto      invoca atributo
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int numero;

        try {
//            Abrimos el fichero para lectura y escritura
            fichero = new RandomAccessFile("mi_fichero.txt", "rw");
            verFichero();

            System.out.println("Introduzca un numero entero : ");
            numero = buff.read();

//            Nos situamos al final del fichero
            fichero.seek(fichero.length());
//            Escribimos un entero
            fichero.writeInt(numero);

            verFichero();
            fichero.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error : " + e.getLocalizedMessage() + " - Mensaje : " + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(FicheroDeEnteros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : " + ex.getLocalizedMessage() + " - Mensaje : " + ex.getMessage());
        }
    }

    /**
     * Abre el fichero y busca la 1º posicion
     */
    public static void verFichero() {
        int n = 0;
        try {
// Nos situamos al principio del fichero
            fichero.seek(0);
// Posicion actual del fichero hasta el punto donde se encuentra el puntero pero en "posiciones bytes"        
            long posicionActual = fichero.getFilePointer();
//          Mientras: 
            while (posicionActual < fichero.length()) {
// Leemos un entero del fichero                 
                n = fichero.readInt();
                System.out.println(n);
// Posicion actual del puntero una vez se ha modificado su valor              
                posicionActual = fichero.getFilePointer();
            }
        } catch (IOException ex) {
            Logger.getLogger(FicheroDeEnteros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : " + ex.getLocalizedMessage() + " Mensaje : " + ex.getMessage());
        }
    }

}
