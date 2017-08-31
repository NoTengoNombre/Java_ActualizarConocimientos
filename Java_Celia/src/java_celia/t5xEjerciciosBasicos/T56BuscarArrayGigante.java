/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T56BuscarArrayGigante {

    private static long[] arrayM = new long[1000000];

    public static void setArrayMillon() {
        System.out.println("\n------ INICIO -------");
        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = (long) (Math.random() * (1 + 2000000) + 1);
        }
    }

    public static void ordenaArray(int izquierda, int derecha) {

        int izq, der, mitad, numero;

        izq = izquierda;
        der = derecha;

        mitad = (int) arrayM[(izquierda + derecha) / 2];

        do {
            while (arrayM[izq] < mitad) {
                izq++;
            }
            while (mitad < arrayM[der]) {
                der--;
            }
            if (izq <= der) {
                numero = (int) arrayM[izq];
                arrayM[izq] = arrayM[der];
                arrayM[der] = numero;
                izq++;
                der--;
            }
        } while (izq <= der);

        numero = (int) arrayM[izq];
        arrayM[izq] = arrayM[derecha];
        arrayM[derecha] = numero;

        if (izquierda < der) {
            ordenaArray(izquierda, der);
        }
        if (izq < derecha) {
            ordenaArray(izq, derecha);
        }
    }

    public static void getArray() {
        for (int i = 0; i < arrayM.length; i++) {
            System.out.println("\u001B[32m " + arrayM[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        setArrayMillon();

        ordenaArray(0, arrayM.length - 1);

        getArray();

    }
}
