/**
 * @created on : 11-ago-2017, 21:11:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class JavaSumarElementoArray {

    public static void main(String[] args) {

        int suma = 0;
        int[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Longitud : " + datos.length);

        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        System.out.println(suma);

    }
}
