/**
 * @created on : 03-sep-2017, 11:54:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces.Static;

/**
 * Llamar a un metodo Static de la Interface no requiere ser implementado por
 * alguna clase , Se usan las mismas reglas de los metodos Static de la
 * Superclases en los metodos STATIC de la INTERFACES
 *
 * @author Portatil_Bot
 */
public class InterfaceStatic implements InterfaceConMetodoStatic {

    /**
     * Metodo INTERFACS implementado por la clase que lo hereda
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

//                                               metodo Implementado por la Interface
        int resultado = InterfaceConMetodoStatic.multiply(2, 3);
        System.out.println(resultado);
    }
}

interface InterfaceConMetodoStatic {

    /**
     * Metodo de instancia de la interfaces
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b);

    /**
     * Metodo de clase 'static' de la interfaces y ademas implementando
     *
     * @param a
     * @param b
     * @return
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
}
