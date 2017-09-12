/**
 * @created on : 12-sep-2017, 9:19:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla.T5x30SopaDeLetrasNumerosAleatorios.getLetraAleatoria;

public class T5x30SopaDeLetrasLeerTeclado {

    /**
     * Coge por teclado una palabra
     *
     * @return
     */
    public static String getStringPorTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.next();
        if (palabra.length() < 3 || palabra.length() > 8) {
            while (palabra.length() < 3 || palabra.length() > 8) {
                System.out.println("Introduce una palabra que tenga entre 3 y 8 caracteres");
                palabra = sc.next();
            }
        }
        return palabra;
    }

    /**
     * Convierte String a array de [] char y rellena los espacios vacios con
     * caracteres aleatorios
     *
     * @param cadena
     * @return array de char
     *
     * Restar indices
     *
     */
    public static char[] getStringToChar(String cadena) {
        char[] caracteres = new char[8];
        int total = (caracteres.length - cadena.length());
        int restoEspacios = (caracteres.length - total);

        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = cadena.charAt(i);
        }
        for (int j = restoEspacios; j < caracteres.length; j++) {
            try {
                caracteres[j] = getLetraAleatoria();
            } catch (IOException ex) {
                Logger.getLogger(T5x30SopaDeLetrasLeerTeclado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return caracteres;
    }
}
