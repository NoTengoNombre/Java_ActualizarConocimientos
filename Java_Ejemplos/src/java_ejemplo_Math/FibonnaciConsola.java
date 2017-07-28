
/**
 * @created on : 27-jul-2017, 23:31:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
//package java_ejemplo_Math;
public class FibonnaciConsola {

    public static long fibonnaci(int n) {
        if (n <= 1) { // regresa 0 o 1 Si 'n' es menor 1
            return n;
        } else {
//             3 <- 3 - 1  +  3 - 2
            return (n - 1) + (n - 2);
        }
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + ": " + fibonnaci(n));
        }
    }
}
