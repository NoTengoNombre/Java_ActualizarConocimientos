/**
 * @created on : 06-sep-2017, 18:24:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_convecciones;

public class JavaRegresarBooleandoDentroMetodos {

    /**
     * Si valor es mayor que 5
     *
     * @return devuelto 5
     */
    public static int getNumero() {
        int a0 = (int) (Math.random() * (1 + 10));
        System.out.println("Valor de a0 : " + a0);
        int a1 = 5;
        return ((a0 < a1) ? a0 : a1);
    }

    /**
     * Si valor es distinto de 1
     *
     * FIXME : nada
     *
     * XXX : nada
     *
     * @return devuelve true
     */
    public static boolean isBoolean() {
        int a0 = (int) (Math.random() * (1 + 10));
        int a1 = 1;
        return ((a0 != a1) ? true : false);
    }

    public static void main(String[] args) {

        System.out.println("Valor devuelto : " + getNumero());
        System.out.println("----------");
        System.out.println(isBoolean());
    }
}
