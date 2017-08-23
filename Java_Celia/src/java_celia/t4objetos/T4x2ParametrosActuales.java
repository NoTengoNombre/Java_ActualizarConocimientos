/**
 * @created on : 22-ago-2017, 10:57:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

public class T4x2ParametrosActuales {

}

class MiNumero {

    /**
     * Le pasamos parametros formales
     * 
     * @param base
     * @param exponente
     * @return
     */
//                                parametros formales
//                                cuando termina de ejecutarse deja de existir los parametros
    public static double potencia(double base, double exponente) {
//        variables convencionales
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {

//      Parametros Actuales
        double a = 5.8;
        double b = 3.0;
        double c = MiNumero.potencia(a, b);
        System.out.println(c);

    }
}
