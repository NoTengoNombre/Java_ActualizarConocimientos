/**
 * @created on : 14-sep-2017, 9:42:04
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Arrays;

public class JavaArrayMoverPalabraDentroLongitudMaximaConFuncion {

    public static String moverPalabra = "OSO";

    public static void moverPalabra(String paParam) {
        char[] contenedorChar = new char[4];
        char[] contenedorCharMas1 = new char[4];
        System.out.println("Longitud total del array : " + Arrays.toString(contenedorChar));
        System.out.println("Empieza a escribir en la posicion " + (contenedorChar.length - 4));
        for (int i = 0; i < moverPalabra.length(); i++) {
            contenedorChar[i] = moverPalabra.charAt(i);
        }
        System.out.println("Longitud total de las palabras : " + Arrays.toString(contenedorChar));
        System.out.println("Empieza a escribir en la posicion " + (contenedorCharMas1.length - 3));
        for (int i = 0; i < moverPalabra.length(); i++) {
            contenedorCharMas1[i + 1] = moverPalabra.charAt(i);
        }
        System.out.println("Longitud total de las palabras : " + Arrays.toString(contenedorCharMas1));
    }

    public static void moverPalabraConIF(String paParam, int c) {
        char[] contenedorChar = new char[10];
        char[] palabra = {'o', 's', 'o'};
        System.out.println("Longitud total del array : " + contenedorChar.length);
        System.out.println("Longitud total del array : " + Arrays.toString(contenedorChar));
        System.out.println("Longitud de las palabras : " + palabra.length);
        System.out.println("Longitud total de las palabras : " + Arrays.toString(palabra));
        for (int i = 0; i < moverPalabra.length(); i++) {
            if (c > (palabra.length - contenedorChar.length)) {
                contenedorChar[i + c] = moverPalabra.charAt(i);
                System.out.println("\u001b[33mElige otra palabra");
            } else {
                System.out.println("Correcto");
            }
        }
        System.out.println("Longitud total de las palabras : " + Arrays.toString(contenedorChar));
    }

    public static void moverPalabraConIfAlternativo(int paramColumn) {

        char[] contenedorChar = new char[10];
        char[] palabra = {'o', 's', 'o'};

        System.out.println("ContenedorChar.length : " + contenedorChar.length);
        System.out.println("paramColumn : " + paramColumn);

        int valor = (contenedorChar.length - palabra.length);
        System.out.println("(contenedorChar.length - palabra.length) : " + valor);

        if (paramColumn <= valor) {
            for (int i = 0; i < moverPalabra.length(); i++) {
//                if (paramColumn > (palabra.length - contenedorChar.length)) {
                contenedorChar[i + paramColumn] = moverPalabra.charAt(i);
                System.out.println("Correcto");
                System.out.println("Longitud total de las palabras : " + Arrays.toString(contenedorChar));
//                }
            }
        } else {
            System.out.println("\u001b[33mElige otra palabra");
        }
    }

    public static void main(String[] args) {
//        moverPalabraConIF(moverPalabra, 7);

        moverPalabraConIfAlternativo(7);

    }

}
