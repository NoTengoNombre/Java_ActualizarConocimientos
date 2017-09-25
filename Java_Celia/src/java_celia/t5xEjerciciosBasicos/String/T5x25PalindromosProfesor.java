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

    /**
     * Array de char
     */
    private char[] frase;

    private int j;

    T5x25PalindromosProfesor() {
        this.j = 0;
    }

    /**
     * Captura por teclado lo que introduzca por consola
     */
    public void leer() {
        String str = null;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce por teclado la frase que quieres cambiar");
        try {
            str = buff.readLine();
        } catch (IOException e) {
            System.out.println("Excepcion del tipo " + e.getMessage() + " Localizacion : " + e.getLocalizedMessage());
        }
        frase = str.toCharArray();
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
        System.out.println("Contar caracteres validos " + cont);
        return cont;
    }

    /**
     * Elimina los espacios de la frase
     */
    private void quitarEspacios() {
        char[] nuevo = new char[contarCaracteresValidos()];
        int izquierda;
        int derecha = 0;

        for (izquierda = 0; izquierda < frase.length; izquierda++) {
            if (frase[izquierda] != ' ') {
                nuevo[derecha] = frase[izquierda];
                derecha++;
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
            System.out.print(frase[i]);
        }
        System.out.println();
    }

    /**
     * Comprobamos si la frase es palindroma recorriendola desde el extremo
     * izquierdo (variable i) y desde el derecho ( variable j )
     *
     * Si encontramos alguna pareja diferente , sabremos que la frase no es
     * palindroma
     *
     * Recorro el char de array de izquierda (variable i ) a derecha (variable
     * j) Si encontramos alguna pareja diferente , no es palindromo
     *
     * @return
     */
    public boolean esPalindromo() {
        int izq = 0;
        int der = (frase.length - 1);
        boolean palindromo = true;

        while ((izq < der) && palindromo) {
            if (frase[izq] != frase[der]) {
                palindromo = false;
            }
            izq++;
            der--;
        }
        esPalindromoSiNo(palindromo);
        return palindromo;
    }

    public void esPalindromoSiNo(boolean palindromo) {
        if (palindromo == true) {
            System.out.println("\u001b[33m La palabra es palindroma");
        } else {
            System.out.println("\u001b[35m La palabra es NO palindroma");
        }
    }

    /**
     *
     */
    public static void lanzarAppArrayChar() {
        T5x25PalindromosProfesor p = new T5x25PalindromosProfesor();
        p.leer();
        p.quitarEspacios();
        p.contarCaracteresValidos();
        p.mostrar();
        p.esPalindromo();
    }

}

class PalindromoString {

    private String frase;

    /**
     *
     */
    public void leer() {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce por teclado la frase que quieres cambiar");
        try {
            frase = buff.readLine();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage() + " Localizado : " + e.getLocalizedMessage());
        }
    }

    /**
     *
     * @return
     */
    private int contarCaracteresValidos() {
        return frase.length();
    }

    /**
     *
     */
    public void quitarEspacios() {
        frase = frase.replaceAll(" ", "");
    }

    /**
     *
     */
    public void mostrar() {
        System.out.println(frase);
    }

    /**
     *
     * @return
     */
    public boolean esPalindromo() {
        StringBuilder str1 = new StringBuilder(frase);
        String fraseInvertida = (str1.reverse().toString());
        System.out.println("El valor es : " + frase.equals(fraseInvertida));
        esPalindromoSiNo(frase.equals(fraseInvertida));
        return frase.equals(fraseInvertida);
    }

    public void esPalindromoSiNo(boolean palindromo) {
        if (palindromo == true) {
            System.out.println("\u001b[32m Si es palindromo");
        } else {
            System.out.println("\u001b[32m No es palindromo");
        }
    }

    public static void lanzarAppString() {
        PalindromoString ps = new PalindromoString();
        ps.leer();
        ps.contarCaracteresValidos();
        ps.quitarEspacios();
        ps.mostrar();
        ps.esPalindromo();
    }

    public static void main(String[] args) {
        lanzarAppString();
    }

}
