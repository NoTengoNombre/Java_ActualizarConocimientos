/**
 * @created on : 24-sep-2017, 18:30:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.Arrays;

public class T52ParesImparesProfesor {

    private final static int TAM = 10;

    public static void main(String[] args) {

        int[] aPares = new int[TAM];
        int[] aImpares = new int[TAM];

        int valor = 1;

        for (int i = 0; i < TAM; i++) {
            aPares[i] = valor + 1;
            aImpares[i] = valor;
            valor += 2;
        }

        System.out.println("♦ Valor par : " + Arrays.toString(aPares));
        System.out.println("♦ Valor impar : " + Arrays.toString(aImpares));

    }
}
