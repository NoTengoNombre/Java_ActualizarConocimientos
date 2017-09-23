/** w
 *
 * @created on : 12-sep-2017, 19:44:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

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
public class T5xSopaDeLetrasCogeDatosTeclado implements SopaDeLetrasCapturaTeclado {

    /**
     * Coge un numero por teclado
     *
     * @param numero
     * @return
     */
    public int getNumeroFilas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("✤ Filas : Introduce un numero entre '3' y '20' ✤ ");
        int col = sc.nextInt();
        if (col < 3 || col > 20) {
            while (col < 3 || col > 20) {
                System.out.println("✤ Filas : Por favor : Introduce un numero entre 3 y 20");
                col = sc.nextInt();
            }
        }
        return col;
    }

    public int getNumeroCol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("✤ Columnas : Introduce un numero entre '3' y '20' ✤ ");
        int col = sc.nextInt();
        if (col < 3 || col > 20) {
            while (col < 3 || col > 20) {
                System.out.println("✤ Columnas : Por favor : Introduce un numero entre 3 y 20");
                col = sc.nextInt();
            }
        }
        return col;
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
            Logger.getLogger(T5xSopaDeLetrasCogeDatosTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    /**
     * Fija un numero que sera el rango de palabras que tendra el array de
     * DICCIONARIO de palabra de la sopa
     *
     * @param numero
     * @return
     */
    public int getNumeroDePalabrasParaSopa() {
        Scanner sc = new Scanner(System.in);
        int longitud = SopaDeLetrasDiccionario.DICCIONARIO.length;
        System.out.println("▯ Introduce un numero para elegir cuantas palabras quieres mostrar en la sopa de letras : ");
        int totalPalabras = sc.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("▯ Numero palabras elegidas para la sopa de letras : " + totalPalabras);

        if (totalPalabras < 1 || totalPalabras >= longitud) {
            while (totalPalabras < 1 || totalPalabras > longitud) {
                System.out.println("▯ Por favor : Introduce un numero entre 1 y " + longitud);
                totalPalabras = sc.nextInt();
            }
        }
        return totalPalabras;
    }

    /**
     * Elegir Numero Entre 1 y 2
     *
     * @return
     */
    public int getElegirNumeroEntre1y2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("▶ Pulsa 0 para salir ▶");
        int teclado = sc.nextInt();
        if (teclado == 0) {
            teclado = 0;
        } else {
            if (teclado < 1 || teclado > 2) {
                while (teclado < 1 || teclado > 2) {
                    System.out.println("▶ Por favor : Introduce 1 para elegir - Cuadrado  ▇ ");
                    System.out.println("▶ Por favor : Introduce 2 para elegir - Rectangulo ▀▀ ");
                    teclado = sc.nextInt();
                }
            }
        }
        if (teclado == 1) {
            System.out.println("▶ La forma elegida es el cuadrado : ▇ ");
        }
        if (teclado == 2) {
            System.out.println("▶ La forma elegida es el Rectangulo : ▀▀ ");
        }
        return teclado;
    }

    /**
     * Genera una letra de forma aleatoria
     *
     * @return caracter
     */
    public char getGeneraLetraAleatoria() {
        char caracter = (char) (Math.random() * 26 + 'a');
        return caracter;
    }
}
