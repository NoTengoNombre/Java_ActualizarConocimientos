/**
 * @created on : 13-sep-2017, 0:22:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Metodos;

import java.util.Arrays;

public class JavaArrayMetodoToStringVerArraysDistintasPosiciones {

    /**
     *
     * @param cadena
     * @return
     */
    public static char[] getConvertirStringToArrayDeCharFila4(String cadena) {
        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
//  Selecciona el caracter que esta en la posicion 4
            caracteres[4] = cadena.charAt(i);
//            System.out.print(caracteres[i]);
            System.out.println(Arrays.toString(caracteres));
        }
        return caracteres;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public static char[] getConvertirStringToArrayDeCharFila3(String cadena) {
        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
//  Selecciona el caracter que esta en la posicion 3
            caracteres[3] = cadena.charAt(i);
//            System.out.print(caracteres[i]);
            System.out.println(Arrays.toString(caracteres));
        }
        return caracteres;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public static char[] getConvertirStringToArrayDeCharFila2(String cadena) {
        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
//  Selecciona el caracter que esta en la posicion 2
            caracteres[2] = cadena.charAt(i);
//            System.out.print(caracteres[i]);
            System.out.println(Arrays.toString(caracteres));
        }
        return caracteres;
    }

    public static void main(String[] args) {
        String perro = "perro";
        char[] caracteres = new char[perro.length()];
//        getConvertirStringToArrayDeCharFila4(perro);
//        getConvertirStringToArrayDeCharFila3(perro);
//        getConvertirStringToArrayDeCharFila2(perro);

        for (int i = 0; i < 1; i++) {
            caracteres[i] = getConvertirStringToArrayDeCharFila3(perro)[i];
            System.out.println(caracteres[i]);
        }

    }
}
