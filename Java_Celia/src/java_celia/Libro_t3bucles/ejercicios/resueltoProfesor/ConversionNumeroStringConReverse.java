/**
 * @created on : 21-ago-2017, 16:44:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class ConversionNumeroStringConReverse {

    public static int getRevertirString(StringBuilder sb) {
        StringBuilder str = new StringBuilder(sb);
        StringBuilder inverso = str.reverse();
        int valor = Integer.parseInt(inverso.toString());
        return valor;
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("12345");

        System.out.println(getRevertirString(sb));

    }
}
