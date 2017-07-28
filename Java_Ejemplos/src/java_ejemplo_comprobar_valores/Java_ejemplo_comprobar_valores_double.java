/**
 * @created on : 17-jul-2017, 9:49:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_comprobar_valores;

public class Java_ejemplo_comprobar_valores_double {

    static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            String message = e.getMessage();
            System.out.println("Valor del mensaje : " + message);
            return false;
        }
    }

    public static void main(String[] args) {

        boolean aDouble = isDouble("10.1");
        System.out.println("" + aDouble);
    }
}
