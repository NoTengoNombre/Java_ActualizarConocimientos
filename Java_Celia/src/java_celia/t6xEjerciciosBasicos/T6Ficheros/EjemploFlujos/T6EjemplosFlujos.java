/**
 * @created on : 29-sep-2017, 22:45:52
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

public class T6EjemplosFlujos {

    public static void main(String[] args) {

        int caracter = 0;
        String s = "Objeto String";
        s += " Concatenacion objeto String 1";
        s += " Concatenacion objeto String 2";
        s += " Concatenacion objeto String 3";

        char[] arr = new char[s.length()];

        StringReader flujoEntrada = new StringReader(s);
        CharArrayWriter flujoSalida = new CharArrayWriter();

        try {
            while ((caracter = flujoEntrada.read()) != -1) {
                flujoSalida.write(caracter);
            }
            arr = flujoSalida.toCharArray();
            System.out.println(arr);
        } catch (IOException ex) {
            Logger.getLogger(T6EjemplosFlujos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            flujoEntrada.close();
            flujoSalida.close();
        }
    }

}