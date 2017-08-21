/**
 * @created on : 16-ago-2017, 19:35:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_generar_turnos;

public class java_generar_turnos {

    private static int finDelJuego;

    public static void main(String[] args) {
        int turno = 2;

        while (finDelJuego == 0) {
            turno--;
            if (turno <= 2) {
                System.out.println(turno);
                turno++;
            }
            System.out.println(turno);
        }
    }
}
