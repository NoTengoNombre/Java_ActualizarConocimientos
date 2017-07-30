/**
 * @created on : 30-jul-2017, 14:31:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class DecrementoPorDivision {

    public static void main(String[] args) {
        int n = 1000;
        int t = 10;
        n = n / t;
        System.out.println("r1 : " + n + " - " + t);
        n = n / t;
        System.out.println("r1 : " + n + " - " + t);
        n = n / t;
        System.out.println("r1 : " + n + " - " + t);
        n = n / t;
        System.out.println("r1 : " + n + " - " + t);

        System.out.println("-----------------------");

        int n1 = 1000;
        int t1 = 10;

        n1 /= t1;
        System.out.println("valor de n1 : " + n1);

        int n2 = 10000;
        int t2 = 10;

        System.out.println("------------");

        do {
            n2 /= t2;
            System.out.println("Valor de n2 : " + n2);
        } while (n2 > 0);

        int n3 = 10000;
        int t3 = 10;

        System.out.println("------------");

        do {
            n3 = n3 / t3;
            System.out.println("Valor de n2 : " + n3);
        } while (n3 > 0);

    }
}
