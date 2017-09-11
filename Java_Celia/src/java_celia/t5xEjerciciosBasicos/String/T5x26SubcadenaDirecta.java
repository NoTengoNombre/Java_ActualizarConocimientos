/**
 * @created on : 10-sep-2017, 18:42:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.util.Arrays;

public class T5x26SubcadenaDirecta {

    private static String nuevoValor = null;

    /**
     * Metodo para convetir String a array char y cambiar el valor del array
     * grande
     *
     * @param cad
     * @param cad1
     */
    public static void getCambiarValoresDe2ArrayCharMediantePosicion(String cad, String cad1) {
        char[] caPalabra = new char[cad.length()];
        char[] caCadena = new char[cad1.length()];
        for (int i = 0; i < caPalabra.length; i++) {
            caPalabra[i] = cad.charAt(i);
        }
        for (int i = 0; i < caCadena.length; i++) {
            caCadena[i] = cad1.charAt(i);
        }
        System.out.println(Arrays.toString(caPalabra));
        System.out.println(Arrays.toString(caCadena));
        int[] num = new int[caPalabra.length];
        int incremento = 0;
        boolean stop = true;
        for (int i = 0; i < caCadena.length; i++) {
            for (int j = i; j < caCadena.length && stop; j++) {
                if (caPalabra[i] == caCadena[j]) {
                    incremento++;
//                    System.out.println(j + " - Obtener Numeros - " + caCadena[j]);
//                    Tengo la posicion de las letras en el array de carateres grande
                    num[i] = j;
//                    tengo que aumentar 
                    i++;
                    if (incremento == caPalabra.length) {
                        stop = false;
                    }
                }
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < num.length; i++) {
//            System.out.println("Posiciones recogidas : " + num[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < caPalabra.length; i++) { // 0,1,2
            for (int ii = i; ii < caCadena.length; ii++) { //0,1,2,3,4,5,6,7
                if (num[i] == ii) {
//                    System.out.println(i + " : Entra " + ii + " : Palabra : " + caCadena[ii]);
                    caCadena[ii] = '*';
                }
            }
            System.out.println("--");
        }
        System.out.println("------------------");
        for (int r = 0; r < caCadena.length; r++) {
            System.out.print(caCadena[r]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {

//        Convertir String en cadena caracteres
        String cadenaCorta = "perro";
//        Para poder comprar con la otra cadena
        char[] caracterCortos = new char[cadenaCorta.length()];
//        Longitud 5 - espacios 0 a 4
        for (int i = 0; i < cadenaCorta.length(); i++) {
//                               Convierte la cadena en array de caracteres
            caracterCortos[i] = cadenaCorta.charAt(i);
//                           Cada caracter corto
            System.out.print(caracterCortos[i]);
        }

//        Convetir String a cadena caracteres
        String cadenaLarga = "El perro de San Roque";
//        Para poderla comparar con la 1º cadena
        char[] caracterLargos = new char[cadenaLarga.length()];
        System.out.println("\n--------------------");
        for (int i = 0; i < cadenaLarga.length(); i++) {
//                               Convierte la cadena en array de caracteres
            caracterLargos[i] = cadenaLarga.charAt(i);
//                           Cada caracter corto
            System.out.print(caracterLargos[i]);
        }
        System.out.println("\n--------------------");

        for (int i = 0; i < caracterCortos.length; i++) {
            for (int j = i; j < caracterLargos.length; j++) {

            }
        }

        String palabraCensurar = "perro";

        String[] st = {"El", "perro", "de", "San", "Roque"};

        for (int i = 0; i < st.length; i++) {
            if (palabraCensurar == st[i]) {
                String sta = st[i];
                char[] cambia = new char[sta.length()];
                cambia[i] = sta.charAt(i);
                for (int j = 0; j < sta.length(); j++) {
                    cambia[i] = '*';
//                    System.out.print(cambia[i]);
                    nuevoValor = new String(cambia).trim();
                    System.out.print(nuevoValor);
                }
                System.out.println("");
            }
            st[i] = nuevoValor;
        }

        for (String st1 : st) {
            System.out.print(st1);
        }

    }

}
