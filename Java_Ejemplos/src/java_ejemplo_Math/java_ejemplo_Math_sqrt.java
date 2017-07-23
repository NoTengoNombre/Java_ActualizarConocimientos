/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

public class java_ejemplo_Math_sqrt {

    public static void main(String[] args) {

        int c = 0;
        double total_cuadrado = 0;

        for (int i = 0; i < 10; i++) {
            c = c + i;
            System.out.println("Numero : " + i);
            total_cuadrado = (double) (total_cuadrado + Math.sqrt(i));
        }

        System.out.println("Total : " + c);
        double raiz_cuadrada = Math.sqrt(45);
        System.out.println("" + raiz_cuadrada);

    }
}
