/**
 * @created on : 20-ago-2017, 12:08:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_incremento_decremento;

public class Java_incremento_decremento {

    public static void generarTurnos() {
        int i = 0;
        int turno = 2;
        boolean sigueJugando = false;

        do {
            if (i % 2 == 0) {
                turno--;
            }
            if (i % 2 != 0) {
                turno++;
            }
            i++;
            if (i == 10) {
                sigueJugando = true;
            }
        } while (sigueJugando == false);
    }

    public static void main(String[] args) {

        generarTurnos();
        
    }

}
