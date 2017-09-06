/**
 * @created on : 27-jul-2017, 0:37:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_acumuladores;

public class java_ejemplo_acumuladores2 {

    public static void main(String[] args) {

        int a = 1;
        System.out.println("valor : " + a);
        a += 1;
        System.out.println("valor : " + a);
        a = a + 1;
        System.out.println("valor : " + a);
        int b = 2;
        b += 1;
        System.out.println(b);
//                     2 filas 1 Columna
        int[][] ar
                = {
                    {1},
                    {1}};

        ar[0][0] += 1;
        System.out.println("Suma de valores : " + ar[0][0]);
    }
}
