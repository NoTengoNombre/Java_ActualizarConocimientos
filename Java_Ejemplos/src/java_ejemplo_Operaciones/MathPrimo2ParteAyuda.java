/**
 * @created on : 29-jul-2017, 14:51:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class MathPrimo2ParteAyuda {

    public static boolean esPrimo2(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        long sqrtN = (long) Math.sqrt(n) + 1;
        
        System.out.println("Raiz cuadrada : " + sqrtN);
        for (long i = 6L; i <= sqrtN; i += 6) {

//              4    6              4      8
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            boolean esPrimo = esPrimo(i);
//            System.out.println(i + " es : " + esPrimo);
//        }

        for (int i = 0; i < 20; i++) {
            boolean esPrimo = esPrimo2(i);
            if (esPrimo == true) {
                System.out.println(i + " es : " + esPrimo);
            }
        }
    }
}
