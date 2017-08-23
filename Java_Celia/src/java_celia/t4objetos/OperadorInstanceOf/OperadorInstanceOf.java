/**
 * @created on : 23-ago-2017, 18:43:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.OperadorInstanceOf;

/**
 * Operador nos dice si este objeto es una instancia de una determinada clase
 *
 * instance of = "En vez de"
 *
 * @author Portatil_Bot
 */
public class OperadorInstanceOf {

    public static void main(String[] args) {

        Gato g1 = new Gato();

        Animal a = g1;

        if (a instanceof Gato) {
            System.out.println("Objeto 'a' es un gato ");
            System.out.println("Podemos hacer downcasting sin problemas : "
                    + "\n Acceder de arriba a abajo a las metodos de Gato");
            Gato g2 = (Gato) a;
        }

        System.out.println("------------------------------------------------");
        System.out.println("No funciona porque estas haciendo una asignacion");
        System.out.println("a un objeto que puede ser (gato) o (perro) hacia Mamifero(Clase Padre)");
//        Mamifero m = new Mamifero();
//        Gato c = (Gato) m;

    }

}
