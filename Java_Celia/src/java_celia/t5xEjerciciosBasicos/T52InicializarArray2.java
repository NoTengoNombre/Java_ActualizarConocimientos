/**
 * @created on : 29-ago-2017, 22:59:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T52InicializarArray2 {

    private static int[] arrayPares = new int[101];
    private static int[] arrayImpares = new int[101];

    public static void setArrayPar() {
        for (int i = 0; i < arrayPares.length; i++) {
            if (i % 2 == 0) {
                int v = arrayPares[i] = i;
                System.out.println(v);
            }
        }
    }

    public static void setArrayImpar() {
        for (int i = 0; i < arrayImpares.length; i++) {
            if (i % 2 != 0) {
                int v = arrayImpares[i] = i;
                System.out.println(v);
            }
        }
    }

    public static void main(String[] args) {

        setArrayPar();
        setArrayImpar();
    }
}
