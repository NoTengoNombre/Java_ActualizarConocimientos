/**
 * @created on : 11-sep-2017, 12:45:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java_celia.t5xEjerciciosBasicos.String.Subcadena.getFrase;
import static java_celia.t5xEjerciciosBasicos.String.Subcadena.getPalabra;

/**
 * Con esto he conseguido coger 2 String , convertirlos a array de caracteres
 *
 * Buscar en el array grande , laa posicion de los caracteres que quiero cambiar
 * que coinciden con el array pequeño y modificar su valor segun su posicion del
 * array grande
 *
 * @author Portatil_Bot
 */
public class Tx526Subcadena {

    public static void main(String[] args) throws IOException {

        Subcadena scn = new Subcadena();
        scn.getMensaje(scn.getCambiarValoresDe2Array(getPalabra(), getFrase()));

    }
}

class Subcadena {

    /**
     *
     * @return @throws IOException
     */
    public static String getPalabra() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la palabra para censurar ");
        String cadena = null;
        try {
            cadena = bf.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Subcadena.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadena;
    }

    /**
     *
     * @return @throws IOException
     */
    public static String getFrase() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la frase ");
        String cadena = null;
        try {
            cadena = bf.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Subcadena.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadena;
    }

    /**
     *
     * @param mensaje
     */
    public void getMensaje(char[] mensaje) {
        for (int i = 0; i < mensaje.length; i++) {
            System.out.print(mensaje[i]);
        }
        System.out.println("");
    }

    /**
     * Metodo para convetir String a array char y cambiar el valor del array
     * grande
     *
     * Sin comentarios en el codigo
     *
     * @param cad
     * @param cad1
     */
    public char[] getCambiarValoresDe2Array(String cad, String cad1) {
        char[] caPalabra = new char[cad.length()];
        char[] caCadena = new char[cad1.length()];
        for (int i = 0; i < caPalabra.length; i++) {
            caPalabra[i] = cad.charAt(i);
        }
        for (int i = 0; i < caCadena.length; i++) {
            caCadena[i] = cad1.charAt(i);
        }
        int[] num = new int[caPalabra.length];
        int incremento = 0;
        boolean stop = true;
        for (int i = 0; i < caCadena.length; i++) {
            for (int j = i; j < caCadena.length && stop; j++) {
                if (caPalabra[i] == caCadena[j]) {
                    incremento++;
                    num[i] = j;
                    i++;
                    if (incremento == caPalabra.length) {
                        stop = false;
                    }
                }
            }
        }
        for (int i = 0; i < caPalabra.length; i++) {
            for (int ii = i; ii < caCadena.length; ii++) {
                if (num[i] == ii) {
                    caCadena[ii] = '*';
                }
            }
        }
        return caCadena;
    }

    /**
     * Metodo para convetir String a array char y cambiar el valor del array
     * grande
     *
     * @param cad
     * @param cad1
     */
    public static void getCambiarValoresDe2ArrayCharMediantePosicion(String cad, String cad1) {
        char[] caPalabra = new char[cad.length()];
        char[] caCadena = new char[cad1.length()];
        for (int i = 0; i < caPalabra.length; i++) {
            caPalabra[i] = cad.charAt(i);
        }
        for (int i = 0; i < caCadena.length; i++) {
            caCadena[i] = cad1.charAt(i);
        }

        System.out.println(Arrays.toString(caPalabra));
        System.out.println(Arrays.toString(caCadena));

        int[] num = new int[caPalabra.length];
        int incremento = 0;
        boolean stop = true;
        for (int i = 0; i < caCadena.length; i++) {
            for (int j = i; j < caCadena.length && stop; j++) {
                if (caPalabra[i] == caCadena[j]) {
                    incremento++;
                    System.out.println(j + " - Obtener Numeros - " + caCadena[j]);
                    num[i] = j;
                    i++;
                    if (incremento == caPalabra.length) {
                        stop = false;
                    }
                }
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Posiciones recogidas : " + num[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < caPalabra.length; i++) { // 0,1,2
            for (int ii = i; ii < caCadena.length; ii++) { //0,1,2,3,4,5,6,7
                if (num[i] == ii) {
                    System.out.println(i + " : Entra " + ii + " : Palabra : " + caCadena[ii]);
                    caCadena[ii] = '*';
                }
            }
            System.out.println("--");
        }
        System.out.println("------------------");
        for (int r = 0; r < caCadena.length; r++) {
            System.out.print(caCadena[r]);
        }
        System.out.println("");
    }

}
