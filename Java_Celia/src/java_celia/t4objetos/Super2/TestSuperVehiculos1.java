/**
 * @created on : 23-ago-2017, 19:40:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Super2;

public class TestSuperVehiculos1 {

    public static void main(String[] args) {
        Bicicleta1 b1 = new Bicicleta1("BH1", "EasyMotivo1");
//        Esta invocando metodo de la SUPERCLASE
        b1.setMarca("BH", "EasyMotion");
//        Esta invocando metodo de la SUPERCLASE
        b1.setTamRueda(28);
//        Esta invocando metodo de la SUPERCLASE
        b1.info();
    }
}
