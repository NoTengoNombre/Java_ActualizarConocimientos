/**
 * @created on : 15-jul-2017, 12:13:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_num_letras_aleatorios;

public class JavaNumAleatorios {

    public static void main(String[] args) {
//        for (int i = 0; i < 1001; i++) {

        System.out.println("------------");
        double valor_0_10 = (double) (Math.random() * (0 + 10) + 1);
        System.out.println(valor_0_10);

        System.out.println("------------");
        int valor_1_10 = (int) (Math.random() * (1 + 9) + 1);
        System.out.println(valor_1_10);

        System.out.println("------------");
        int x = (int) (Math.random() * (0 + 3) + 1);
        System.out.println(x);

        System.out.println("---- Intervalo entre 1900 y 2000 --------");
        int num = (int) ((Math.random() * 100 + 1900));
        System.out.println(num);

//        }
    }
}
