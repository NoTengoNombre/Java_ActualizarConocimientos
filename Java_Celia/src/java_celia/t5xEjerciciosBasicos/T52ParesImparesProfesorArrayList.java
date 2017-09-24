/**
 * @created on : 24-sep-2017, 18:30:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.ArrayList;

public class T52ParesImparesProfesorArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> aPares = new ArrayList<>();
        ArrayList<Integer> aImpares = new ArrayList<>();

        int valor = 1;

        for (int i = 0; i < 10; i++) {
            aPares.add(valor + 1);
            aImpares.add(valor);
            valor += 2;
        }

        System.out.println("Pares Impares ");

        for (int i = 0; i < aPares.size(); i++) {
            System.out.format("%5d %5d %2.3f\n", aPares.get(i), aImpares.get(i));
        }
    }
}
