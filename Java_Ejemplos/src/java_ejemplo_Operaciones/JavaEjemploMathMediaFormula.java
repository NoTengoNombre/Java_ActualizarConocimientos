/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class JavaEjemploMathMediaFormula {

    public static void main(String[] args) {
//        int[] list = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
//        int[] list = {12, 6, 7, 3, 15, 10, 18, 5};
        int[] list = {2, 3, 6, 8, 11};
        System.out.println(stdev(list));
    }

    public static double stdev(int[] list) {
        double sum = 0.0;
        double mean = 0.0;
        double num = 0.0;
        double numi = 0.0;

        for (int i : list) {
            sum += i;
            System.out.println("indice : " + sum);
        }
        mean = sum / list.length;

        for (int i : list) {
            numi = Math.pow((double) (i - mean), 2);
            num += numi;
            System.out.println("media : " + num);
        }

        return Math.sqrt(num / list.length);
    }
}
