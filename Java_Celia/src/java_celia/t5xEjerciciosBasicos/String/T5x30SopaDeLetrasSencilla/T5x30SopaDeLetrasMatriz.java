/**
 * @created on : 12-sep-2017, 10:29:05
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla;

import java.io.IOException;
import static java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla.T5x30SopaDeLetrasLeerTeclado.getStringToChar;
import static java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla.T5x30SopaDeLetrasNumerosAleatorios.getLetraAleatoria;
import static java_celia.t5xEjerciciosBasicos.String.T5x30SopaDeLetrasSencilla.T5x30SopaDeLetrasNumerosAleatorios.getValorAleatorio1a8;

public class T5x30SopaDeLetrasMatriz {

    /**
     *
     * @return @throws IOException
     */
    public static char[][] getMatriz8x8ConLetras() throws IOException {
        char[][] matriz = new char[8][8];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = getLetraAleatoria();
            }
        }
        return matriz;
    }

    /**
     *
     * @param cadena
     * @throws IOException
     */
    public static void setMatriz8x8ConPalabra(String cadena) throws IOException {

//Genera un num 1 a 8 para elegir la fila
        int x = getValorAleatorio1a8();

//        Matriz 8 x 8 casillas
        for (int f = 0; f < getMatriz8x8ConLetras().length; f++) {
            for (int c = 0; c < getMatriz8x8ConLetras()[f].length; c++) {

                char[] ca = getStringToChar(cadena);

                if (f == x) {
                    System.out.print((getMatriz8x8ConLetras()[f][c] = ca[c]));
                } else {
                    System.out.print(getMatriz8x8ConLetras()[f][c]);
                }
            }
            System.out.println();
        }
    }

    public static void setEjecutarSopa() throws IOException {
        setMatriz8x8ConPalabra(T5x30SopaDeLetrasLeerTeclado.getStringPorTeclado());

    }

}
