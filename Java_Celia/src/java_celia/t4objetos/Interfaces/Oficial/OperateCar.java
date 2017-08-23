/**
 * @created on : 23-ago-2017, 11:09:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces.Oficial;

/**
 * Patron de diseño general
 *
 * Indica a las "Clases Descendientes" que utilicen esta interfaz como tienen
 * que llamarse sus metodos y que parametros incorporar para asi crear un diseño
 * estandar entre todas las "Clases Bases" que vayan a usar esta interfaz
 *
 * @author Portatil_Bot
 */
public interface OperateCar {

//    Constan declaration
    public static final boolean ABIERTA = true;
    public static final boolean CERRADA = false;

    /**
     * Method signatures
     *
     * @param direction
     * @param abierta
     * @return
     */
    int abrirPuertas(Direction direction, boolean abierta);

    /**
     * An enum with values RIGHT, LEFT
     */
    public enum giroVehiculo {
        RIGHT, LEFT;
    }

    int turn(Direction direction, double radius, double startSpeed, double endSpeed);

    int changeLanes(Direction direction, double startSpeed, double endSpeed);

    int signalTurn(Direction direction, boolean signalOn);

    int getRadarFront(double distanceToCar, double speedOfCar);

    int getRadarRear(double distanceToCar, double speedOfCar);

}
