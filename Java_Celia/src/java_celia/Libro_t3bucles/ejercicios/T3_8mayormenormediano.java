/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_8mayormenormediano {

    public static int c;

    public static void main(String[] args) {
        double n1 = (int) (Math.random() * (1 + 10));
        double n2 = (int) (Math.random() * (1 + 10));
        double n3 = (int) (Math.random() * (1 + 10));

        if ((n1 < n2) && (n1 < n3)) {
            System.out.println("menor " + n1);
            if (n2 < n3) {
                System.out.println("intermedio " + n2);
                System.out.println("mayor " + n3);
            } else {
                System.out.println("intermedio " + n3);
                System.out.println("mayor " + n2);
            }
        } else if ((n2 < n1) && (n2 < n3)) {
            System.out.println("menor " + n2);
            if (n2 < n3) {
                System.out.println("intermedio " + n2);
                System.out.println("mayor " + n3);
            } else {
                System.out.println("intermedio " + n3);
                System.out.println("mayor " + n2);
            }
        } else if ((n3 < n1) && (n3 < n2)) {
            System.out.println("menor " + n3);
            if (n1 < n2) {
                System.out.println("intermedio " + n1);
                System.out.println("mayor " + n2);
            } else {
                System.out.println("intermedio " + n2);
                System.out.println("mayor " + n1);
            }
        }
    }
}
