/**
 * @created on : 11-sep-2017, 16:39:10
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tx527SepararPalabras {

    public static void main(String[] args) {

        SepararPalabras spa = new SepararPalabras();
        spa.getPalabrasSeparadas("Esto es un mensaje de prueba");

    }
}

class SepararPalabras {

    public String[] getArrayStringSinNull(String[] arrayString) {
        List<String> list = new ArrayList<>();

        for (String s : arrayString) {
            if (s != null && s.length() > 0) {
                list.add(s);
            }
        }
        arrayString = list.toArray(new String[list.size()]);
        return arrayString;
    }

    /**
     * Introducir por teclado una cadena
     *
     * @return
     */
    public String setTeclado() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un texto :");
        String cadena = null;
        try {
            cadena = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SepararPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadena;
    }

    /**
     *
     * @param cadParametro
     * @return
     */
    public String[] getPalabrasSeparadas(String cadParametro) {
        //---------------------"Esto es un mensaje de prueba "
        String cadena = cadParametro + " ";                      // 29

        String convertirArrayCharToString = null;
        String[] contenedorString = null;

        char[] caracteres = new char[cadena.toCharArray().length];

        boolean stop = true;
        //                            29 espacios dentro del array
        contenedorString = new String[cadena.length()];
        //                            29 espacios dentro del array
        for (int i = 0; i < (cadena.length()) && stop; i++) {
//                             
            caracteres[i] = cadena.charAt(i);

            if (caracteres[i] == ' ') {
                convertirArrayCharToString = String.valueOf(caracteres);
                contenedorString[i] = convertirArrayCharToString;
                System.out.println(i + " - " + contenedorString[i]);
            }

        }

        System.out.println(Arrays.toString(contenedorString));

        return contenedorString;
    }

}
