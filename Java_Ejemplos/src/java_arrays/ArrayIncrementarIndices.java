/**
 * @created on : 06-sep-2017, 13:10:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayIncrementarIndices {

    public static void main(String[] args) {

        int[][] a = new int[3][3];
        a[0][0]++;
        a[0][0]++;
        a[0][0]++;
        a[0][0]++;
        a[0][0]++;

        System.out.println("Incrementar el valor del indice mediante incremento");
        System.out.println(""
                + "        a[0][0]++;\n"
                + "        a[0][0]++;\n"
                + "        a[0][0]++;\n"
                + "        a[0][0]++;\n"
                + "        a[0][0]++;");
        System.out.println("Valor generado : " + a[0][0]);

    }
}
