/**
 * @created on : 12-sep-2017, 19:44:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetrasCapturaTeclado;

/**
 *
 * @author Portatil_Bot
 */
public class T5xSopaDeLetrasCapturaTeclado {

}

class CapturaTeclado implements SopaDeLetrasCapturaTeclado {

    /**
     * Genera una letra de forma aleatoria
     *
     * @return caracter
     */
    public char getGeneraLetraAleatoria() {
        char caracter = (char) (Math.random() * 26 + 'a');
        return caracter;
    }

    /**
     * B - Numero de palabras que la sopa tiene que contener
     *
     * Dividir las filas entre 2
     *
     * @return n -> numero de palabras
     *
     * @throws IOException
     */
    public int getNumeroPalabrasParaAniadirSopa() throws IOException {
        int n;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el numero de palabras que la sopa de letras quiere contener");
        n = Integer.parseInt(bf.readLine());
        if (n < 1) {
            while (n < 1 || n > 5) {
                System.out.println("Por favor : Introduce un numero mayor de 0 y menor de 5 ");
                n = Integer.parseInt(bf.readLine());
            }
        }
        return n;
    }

    /**
     * Captura Numero Teclado
     *
     * @return
     */
    @Override
    public int getCapturaNumeroTeclado() {
        int n = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce un numero entre 3 y 10");
            n = Integer.parseInt(bf.readLine());
            if (n < 3 || n > 10) {
                while (n < 3 || n > 10) {
                    System.out.println("El numero " + n + " es incorrecto"
                            + "\n Por favor : Introduce un numero entre 3 y 10");
                    n = Integer.parseInt(bf.readLine());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(CapturaTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    /**
     * Devuelve un array de caracteres de un String
     *
     * @param cadena
     * @return
     */
    public char[] getConvertirStringArrayDeChar(String cadena) {
        char[] caracteres = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = cadena.charAt(i);
        }
        return caracteres;
    }
}
