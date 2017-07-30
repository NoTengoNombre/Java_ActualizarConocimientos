/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_7ContarCifras3 {

    public static int c;

    public static void main(String[] args) {

        int x = 100;

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

        if ((-(x / 100000)) >= 1.0 || ((x / 100000) >= 1.0)) {
            System.out.println("♦ La longitud mayor de " + c + " no esta permitida ");
        } else {
            System.out.println(" • La longitud del valor es : " + c);
        }

    }

}
