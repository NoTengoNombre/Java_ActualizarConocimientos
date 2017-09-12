/**
 * @created on : 12-sep-2017, 19:33:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada;

import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetraMatriz;

/**
 * Generar Matrices que dispongan las palabras:
 *
 * Vertical , Horizontal , Diagonal , Invertidas
 *
 * A - Tamaño de la sopa de la letra a generar
 *
 * B - Numero de palabras que la sopa tiene que contener
 *
 * C - Forma de la sopa de letras va a generar
 *
 * @author Portatil_Bot
 */
public class T5xSopaDeLetrasGenerarMatrices {

    public static void main(String[] args) {
        GenerarMatrices gm = new GenerarMatrices();
//        gm.setArrayVertical(gm.getGenerarMatrizCaracterAleatorios(5, 10), "PERRO");
        gm.setArrayHorizontal(gm.getGenerarMatrizCaracterAleatorios(5, 10), "PERRO");
    }

}

class GenerarMatrices implements SopaDeLetraMatriz {

    /**
     * A - Tamaño de la sopa de letras a generar
     *
     * Matriz con formas geometricas basicas "cuadrado" o "rectangulo y lo
     * devuelve
     *
     * @param fila
     * @param col
     * @return
     */
    @Override
    public char[][] getGenerarMatrizCaracterAleatorios(int fila, int col) {
        System.out.println("\u001b[33m◘ Genera una matriz basica de letras");
        CapturaTeclado ct = new CapturaTeclado();
        char[][] matriz = new char[fila][col];
        for (fila = 0; fila < matriz.length; fila++) {
            for (col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = ct.getGeneraLetraAleatoria();
            }
        }
        return matriz;
    }

    /**
     *
     * @param cadena
     */
    public void setArrayVertical(char[][] cadena, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int i = 0;
        for (int f = 0; f < cadena.length; f++) {
            for (int c = 0; c < cadena[f].length; c++) {
                // Modificando (cadena[0].length - 10)
                // esta parte mueve la palabra de izquierda a derecha
                if ((f == f && c == cadena[0].length - 10)) {
                    if (i < palabra.length()) {
                        cadena[f][c] = palabraTroceada[i];
                        i++;
                    }
                }
                System.out.print(cadena[f][c]);
            }
            System.out.println("");
        }
    }

    /**
     *
     * @param args
     */
    public static void setArrayHorizontal(char[][] cadena, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int i = 0;
        for (int f = 0; f < cadena.length; f++) {
            for (int c = 0; c < cadena[f].length; c++) {
// Modificando (f == 0) Movemos de arriba a abajo el array de letras
                if (((f == 0) && (c <= cadena.length))) {
                    if (i < palabra.length()) {
                        cadena[f][c] = palabraTroceada[i];
                        i++;
                    }
                }
                System.out.print(cadena[f][c]);
            }
            System.out.println("");
        }
    }

    /**
     *
     * @param args
     */
    public static void setArrayDiagonal(char[] args) {

    }

}
