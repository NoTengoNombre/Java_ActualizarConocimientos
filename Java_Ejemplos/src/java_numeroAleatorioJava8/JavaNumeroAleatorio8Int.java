/**
 * @created on : 31-ago-2017, 10:04:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_numeroAleatorioJava8;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class JavaNumeroAleatorio8Int {

    public static void main(String[] args) {

//        Instanciamos un objeto de la clase Random
        Random random = new Random();

//        Obtener intStream , El IntStream tendra 10 numeros aleatorios
//        entre 1 y 7 , excluido en el 7 , la tipica tirada de dados del 1 al 6
        IntStream intStream = random.ints(10, 1, 7);
//        Iterador para ir obteniendo los numeros 
        Iterator iterator = intStream.iterator();

        while (iterator.hasNext()) {
            System.out.println("Numero Aleatorio " + iterator.next());
        }

    }
}
