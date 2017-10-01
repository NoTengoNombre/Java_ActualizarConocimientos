/**
 * @created on : 30-sep-2017, 13:40:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.EjemploFlujos;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Se trata de abrir y cerrar flujos de caracteres "String" convertidos a array
 * de [] char
 *
 * @author Portatil_Bot
 */
public class T6EjemploFlujos2 {

    public static void main(String[] args) {

//        Creo un String
        String s = "Cadena de datos para leer y escribir";
//       Creo un array de bytes con la longitud del String
        char[] arr = new char[s.length()];
//        Inicio a 0 los caracteres
        int car = 0;

//        ABRO un flujo de lectura hacia la cadena String
        StringReader flujoEntrada = new StringReader(s);
//        Cada caracter leido del flujo lo convierto en un caracter de un array autogenerado
        CharArrayWriter flujoSalida = new CharArrayWriter();

        try {
// Almacena en 'car' un caracter leido hasta -1 que es el fin de lectura de caracteres
            while ((car = flujoEntrada.read()) != -1) {
// Escribe en el flujo los caracteres leidos en forma de array de char 
                flujoSalida.write(car);
            }
//            Convierte el flujo de "String" en un array de [] char
            arr = flujoSalida.toCharArray();
            System.out.println(arr);

        } catch (IOException ex) {
            Logger.getLogger(T6EjemploFlujos2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Mensaje : " + ex.getMessage() + " Localizacion : " + ex.getLocalizedMessage());
        } finally {
            flujoEntrada.close();
            flujoSalida.close();
        }

    }
}
