/**
 * @created on : 18-jul-2017, 10:56:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 *
 * Escribir un algoritmo que sume todos los números naturales de n hasta m,
 * siendo n y m números recibidos como parámetros.
 *
 * Devuelve la suma si todo ha ido bien o ­1 en caso de error
 */
package java_celia.Libro_t3bucles;

public class T3_javadoc {

    public static int set_num(int n, int m) {
        int suma = 0;
        while (n <= m) {
//            System.out.println("• Valor de n : " + n++);
            if ((n <= 0 || n == -1) || (suma == -1)) {
                suma = -1;
//              return suma;
            } else {
                suma = suma + n;
            }
            System.out.println("suma total : " + suma);
            n++;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Recuerda la sumatoria de Euler");
        System.out.println("Total : " + set_num(1, 100));
    }

}
