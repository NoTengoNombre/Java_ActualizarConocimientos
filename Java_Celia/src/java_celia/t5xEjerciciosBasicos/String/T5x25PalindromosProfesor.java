/**
 * @created on : 25-sep-2017, 0:46:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5x25PalindromosProfesor {

    public static void main(String[] args) {

    }
}

class PalindromoCharArray {

    /**
     * Array de char
     */
    private char[] frase;

    protected int j;

    PalindromoCharArray() {
        this.j = 0;
    }

    /**
     * Captura por teclado lo que introduzca por consola
     */
    public void leer() {
        String str = null;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = buff.readLine();
        } catch (IOException e) {
            System.out.println("Excepcion del tipo " + e.getMessage());
            frase = str.toCharArray();
        }
    }

    /**
     * Cuenta el numero de caracteres validos ( no espacios )
     *
     * @return
     */
    private int contarCaracteresValidos() {
        int cont = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] != ' ') {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Elimina los espacios de la frase
     */
    private void quitarEspacios() {
        char[] nuevo = new char[contarCaracteresValidos()];
        int i;
        for (i = 0; i < frase.length; i++) {
            if (frase[i] != ' ') {
                nuevo[i] = frase[i];
                j++;
            }
        }
        frase = nuevo;
    }

    /**
     * Muestra el contenido del array
     */
    public void mostrar() {
        int i;
        for (i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
        }
        System.out.println();
    }

    /**
     * Recorro el char de array de izquierda (variable i ) a derecha (variable
     * j) Si encontramos alguna pareja diferente , no es palindromo
     *
     * @return
     */
    public boolean esPalindromo() {
        int izq = 0;
        int der = frase.length - 1;
        boolean palindromo = true;

        while (izq < der && palindromo) {
            if (frase[izq] != frase[der]) {
                palindromo = false;
            }
            izq++;
            der--;
        }
        return palindromo;
    }

}
