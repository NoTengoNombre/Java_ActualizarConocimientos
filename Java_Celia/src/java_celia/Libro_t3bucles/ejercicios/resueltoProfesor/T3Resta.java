/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3Resta {

    public int calcularResta(int mayor, int menor) {
        int resta = 0;
        if (mayor > menor) {
            resta = mayor - menor;
        } else {
            resta = menor - mayor;
        }
        return resta;
    }
}
