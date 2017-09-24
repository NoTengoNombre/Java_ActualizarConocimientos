/**
 * @created on : 24-sep-2017, 18:39:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class T53LoteriaPrimitivaProfesor {

    private final static int TAM = 10;

    public static int[] generaPrimitivaArray() {
        int a = 0;
        int[] combinacion = new int[6];
        boolean repetido = false;

        for (int i = 0; i < 6; i++) {
            do {
                a = (int) (Math.random() * 49 + 1);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (combinacion[j] == a) {
                        repetido = true;
                    }
                }
            } while (repetido);
            combinacion[i] = a;
        }
        return combinacion;
    }

    /**
     * Recorre un array de 6 posiciones y en cada 1 de ella le añade un numero
     * entre 1 y 49
     *
     * @return
     */
    public static ArrayList<Integer> generarPrimitivaArrayList() {

        ArrayList<Integer> combinacion = new ArrayList<>();

        int a = 0;

        for (int i = 0; i < 6; i++) {
            do {
                a = (int) (Math.random() * 49 + 1);
            } while (combinacion.indexOf(a) != -1);
            combinacion.add(a);
        }
        return combinacion;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(generaPrimitivaArray()));

        System.out.println("------------------------------------");

        for (Iterator<Integer> it = generarPrimitivaArrayList().iterator(); it.hasNext();) {
            Integer integer = it.next();
            System.out.format("\u001b[33m" + integer + " ");
        }

        System.out.println("\n------------------------------------");

        for (Integer integer : generarPrimitivaArrayList()) {
            System.out.format("\u001b[33m" + integer + " ");
        }
        System.out.println();

    }
}
