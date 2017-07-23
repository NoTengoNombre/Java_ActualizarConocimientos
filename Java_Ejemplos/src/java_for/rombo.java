/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for;

public class rombo {

    // Tiene que recibir la cantidad máxima de valores a mostrar
    // Siempre sera un valor impar
    public static void main(String[] args) {
        // obtenemos el valor recibido
        int max = 7;
        int i = 0;
        int j = 0;
        int k = 0;

        // Si el valor recibido es par, le añadimos uno
        if (max % 2 == 0) {
            max++;
        }

        // parte superior del rombo
        for (i = 1; i <= max; i = i + 2) {
            // Añadimos los espacios necesarios delante de cada linea
            for (k = max + 1; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            // Mostramos loas asteriscos
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //parte inferior del rombo
        for (i = max; i >= 1; i = i - 2) {
            // Añadimos los espacios necesarios delante de cada linea
            for (k = i; k <= max + 2; k = k + 2) {
                System.out.print(" ");
            }
            // Mostramos loas asteriscos
            for (j = i - 2; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
