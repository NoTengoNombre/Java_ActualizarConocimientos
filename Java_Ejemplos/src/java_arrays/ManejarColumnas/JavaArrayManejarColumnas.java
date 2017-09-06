/**
 * @created on : 06-sep-2017, 18:14:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.ManejarColumnas;

public class JavaArrayManejarColumnas {

    /**
     * Solo modifica las columna del primer Array[0]
     *
     * @return
     */
    public static int setSumarColumnas() {
        int[][] numeros = new int[3][3];

        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[0][j]++;
            }
        }
        System.out.println("Solo modifica las columna del primer Array[0]");
        System.out.print(numeros[0][0]);
        System.out.print(numeros[0][1]);
        System.out.print(numeros[0][2]);
        System.out.println("\n------------");
        System.out.print(numeros[1][0]);
        System.out.print(numeros[1][1]);
        System.out.print(numeros[1][2]);
        System.out.println("\n------------");
        System.out.print(numeros[2][0]);
        System.out.print(numeros[2][1]);
        System.out.print(numeros[2][2]);
        System.out.println("\n------------");

        return total;
    }

    public static void main(String[] args) {

        setSumarColumnas();
    }
}
