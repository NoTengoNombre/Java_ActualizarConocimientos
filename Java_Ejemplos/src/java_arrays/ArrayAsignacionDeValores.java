/**
 * @created on : 04-sep-2017, 14:54:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAsignacionDeValores {

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

    public static void setIntercambiarPosicionArray(String[] array) {

        for (int i = 0; i < arrayStringA.length; i++) {

            int x = getX();
            int y = getY();

            aux = arrayStringA[x];

            if (x == y) {
                y = getY();
            }

            arrayStringA[x] = arrayStringA[y];
            arrayStringA[y] = aux;

            if (arrayStringA[x].equals(arrayStringA[y])) {
                arrayContenedorNum[x] = arrayStringA[x];
            }

//            Operador ternario
//            if (arrayStringA[x] == null ? arrayStringA[y] != null : !arrayStringA[x].equals(arrayStringA[y])) {
//                arrayContenedorNum[x] = arrayStringA[x];
//            }
        }
    }

    public static void main(String[] args) {

        setIntercambiarPosicionArray(arrayStringA);
        setIntercambiarPosicionArray(arrayStringB);

        for (int i = 0; i < arrayStringA.length; i++) {
            System.out.print(arrayStringA[i]);
//            System.out.print(arrayStringB[i] + "\n");
        }
        System.out.println("");
    }
}
