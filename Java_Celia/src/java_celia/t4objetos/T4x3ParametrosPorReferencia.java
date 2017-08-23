/**
 * @created on : 22-ago-2017, 10:57:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

/**
 * NO EXISTE parametro por Referencia
 *
 * @author Portatil_Bot
 */
public class T4x3ParametrosPorReferencia {

}

class MiNumero2 {

    /**
     * Por referencia : ligadura entre parametro actual y parametro formal
     *
     * Si el parametro formal se modifica dentro del metodo, el parametro actual
     * se modifica también dentro del metodo
     *
     * Le pasamos parametros formales
     *
     * @param base
     * @param exponente
     * @return
     */
    /**
     * parametros formales
     *
     * cuando termina de ejecutarse deja de existir los parametros
     *
     * @param base
     * @param exponente
     * @return
     */
    public static double potencia(double base, double exponente) {
//        variables convencionales
        return Math.pow(base, exponente);
    }

    /**
     * Cuando el argumento es un objeto en lugar de tipo primitivo lo que se le
     * pasa por valor es su REFERENCIA , la posicion que ocupa en la memoria
     * podemos acceder a las tripas del objeto y modificar su contenido desde el
     * metodo
     *
     * @param valorPorReferencia1
     * @param valorPorReferencia2
     * @return
     */
    public static String potenciaReferenciaObjeto(String valorPorReferencia1, String valorPorReferencia2) {
        System.out.println(valorPorReferencia1);
        System.out.println(valorPorReferencia2);
        return valorPorReferencia1.concat(valorPorReferencia2);
    }

    public static void main(String[] args) {

//      Parametros Actuales
        double a = 5.8;
        double b = 3.0;
        double c = MiNumero2.potencia(a, b);
        System.out.println(c);

    }
}
