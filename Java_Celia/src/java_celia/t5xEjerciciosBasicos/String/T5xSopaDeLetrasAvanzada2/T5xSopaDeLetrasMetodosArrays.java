/**
 * @created on : 18-sep-2017, 9:26:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasFilasColumnas.getNumeroColum;
import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasFilasColumnas.getNumeroFila;

public class T5xSopaDeLetrasMetodosArrays {

    /**
     * @param matriz
     */
    public void setVerMatrices(char[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    /**
     * /**
     * Muestra la matriz completa con caracteres o sin ellos
     *
     * @param matriz
     */
    public void setVerMatrizSopaLetras(char[][] matriz) {
        T5xSopaDeLetrasCogeDatosTeclado ct = new T5xSopaDeLetrasCogeDatosTeclado();
        int incremento = 0;
        int incrementoPalabra = 1;

        System.out.println("\n\t\u001b[33m ═ Filas : " + getNumeroFila() + " ║ Columnas : " + getNumeroColum());
        System.out.println("\t\u001b[32m ░ Sopa de letras generada ░ ");
        System.out.println("\nTotal de palabras elegidas : " + SopaDeLetrasDiccionario.DICCIONARIO.length);

        for (int indice1 = 0; indice1 < getNumeroColum() * 9; indice1++) {
            System.out.print("_");
        }

        for (int fila = 0; fila < matriz.length; fila++) {
            while (incremento < SopaDeLetrasDiccionario.DICCIONARIO.length) {
                System.out.print("\n " + (incrementoPalabra++) + " - " + SopaDeLetrasDiccionario.DICCIONARIO[incremento] + "\t\t");
                for (int columnas = 0; columnas < matriz[fila].length; columnas++) {
                    System.out.print("| " + (matriz[fila][columnas] = ct.getGeneraLetraAleatoria()) + " |");
                }
                incremento++;
            }
        }
        System.out.println();
        for (int i = 0; i < getNumeroColum() * 5; i++) {
            System.out.print("▔");
        }
        System.out.println();
    }
}
