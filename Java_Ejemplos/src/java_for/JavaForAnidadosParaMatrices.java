/**
 * @created on : 06-sep-2017, 1:17:04
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for;

public class JavaForAnidadosParaMatrices {

    private int numeros[][] = new int[3][3];

    public int[][] getSumarNumeros() {
        return numeros;
    }

    public static void setSumarNumeros(int[][] numeros) {
        for (int[] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                numero[j] = (int) (Math.random() * (1 + 100));
                System.out.println(numero[j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        JavaForAnidadosParaMatrices j = new JavaForAnidadosParaMatrices();
        setSumarNumeros(j.getSumarNumeros());
    }
}
