/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

public class Java_division3_negativa {

    public static int c;

    public static void main(String[] args) {

        int x = -10000;

        if ((-(x / 1)) >= 1.0 || ((x / 1) >= 1.0)) {
            c++;
        }

        if ((-(x / 10)) >= 1.0 || ((x / 10) >= 1.0)) {
            c++;
        }

        if ((-(x / 100)) >= 1.0 || ((x / 100) >= 1.0)) {
            c++;
        }

        if ((-(x / 1000)) >= 1.0 || ((x / 1000) >= 1.0)) {
            c++;
        }

        if ((-(x / 10000)) >= 1.0 || ((x / 10000) >= 1.0)) {
            c++;
        }

        if ((-(x / 100000)) >= 1.0 || ((x / 100000) >= 1.0)) {
            c++;
        }

        if ((String.valueOf(x).length()) > 5) {
            System.out.println("El numero es demasiado largo ");
        } else if ((-x * 0.000001) < 5) {
            System.out.println("Total : " + c);
        }

        System.out.println("La longitud del valor es : " + c);

    }
}
