/**
 * @created on : 23-ago-2017, 11:56:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces.ClasesHelpers;

/**
 * Una clase auxiliar para ayudar a proporcionar alguna funcionalidad, que no es
 * el objetivo principal de la aplicación o clase en la que se utiliza
 *
 * Una instancia de una clase auxiliar se denomina objeto auxiliar (por ejemplo,
 * en el patrón de delegación).
 *
 * Clase auxiliar en la que los métodos son todos estáticos. En general, las
 * clases auxiliares no tienen que tener todos los métodos estáticos y pueden
 * tener variables de instancia y pueden existir varias instancias de la clase
 * auxiliar.
 *
 * @author Portatil_Bot
 */
public class AnteponerAyudante {

    public static String GatoAnteponer(String texto) {
        return "Meow meow " + texto + " ! ";
    }

    public static String PerroAnteponer(String texto) {
        return "Woof Woof " + texto + " ! ";
    }

    public static String CachorroAnteponer(String texto) {
        return "Soy un cachorro de : " + texto + " ! ";
    }

}
