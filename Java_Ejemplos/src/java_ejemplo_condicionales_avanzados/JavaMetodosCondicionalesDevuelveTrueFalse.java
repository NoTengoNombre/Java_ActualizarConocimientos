/**
 * @created on : 15-ago-2017, 21:00:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_condicionales_avanzados;

public class JavaMetodosCondicionalesDevuelveTrueFalse {

    private static final int MONTON1 = 1;
    private static final int MONTON2 = 2;
    private static final int MONTON3 = 3;

//    private static final int MONTONPALILLOS1 = (int) (Math.random() * (1 + 10) + 1);
    private static final int MONTONPALILLOS1 = 0;
//    private static final int MONTONPALILLOS2 = (int) (Math.random() * (1 + 10) + 1);
    private static final int MONTONPALILLOS2 = 0;
//    private static final int MONTONPALILLOS3 = (int) (Math.random() * (1 + 10) + 1);
    private static final int MONTONPALILLOS3 = 0;

    public static boolean comprobarMonton(int monton) {

        System.out.println(MONTONPALILLOS1);
        if (MONTON1 == monton && (MONTONPALILLOS1 > 0)) {
            return true;
        }

        System.out.println(MONTONPALILLOS2);
        if (MONTON2 == monton && (MONTONPALILLOS2 > 0)) {
            return true;
        }

        System.out.println(MONTONPALILLOS3);
        if (MONTON3 == monton && (MONTONPALILLOS3 > 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("ver : " + comprobarMonton(1));
    }
}
