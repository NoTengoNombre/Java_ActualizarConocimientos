/**
 * @created on : 23-jul-2017, 16:33:19
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_array;

public class Java_ejemplos_array {

    public static void main(String[] args) {

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println("----------------------");
        System.out.println("Valores : " + a[0]);
        System.out.println("Valores : " + a[1]);
        System.out.println("Valores : " + a[2]);
        System.out.println("Valores : " + a[3]);
        System.out.println("Valores : " + a[4]);
        System.out.println("Valores : " + a[5]);
        System.out.println("Valores : " + a[6]);
        System.out.println("Valores : " + a[7]);
        System.out.println("Valores : " + a[8]);
        System.out.println("Valores : " + a[9]);

        int b = 0;
        int valor = a[b];
        System.out.println("valor : " + valor);
        int valor1 = a[b + 1];
        System.out.println("valor : " + valor1);

    }
}
