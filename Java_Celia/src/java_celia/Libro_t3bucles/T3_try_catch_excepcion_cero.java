/**
 * @created on : 17-jul-2017, 21:24:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

public class T3_try_catch_excepcion_cero {

    public static void main(String[] args) {

        int a = 10, b = 0, c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error al hacer la division : " + e);
            c = 0;
        }
        System.out.println("Resultado : " + c);
    }
}
