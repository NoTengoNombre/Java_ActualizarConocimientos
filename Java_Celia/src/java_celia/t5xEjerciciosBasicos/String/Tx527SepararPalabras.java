/**
 * @created on : 11-sep-2017, 16:39:10
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tx527SepararPalabras {

    public static void main(String[] args) {

        SepararPalabras spa = new SepararPalabras();
        spa.setPalabrasSeparadas(spa.getTeclado());

    }
}

class SepararPalabras {

    private static ArrayList<String> lista = new ArrayList<>();

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
    public String getTeclado() {
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
    public void setPalabrasSeparadas(String cadParametro) {

        StringTokenizer str = new StringTokenizer(cadParametro);

        System.out.println("La cadena tiene " + str.countTokens());

        int i = 0;

        while (str.hasMoreTokens()) {
            System.out.println("Palabra " + i++ + " " + str.nextToken());
        }

        System.out.println("Total : " + i + " palabras ");

    }
}
