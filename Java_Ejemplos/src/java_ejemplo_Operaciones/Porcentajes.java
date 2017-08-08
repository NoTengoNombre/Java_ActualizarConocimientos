/**
 * @created on : 04-ago-2017, 21:17:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class Porcentajes {

    public static void main(String[] args) {

        double totalDesc = ((40 / 100d) * 100);

        double precio = 100 - totalDesc;

        System.out.println(totalDesc);
        System.out.println("Precio final : " + precio);

    }
}
