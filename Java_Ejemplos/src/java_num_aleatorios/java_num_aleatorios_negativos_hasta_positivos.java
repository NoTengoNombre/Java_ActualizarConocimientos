/**
 * @created on : 15-jul-2017, 12:13:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_aleatorios;

public class java_num_aleatorios_negativos_hasta_positivos {

    public static void main(String[] args) {
//        for (int i = 0; i < 1001; i++) {

        System.out.println("------------");
        double valor_0_10 = (int) (Math.random() * ((-50) + (100)) + 1);
        System.out.println(valor_0_10);

        System.out.println("------------");
        int valor_1_10 = (int) (Math.random() * (1 + 9) + 1);
        System.out.println(valor_1_10);

        System.out.println("------------");
        int x = (int) (Math.random() * (0 + 3) + 1);
        System.out.println(x);

        System.out.println("------------");
        double xx = (Math.random() * (1 + 10));
        System.out.println(xx);

        double r = 10.00 - 0.03;
        System.out.println("valor : " + r);

        double xr = 100.0 - 0.5;
        System.out.println("valor : " + xr);
//        }

    }
}
