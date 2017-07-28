/**
 * @created on : 17-jul-2017, 9:49:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_comprobar_valores;

public class Java_ejemplo_comprobar_valores_integer {

    static String medida = null;

    public static void main(String[] args) {

        medida = "hola";

        if (medida instanceof String) {
            System.out.println("Si es un String");
        }

    }
}
