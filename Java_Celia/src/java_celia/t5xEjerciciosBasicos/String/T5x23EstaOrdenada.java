/**
 * @created on : 10-sep-2017, 0:35:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5x23EstaOrdenada {

    public static void main(String[] args) throws IOException {

        EstaOrdenada eo = new EstaOrdenada();
//        eo.setCadenaOrdenadaComparaSiguienteCaracter(eo.getCadenaPorTeclado());
        eo.setCadenaOrdenadaComparaMismoCaracter(eo.getCadenaPorTeclado());
    }
}

class EstaOrdenada {

    public String getCadenaPorTeclado() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("♦ Introduce la cadena de caracteres que quieres comprobar ");
        return bf.readLine();
    }

    public void setCadenaOrdenadaComparaMismoCaracter(String cadena) {
        String cInsertada = cadena;
        int[] aCInsertada = new int[cInsertada.length()];

        System.out.println(" -- Cadena Insertada -- ");
        for (int i = 0; i < cInsertada.length(); i++) {
            aCInsertada[i] = (cInsertada.charAt(i) - 0);
        }

        System.out.println("cInsertada " + cInsertada.length());
        boolean orden = true;

        for (int i = 0; i < cInsertada.length(); i++) {
            for (int j = i; j < cInsertada.length(); j++) {
                if (aCInsertada[i] <= aCInsertada[j]) {
                    System.out.println("\u001b[32mEsta ordenado : " + aCInsertada[i] + " - " + aCInsertada[j] + " : " + cInsertada.charAt(i) + " - " + cInsertada.charAt(j));
//                    Si pone orden = true --> se guarda la ultima posicion y como ambos son iguales entonces da error
                } else {
                    System.out.println("\u001b[33mNo Esta ordenado : " + aCInsertada[i] + " - " + aCInsertada[j] + " : " + cInsertada.charAt(i) + " - " + cInsertada.charAt(j));
                    orden = false;
                }
            }
        }
        if (orden == true) {
            System.out.println("\u001b[32mESTAN ORDENADOS");
        } else {
            System.out.println("\u001b[33mNO ESTAN ORDENADOS");
        }

    }

    public void setCadenaOrdenadaComparaSiguienteCaracter(String cadena) {
        String cInsertada = cadena;
        int[] aCInsertada = new int[cInsertada.length()];

        System.out.println(" -- Cadena Insertada -- ");
        for (int i = 0; i < cInsertada.length(); i++) {
            aCInsertada[i] = (cInsertada.charAt(i) - 0);
        }

        System.out.println("cInsertada " + cInsertada.length());
        boolean orden = true;

        for (int i = 0; i < cInsertada.length(); i++) {
//            PARA EVITAR QUE SE COMPRUEBE EL MISMO CARACTER 2 VECES SE INCREMENTA i + 1
            for (int j = i + 1; j < cInsertada.length(); j++) {
                if (aCInsertada[i] < aCInsertada[j]) {
                    System.out.println("\u001b[32mEsta ordenado : " + aCInsertada[i] + " - " + aCInsertada[j] + " : " + cInsertada.charAt(i) + " - " + cInsertada.charAt(j));
//                    AHORA CADA POSICION ES DIFERENTE A LA ANTERIOR : NO SE COMPARAN LA MISMA POSICION 2 VECES
                } else {
                    System.out.println("\u001b[33mNo Esta ordenado : " + aCInsertada[i] + " - " + aCInsertada[j] + " : " + cInsertada.charAt(i) + " - " + cInsertada.charAt(j));
                    orden = false;
                }
            }
        }

        if (orden == true) {
            System.out.println("\u001b[32mESTAN ORDENADOS");
        } else {
            System.out.println("\u001b[33mNO ESTAN ORDENADOS");
        }

    }

}
