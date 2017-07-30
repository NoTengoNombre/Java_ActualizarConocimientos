/**
 * @created on : 27-jul-2017, 12:04:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class MathAbs {

    public static void main(String[] args) {

//        int n = 0;
//        int abs = Math.abs(n - 1 + n - 2);
//        System.out.println("Valor : " + abs);
        int max = 100;
        int valor = 0;

        for (int i = 1; i < max; i++) {
            if (max % i == 0) {
                valor++;
//            System.out.println("v : " + valor);
            }
            System.out.println("valor : " + i);
        }
        System.out.println("------------------");
        System.out.println("Total : " + valor);

    }
}
