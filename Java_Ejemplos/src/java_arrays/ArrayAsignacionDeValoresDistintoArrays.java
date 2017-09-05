/**
 * @created on : 04-sep-2017, 14:54:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAsignacionDeValoresDistintoArrays {

    private static String[] arrayStringA = {"A1|", "B2|", "C3|", "D4|", "E5|"};
    private static String[] arrayStringB = {"z6", "y7", "x8", "w9", "v10"};
    private static String[] arrayContenedorNum = new String[arrayStringA.length];
    private static String[] arrayMezclado = new String[arrayStringA.length];
    private static String aux;

    public static int getX() {
        int x = (int) (Math.random() * (1 + arrayStringA.length - 1));
        return x;
    }

    public static int getY() {
        int y = (int) (Math.random() * (1 + arrayStringB.length - 1));
        return y;
    }

    public static void setIntercambiarPosicionArray(String[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {

            int x = getX();
            int y = getY();

            aux = arrayParam[x];

            if (x == y) {
                y = getY();
            }

            arrayParam[x] = arrayParam[y];
            arrayParam[y] = aux;

            if (arrayParam[x].equals(arrayParam[y])) {
                arrayContenedorNum[x] = arrayParam[x];
            }
        }
    }

    public static void main(String[] args) {

        setIntercambiarPosicionArray(arrayStringA);
        setIntercambiarPosicionArray(arrayStringB);

        for (int i = 0; i < arrayStringA.length; i++) {
            System.out.print(arrayStringA[i] + " - " + arrayStringB[i] + "\n");
        }
        System.out.println("");
    }
}
