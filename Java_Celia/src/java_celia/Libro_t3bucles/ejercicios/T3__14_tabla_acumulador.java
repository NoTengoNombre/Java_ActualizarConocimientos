/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

/**
 *
 */
public class T3__14_tabla_acumulador {

    public static void acumuladorSimple(int n) {
        int total = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                total = a + i;
                System.out.println("Acumulador : " + total);
            }
        }
    }

    public static void acumuladorSimple2(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
//              0   0 + 0
//              2   0 + 2
//              6   2 + 4
//             12   6 + 6
//             20  12 + 8
                a = a + i; // x2
                System.out.println("Acumulador : " + a);
            }
        }
    }

    public static void main(String[] args) {
        acumuladorSimple(10);
        System.out.println("--------------");
        acumuladorSimple2(10);
    }
}
