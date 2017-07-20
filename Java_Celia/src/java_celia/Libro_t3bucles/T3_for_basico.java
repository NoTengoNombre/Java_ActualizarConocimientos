/**
 * @created on : 17-jul-2017, 21:24:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

public class T3_for_basico {

    public static void main(String[] args) {

        int i;
        for (i = 1; i < 101; i++) {
            System.out.println("♠ Incremento : " + i);
        }

        int e;
        for (e = 1; e <= 100; e += 2) {
            System.out.println("♣ Incremento : " + e);
        }

        int ee;
        for (ee = 1; ee <= 100; ee = ee + 2) {
            System.out.println("♣ Incremento : " + e);
        }

        int y;
        for (y = 0; y <= 100; y += 3) {
            System.out.println("• Incremento : " + y);
        }
        

    }

}
