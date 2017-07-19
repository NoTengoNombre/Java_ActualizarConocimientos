/**
 * @created on : 18-jul-2017, 11:37:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.acumuladores;

public class acumuladores {

    public static void main(String[] args) {

        int acumulador = 0;
        acumulador++;
        System.out.println("acumulador : " + acumulador);

        int a = 0;
        a = a + 1;
        System.out.println("acumulador a : " + a);

        int aa = 1;
//      aa = aa + aa;
        aa += aa;
        System.out.println("acumulador aa : " + aa);

        int valor = 1;
        valor = +valor;
        System.out.println("valor positivo +valor : " + valor);

        int valor_negativo = 1;
        valor_negativo = -valor_negativo;
        System.out.println("valor negativo -valor : " + valor_negativo);

    }
}
