/**
 * @created on : 02-ago-2017, 18:43:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_static;

public class JavaStatic {

    private static int numero;

    public static void setNumero() {
        numero = (int) ((Math.random() * (1 + 10) + 1));
    }

    public static int getNumero() {
        System.out.println(" - El metodo 'setNumero' "
                + "que genera un numero aleatorio");
        System.out.println(" - Cambia el valor del "
                + "'atributo' por otro "
                + "cuando se ejecuta dentro "
                + "de otro metodo.");
        setNumero();
        return numero;
    }

    public static void main(String[] args) {
        setNumero();
        System.out.println("Valor: " + numero);
        System.out.println("Metodo getNumero : " + getNumero());

    }
}
