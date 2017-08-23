/**
 * @created on : 23-ago-2017, 11:13:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces.Oficial;

/**
 * Clase base que utiliza la INTERFACE OperateCar para implementar los metodos
 * que necesita para darle la funcion requerida
 *
 * @author Portatil_Bot
 */
public class OperateBMW760i implements OperateCar {

    @Override
    public int abrirPuertas(Direction direction, boolean abierta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int signalTurn(Direction direction, boolean signalOn) {
//        Codigo cuando gire a la derecha el BWN y el indicador este apagado
//        Codigo cuando gire a la izquierda el BWN y el indicador este NO apagado
//        Codigo cuando gire a la derecha el BWN y el indicador este apagado
//        Codigo cuando gire a la izquierda el BWN y el indicador este NO apagado
        return 0;
    }

    @Override
    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
